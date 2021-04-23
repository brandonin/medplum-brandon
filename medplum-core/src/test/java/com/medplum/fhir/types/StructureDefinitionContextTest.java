/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class StructureDefinitionContextTest {

    @Test
    public void testConstructor() {
        assertNotNull(new StructureDefinition.StructureDefinitionContext(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(StructureDefinition.StructureDefinitionContext.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", StructureDefinition.StructureDefinitionContext.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, StructureDefinition.StructureDefinitionContext.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        assertEquals("x", StructureDefinition.StructureDefinitionContext.create().type("x").build().type());
    }

    @Test
    public void testExpression() {
        assertEquals("x", StructureDefinition.StructureDefinitionContext.create().expression("x").build().expression());
    }
}
