/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CompartmentDefinitionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CompartmentDefinition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CompartmentDefinition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", CompartmentDefinition.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", CompartmentDefinition.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, CompartmentDefinition.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", CompartmentDefinition.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", CompartmentDefinition.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, CompartmentDefinition.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, CompartmentDefinition.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CompartmentDefinition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        assertEquals("x", CompartmentDefinition.create().url("x").build().url());
    }

    @Test
    public void testVersion() {
        assertEquals("x", CompartmentDefinition.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", CompartmentDefinition.create().name("x").build().name());
    }

    @Test
    public void testStatus() {
        assertEquals("x", CompartmentDefinition.create().status("x").build().status());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, CompartmentDefinition.create().experimental(true).build().experimental());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, CompartmentDefinition.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", CompartmentDefinition.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, CompartmentDefinition.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", CompartmentDefinition.create().description("x").build().description());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, CompartmentDefinition.create().useContext(value).build().useContext());
    }

    @Test
    public void testPurpose() {
        assertEquals("x", CompartmentDefinition.create().purpose("x").build().purpose());
    }

    @Test
    public void testCode() {
        assertEquals("x", CompartmentDefinition.create().code("x").build().code());
    }

    @Test
    public void testSearch() {
        assertEquals(true, CompartmentDefinition.create().search(true).build().search());
    }

    @Test
    public void testResource() {
        final java.util.List<CompartmentDefinition.CompartmentDefinitionResource> value = java.util.Collections.emptyList();
        assertEquals(value, CompartmentDefinition.create().resource(value).build().resource());
    }
}
