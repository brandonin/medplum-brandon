/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ObservationDefinitionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ObservationDefinition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ObservationDefinition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", ObservationDefinition.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", ObservationDefinition.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, ObservationDefinition.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", ObservationDefinition.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ObservationDefinition.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, ObservationDefinition.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, ObservationDefinition.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ObservationDefinition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCategory() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ObservationDefinition.create().category(value).build().category());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ObservationDefinition.create().code(value).build().code());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, ObservationDefinition.create().identifier(value).build().identifier());
    }

    @Test
    public void testPermittedDataType() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ObservationDefinition.create().permittedDataType(value).build().permittedDataType());
    }

    @Test
    public void testMultipleResultsAllowed() {
        assertEquals(true, ObservationDefinition.create().multipleResultsAllowed(true).build().multipleResultsAllowed());
    }

    @Test
    public void testMethod() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ObservationDefinition.create().method(value).build().method());
    }

    @Test
    public void testPreferredReportName() {
        assertEquals("x", ObservationDefinition.create().preferredReportName("x").build().preferredReportName());
    }

    @Test
    public void testQuantitativeDetails() {
        final ObservationDefinition.ObservationDefinitionQuantitativeDetails value = ObservationDefinition.ObservationDefinitionQuantitativeDetails.create().build();
        assertEquals(value, ObservationDefinition.create().quantitativeDetails(value).build().quantitativeDetails());
    }

    @Test
    public void testQualifiedInterval() {
        final java.util.List<ObservationDefinition.ObservationDefinitionQualifiedInterval> value = java.util.Collections.emptyList();
        assertEquals(value, ObservationDefinition.create().qualifiedInterval(value).build().qualifiedInterval());
    }

    @Test
    public void testValidCodedValueSet() {
        final Reference value = Reference.create().build();
        assertEquals(value, ObservationDefinition.create().validCodedValueSet(value).build().validCodedValueSet());
    }

    @Test
    public void testNormalCodedValueSet() {
        final Reference value = Reference.create().build();
        assertEquals(value, ObservationDefinition.create().normalCodedValueSet(value).build().normalCodedValueSet());
    }

    @Test
    public void testAbnormalCodedValueSet() {
        final Reference value = Reference.create().build();
        assertEquals(value, ObservationDefinition.create().abnormalCodedValueSet(value).build().abnormalCodedValueSet());
    }

    @Test
    public void testCriticalCodedValueSet() {
        final Reference value = Reference.create().build();
        assertEquals(value, ObservationDefinition.create().criticalCodedValueSet(value).build().criticalCodedValueSet());
    }
}
