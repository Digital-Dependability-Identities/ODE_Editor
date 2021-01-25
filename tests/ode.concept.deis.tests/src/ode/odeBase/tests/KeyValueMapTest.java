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
package ode.odeBase.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ode.odeBase.KeyValueMap;
import ode.odeBase.OdeBaseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Key Value Map</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KeyValueMapTest extends TestCase {

	/**
	 * The fixture for this Key Value Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyValueMap fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KeyValueMapTest.class);
	}

	/**
	 * Constructs a new Key Value Map test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueMapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Key Value Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(KeyValueMap fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Key Value Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyValueMap getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OdeBaseFactory.eINSTANCE.createKeyValueMap());
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

} //KeyValueMapTest
