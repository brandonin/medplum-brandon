/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CommunicationRequestTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CommunicationRequest(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CommunicationRequest.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", CommunicationRequest.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", CommunicationRequest.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, CommunicationRequest.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", CommunicationRequest.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", CommunicationRequest.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, CommunicationRequest.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().identifier(value).build().identifier());
    }

    @Test
    public void testBasedOn() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().basedOn(value).build().basedOn());
    }

    @Test
    public void testReplaces() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().replaces(value).build().replaces());
    }

    @Test
    public void testGroupIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, CommunicationRequest.create().groupIdentifier(value).build().groupIdentifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", CommunicationRequest.create().status("x").build().status());
    }

    @Test
    public void testStatusReason() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, CommunicationRequest.create().statusReason(value).build().statusReason());
    }

    @Test
    public void testCategory() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().category(value).build().category());
    }

    @Test
    public void testPriority() {
        assertEquals("x", CommunicationRequest.create().priority("x").build().priority());
    }

    @Test
    public void testDoNotPerform() {
        assertEquals(true, CommunicationRequest.create().doNotPerform(true).build().doNotPerform());
    }

    @Test
    public void testMedium() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().medium(value).build().medium());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, CommunicationRequest.create().subject(value).build().subject());
    }

    @Test
    public void testAbout() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().about(value).build().about());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, CommunicationRequest.create().encounter(value).build().encounter());
    }

    @Test
    public void testPayload() {
        final java.util.List<CommunicationRequest.CommunicationRequestPayload> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().payload(value).build().payload());
    }

    @Test
    public void testOccurrenceDateTime() {
        assertEquals("x", CommunicationRequest.create().occurrenceDateTime("x").build().occurrenceDateTime());
    }

    @Test
    public void testOccurrencePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, CommunicationRequest.create().occurrencePeriod(value).build().occurrencePeriod());
    }

    @Test
    public void testAuthoredOn() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, CommunicationRequest.create().authoredOn(value).build().authoredOn());
    }

    @Test
    public void testRequester() {
        final Reference value = Reference.create().build();
        assertEquals(value, CommunicationRequest.create().requester(value).build().requester());
    }

    @Test
    public void testRecipient() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().recipient(value).build().recipient());
    }

    @Test
    public void testSender() {
        final Reference value = Reference.create().build();
        assertEquals(value, CommunicationRequest.create().sender(value).build().sender());
    }

    @Test
    public void testReasonCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().reasonCode(value).build().reasonCode());
    }

    @Test
    public void testReasonReference() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().reasonReference(value).build().reasonReference());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, CommunicationRequest.create().note(value).build().note());
    }
}
