/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ObservationDefinitionQuantitativeDetailsTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ObservationDefinition.ObservationDefinitionQuantitativeDetails(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ObservationDefinition.ObservationDefinitionQuantitativeDetails.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ObservationDefinition.ObservationDefinitionQuantitativeDetails.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ObservationDefinition.ObservationDefinitionQuantitativeDetails.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCustomaryUnit() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ObservationDefinition.ObservationDefinitionQuantitativeDetails.create().customaryUnit(value).build().customaryUnit());
    }

    @Test
    public void testUnit() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ObservationDefinition.ObservationDefinitionQuantitativeDetails.create().unit(value).build().unit());
    }

    @Test
    public void testConversionFactor() {
        assertEquals(1.0, ObservationDefinition.ObservationDefinitionQuantitativeDetails.create().conversionFactor(1.0).build().conversionFactor());
    }

    @Test
    public void testDecimalPrecision() {
        assertEquals(1, ObservationDefinition.ObservationDefinitionQuantitativeDetails.create().decimalPrecision(1).build().decimalPrecision());
    }
}
