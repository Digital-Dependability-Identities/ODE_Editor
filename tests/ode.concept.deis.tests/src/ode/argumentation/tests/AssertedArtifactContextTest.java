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
import ode.argumentation.AssertedArtifactContext;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asserted Artifact Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssertedArtifactContextTest extends AssertedRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssertedArtifactContextTest.class);
	}

	/**
	 * Constructs a new Asserted Artifact Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedArtifactContextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asserted Artifact Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssertedArtifactContext getFixture() {
		return (AssertedArtifactContext)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArgumentationFactory.eINSTANCE.createAssertedArtifactContext());
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

} //AssertedArtifactContextTest
