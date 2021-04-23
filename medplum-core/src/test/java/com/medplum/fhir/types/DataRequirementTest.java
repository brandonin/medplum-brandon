/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DataRequirementTest {

    @Test
    public void testConstructor() {
        assertNotNull(new DataRequirement(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(DataRequirement.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", DataRequirement.create().id("x").build().id());
    }

    @Test
    public void testType() {
        assertEquals("x", DataRequirement.create().type("x").build().type());
    }

    @Test
    public void testProfile() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, DataRequirement.create().profile(value).build().profile());
    }

    @Test
    public void testSubjectCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, DataRequirement.create().subjectCodeableConcept(value).build().subjectCodeableConcept());
    }

    @Test
    public void testSubjectReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, DataRequirement.create().subjectReference(value).build().subjectReference());
    }

    @Test
    public void testMustSupport() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, DataRequirement.create().mustSupport(value).build().mustSupport());
    }

    @Test
    public void testCodeFilter() {
        final java.util.List<DataRequirement.DataRequirementCodeFilter> value = java.util.Collections.emptyList();
        assertEquals(value, DataRequirement.create().codeFilter(value).build().codeFilter());
    }

    @Test
    public void testDateFilter() {
        final java.util.List<DataRequirement.DataRequirementDateFilter> value = java.util.Collections.emptyList();
        assertEquals(value, DataRequirement.create().dateFilter(value).build().dateFilter());
    }

    @Test
    public void testLimit() {
        assertEquals(1, DataRequirement.create().limit(1).build().limit());
    }

    @Test
    public void testSort() {
        final java.util.List<DataRequirement.DataRequirementSort> value = java.util.Collections.emptyList();
        assertEquals(value, DataRequirement.create().sort(value).build().sort());
    }
}
