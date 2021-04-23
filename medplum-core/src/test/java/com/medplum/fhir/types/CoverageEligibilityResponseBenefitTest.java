/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CoverageEligibilityResponseBenefitTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CoverageEligibilityResponse.CoverageEligibilityResponseBenefit(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CoverageEligibilityResponse.CoverageEligibilityResponseBenefit.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", CoverageEligibilityResponse.CoverageEligibilityResponseBenefit.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseBenefit.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseBenefit.create().type(value).build().type());
    }

    @Test
    public void testAllowedUnsignedInt() {
        assertEquals(1, CoverageEligibilityResponse.CoverageEligibilityResponseBenefit.create().allowedUnsignedInt(1).build().allowedUnsignedInt());
    }

    @Test
    public void testAllowedString() {
        assertEquals("x", CoverageEligibilityResponse.CoverageEligibilityResponseBenefit.create().allowedString("x").build().allowedString());
    }

    @Test
    public void testAllowedMoney() {
        final Money value = Money.create().build();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseBenefit.create().allowedMoney(value).build().allowedMoney());
    }

    @Test
    public void testUsedUnsignedInt() {
        assertEquals(1, CoverageEligibilityResponse.CoverageEligibilityResponseBenefit.create().usedUnsignedInt(1).build().usedUnsignedInt());
    }

    @Test
    public void testUsedString() {
        assertEquals("x", CoverageEligibilityResponse.CoverageEligibilityResponseBenefit.create().usedString("x").build().usedString());
    }

    @Test
    public void testUsedMoney() {
        final Money value = Money.create().build();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseBenefit.create().usedMoney(value).build().usedMoney());
    }
}
