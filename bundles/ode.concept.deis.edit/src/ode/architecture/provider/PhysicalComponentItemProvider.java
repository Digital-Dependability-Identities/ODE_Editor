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
import ode.architecture.PhysicalComponent;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ode.architecture.PhysicalComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalComponentItemProvider extends SystemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentItemProvider(AdapterFactory adapterFactory) {
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

			addDimensionsPropertyDescriptor(object);
			addPricePerUnitPropertyDescriptor(object);
			addMassPropertyDescriptor(object);
			addProtectionCategoryPropertyDescriptor(object);
			addUsefulLifetimePropertyDescriptor(object);
			addUsefulLifetimeTimeUnitPropertyDescriptor(object);
			addLogicalComponentsPropertyDescriptor(object);
			addMaintenanceProcedurePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dimensions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDimensionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalComponent_dimensions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalComponent_dimensions_feature", "_UI_PhysicalComponent_type"),
				 ArchitecturePackage.Literals.PHYSICAL_COMPONENT__DIMENSIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Price Per Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPricePerUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalComponent_pricePerUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalComponent_pricePerUnit_feature", "_UI_PhysicalComponent_type"),
				 ArchitecturePackage.Literals.PHYSICAL_COMPONENT__PRICE_PER_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalComponent_mass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalComponent_mass_feature", "_UI_PhysicalComponent_type"),
				 ArchitecturePackage.Literals.PHYSICAL_COMPONENT__MASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protection Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtectionCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalComponent_protectionCategory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalComponent_protectionCategory_feature", "_UI_PhysicalComponent_type"),
				 ArchitecturePackage.Literals.PHYSICAL_COMPONENT__PROTECTION_CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Useful Lifetime feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsefulLifetimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalComponent_usefulLifetime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalComponent_usefulLifetime_feature", "_UI_PhysicalComponent_type"),
				 ArchitecturePackage.Literals.PHYSICAL_COMPONENT__USEFUL_LIFETIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Useful Lifetime Time Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsefulLifetimeTimeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalComponent_usefulLifetimeTimeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalComponent_usefulLifetimeTimeUnit_feature", "_UI_PhysicalComponent_type"),
				 ArchitecturePackage.Literals.PHYSICAL_COMPONENT__USEFUL_LIFETIME_TIME_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Logical Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogicalComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalComponent_logicalComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalComponent_logicalComponents_feature", "_UI_PhysicalComponent_type"),
				 ArchitecturePackage.Literals.PHYSICAL_COMPONENT__LOGICAL_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maintenance Procedure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaintenanceProcedurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalComponent_maintenanceProcedure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalComponent_maintenanceProcedure_feature", "_UI_PhysicalComponent_type"),
				 ArchitecturePackage.Literals.PHYSICAL_COMPONENT__MAINTENANCE_PROCEDURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(ArchitecturePackage.Literals.PHYSICAL_COMPONENT__LIFECYCLE_CONDITIONS);
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
	 * This returns PhysicalComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PhysicalComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PhysicalComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PhysicalComponent_type") :
			getString("_UI_PhysicalComponent_type") + " " + label;
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

		switch (notification.getFeatureID(PhysicalComponent.class)) {
			case ArchitecturePackage.PHYSICAL_COMPONENT__DIMENSIONS:
			case ArchitecturePackage.PHYSICAL_COMPONENT__PRICE_PER_UNIT:
			case ArchitecturePackage.PHYSICAL_COMPONENT__MASS:
			case ArchitecturePackage.PHYSICAL_COMPONENT__PROTECTION_CATEGORY:
			case ArchitecturePackage.PHYSICAL_COMPONENT__USEFUL_LIFETIME:
			case ArchitecturePackage.PHYSICAL_COMPONENT__USEFUL_LIFETIME_TIME_UNIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__LIFECYCLE_CONDITIONS:
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
				(ArchitecturePackage.Literals.PHYSICAL_COMPONENT__LIFECYCLE_CONDITIONS,
				 ArchitectureFactory.eINSTANCE.createLifecycleCondition()));
	}

}
