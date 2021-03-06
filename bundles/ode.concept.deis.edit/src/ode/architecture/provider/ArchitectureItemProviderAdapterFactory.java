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

import java.util.ArrayList;
import java.util.Collection;

import ode.architecture.util.ArchitectureAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureItemProviderAdapterFactory extends ArchitectureAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.DesignPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignPackageItemProvider designPackageItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.DesignPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDesignPackageAdapter() {
		if (designPackageItemProvider == null) {
			designPackageItemProvider = new DesignPackageItemProvider(this);
		}

		return designPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.SafetyFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyFunctionItemProvider safetyFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.SafetyFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSafetyFunctionAdapter() {
		if (safetyFunctionItemProvider == null) {
			safetyFunctionItemProvider = new SafetyFunctionItemProvider(this);
		}

		return safetyFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.Port} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortItemProvider portItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortAdapter() {
		if (portItemProvider == null) {
			portItemProvider = new PortItemProvider(this);
		}

		return portItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.PerfChars} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerfCharsItemProvider perfCharsItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.PerfChars}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerfCharsAdapter() {
		if (perfCharsItemProvider == null) {
			perfCharsItemProvider = new PerfCharsItemProvider(this);
		}

		return perfCharsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.SystemBoundary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemBoundaryItemProvider systemBoundaryItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.SystemBoundary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemBoundaryAdapter() {
		if (systemBoundaryItemProvider == null) {
			systemBoundaryItemProvider = new SystemBoundaryItemProvider(this);
		}

		return systemBoundaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.Context} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextItemProvider contextItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextAdapter() {
		if (contextItemProvider == null) {
			contextItemProvider = new ContextItemProvider(this);
		}

		return contextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.PhysicalComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalComponentItemProvider physicalComponentItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.PhysicalComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhysicalComponentAdapter() {
		if (physicalComponentItemProvider == null) {
			physicalComponentItemProvider = new PhysicalComponentItemProvider(this);
		}

		return physicalComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.LogicalComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalComponentItemProvider logicalComponentItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.LogicalComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalComponentAdapter() {
		if (logicalComponentItemProvider == null) {
			logicalComponentItemProvider = new LogicalComponentItemProvider(this);
		}

		return logicalComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.LifecycleCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifecycleConditionItemProvider lifecycleConditionItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.LifecycleCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLifecycleConditionAdapter() {
		if (lifecycleConditionItemProvider == null) {
			lifecycleConditionItemProvider = new LifecycleConditionItemProvider(this);
		}

		return lifecycleConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.Signal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalItemProvider signalItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalAdapter() {
		if (signalItemProvider == null) {
			signalItemProvider = new SignalItemProvider(this);
		}

		return signalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.SafetyRelatedSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyRelatedSystemItemProvider safetyRelatedSystemItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.SafetyRelatedSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSafetyRelatedSystemAdapter() {
		if (safetyRelatedSystemItemProvider == null) {
			safetyRelatedSystemItemProvider = new SafetyRelatedSystemItemProvider(this);
		}

		return safetyRelatedSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ode.architecture.Configuration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationItemProvider configurationItemProvider;

	/**
	 * This creates an adapter for a {@link ode.architecture.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigurationAdapter() {
		if (configurationItemProvider == null) {
			configurationItemProvider = new ConfigurationItemProvider(this);
		}

		return configurationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (designPackageItemProvider != null) designPackageItemProvider.dispose();
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (functionItemProvider != null) functionItemProvider.dispose();
		if (safetyFunctionItemProvider != null) safetyFunctionItemProvider.dispose();
		if (portItemProvider != null) portItemProvider.dispose();
		if (perfCharsItemProvider != null) perfCharsItemProvider.dispose();
		if (systemBoundaryItemProvider != null) systemBoundaryItemProvider.dispose();
		if (contextItemProvider != null) contextItemProvider.dispose();
		if (physicalComponentItemProvider != null) physicalComponentItemProvider.dispose();
		if (logicalComponentItemProvider != null) logicalComponentItemProvider.dispose();
		if (lifecycleConditionItemProvider != null) lifecycleConditionItemProvider.dispose();
		if (signalItemProvider != null) signalItemProvider.dispose();
		if (safetyRelatedSystemItemProvider != null) safetyRelatedSystemItemProvider.dispose();
		if (configurationItemProvider != null) configurationItemProvider.dispose();
	}

}
