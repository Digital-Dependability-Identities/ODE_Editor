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
import ode.dependability.TARAPackage;

import ode.integration.provider.ODEProductPackageItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ode.dependability.TARAPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TARAPackageItemProvider extends ODEProductPackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TARAPackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Dependability_Package.Literals.TARA_PACKAGE__IDENTIFIED_RISKS);
			childrenFeatures.add(Dependability_Package.Literals.TARA_PACKAGE__CONTROLS);
			childrenFeatures.add(Dependability_Package.Literals.TARA_PACKAGE__CONSIDERED_ASSETS);
			childrenFeatures.add(Dependability_Package.Literals.TARA_PACKAGE__CONSIDERED_THREAT_AGENTS);
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
	 * This returns TARAPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TARAPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TARAPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TARAPackage_type") :
			getString("_UI_TARAPackage_type") + " " + label;
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

		switch (notification.getFeatureID(TARAPackage.class)) {
			case Dependability_Package.TARA_PACKAGE__IDENTIFIED_RISKS:
			case Dependability_Package.TARA_PACKAGE__CONTROLS:
			case Dependability_Package.TARA_PACKAGE__CONSIDERED_ASSETS:
			case Dependability_Package.TARA_PACKAGE__CONSIDERED_THREAT_AGENTS:
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
				(Dependability_Package.Literals.TARA_PACKAGE__IDENTIFIED_RISKS,
				 Dependability_Factory.eINSTANCE.createSecurityRisk()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.TARA_PACKAGE__CONTROLS,
				 Dependability_Factory.eINSTANCE.createSecurityControl()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.TARA_PACKAGE__CONSIDERED_ASSETS,
				 Dependability_Factory.eINSTANCE.createAsset()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.TARA_PACKAGE__CONSIDERED_ASSETS,
				 Dependability_Factory.eINSTANCE.createVulnerableItem()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.TARA_PACKAGE__CONSIDERED_THREAT_AGENTS,
				 Dependability_Factory.eINSTANCE.createThreatAgent()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.TARA_PACKAGE__CONSIDERED_THREAT_AGENTS,
				 Dependability_Factory.eINSTANCE.createHuman()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.TARA_PACKAGE__CONSIDERED_THREAT_AGENTS,
				 Dependability_Factory.eINSTANCE.createNonHuman()));
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
