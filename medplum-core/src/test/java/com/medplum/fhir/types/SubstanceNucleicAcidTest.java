/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceNucleicAcidTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstanceNucleicAcid(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstanceNucleicAcid.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", SubstanceNucleicAcid.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", SubstanceNucleicAcid.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, SubstanceNucleicAcid.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", SubstanceNucleicAcid.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", SubstanceNucleicAcid.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, SubstanceNucleicAcid.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceNucleicAcid.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceNucleicAcid.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSequenceType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceNucleicAcid.create().sequenceType(value).build().sequenceType());
    }

    @Test
    public void testNumberOfSubunits() {
        assertEquals(1, SubstanceNucleicAcid.create().numberOfSubunits(1).build().numberOfSubunits());
    }

    @Test
    public void testAreaOfHybridisation() {
        assertEquals("x", SubstanceNucleicAcid.create().areaOfHybridisation("x").build().areaOfHybridisation());
    }

    @Test
    public void testOligoNucleotideType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceNucleicAcid.create().oligoNucleotideType(value).build().oligoNucleotideType());
    }

    @Test
    public void testSubunit() {
        final java.util.List<SubstanceNucleicAcid.SubstanceNucleicAcidSubunit> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceNucleicAcid.create().subunit(value).build().subunit());
    }
}
