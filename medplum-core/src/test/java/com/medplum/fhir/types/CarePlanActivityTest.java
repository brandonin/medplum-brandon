/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CarePlanActivityTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CarePlan.CarePlanActivity(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CarePlan.CarePlanActivity.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", CarePlan.CarePlanActivity.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CarePlan.CarePlanActivity.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testOutcomeCodeableConcept() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, CarePlan.CarePlanActivity.create().outcomeCodeableConcept(value).build().outcomeCodeableConcept());
    }

    @Test
    public void testOutcomeReference() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, CarePlan.CarePlanActivity.create().outcomeReference(value).build().outcomeReference());
    }

    @Test
    public void testProgress() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, CarePlan.CarePlanActivity.create().progress(value).build().progress());
    }

    @Test
    public void testReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, CarePlan.CarePlanActivity.create().reference(value).build().reference());
    }

    @Test
    public void testDetail() {
        final CarePlan.CarePlanDetail value = CarePlan.CarePlanDetail.create().build();
        assertEquals(value, CarePlan.CarePlanActivity.create().detail(value).build().detail());
    }
}
