/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ConceptMapGroupTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ConceptMap.ConceptMapGroup(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ConceptMap.ConceptMapGroup.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ConceptMap.ConceptMapGroup.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.ConceptMapGroup.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSource() {
        assertEquals("x", ConceptMap.ConceptMapGroup.create().source("x").build().source());
    }

    @Test
    public void testSourceVersion() {
        assertEquals("x", ConceptMap.ConceptMapGroup.create().sourceVersion("x").build().sourceVersion());
    }

    @Test
    public void testTarget() {
        assertEquals("x", ConceptMap.ConceptMapGroup.create().target("x").build().target());
    }

    @Test
    public void testTargetVersion() {
        assertEquals("x", ConceptMap.ConceptMapGroup.create().targetVersion("x").build().targetVersion());
    }

    @Test
    public void testElement() {
        final java.util.List<ConceptMap.ConceptMapElement> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.ConceptMapGroup.create().element(value).build().element());
    }

    @Test
    public void testUnmapped() {
        final ConceptMap.ConceptMapUnmapped value = ConceptMap.ConceptMapUnmapped.create().build();
        assertEquals(value, ConceptMap.ConceptMapGroup.create().unmapped(value).build().unmapped());
    }
}
