/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ServiceRequestTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ServiceRequest(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ServiceRequest.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", ServiceRequest.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", ServiceRequest.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, ServiceRequest.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", ServiceRequest.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ServiceRequest.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, ServiceRequest.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().identifier(value).build().identifier());
    }

    @Test
    public void testInstantiatesCanonical() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().instantiatesCanonical(value).build().instantiatesCanonical());
    }

    @Test
    public void testInstantiatesUri() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().instantiatesUri(value).build().instantiatesUri());
    }

    @Test
    public void testBasedOn() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().basedOn(value).build().basedOn());
    }

    @Test
    public void testReplaces() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().replaces(value).build().replaces());
    }

    @Test
    public void testRequisition() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, ServiceRequest.create().requisition(value).build().requisition());
    }

    @Test
    public void testStatus() {
        assertEquals("x", ServiceRequest.create().status("x").build().status());
    }

    @Test
    public void testIntent() {
        assertEquals("x", ServiceRequest.create().intent("x").build().intent());
    }

    @Test
    public void testCategory() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().category(value).build().category());
    }

    @Test
    public void testPriority() {
        assertEquals("x", ServiceRequest.create().priority("x").build().priority());
    }

    @Test
    public void testDoNotPerform() {
        assertEquals(true, ServiceRequest.create().doNotPerform(true).build().doNotPerform());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ServiceRequest.create().code(value).build().code());
    }

    @Test
    public void testOrderDetail() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().orderDetail(value).build().orderDetail());
    }

    @Test
    public void testQuantityQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ServiceRequest.create().quantityQuantity(value).build().quantityQuantity());
    }

    @Test
    public void testQuantityRatio() {
        final Ratio value = Ratio.create().build();
        assertEquals(value, ServiceRequest.create().quantityRatio(value).build().quantityRatio());
    }

    @Test
    public void testQuantityRange() {
        final Range value = Range.create().build();
        assertEquals(value, ServiceRequest.create().quantityRange(value).build().quantityRange());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, ServiceRequest.create().subject(value).build().subject());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, ServiceRequest.create().encounter(value).build().encounter());
    }

    @Test
    public void testOccurrenceDateTime() {
        assertEquals("x", ServiceRequest.create().occurrenceDateTime("x").build().occurrenceDateTime());
    }

    @Test
    public void testOccurrencePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, ServiceRequest.create().occurrencePeriod(value).build().occurrencePeriod());
    }

    @Test
    public void testOccurrenceTiming() {
        final Timing value = Timing.create().build();
        assertEquals(value, ServiceRequest.create().occurrenceTiming(value).build().occurrenceTiming());
    }

    @Test
    public void testAsNeededBoolean() {
        assertEquals(true, ServiceRequest.create().asNeededBoolean(true).build().asNeededBoolean());
    }

    @Test
    public void testAsNeededCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ServiceRequest.create().asNeededCodeableConcept(value).build().asNeededCodeableConcept());
    }

    @Test
    public void testAuthoredOn() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, ServiceRequest.create().authoredOn(value).build().authoredOn());
    }

    @Test
    public void testRequester() {
        final Reference value = Reference.create().build();
        assertEquals(value, ServiceRequest.create().requester(value).build().requester());
    }

    @Test
    public void testPerformerType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ServiceRequest.create().performerType(value).build().performerType());
    }

    @Test
    public void testPerformer() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().performer(value).build().performer());
    }

    @Test
    public void testLocationCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().locationCode(value).build().locationCode());
    }

    @Test
    public void testLocationReference() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().locationReference(value).build().locationReference());
    }

    @Test
    public void testReasonCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().reasonCode(value).build().reasonCode());
    }

    @Test
    public void testReasonReference() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().reasonReference(value).build().reasonReference());
    }

    @Test
    public void testInsurance() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().insurance(value).build().insurance());
    }

    @Test
    public void testSupportingInfo() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().supportingInfo(value).build().supportingInfo());
    }

    @Test
    public void testSpecimen() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().specimen(value).build().specimen());
    }

    @Test
    public void testBodySite() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().bodySite(value).build().bodySite());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().note(value).build().note());
    }

    @Test
    public void testPatientInstruction() {
        assertEquals("x", ServiceRequest.create().patientInstruction("x").build().patientInstruction());
    }

    @Test
    public void testRelevantHistory() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ServiceRequest.create().relevantHistory(value).build().relevantHistory());
    }
}
