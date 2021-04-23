/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClaimResponseAdjudicationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ClaimResponse.ClaimResponseAdjudication(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ClaimResponse.ClaimResponseAdjudication.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ClaimResponse.ClaimResponseAdjudication.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClaimResponse.ClaimResponseAdjudication.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCategory() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ClaimResponse.ClaimResponseAdjudication.create().category(value).build().category());
    }

    @Test
    public void testReason() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ClaimResponse.ClaimResponseAdjudication.create().reason(value).build().reason());
    }

    @Test
    public void testAmount() {
        final Money value = Money.create().build();
        assertEquals(value, ClaimResponse.ClaimResponseAdjudication.create().amount(value).build().amount());
    }

    @Test
    public void testValue() {
        assertEquals(1.0, ClaimResponse.ClaimResponseAdjudication.create().value(1.0).build().value());
    }
}
