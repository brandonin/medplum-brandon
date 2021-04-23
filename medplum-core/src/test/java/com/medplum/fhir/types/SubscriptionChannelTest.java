/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubscriptionChannelTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Subscription.SubscriptionChannel(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Subscription.SubscriptionChannel.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Subscription.SubscriptionChannel.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Subscription.SubscriptionChannel.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        assertEquals("x", Subscription.SubscriptionChannel.create().type("x").build().type());
    }

    @Test
    public void testEndpoint() {
        assertEquals("x", Subscription.SubscriptionChannel.create().endpoint("x").build().endpoint());
    }

    @Test
    public void testPayload() {
        assertEquals("x", Subscription.SubscriptionChannel.create().payload("x").build().payload());
    }

    @Test
    public void testHeader() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, Subscription.SubscriptionChannel.create().header(value).build().header());
    }
}
