/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MolecularSequenceRepositoryTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MolecularSequence.MolecularSequenceRepository(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MolecularSequence.MolecularSequenceRepository.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", MolecularSequence.MolecularSequenceRepository.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceRepository.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        assertEquals("x", MolecularSequence.MolecularSequenceRepository.create().type("x").build().type());
    }

    @Test
    public void testUrl() {
        assertEquals("x", MolecularSequence.MolecularSequenceRepository.create().url("x").build().url());
    }

    @Test
    public void testName() {
        assertEquals("x", MolecularSequence.MolecularSequenceRepository.create().name("x").build().name());
    }

    @Test
    public void testDatasetId() {
        assertEquals("x", MolecularSequence.MolecularSequenceRepository.create().datasetId("x").build().datasetId());
    }

    @Test
    public void testVariantsetId() {
        assertEquals("x", MolecularSequence.MolecularSequenceRepository.create().variantsetId("x").build().variantsetId());
    }

    @Test
    public void testReadsetId() {
        assertEquals("x", MolecularSequence.MolecularSequenceRepository.create().readsetId("x").build().readsetId());
    }
}
