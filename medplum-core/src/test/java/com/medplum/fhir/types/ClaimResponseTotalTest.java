/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClaimResponseTotalTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ClaimResponse.ClaimResponseTotal(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ClaimResponse.ClaimResponseTotal.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ClaimResponse.ClaimResponseTotal.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClaimResponse.ClaimResponseTotal.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCategory() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ClaimResponse.ClaimResponseTotal.create().category(value).build().category());
    }

    @Test
    public void testAmount() {
        final Money value = Money.create().build();
        assertEquals(value, ClaimResponse.ClaimResponseTotal.create().amount(value).build().amount());
    }
}
