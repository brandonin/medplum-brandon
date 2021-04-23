/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class HealthcareServiceAvailableTimeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new HealthcareService.HealthcareServiceAvailableTime(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(HealthcareService.HealthcareServiceAvailableTime.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", HealthcareService.HealthcareServiceAvailableTime.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.HealthcareServiceAvailableTime.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDaysOfWeek() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.HealthcareServiceAvailableTime.create().daysOfWeek(value).build().daysOfWeek());
    }

    @Test
    public void testAllDay() {
        assertEquals(true, HealthcareService.HealthcareServiceAvailableTime.create().allDay(true).build().allDay());
    }

    @Test
    public void testAvailableStartTime() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, HealthcareService.HealthcareServiceAvailableTime.create().availableStartTime(value).build().availableStartTime());
    }

    @Test
    public void testAvailableEndTime() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, HealthcareService.HealthcareServiceAvailableTime.create().availableEndTime(value).build().availableEndTime());
    }
}
