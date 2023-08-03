/**
 */
package security_dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import security_dsl.Attribute;
import security_dsl.EType;
import security_dsl.Security_dslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link security_dsl.impl.AttributeImpl#isIdentifier <em>Identifier</em>}</li>
 *   <li>{@link security_dsl.impl.AttributeImpl#isCredential <em>Credential</em>}</li>
 *   <li>{@link security_dsl.impl.AttributeImpl#getCollumnName <em>Collumn Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EType TYPE_EDEFAULT = EType.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDENTIFIER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentifier()
	 * @generated
	 * @ordered
	 */
	protected boolean identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #isCredential() <em>Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCredential()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREDENTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCredential() <em>Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCredential()
	 * @generated
	 * @ordered
	 */
	protected boolean credential = CREDENTIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollumnName() <em>Collumn Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollumnName() <em>Collumn Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollumnName()
	 * @generated
	 * @ordered
	 */
	protected String collumnName = COLLUMN_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EType newType) {
		EType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(boolean newIdentifier) {
		boolean oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ATTRIBUTE__IDENTIFIER,
					oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCredential() {
		return credential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredential(boolean newCredential) {
		boolean oldCredential = credential;
		credential = newCredential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ATTRIBUTE__CREDENTIAL,
					oldCredential, credential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollumnName() {
		return collumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollumnName(String newCollumnName) {
		String oldCollumnName = collumnName;
		collumnName = newCollumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ATTRIBUTE__COLLUMN_NAME,
					oldCollumnName, collumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Security_dslPackage.ATTRIBUTE__NAME:
			return getName();
		case Security_dslPackage.ATTRIBUTE__TYPE:
			return getType();
		case Security_dslPackage.ATTRIBUTE__IDENTIFIER:
			return isIdentifier();
		case Security_dslPackage.ATTRIBUTE__CREDENTIAL:
			return isCredential();
		case Security_dslPackage.ATTRIBUTE__COLLUMN_NAME:
			return getCollumnName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Security_dslPackage.ATTRIBUTE__NAME:
			setName((String) newValue);
			return;
		case Security_dslPackage.ATTRIBUTE__TYPE:
			setType((EType) newValue);
			return;
		case Security_dslPackage.ATTRIBUTE__IDENTIFIER:
			setIdentifier((Boolean) newValue);
			return;
		case Security_dslPackage.ATTRIBUTE__CREDENTIAL:
			setCredential((Boolean) newValue);
			return;
		case Security_dslPackage.ATTRIBUTE__COLLUMN_NAME:
			setCollumnName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Security_dslPackage.ATTRIBUTE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Security_dslPackage.ATTRIBUTE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Security_dslPackage.ATTRIBUTE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Security_dslPackage.ATTRIBUTE__CREDENTIAL:
			setCredential(CREDENTIAL_EDEFAULT);
			return;
		case Security_dslPackage.ATTRIBUTE__COLLUMN_NAME:
			setCollumnName(COLLUMN_NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Security_dslPackage.ATTRIBUTE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Security_dslPackage.ATTRIBUTE__TYPE:
			return type != TYPE_EDEFAULT;
		case Security_dslPackage.ATTRIBUTE__IDENTIFIER:
			return identifier != IDENTIFIER_EDEFAULT;
		case Security_dslPackage.ATTRIBUTE__CREDENTIAL:
			return credential != CREDENTIAL_EDEFAULT;
		case Security_dslPackage.ATTRIBUTE__COLLUMN_NAME:
			return COLLUMN_NAME_EDEFAULT == null ? collumnName != null : !COLLUMN_NAME_EDEFAULT.equals(collumnName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", credential: ");
		result.append(credential);
		result.append(", collumnName: ");
		result.append(collumnName);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
