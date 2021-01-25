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

import ode.dependability.DependabilityPackage;
import ode.dependability.Dependability_Factory;
import ode.dependability.Dependability_Package;

import ode.integration.provider.ODEProductPackageItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ode.dependability.DependabilityPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DependabilityPackageItemProvider extends ODEProductPackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependabilityPackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__MEASURES);
			childrenFeatures.add(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__MEASURE_TYPES);
			childrenFeatures.add(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__MAINTENANCE_PROCEDURES);
			childrenFeatures.add(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__HARA_PACKAGES);
			childrenFeatures.add(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__REQUIREMENT_PACKAGES);
			childrenFeatures.add(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__DOMAIN_PACKAGES);
			childrenFeatures.add(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__TARA_PACKAGES);
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
	 * This returns DependabilityPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DependabilityPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DependabilityPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DependabilityPackage_type") :
			getString("_UI_DependabilityPackage_type") + " " + label;
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

		switch (notification.getFeatureID(DependabilityPackage.class)) {
			case Dependability_Package.DEPENDABILITY_PACKAGE__MEASURES:
			case Dependability_Package.DEPENDABILITY_PACKAGE__MEASURE_TYPES:
			case Dependability_Package.DEPENDABILITY_PACKAGE__MAINTENANCE_PROCEDURES:
			case Dependability_Package.DEPENDABILITY_PACKAGE__HARA_PACKAGES:
			case Dependability_Package.DEPENDABILITY_PACKAGE__REQUIREMENT_PACKAGES:
			case Dependability_Package.DEPENDABILITY_PACKAGE__DOMAIN_PACKAGES:
			case Dependability_Package.DEPENDABILITY_PACKAGE__TARA_PACKAGES:
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
				(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__MEASURES,
				 Dependability_Factory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__MEASURES,
				 Dependability_Factory.eINSTANCE.createFaultToleranceMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__MEASURES,
				 Dependability_Factory.eINSTANCE.createSecurityControl()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__MEASURE_TYPES,
				 Dependability_Factory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__MAINTENANCE_PROCEDURES,
				 Dependability_Factory.eINSTANCE.createMaintenanceProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__HARA_PACKAGES,
				 Dependability_Factory.eINSTANCE.createHARAPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__REQUIREMENT_PACKAGES,
				 Dependability_Factory.eINSTANCE.createRequirementPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__DOMAIN_PACKAGES,
				 Dependability_Factory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Dependability_Package.Literals.DEPENDABILITY_PACKAGE__TARA_PACKAGES,
				 Dependability_Factory.eINSTANCE.createTARAPackage()));
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
