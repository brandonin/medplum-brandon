/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TestScriptSetupTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TestScript.TestScriptSetup(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TestScript.TestScriptSetup.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", TestScript.TestScriptSetup.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptSetup.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testAction() {
        final java.util.List<TestScript.TestScriptAction> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptSetup.create().action(value).build().action());
    }
}
