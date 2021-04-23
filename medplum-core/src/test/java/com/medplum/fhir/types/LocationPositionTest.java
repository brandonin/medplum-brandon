/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class LocationPositionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Location.LocationPosition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Location.LocationPosition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Location.LocationPosition.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Location.LocationPosition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testLongitude() {
        assertEquals(1.0, Location.LocationPosition.create().longitude(1.0).build().longitude());
    }

    @Test
    public void testLatitude() {
        assertEquals(1.0, Location.LocationPosition.create().latitude(1.0).build().latitude());
    }

    @Test
    public void testAltitude() {
        assertEquals(1.0, Location.LocationPosition.create().altitude(1.0).build().altitude());
    }
}
