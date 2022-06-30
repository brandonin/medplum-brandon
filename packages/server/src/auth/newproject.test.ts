import { randomUUID } from 'crypto';
import express from 'express';
import { pwnedPassword } from 'hibp';
import fetch from 'node-fetch';
import request from 'supertest';
import { initApp } from '../app';
import { loadTestConfig } from '../config';
import { closeDatabase, initDatabase } from '../database';
import { initKeys } from '../oauth';
import { closeRedis, initRedis } from '../redis';
import { seedDatabase } from '../seed';
import { setupPwnedPasswordMock, setupRecaptchaMock } from '../test.setup';

jest.mock('hibp');
jest.mock('node-fetch');

const app = express();

describe('New project', () => {
  beforeAll(async () => {
    const config = await loadTestConfig();
    initRedis(config.redis);
    await initDatabase(config.database);
    await seedDatabase();
    await initApp(app);
    await initKeys(config);
  });

  afterAll(async () => {
    await closeDatabase();
    closeRedis();
  });

  beforeEach(async () => {
    (fetch as unknown as jest.Mock).mockClear();
    (pwnedPassword as unknown as jest.Mock).mockClear();
    setupPwnedPasswordMock(pwnedPassword as unknown as jest.Mock, 0);
    setupRecaptchaMock(fetch as unknown as jest.Mock, true);
  });

  test('Success', async () => {
    const res1 = await request(app)
      .post('/auth/newuser')
      .type('json')
      .send({
        email: `alex${randomUUID()}@example.com`,
        password: 'password!@#',
        recaptchaToken: 'xyz',
      });
    expect(res1.status).toBe(200);

    const res2 = await request(app).post('/auth/newproject').type('json').send({
      login: res1.body.login,
      projectName: 'Hamilton Project',
      firstName: 'Alexander',
      lastName: 'Hamilton',
    });
    expect(res2.status).toBe(200);

    const res3 = await request(app).post('/oauth2/token').type('form').send({
      grant_type: 'authorization_code',
      code: res2.body.code,
      code_verifier: 'xyz',
    });
    expect(res3.status).toBe(200);

    const res4 = await request(app)
      .get(`/fhir/R4/${res3.body.profile.reference}`)
      .set('Authorization', 'Bearer ' + res3.body.access_token);
    expect(res4.status).toBe(200);

    // Try to reuse the login (this should fail)
    const res5 = await request(app).post('/auth/newproject').type('json').send({
      login: res1.body.login,
      projectName: 'Hamilton Project',
      firstName: 'Alexander',
      lastName: 'Hamilton',
    });
    expect(res5.status).toBe(400);

    // Try without a login (this should fail)
    const res6 = await request(app).post('/auth/newproject').type('json').send({
      projectName: 'Hamilton Project',
      firstName: 'Alexander',
      lastName: 'Hamilton',
    });
    expect(res6.status).toBe(400);
  });

  test('Default project name', async () => {
    const res1 = await request(app)
      .post('/auth/newuser')
      .type('json')
      .send({
        email: `alex${randomUUID()}@example.com`,
        password: 'password!@#',
        recaptchaToken: 'xyz',
      });
    expect(res1.status).toBe(200);

    const res2 = await request(app).post('/auth/newproject').type('json').send({
      login: res1.body.login,
      firstName: 'Alexander',
      lastName: 'Hamilton',
    });
    expect(res2.status).toBe(200);
    expect(res2.body.login).toBeDefined();
  });

  test('Default ClientApplication is restricted to project', async () => {
    // User1 registers
    // User1 creates a patient
    // User2 registers
    // User2 creates a client
    // Client should not be able to see User1 patients
    // Client should not see User1 patients in search
    const user1_res1 = await request(app)
      .post('/auth/newuser')
      .type('json')
      .send({
        email: `user1-${randomUUID()}@example.com`,
        password: 'password!@#',
        recaptchaToken: 'xyz',
      });
    expect(user1_res1.status).toBe(200);

    const user1_res2 = await request(app).post('/auth/newproject').type('json').send({
      login: user1_res1.body.login,
      projectName: 'User1 Project',
      firstName: 'User1',
      lastName: 'User1',
    });
    expect(user1_res2.status).toBe(200);

    const user1_res3 = await request(app).post('/oauth2/token').type('form').send({
      grant_type: 'authorization_code',
      code: user1_res2.body.code,
      code_verifier: 'xyz',
    });
    expect(user1_res3.status).toBe(200);

    const user1_res4 = await request(app)
      .post(`/fhir/R4/Patient`)
      .set('Authorization', 'Bearer ' + user1_res3.body.access_token)
      .type('json')
      .send({
        resourceType: 'Patient',
        name: [
          {
            given: ['Patient1'],
            family: 'Patient1',
          },
        ],
      });
    expect(user1_res4.status).toBe(201);

    const patient = user1_res4.body;

    const user2_res1 = await request(app)
      .post('/auth/newuser')
      .type('json')
      .send({
        email: `user2-${randomUUID()}@example.com`,
        password: 'password!@#',
        recaptchaToken: 'xyz',
      });
    expect(user2_res1.status).toBe(200);

    const user2_res2 = await request(app).post('/auth/newproject').type('json').send({
      login: user2_res1.body.login,
      projectName: 'User2 Project',
      firstName: 'User2',
      lastName: 'User2',
    });
    expect(user2_res2.status).toBe(200);

    const user2_res3 = await request(app).post('/oauth2/token').type('form').send({
      grant_type: 'authorization_code',
      code: user2_res2.body.code,
      code_verifier: 'xyz',
    });
    expect(user2_res3.status).toBe(200);

    // Try to access User1 patient using User2 directly
    // This should fail
    const user2_res4 = await request(app)
      .get(`/fhir/R4/Patient/${patient.id}`)
      .set('Authorization', 'Bearer ' + user2_res3.body.access_token);
    expect(user2_res4.status).toBe(404);

    // Get the client
    const user2_res5 = await request(app)
      .get(`/fhir/R4/ClientApplication`)
      .set('Authorization', 'Bearer ' + user2_res3.body.access_token);
    expect(user2_res5.status).toBe(200);
    expect(user2_res5.body.entry).toHaveLength(1);

    const client = user2_res5.body.entry[0].resource;

    // Get a token using the client
    const res6 = await request(app).post('/oauth2/token').type('form').send({
      grant_type: 'client_credentials',
      client_id: client.id,
      client_secret: client.secret,
    });
    expect(res6.status).toBe(200);
    expect(res6.body.error).toBeUndefined();
    expect(res6.body.access_token).toBeDefined();

    // Try to access User1 patient using User2 directly
    // This should fail
    const res7 = await request(app)
      .get(`/fhir/R4/Patient/${patient.id}`)
      .set('Authorization', 'Bearer ' + res6.body.access_token);
    expect(res7.status).toBe(404);

    // Try to search for patients using User2 client
    // This should return empty set
    const res8 = await request(app)
      .get(`/fhir/R4/Patient`)
      .set('Authorization', 'Bearer ' + res6.body.access_token);
    expect(res8.status).toBe(200);
    expect(res8.body.entry.length).toEqual(0);
  });

  test('GraphQL is restricted to project', async () => {
    // User1 registers
    // User1 creates a patient
    // User2 registers
    // User2 should not see User1 patients in search
    // User2 should not be able to see User1 patients by GraphQL
    const user1_res1 = await request(app)
      .post('/auth/newuser')
      .type('json')
      .send({
        email: `user1-${randomUUID()}@example.com`,
        password: 'password!@#',
        recaptchaToken: 'xyz',
      });
    expect(user1_res1.status).toBe(200);

    const user1_res2 = await request(app).post('/auth/newproject').type('json').send({
      login: user1_res1.body.login,
      projectName: 'User1 Project',
      firstName: 'User1',
      lastName: 'User1',
    });
    expect(user1_res2.status).toBe(200);

    const user1_res3 = await request(app).post('/oauth2/token').type('form').send({
      grant_type: 'authorization_code',
      code: user1_res2.body.code,
      code_verifier: 'xyz',
    });
    expect(user1_res3.status).toBe(200);

    const user1_res4 = await request(app)
      .post(`/fhir/R4/Patient`)
      .set('Authorization', 'Bearer ' + user1_res3.body.access_token)
      .type('json')
      .send({
        resourceType: 'Patient',
        name: [
          {
            given: ['Patient1'],
            family: 'Patient1',
          },
        ],
      });
    expect(user1_res4.status).toBe(201);

    const user2_res1 = await request(app)
      .post('/auth/newuser')
      .type('json')
      .send({
        email: `user2-${randomUUID()}@example.com`,
        password: 'password!@#',
        recaptchaToken: 'xyz',
      });
    expect(user2_res1.status).toBe(200);

    const user2_res2 = await request(app).post('/auth/newproject').type('json').send({
      login: user2_res1.body.login,
      projectName: 'User2 Project',
      firstName: 'User2',
      lastName: 'User2',
    });
    expect(user2_res2.status).toBe(200);

    const user2_res3 = await request(app).post('/oauth2/token').type('form').send({
      grant_type: 'authorization_code',
      code: user2_res2.body.code,
      code_verifier: 'xyz',
    });
    expect(user2_res3.status).toBe(200);

    // Try to access User1 patient using User2 graphql
    // This should fail
    const res5 = await request(app)
      .post(`/fhir/R4/$graphql`)
      .set('Authorization', 'Bearer ' + user2_res3.body.access_token)
      .type('json')
      .send({
        query: `{
          PatientList(name:"Patient1") {
            name {
              family
            }
          }
        }`,
      });
    expect(res5.status).toBe(200);
    expect(res5.body.data).toBeDefined();
    expect(res5.body.data.PatientList).toBeDefined();
    expect(res5.body.data.PatientList.length).toEqual(0);
  });
});
