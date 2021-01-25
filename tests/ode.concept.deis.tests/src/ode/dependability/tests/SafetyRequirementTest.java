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
package ode.dependability.tests;

import junit.textui.TestRunner;

import ode.dependability.Dependability_Factory;
import ode.dependability.SafetyRequirement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Safety Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyRequirementTest extends DependabilityRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SafetyRequirementTest.class);
	}

	/**
	 * Constructs a new Safety Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Safety Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SafetyRequirement getFixture() {
		return (SafetyRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dependability_Factory.eINSTANCE.createSafetyRequirement());
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

} //SafetyRequirementTest
