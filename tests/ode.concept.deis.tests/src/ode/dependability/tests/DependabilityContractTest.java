/**
 */
package ode.dependability.tests;

import junit.textui.TestRunner;

import ode.dependability.DependabilityContract;
import ode.dependability.Dependability_Factory;

import ode.odeBase.tests.BaseElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dependability Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependabilityContractTest extends BaseElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DependabilityContractTest.class);
	}

	/**
	 * Constructs a new Dependability Contract test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependabilityContractTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dependability Contract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DependabilityContract getFixture() {
		return (DependabilityContract)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dependability_Factory.eINSTANCE.createDependabilityContract());
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

} //DependabilityContractTest
