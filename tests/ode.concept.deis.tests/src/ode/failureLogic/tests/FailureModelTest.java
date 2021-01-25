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
package ode.failureLogic.tests;

import junit.textui.TestRunner;

import ode.failureLogic.FailureLogic_Factory;
import ode.failureLogic.FailureModel;

import ode.odeBase.tests.BaseElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Failure Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureModelTest extends BaseElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FailureModelTest.class);
	}

	/**
	 * Constructs a new Failure Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Failure Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FailureModel getFixture() {
		return (FailureModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FailureLogic_Factory.eINSTANCE.createFailureModel());
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

} //FailureModelTest
