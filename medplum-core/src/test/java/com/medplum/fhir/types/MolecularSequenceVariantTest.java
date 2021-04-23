/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MolecularSequenceVariantTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MolecularSequence.MolecularSequenceVariant(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MolecularSequence.MolecularSequenceVariant.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", MolecularSequence.MolecularSequenceVariant.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceVariant.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testStart() {
        assertEquals(1, MolecularSequence.MolecularSequenceVariant.create().start(1).build().start());
    }

    @Test
    public void testEnd() {
        assertEquals(1, MolecularSequence.MolecularSequenceVariant.create().end(1).build().end());
    }

    @Test
    public void testObservedAllele() {
        assertEquals("x", MolecularSequence.MolecularSequenceVariant.create().observedAllele("x").build().observedAllele());
    }

    @Test
    public void testReferenceAllele() {
        assertEquals("x", MolecularSequence.MolecularSequenceVariant.create().referenceAllele("x").build().referenceAllele());
    }

    @Test
    public void testCigar() {
        assertEquals("x", MolecularSequence.MolecularSequenceVariant.create().cigar("x").build().cigar());
    }

    @Test
    public void testVariantPointer() {
        final Reference value = Reference.create().build();
        assertEquals(value, MolecularSequence.MolecularSequenceVariant.create().variantPointer(value).build().variantPointer());
    }
}
