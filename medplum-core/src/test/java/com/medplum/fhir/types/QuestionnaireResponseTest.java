/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class QuestionnaireResponseTest {

    @Test
    public void testConstructor() {
        assertNotNull(new QuestionnaireResponse(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(QuestionnaireResponse.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", QuestionnaireResponse.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", QuestionnaireResponse.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, QuestionnaireResponse.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", QuestionnaireResponse.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", QuestionnaireResponse.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, QuestionnaireResponse.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, QuestionnaireResponse.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, QuestionnaireResponse.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, QuestionnaireResponse.create().identifier(value).build().identifier());
    }

    @Test
    public void testBasedOn() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, QuestionnaireResponse.create().basedOn(value).build().basedOn());
    }

    @Test
    public void testPartOf() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, QuestionnaireResponse.create().partOf(value).build().partOf());
    }

    @Test
    public void testQuestionnaire() {
        assertEquals("x", QuestionnaireResponse.create().questionnaire("x").build().questionnaire());
    }

    @Test
    public void testStatus() {
        assertEquals("x", QuestionnaireResponse.create().status("x").build().status());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, QuestionnaireResponse.create().subject(value).build().subject());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, QuestionnaireResponse.create().encounter(value).build().encounter());
    }

    @Test
    public void testAuthored() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, QuestionnaireResponse.create().authored(value).build().authored());
    }

    @Test
    public void testAuthor() {
        final Reference value = Reference.create().build();
        assertEquals(value, QuestionnaireResponse.create().author(value).build().author());
    }

    @Test
    public void testSource() {
        final Reference value = Reference.create().build();
        assertEquals(value, QuestionnaireResponse.create().source(value).build().source());
    }

    @Test
    public void testItem() {
        final java.util.List<QuestionnaireResponse.QuestionnaireResponseItem> value = java.util.Collections.emptyList();
        assertEquals(value, QuestionnaireResponse.create().item(value).build().item());
    }
}
