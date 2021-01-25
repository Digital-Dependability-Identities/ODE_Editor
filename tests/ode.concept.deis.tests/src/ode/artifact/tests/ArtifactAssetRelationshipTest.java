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
package ode.artifact.tests;

import junit.textui.TestRunner;

import ode.artifact.ArtifactAssetRelationship;
import ode.artifact.Artifact_Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact Asset Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactAssetRelationshipTest extends ArtifactAssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArtifactAssetRelationshipTest.class);
	}

	/**
	 * Constructs a new Artifact Asset Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssetRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Artifact Asset Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArtifactAssetRelationship getFixture() {
		return (ArtifactAssetRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Artifact_Factory.eINSTANCE.createArtifactAssetRelationship());
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

} //ArtifactAssetRelationshipTest
