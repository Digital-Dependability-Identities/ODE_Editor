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
import ode.architecture.SystemBoundary;

import ode.odeBase.tests.BaseElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Boundary</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemBoundaryTest extends BaseElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemBoundaryTest.class);
	}

	/**
	 * Constructs a new System Boundary test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemBoundaryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Boundary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemBoundary getFixture() {
		return (SystemBoundary)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArchitectureFactory.eINSTANCE.createSystemBoundary());
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

} //SystemBoundaryTest
