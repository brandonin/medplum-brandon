/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class InvoiceLineItemTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Invoice.InvoiceLineItem(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Invoice.InvoiceLineItem.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Invoice.InvoiceLineItem.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Invoice.InvoiceLineItem.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSequence() {
        assertEquals(1, Invoice.InvoiceLineItem.create().sequence(1).build().sequence());
    }

    @Test
    public void testChargeItemReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Invoice.InvoiceLineItem.create().chargeItemReference(value).build().chargeItemReference());
    }

    @Test
    public void testChargeItemCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Invoice.InvoiceLineItem.create().chargeItemCodeableConcept(value).build().chargeItemCodeableConcept());
    }

    @Test
    public void testPriceComponent() {
        final java.util.List<Invoice.InvoicePriceComponent> value = java.util.Collections.emptyList();
        assertEquals(value, Invoice.InvoiceLineItem.create().priceComponent(value).build().priceComponent());
    }
}
