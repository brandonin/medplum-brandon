/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class StructureDefinitionDifferentialTest {

    @Test
    public void testConstructor() {
        assertNotNull(new StructureDefinition.StructureDefinitionDifferential(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(StructureDefinition.StructureDefinitionDifferential.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", StructureDefinition.StructureDefinitionDifferential.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, StructureDefinition.StructureDefinitionDifferential.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testElement() {
        final java.util.List<ElementDefinition> value = java.util.Collections.emptyList();
        assertEquals(value, StructureDefinition.StructureDefinitionDifferential.create().element(value).build().element());
    }
}
