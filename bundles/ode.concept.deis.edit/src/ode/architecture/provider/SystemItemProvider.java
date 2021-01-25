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

import ode.base.provider.MergedODEEditPlugin;

import ode.odeBase.provider.BaseElementItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ode.architecture.System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemItemProvider extends BaseElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemItemProvider(AdapterFactory adapterFactory) {
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

			addOverallLifetimePropertyDescriptor(object);
			addOverallLifetimeTimeUnitPropertyDescriptor(object);
			addSubSystemsPropertyDescriptor(object);
			addRealisedFunctionsPropertyDescriptor(object);
			addAsAssetPropertyDescriptor(object);
			addDependabilityRequirementsPropertyDescriptor(object);
			addAssuranceLevelPropertyDescriptor(object);
			addAppliedStandardsPropertyDescriptor(object);
			addFailureModelsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Overall Lifetime feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverallLifetimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_overallLifetime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_overallLifetime_feature", "_UI_System_type"),
				 ArchitecturePackage.Literals.SYSTEM__OVERALL_LIFETIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overall Lifetime Time Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverallLifetimeTimeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_overallLifetimeTimeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_overallLifetimeTimeUnit_feature", "_UI_System_type"),
				 ArchitecturePackage.Literals.SYSTEM__OVERALL_LIFETIME_TIME_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Systems feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubSystemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_subSystems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_subSystems_feature", "_UI_System_type"),
				 ArchitecturePackage.Literals.SYSTEM__SUB_SYSTEMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Realised Functions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRealisedFunctionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_realisedFunctions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_realisedFunctions_feature", "_UI_System_type"),
				 ArchitecturePackage.Literals.SYSTEM__REALISED_FUNCTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the As Asset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAsAssetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_asAsset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_asAsset_feature", "_UI_System_type"),
				 ArchitecturePackage.Literals.SYSTEM__AS_ASSET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependability Requirements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependabilityRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_dependabilityRequirements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_dependabilityRequirements_feature", "_UI_System_type"),
				 ArchitecturePackage.Literals.SYSTEM__DEPENDABILITY_REQUIREMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assurance Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssuranceLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_assuranceLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_assuranceLevel_feature", "_UI_System_type"),
				 ArchitecturePackage.Literals.SYSTEM__ASSURANCE_LEVEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Applied Standards feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliedStandardsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_appliedStandards_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_appliedStandards_feature", "_UI_System_type"),
				 ArchitecturePackage.Literals.SYSTEM__APPLIED_STANDARDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Failure Models feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFailureModelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_failureModels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_failureModels_feature", "_UI_System_type"),
				 ArchitecturePackage.Literals.SYSTEM__FAILURE_MODELS,
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
			childrenFeatures.add(ArchitecturePackage.Literals.SYSTEM__SYSTEM_BOUNDARIES);
			childrenFeatures.add(ArchitecturePackage.Literals.SYSTEM__CONTEXTS);
			childrenFeatures.add(ArchitecturePackage.Literals.SYSTEM__CONFIGURATIONS);
			childrenFeatures.add(ArchitecturePackage.Literals.SYSTEM__SIGNALS);
			childrenFeatures.add(ArchitecturePackage.Literals.SYSTEM__PORTS);
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
	 * This returns System.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/System"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ode.architecture.System)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_System_type") :
			getString("_UI_System_type") + " " + label;
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

		switch (notification.getFeatureID(ode.architecture.System.class)) {
			case ArchitecturePackage.SYSTEM__OVERALL_LIFETIME:
			case ArchitecturePackage.SYSTEM__OVERALL_LIFETIME_TIME_UNIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ArchitecturePackage.SYSTEM__SYSTEM_BOUNDARIES:
			case ArchitecturePackage.SYSTEM__CONTEXTS:
			case ArchitecturePackage.SYSTEM__CONFIGURATIONS:
			case ArchitecturePackage.SYSTEM__SIGNALS:
			case ArchitecturePackage.SYSTEM__PORTS:
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
				(ArchitecturePackage.Literals.SYSTEM__SYSTEM_BOUNDARIES,
				 ArchitectureFactory.eINSTANCE.createSystemBoundary()));

		newChildDescriptors.add
			(createChildParameter
				(ArchitecturePackage.Literals.SYSTEM__CONTEXTS,
				 ArchitectureFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(ArchitecturePackage.Literals.SYSTEM__CONFIGURATIONS,
				 ArchitectureFactory.eINSTANCE.createConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ArchitecturePackage.Literals.SYSTEM__SIGNALS,
				 ArchitectureFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(ArchitecturePackage.Literals.SYSTEM__PORTS,
				 ArchitectureFactory.eINSTANCE.createPort()));
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
