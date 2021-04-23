/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SpecimenContainerTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Specimen.SpecimenContainer(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Specimen.SpecimenContainer.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Specimen.SpecimenContainer.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Specimen.SpecimenContainer.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Specimen.SpecimenContainer.create().identifier(value).build().identifier());
    }

    @Test
    public void testDescription() {
        assertEquals("x", Specimen.SpecimenContainer.create().description("x").build().description());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Specimen.SpecimenContainer.create().type(value).build().type());
    }

    @Test
    public void testCapacity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, Specimen.SpecimenContainer.create().capacity(value).build().capacity());
    }

    @Test
    public void testSpecimenQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, Specimen.SpecimenContainer.create().specimenQuantity(value).build().specimenQuantity());
    }

    @Test
    public void testAdditiveCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Specimen.SpecimenContainer.create().additiveCodeableConcept(value).build().additiveCodeableConcept());
    }

    @Test
    public void testAdditiveReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Specimen.SpecimenContainer.create().additiveReference(value).build().additiveReference());
    }
}
