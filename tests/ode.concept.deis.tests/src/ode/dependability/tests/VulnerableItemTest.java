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
import ode.dependability.VulnerableItem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vulnerable Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VulnerableItemTest extends AssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VulnerableItemTest.class);
	}

	/**
	 * Constructs a new Vulnerable Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VulnerableItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Vulnerable Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VulnerableItem getFixture() {
		return (VulnerableItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dependability_Factory.eINSTANCE.createVulnerableItem());
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

} //VulnerableItemTest
