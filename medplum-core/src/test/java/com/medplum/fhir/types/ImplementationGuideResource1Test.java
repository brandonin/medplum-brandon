/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ImplementationGuideResource1Test {

    @Test
    public void testConstructor() {
        assertNotNull(new ImplementationGuide.ImplementationGuideResource1(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ImplementationGuide.ImplementationGuideResource1.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ImplementationGuide.ImplementationGuideResource1.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuideResource1.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, ImplementationGuide.ImplementationGuideResource1.create().reference(value).build().reference());
    }

    @Test
    public void testExampleBoolean() {
        assertEquals(true, ImplementationGuide.ImplementationGuideResource1.create().exampleBoolean(true).build().exampleBoolean());
    }

    @Test
    public void testExampleCanonical() {
        assertEquals("x", ImplementationGuide.ImplementationGuideResource1.create().exampleCanonical("x").build().exampleCanonical());
    }

    @Test
    public void testRelativePath() {
        assertEquals("x", ImplementationGuide.ImplementationGuideResource1.create().relativePath("x").build().relativePath());
    }
}
