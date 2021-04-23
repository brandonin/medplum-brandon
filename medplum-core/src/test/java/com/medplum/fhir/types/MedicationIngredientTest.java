/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicationIngredientTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Medication.MedicationIngredient(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Medication.MedicationIngredient.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Medication.MedicationIngredient.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Medication.MedicationIngredient.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testItemCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Medication.MedicationIngredient.create().itemCodeableConcept(value).build().itemCodeableConcept());
    }

    @Test
    public void testItemReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Medication.MedicationIngredient.create().itemReference(value).build().itemReference());
    }

    @Test
    public void testIsActive() {
        assertEquals(true, Medication.MedicationIngredient.create().isActive(true).build().isActive());
    }

    @Test
    public void testStrength() {
        final Ratio value = Ratio.create().build();
        assertEquals(value, Medication.MedicationIngredient.create().strength(value).build().strength());
    }
}
