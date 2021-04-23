/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicationKnowledgeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicationKnowledge(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicationKnowledge.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", MedicationKnowledge.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", MedicationKnowledge.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, MedicationKnowledge.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", MedicationKnowledge.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", MedicationKnowledge.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, MedicationKnowledge.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationKnowledge.create().code(value).build().code());
    }

    @Test
    public void testStatus() {
        assertEquals("x", MedicationKnowledge.create().status("x").build().status());
    }

    @Test
    public void testManufacturer() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationKnowledge.create().manufacturer(value).build().manufacturer());
    }

    @Test
    public void testDoseForm() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationKnowledge.create().doseForm(value).build().doseForm());
    }

    @Test
    public void testAmount() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, MedicationKnowledge.create().amount(value).build().amount());
    }

    @Test
    public void testSynonym() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().synonym(value).build().synonym());
    }

    @Test
    public void testRelatedMedicationKnowledge() {
        final java.util.List<MedicationKnowledge.MedicationKnowledgeRelatedMedicationKnowledge> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().relatedMedicationKnowledge(value).build().relatedMedicationKnowledge());
    }

    @Test
    public void testAssociatedMedication() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().associatedMedication(value).build().associatedMedication());
    }

    @Test
    public void testProductType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().productType(value).build().productType());
    }

    @Test
    public void testMonograph() {
        final java.util.List<MedicationKnowledge.MedicationKnowledgeMonograph> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().monograph(value).build().monograph());
    }

    @Test
    public void testIngredient() {
        final java.util.List<MedicationKnowledge.MedicationKnowledgeIngredient> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().ingredient(value).build().ingredient());
    }

    @Test
    public void testPreparationInstruction() {
        assertEquals("x", MedicationKnowledge.create().preparationInstruction("x").build().preparationInstruction());
    }

    @Test
    public void testIntendedRoute() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().intendedRoute(value).build().intendedRoute());
    }

    @Test
    public void testCost() {
        final java.util.List<MedicationKnowledge.MedicationKnowledgeCost> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().cost(value).build().cost());
    }

    @Test
    public void testMonitoringProgram() {
        final java.util.List<MedicationKnowledge.MedicationKnowledgeMonitoringProgram> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().monitoringProgram(value).build().monitoringProgram());
    }

    @Test
    public void testAdministrationGuidelines() {
        final java.util.List<MedicationKnowledge.MedicationKnowledgeAdministrationGuidelines> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().administrationGuidelines(value).build().administrationGuidelines());
    }

    @Test
    public void testMedicineClassification() {
        final java.util.List<MedicationKnowledge.MedicationKnowledgeMedicineClassification> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().medicineClassification(value).build().medicineClassification());
    }

    @Test
    public void testPackaging() {
        final MedicationKnowledge.MedicationKnowledgePackaging value = MedicationKnowledge.MedicationKnowledgePackaging.create().build();
        assertEquals(value, MedicationKnowledge.create().packaging(value).build().packaging());
    }

    @Test
    public void testDrugCharacteristic() {
        final java.util.List<MedicationKnowledge.MedicationKnowledgeDrugCharacteristic> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().drugCharacteristic(value).build().drugCharacteristic());
    }

    @Test
    public void testContraindication() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().contraindication(value).build().contraindication());
    }

    @Test
    public void testRegulatory() {
        final java.util.List<MedicationKnowledge.MedicationKnowledgeRegulatory> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().regulatory(value).build().regulatory());
    }

    @Test
    public void testKinetics() {
        final java.util.List<MedicationKnowledge.MedicationKnowledgeKinetics> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.create().kinetics(value).build().kinetics());
    }
}
