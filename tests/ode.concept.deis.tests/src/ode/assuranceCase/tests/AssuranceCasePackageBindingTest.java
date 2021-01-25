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
package ode.assuranceCase.tests;

import junit.textui.TestRunner;

import ode.assuranceCase.AssuranceCasePackageBinding;
import ode.assuranceCase.AssuranceCase_Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assurance Case Package Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssuranceCasePackageBindingTest extends AssuranceCasePackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssuranceCasePackageBindingTest.class);
	}

	/**
	 * Constructs a new Assurance Case Package Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCasePackageBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Assurance Case Package Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssuranceCasePackageBinding getFixture() {
		return (AssuranceCasePackageBinding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackageBinding());
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

} //AssuranceCasePackageBindingTest
