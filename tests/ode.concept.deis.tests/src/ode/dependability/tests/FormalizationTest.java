/**
 */
package ode.dependability.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ode.dependability.Dependability_Factory;
import ode.dependability.Formalization;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Formalization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormalizationTest extends TestCase {

	/**
	 * The fixture for this Formalization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Formalization fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FormalizationTest.class);
	}

	/**
	 * Constructs a new Formalization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalizationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Formalization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Formalization fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Formalization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Formalization getFixture() {
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
		setFixture(Dependability_Factory.eINSTANCE.createFormalization());
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

} //FormalizationTest
