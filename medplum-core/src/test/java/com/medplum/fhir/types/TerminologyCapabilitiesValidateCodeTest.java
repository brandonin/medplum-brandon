/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TerminologyCapabilitiesValidateCodeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TerminologyCapabilities.TerminologyCapabilitiesValidateCode(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TerminologyCapabilities.TerminologyCapabilitiesValidateCode.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesValidateCode.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TerminologyCapabilities.TerminologyCapabilitiesValidateCode.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testTranslations() {
        assertEquals(true, TerminologyCapabilities.TerminologyCapabilitiesValidateCode.create().translations(true).build().translations());
    }
}
