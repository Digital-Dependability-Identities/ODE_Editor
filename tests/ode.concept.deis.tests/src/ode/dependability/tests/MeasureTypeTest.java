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
import ode.dependability.MeasureType;

import ode.odeBase.tests.BaseElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measure Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureTypeTest extends BaseElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeasureTypeTest.class);
	}

	/**
	 * Constructs a new Measure Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Measure Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MeasureType getFixture() {
		return (MeasureType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dependability_Factory.eINSTANCE.createMeasureType());
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

} //MeasureTypeTest
