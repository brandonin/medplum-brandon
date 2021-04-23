/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExplanationOfBenefitBenefitBalanceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExplanationOfBenefit.ExplanationOfBenefitBenefitBalance(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExplanationOfBenefit.ExplanationOfBenefitBenefitBalance.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitBenefitBalance.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitBenefitBalance.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCategory() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitBenefitBalance.create().category(value).build().category());
    }

    @Test
    public void testExcluded() {
        assertEquals(true, ExplanationOfBenefit.ExplanationOfBenefitBenefitBalance.create().excluded(true).build().excluded());
    }

    @Test
    public void testName() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitBenefitBalance.create().name("x").build().name());
    }

    @Test
    public void testDescription() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitBenefitBalance.create().description("x").build().description());
    }

    @Test
    public void testNetwork() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitBenefitBalance.create().network(value).build().network());
    }

    @Test
    public void testUnit() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitBenefitBalance.create().unit(value).build().unit());
    }

    @Test
    public void testTerm() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitBenefitBalance.create().term(value).build().term());
    }

    @Test
    public void testFinancial() {
        final java.util.List<ExplanationOfBenefit.ExplanationOfBenefitFinancial> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitBenefitBalance.create().financial(value).build().financial());
    }
}
