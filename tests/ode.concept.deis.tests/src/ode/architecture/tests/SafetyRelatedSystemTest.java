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
package ode.architecture.tests;

import junit.textui.TestRunner;

import ode.architecture.ArchitectureFactory;
import ode.architecture.SafetyRelatedSystem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Safety Related System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyRelatedSystemTest extends SystemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SafetyRelatedSystemTest.class);
	}

	/**
	 * Constructs a new Safety Related System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyRelatedSystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Safety Related System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SafetyRelatedSystem getFixture() {
		return (SafetyRelatedSystem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArchitectureFactory.eINSTANCE.createSafetyRelatedSystem());
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

} //SafetyRelatedSystemTest
