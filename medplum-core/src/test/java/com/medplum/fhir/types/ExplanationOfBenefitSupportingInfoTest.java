/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExplanationOfBenefitSupportingInfoTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSequence() {
        assertEquals(1, ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().sequence(1).build().sequence());
    }

    @Test
    public void testCategory() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().category(value).build().category());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().code(value).build().code());
    }

    @Test
    public void testTimingDate() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().timingDate("x").build().timingDate());
    }

    @Test
    public void testTimingPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().timingPeriod(value).build().timingPeriod());
    }

    @Test
    public void testValueBoolean() {
        assertEquals(true, ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().valueBoolean(true).build().valueBoolean());
    }

    @Test
    public void testValueString() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().valueString("x").build().valueString());
    }

    @Test
    public void testValueQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().valueQuantity(value).build().valueQuantity());
    }

    @Test
    public void testValueAttachment() {
        final Attachment value = Attachment.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().valueAttachment(value).build().valueAttachment());
    }

    @Test
    public void testValueReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().valueReference(value).build().valueReference());
    }

    @Test
    public void testReason() {
        final Coding value = Coding.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitSupportingInfo.create().reason(value).build().reason());
    }
}
