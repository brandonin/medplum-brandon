/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CompositionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Composition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Composition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", Composition.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", Composition.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Composition.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", Composition.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Composition.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Composition.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, Composition.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Composition.create().status("x").build().status());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Composition.create().type(value).build().type());
    }

    @Test
    public void testCategory() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.create().category(value).build().category());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, Composition.create().subject(value).build().subject());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, Composition.create().encounter(value).build().encounter());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Composition.create().date(value).build().date());
    }

    @Test
    public void testAuthor() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.create().author(value).build().author());
    }

    @Test
    public void testTitle() {
        assertEquals("x", Composition.create().title("x").build().title());
    }

    @Test
    public void testConfidentiality() {
        assertEquals("x", Composition.create().confidentiality("x").build().confidentiality());
    }

    @Test
    public void testAttester() {
        final java.util.List<Composition.CompositionAttester> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.create().attester(value).build().attester());
    }

    @Test
    public void testCustodian() {
        final Reference value = Reference.create().build();
        assertEquals(value, Composition.create().custodian(value).build().custodian());
    }

    @Test
    public void testRelatesTo() {
        final java.util.List<Composition.CompositionRelatesTo> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.create().relatesTo(value).build().relatesTo());
    }

    @Test
    public void testEvent() {
        final java.util.List<Composition.CompositionEvent> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.create().event(value).build().event());
    }

    @Test
    public void testSection() {
        final java.util.List<Composition.CompositionSection> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.create().section(value).build().section());
    }
}
