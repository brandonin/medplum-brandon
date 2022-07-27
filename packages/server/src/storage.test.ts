import { assertOk } from '@medplum/core';
import { Binary } from '@medplum/fhirtypes';
import { randomUUID } from 'crypto';
import express, { Request } from 'express';
import { mkdtempSync, rmSync, unlinkSync } from 'fs';
import { resolve, sep } from 'path';
import { Readable } from 'stream';
import request from 'supertest';
import { initApp } from './app';
import { loadTestConfig } from './config';
import { closeDatabase, initDatabase } from './database';
import { getBinaryStorage, initBinaryStorage, systemRepo } from './fhir';
import { closeRedis, initRedis } from './redis';
import { seedDatabase } from './seed';

const app = express();
const binaryDir = mkdtempSync(__dirname + sep + 'binary-');
let binary: Binary;

describe('Storage Routes', () => {
  beforeAll(async () => {
    const config = await loadTestConfig();
    initRedis(config.redis);
    await initDatabase(config.database);
    await seedDatabase();
    await initApp(app);
    await initBinaryStorage('file:' + binaryDir);

    const [outcome, resource] = await systemRepo.createResource<Binary>({
      resourceType: 'Binary',
      contentType: 'text/plain',
    });
    assertOk(outcome, resource);
    binary = resource;

    const req = new Readable();
    req.push('hello world');
    req.push(null);
    (req as any).headers = {};
    await getBinaryStorage().writeBinary(binary, 'hello.txt', 'text/plain', req as Request);
  });

  afterAll(async () => {
    await closeDatabase();
    closeRedis();
    rmSync(binaryDir, { recursive: true, force: true });
  });

  test('Missing signature', async () => {
    const res = await request(app).get(`/storage/${binary.id}`);
    expect(res.status).toBe(401);
  });

  test('Success', async () => {
    const res = await request(app).get(`/storage/${binary.id}?Signature=xyz&Expires=123`);
    expect(res.status).toBe(200);
  });

  test('Binary not found', async () => {
    const res = await request(app).get(`/storage/${randomUUID()}?Signature=xyz&Expires=123`);
    expect(res.status).toBe(404);
  });

  test('File not found', async () => {
    const [outcome, resource] = await systemRepo.createResource<Binary>({
      resourceType: 'Binary',
      contentType: 'text/plain',
    });
    assertOk(outcome, resource);

    const req = new Readable();
    req.push('hello world');
    req.push(null);
    (req as any).headers = {};
    await getBinaryStorage().writeBinary(resource, 'hello.txt', 'text/plain', req as Request);

    // Delete the file on disk
    unlinkSync(resolve(binaryDir, `${resource.id}/${resource.meta?.versionId}`));

    const res = await request(app).get(`/storage/${resource.id}?Signature=xyz&Expires=123`);
    expect(res.status).toBe(404);
  });
});
