/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TestScriptActionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TestScript.TestScriptAction(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TestScript.TestScriptAction.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", TestScript.TestScriptAction.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptAction.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testOperation() {
        final TestScript.TestScriptOperation value = TestScript.TestScriptOperation.create().build();
        assertEquals(value, TestScript.TestScriptAction.create().operation(value).build().operation());
    }

    @Test
    public void testAssertValue() {
        final TestScript.TestScriptAssert value = TestScript.TestScriptAssert.create().build();
        assertEquals(value, TestScript.TestScriptAction.create().assertValue(value).build().assertValue());
    }
}
