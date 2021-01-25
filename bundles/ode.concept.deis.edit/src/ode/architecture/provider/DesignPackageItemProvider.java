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
package ode.architecture.provider;


import java.util.Collection;
import java.util.List;

import ode.architecture.ArchitectureFactory;
import ode.architecture.ArchitecturePackage;
import ode.architecture.DesignPackage;

import ode.base.provider.MergedODEEditPlugin;

import ode.integration.provider.ODEProductPackageItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ode.architecture.DesignPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignPackageItemProvider extends ODEProductPackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ArchitecturePackage.Literals.DESIGN_PACKAGE__SYSTEMS);
			childrenFeatures.add(ArchitecturePackage.Literals.DESIGN_PACKAGE__FUNCTIONS);
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
	 * This returns DesignPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DesignPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DesignPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DesignPackage_type") :
			getString("_UI_DesignPackage_type") + " " + label;
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

		switch (notification.getFeatureID(DesignPackage.class)) {
			case ArchitecturePackage.DESIGN_PACKAGE__SYSTEMS:
			case ArchitecturePackage.DESIGN_PACKAGE__FUNCTIONS:
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
				(ArchitecturePackage.Literals.DESIGN_PACKAGE__SYSTEMS,
				 ArchitectureFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(ArchitecturePackage.Literals.DESIGN_PACKAGE__SYSTEMS,
				 ArchitectureFactory.eINSTANCE.createPhysicalComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ArchitecturePackage.Literals.DESIGN_PACKAGE__SYSTEMS,
				 ArchitectureFactory.eINSTANCE.createLogicalComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ArchitecturePackage.Literals.DESIGN_PACKAGE__SYSTEMS,
				 ArchitectureFactory.eINSTANCE.createSafetyRelatedSystem()));

		newChildDescriptors.add
			(createChildParameter
				(ArchitecturePackage.Literals.DESIGN_PACKAGE__FUNCTIONS,
				 ArchitectureFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ArchitecturePackage.Literals.DESIGN_PACKAGE__FUNCTIONS,
				 ArchitectureFactory.eINSTANCE.createSafetyFunction()));
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
