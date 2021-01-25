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
import ode.dependability.SafetyStandard;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Safety Standard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyStandardTest extends StandardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SafetyStandardTest.class);
	}

	/**
	 * Constructs a new Safety Standard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyStandardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Safety Standard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SafetyStandard getFixture() {
		return (SafetyStandard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dependability_Factory.eINSTANCE.createSafetyStandard());
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

} //SafetyStandardTest
