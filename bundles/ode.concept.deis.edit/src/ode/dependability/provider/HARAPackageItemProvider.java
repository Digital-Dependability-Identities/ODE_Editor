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
package ode.dependability.provider;


import java.util.Collection;
import java.util.List;

import ode.base.provider.MergedODEEditPlugin;

import ode.dependability.Dependability_Factory;
import ode.dependability.Dependability_Package;
import ode.dependability.HARAPackage;

import ode.integration.provider.ODEProductPackageItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ode.dependability.HARAPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HARAPackageItemProvider extends ODEProductPackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HARAPackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Dependability_Package.Literals.HARA_PACKAGE__HAZARDS);
			childrenFeatures.add(Dependability_Package.Literals.HARA_PACKAGE__HAZARD_TYPES);
			childrenFeatures.add(Dependability_Package.Literals.HARA_PACKAGE__HAZARD_TYPE_SYSTEMS);
			childrenFeatures.add(Dependability_Package.Literals.HARA_PACKAGE__MALFUNCTIONS);
			childrenFeatures.add(Dependability_Package.Literals.HARA_PACKAGE__RISK_ASSESSMENTS);
			childrenFeatures.add(Dependability_Package.Literals.HARA_PACKAGE__RISK_PARAMETERS);
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
	 * This returns HARAPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HARAPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HARAPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HARAPackage_type") :
			getString("_UI_HARAPackage_type") + " " + label;
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

		switch (notification.getFeatureID(HARAPackage.class)) {
			case Dependability_Package.HARA_PACKAGE__HAZARDS:
			case Dependability_Package.HARA_PACKAGE__HAZARD_TYPES:
			case Dependability_Package.HARA_PACKAGE__HAZARD_TYPE_SYSTEMS:
			case Dependability_Package.HARA_PACKAGE__MALFUNCTIONS:
			case Dependability_Package.HARA_PACKAGE__RISK_ASSESSMENTS:
			case Dependability_Package.HARA_PACKAGE__RISK_PARAMETERS:
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
				(Dependability_Package.Literals.HARA_PACKAGE__HAZARDS,
				 Dependability_Factory.eINSTANCE.createHazard()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.HARA_PACKAGE__HAZARD_TYPES,
				 Dependability_Factory.eINSTANCE.createHazardType()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.HARA_PACKAGE__HAZARD_TYPE_SYSTEMS,
				 Dependability_Factory.eINSTANCE.createHazardTypeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.HARA_PACKAGE__MALFUNCTIONS,
				 Dependability_Factory.eINSTANCE.createMalfunction()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.HARA_PACKAGE__RISK_ASSESSMENTS,
				 Dependability_Factory.eINSTANCE.createRiskAssessment()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.HARA_PACKAGE__RISK_PARAMETERS,
				 Dependability_Factory.eINSTANCE.createRiskParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.HARA_PACKAGE__RISK_PARAMETERS,
				 Dependability_Factory.eINSTANCE.createSituation()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.HARA_PACKAGE__RISK_PARAMETERS,
				 Dependability_Factory.eINSTANCE.createAccident()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.HARA_PACKAGE__RISK_PARAMETERS,
				 Dependability_Factory.eINSTANCE.createOperatorMeasure()));
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
