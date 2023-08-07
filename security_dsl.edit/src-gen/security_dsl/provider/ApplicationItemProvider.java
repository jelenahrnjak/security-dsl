/**
 */
package security_dsl.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import security_dsl.Application;
import security_dsl.Security_dslFactory;
import security_dsl.Security_dslPackage;

/**
 * This is the item provider adapter for a {@link security_dsl.Application} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationItemProvider(AdapterFactory adapterFactory) {
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

			addArtifactPropertyDescriptor(object);
			addGroupPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addPackageNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addHostnamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Artifact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Application_artifact_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Application_artifact_feature",
								"_UI_Application_type"),
						Security_dslPackage.Literals.APPLICATION__ARTIFACT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Application_group_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Application_group_feature",
								"_UI_Application_type"),
						Security_dslPackage.Literals.APPLICATION__GROUP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Application_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Application_name_feature",
								"_UI_Application_type"),
						Security_dslPackage.Literals.APPLICATION__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Application_packageName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Application_packageName_feature",
								"_UI_Application_type"),
						Security_dslPackage.Literals.APPLICATION__PACKAGE_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Application_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Application_description_feature",
								"_UI_Application_type"),
						Security_dslPackage.Literals.APPLICATION__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Application_port_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Application_port_feature",
								"_UI_Application_type"),
						Security_dslPackage.Literals.APPLICATION__PORT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Hostname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Application_hostname_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Application_hostname_feature",
								"_UI_Application_type"),
						Security_dslPackage.Literals.APPLICATION__HOSTNAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(Security_dslPackage.Literals.APPLICATION__APP_DATABASE);
			childrenFeatures.add(Security_dslPackage.Literals.APPLICATION__APP_ENTITIES);
			childrenFeatures.add(Security_dslPackage.Literals.APPLICATION__APP_CONTROLLERS);
			childrenFeatures.add(Security_dslPackage.Literals.APPLICATION__APP_SECURITY);
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
	 * This returns Application.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Application"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Application) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Application_type")
				: getString("_UI_Application_type") + " " + label;
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

		switch (notification.getFeatureID(Application.class)) {
		case Security_dslPackage.APPLICATION__ARTIFACT:
		case Security_dslPackage.APPLICATION__GROUP:
		case Security_dslPackage.APPLICATION__NAME:
		case Security_dslPackage.APPLICATION__PACKAGE_NAME:
		case Security_dslPackage.APPLICATION__DESCRIPTION:
		case Security_dslPackage.APPLICATION__PORT:
		case Security_dslPackage.APPLICATION__HOSTNAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Security_dslPackage.APPLICATION__APP_DATABASE:
		case Security_dslPackage.APPLICATION__APP_ENTITIES:
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
		case Security_dslPackage.APPLICATION__APP_SECURITY:
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

		newChildDescriptors.add(createChildParameter(Security_dslPackage.Literals.APPLICATION__APP_DATABASE,
				Security_dslFactory.eINSTANCE.createDatabase()));

		newChildDescriptors.add(createChildParameter(Security_dslPackage.Literals.APPLICATION__APP_ENTITIES,
				Security_dslFactory.eINSTANCE.createRole()));

		newChildDescriptors.add(createChildParameter(Security_dslPackage.Literals.APPLICATION__APP_ENTITIES,
				Security_dslFactory.eINSTANCE.createUser()));

		newChildDescriptors.add(createChildParameter(Security_dslPackage.Literals.APPLICATION__APP_CONTROLLERS,
				Security_dslFactory.eINSTANCE.createAuthentication()));

		newChildDescriptors.add(createChildParameter(Security_dslPackage.Literals.APPLICATION__APP_SECURITY,
				Security_dslFactory.eINSTANCE.createJWT()));

		newChildDescriptors.add(createChildParameter(Security_dslPackage.Literals.APPLICATION__APP_SECURITY,
				Security_dslFactory.eINSTANCE.createOAuth2()));

		newChildDescriptors.add(createChildParameter(Security_dslPackage.Literals.APPLICATION__APP_SECURITY,
				Security_dslFactory.eINSTANCE.createBasicAuthentication()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Security_dslEditPlugin.INSTANCE;
	}

}
