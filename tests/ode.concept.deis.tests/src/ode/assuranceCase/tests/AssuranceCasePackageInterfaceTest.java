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

import ode.assuranceCase.AssuranceCasePackageInterface;
import ode.assuranceCase.AssuranceCase_Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assurance Case Package Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssuranceCasePackageInterfaceTest extends AssuranceCasePackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssuranceCasePackageInterfaceTest.class);
	}

	/**
	 * Constructs a new Assurance Case Package Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCasePackageInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Assurance Case Package Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssuranceCasePackageInterface getFixture() {
		return (AssuranceCasePackageInterface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackageInterface());
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

} //AssuranceCasePackageInterfaceTest
