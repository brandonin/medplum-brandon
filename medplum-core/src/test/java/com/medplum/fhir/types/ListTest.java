/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ListTest {

    @Test
    public void testConstructor() {
        assertNotNull(new List(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(List.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", List.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", List.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, List.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", List.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", List.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, List.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, List.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, List.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, List.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", List.create().status("x").build().status());
    }

    @Test
    public void testMode() {
        assertEquals("x", List.create().mode("x").build().mode());
    }

    @Test
    public void testTitle() {
        assertEquals("x", List.create().title("x").build().title());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, List.create().code(value).build().code());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, List.create().subject(value).build().subject());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, List.create().encounter(value).build().encounter());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, List.create().date(value).build().date());
    }

    @Test
    public void testSource() {
        final Reference value = Reference.create().build();
        assertEquals(value, List.create().source(value).build().source());
    }

    @Test
    public void testOrderedBy() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, List.create().orderedBy(value).build().orderedBy());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, List.create().note(value).build().note());
    }

    @Test
    public void testEntry() {
        final java.util.List<List.ListEntry> value = java.util.Collections.emptyList();
        assertEquals(value, List.create().entry(value).build().entry());
    }

    @Test
    public void testEmptyReason() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, List.create().emptyReason(value).build().emptyReason());
    }
}
