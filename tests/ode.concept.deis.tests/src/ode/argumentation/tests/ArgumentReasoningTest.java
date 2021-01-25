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

import ode.argumentation.ArgumentReasoning;
import ode.argumentation.ArgumentationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Argument Reasoning</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentReasoningTest extends ArgumentAssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArgumentReasoningTest.class);
	}

	/**
	 * Constructs a new Argument Reasoning test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentReasoningTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Argument Reasoning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArgumentReasoning getFixture() {
		return (ArgumentReasoning)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArgumentationFactory.eINSTANCE.createArgumentReasoning());
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

} //ArgumentReasoningTest
