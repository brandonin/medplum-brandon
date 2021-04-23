/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceNucleicAcidSubunitTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstanceNucleicAcid.SubstanceNucleicAcidSubunit(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstanceNucleicAcid.SubstanceNucleicAcidSubunit.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", SubstanceNucleicAcid.SubstanceNucleicAcidSubunit.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceNucleicAcid.SubstanceNucleicAcidSubunit.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSubunit() {
        assertEquals(1, SubstanceNucleicAcid.SubstanceNucleicAcidSubunit.create().subunit(1).build().subunit());
    }

    @Test
    public void testSequence() {
        assertEquals("x", SubstanceNucleicAcid.SubstanceNucleicAcidSubunit.create().sequence("x").build().sequence());
    }

    @Test
    public void testLength() {
        assertEquals(1, SubstanceNucleicAcid.SubstanceNucleicAcidSubunit.create().length(1).build().length());
    }

    @Test
    public void testSequenceAttachment() {
        final Attachment value = Attachment.create().build();
        assertEquals(value, SubstanceNucleicAcid.SubstanceNucleicAcidSubunit.create().sequenceAttachment(value).build().sequenceAttachment());
    }

    @Test
    public void testFivePrime() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceNucleicAcid.SubstanceNucleicAcidSubunit.create().fivePrime(value).build().fivePrime());
    }

    @Test
    public void testThreePrime() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceNucleicAcid.SubstanceNucleicAcidSubunit.create().threePrime(value).build().threePrime());
    }

    @Test
    public void testLinkage() {
        final java.util.List<SubstanceNucleicAcid.SubstanceNucleicAcidLinkage> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceNucleicAcid.SubstanceNucleicAcidSubunit.create().linkage(value).build().linkage());
    }

    @Test
    public void testSugar() {
        final java.util.List<SubstanceNucleicAcid.SubstanceNucleicAcidSugar> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceNucleicAcid.SubstanceNucleicAcidSubunit.create().sugar(value).build().sugar());
    }
}
