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
package ode.integration.provider;


import java.util.Collection;
import java.util.List;

import ode.architecture.ArchitectureFactory;

import ode.assuranceCase.AssuranceCase_Factory;

import ode.base.provider.MergedODEEditPlugin;

import ode.dependability.Dependability_Factory;

import ode.failureLogic.FailureLogic_Factory;

import ode.integration.DDIPackage;
import ode.integration.IntegrationPackage;

import ode.odeBase.provider.BaseElementItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ode.integration.DDIPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DDIPackageItemProvider extends BaseElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDIPackageItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IntegrationPackage.Literals.DDI_PACKAGE__ODE_PRODUCT_PACKAGES);
			childrenFeatures.add(IntegrationPackage.Literals.DDI_PACKAGE__ASSURANCE_CASE_PACKAGES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DDIPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DDIPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DDIPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DDIPackage_type") :
			getString("_UI_DDIPackage_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DDIPackage.class)) {
			case IntegrationPackage.DDI_PACKAGE__ODE_PRODUCT_PACKAGES:
			case IntegrationPackage.DDI_PACKAGE__ASSURANCE_CASE_PACKAGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(IntegrationPackage.Literals.DDI_PACKAGE__ODE_PRODUCT_PACKAGES,
				 FailureLogic_Factory.eINSTANCE.createFailureLogicPackage()));

		newChildDescriptors.add
			(createChildParameter
				(IntegrationPackage.Literals.DDI_PACKAGE__ODE_PRODUCT_PACKAGES,
				 Dependability_Factory.eINSTANCE.createDependabilityPackage()));

		newChildDescriptors.add
			(createChildParameter
				(IntegrationPackage.Literals.DDI_PACKAGE__ODE_PRODUCT_PACKAGES,
				 Dependability_Factory.eINSTANCE.createHARAPackage()));

		newChildDescriptors.add
			(createChildParameter
				(IntegrationPackage.Literals.DDI_PACKAGE__ODE_PRODUCT_PACKAGES,
				 Dependability_Factory.eINSTANCE.createRequirementPackage()));

		newChildDescriptors.add
			(createChildParameter
				(IntegrationPackage.Literals.DDI_PACKAGE__ODE_PRODUCT_PACKAGES,
				 Dependability_Factory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(IntegrationPackage.Literals.DDI_PACKAGE__ODE_PRODUCT_PACKAGES,
				 Dependability_Factory.eINSTANCE.createTARAPackage()));

		newChildDescriptors.add
			(createChildParameter
				(IntegrationPackage.Literals.DDI_PACKAGE__ODE_PRODUCT_PACKAGES,
				 ArchitectureFactory.eINSTANCE.createDesignPackage()));

		newChildDescriptors.add
			(createChildParameter
				(IntegrationPackage.Literals.DDI_PACKAGE__ASSURANCE_CASE_PACKAGES,
				 AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackage()));

		newChildDescriptors.add
			(createChildParameter
				(IntegrationPackage.Literals.DDI_PACKAGE__ASSURANCE_CASE_PACKAGES,
				 AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(IntegrationPackage.Literals.DDI_PACKAGE__ASSURANCE_CASE_PACKAGES,
				 AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackageInterface()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MergedODEEditPlugin.INSTANCE;
	}

}
