/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TestScriptMetadataTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TestScript.TestScriptMetadata(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TestScript.TestScriptMetadata.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", TestScript.TestScriptMetadata.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptMetadata.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testLink() {
        final java.util.List<TestScript.TestScriptLink> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptMetadata.create().link(value).build().link());
    }

    @Test
    public void testCapability() {
        final java.util.List<TestScript.TestScriptCapability> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptMetadata.create().capability(value).build().capability());
    }
}
