/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class AuditEventNetworkTest {

    @Test
    public void testConstructor() {
        assertNotNull(new AuditEvent.AuditEventNetwork(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(AuditEvent.AuditEventNetwork.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", AuditEvent.AuditEventNetwork.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, AuditEvent.AuditEventNetwork.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testAddress() {
        assertEquals("x", AuditEvent.AuditEventNetwork.create().address("x").build().address());
    }

    @Test
    public void testType() {
        assertEquals("x", AuditEvent.AuditEventNetwork.create().type("x").build().type());
    }
}
