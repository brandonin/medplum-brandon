/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class AccountGuarantorTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Account.AccountGuarantor(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Account.AccountGuarantor.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Account.AccountGuarantor.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Account.AccountGuarantor.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testParty() {
        final Reference value = Reference.create().build();
        assertEquals(value, Account.AccountGuarantor.create().party(value).build().party());
    }

    @Test
    public void testOnHold() {
        assertEquals(true, Account.AccountGuarantor.create().onHold(true).build().onHold());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Account.AccountGuarantor.create().period(value).build().period());
    }
}
