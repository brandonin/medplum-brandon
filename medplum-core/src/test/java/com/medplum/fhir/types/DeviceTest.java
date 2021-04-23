/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DeviceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Device(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Device.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", Device.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", Device.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Device.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", Device.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Device.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Device.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Device.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Device.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Device.create().identifier(value).build().identifier());
    }

    @Test
    public void testDefinition() {
        final Reference value = Reference.create().build();
        assertEquals(value, Device.create().definition(value).build().definition());
    }

    @Test
    public void testUdiCarrier() {
        final java.util.List<Device.DeviceUdiCarrier> value = java.util.Collections.emptyList();
        assertEquals(value, Device.create().udiCarrier(value).build().udiCarrier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Device.create().status("x").build().status());
    }

    @Test
    public void testStatusReason() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Device.create().statusReason(value).build().statusReason());
    }

    @Test
    public void testDistinctIdentifier() {
        assertEquals("x", Device.create().distinctIdentifier("x").build().distinctIdentifier());
    }

    @Test
    public void testManufacturer() {
        assertEquals("x", Device.create().manufacturer("x").build().manufacturer());
    }

    @Test
    public void testManufactureDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Device.create().manufactureDate(value).build().manufactureDate());
    }

    @Test
    public void testExpirationDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Device.create().expirationDate(value).build().expirationDate());
    }

    @Test
    public void testLotNumber() {
        assertEquals("x", Device.create().lotNumber("x").build().lotNumber());
    }

    @Test
    public void testSerialNumber() {
        assertEquals("x", Device.create().serialNumber("x").build().serialNumber());
    }

    @Test
    public void testDeviceName() {
        final java.util.List<Device.DeviceDeviceName> value = java.util.Collections.emptyList();
        assertEquals(value, Device.create().deviceName(value).build().deviceName());
    }

    @Test
    public void testModelNumber() {
        assertEquals("x", Device.create().modelNumber("x").build().modelNumber());
    }

    @Test
    public void testPartNumber() {
        assertEquals("x", Device.create().partNumber("x").build().partNumber());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Device.create().type(value).build().type());
    }

    @Test
    public void testSpecialization() {
        final java.util.List<Device.DeviceSpecialization> value = java.util.Collections.emptyList();
        assertEquals(value, Device.create().specialization(value).build().specialization());
    }

    @Test
    public void testVersion() {
        final java.util.List<Device.DeviceVersion> value = java.util.Collections.emptyList();
        assertEquals(value, Device.create().version(value).build().version());
    }

    @Test
    public void testProperty() {
        final java.util.List<Device.DeviceProperty> value = java.util.Collections.emptyList();
        assertEquals(value, Device.create().property(value).build().property());
    }

    @Test
    public void testPatient() {
        final Reference value = Reference.create().build();
        assertEquals(value, Device.create().patient(value).build().patient());
    }

    @Test
    public void testOwner() {
        final Reference value = Reference.create().build();
        assertEquals(value, Device.create().owner(value).build().owner());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactPoint> value = java.util.Collections.emptyList();
        assertEquals(value, Device.create().contact(value).build().contact());
    }

    @Test
    public void testLocation() {
        final Reference value = Reference.create().build();
        assertEquals(value, Device.create().location(value).build().location());
    }

    @Test
    public void testUrl() {
        assertEquals("x", Device.create().url("x").build().url());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, Device.create().note(value).build().note());
    }

    @Test
    public void testSafety() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Device.create().safety(value).build().safety());
    }

    @Test
    public void testParent() {
        final Reference value = Reference.create().build();
        assertEquals(value, Device.create().parent(value).build().parent());
    }
}
