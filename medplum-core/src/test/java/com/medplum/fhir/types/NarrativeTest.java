/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class NarrativeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Narrative(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Narrative.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Narrative.create().id("x").build().id());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Narrative.create().status("x").build().status());
    }

    @Test
    public void testDiv() {
        assertEquals("x", Narrative.create().div("x").build().div());
    }
}
