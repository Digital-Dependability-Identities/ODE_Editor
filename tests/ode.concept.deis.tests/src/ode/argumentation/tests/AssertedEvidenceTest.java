/*******************************************************************************
 * Copyright (c) 2018 DEIS Project
 * Copyright (c) 2020 PANORAMA Project
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the MIT License, available at: 
 * https://opensource.org/licenses/MIT
 *
 * SPDX-License-Identifier: MIT
 *******************************************************************************/
/**
 */
package ode.argumentation.tests;

import junit.textui.TestRunner;

import ode.argumentation.ArgumentationFactory;
import ode.argumentation.AssertedEvidence;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asserted Evidence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssertedEvidenceTest extends AssertedRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssertedEvidenceTest.class);
	}

	/**
	 * Constructs a new Asserted Evidence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedEvidenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asserted Evidence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssertedEvidence getFixture() {
		return (AssertedEvidence)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArgumentationFactory.eINSTANCE.createAssertedEvidence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AssertedEvidenceTest
