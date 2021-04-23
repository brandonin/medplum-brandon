/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class EncounterStatusHistoryTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Encounter.EncounterStatusHistory(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Encounter.EncounterStatusHistory.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Encounter.EncounterStatusHistory.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Encounter.EncounterStatusHistory.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Encounter.EncounterStatusHistory.create().status("x").build().status());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Encounter.EncounterStatusHistory.create().period(value).build().period());
    }
}
