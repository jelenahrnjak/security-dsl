/**
 */
package security_dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import security_dsl.Provider;
import security_dsl.Security_dslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.ProviderImpl#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.impl.ProviderImpl#getClientId <em>Client Id</em>}</li>
 *   <li>{@link security_dsl.impl.ProviderImpl#getClientSecret <em>Client Secret</em>}</li>
 *   <li>{@link security_dsl.impl.ProviderImpl#getRedirectUri <em>Redirect Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderImpl extends MinimalEObjectImpl.Container implements Provider {
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
	 * The default value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientId()
	 * @generated
	 * @ordered
	 */
	protected String clientId = CLIENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientSecret() <em>Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientSecret() <em>Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSecret()
	 * @generated
	 * @ordered
	 */
	protected String clientSecret = CLIENT_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedirectUri() <em>Redirect Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectUri()
	 * @generated
	 * @ordered
	 */
	protected static final String REDIRECT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedirectUri() <em>Redirect Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectUri()
	 * @generated
	 * @ordered
	 */
	protected String redirectUri = REDIRECT_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.PROVIDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.PROVIDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientId(String newClientId) {
		String oldClientId = clientId;
		clientId = newClientId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.PROVIDER__CLIENT_ID, oldClientId,
					clientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientSecret() {
		return clientSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientSecret(String newClientSecret) {
		String oldClientSecret = clientSecret;
		clientSecret = newClientSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.PROVIDER__CLIENT_SECRET,
					oldClientSecret, clientSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedirectUri() {
		return redirectUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedirectUri(String newRedirectUri) {
		String oldRedirectUri = redirectUri;
		redirectUri = newRedirectUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.PROVIDER__REDIRECT_URI,
					oldRedirectUri, redirectUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Security_dslPackage.PROVIDER__NAME:
			return getName();
		case Security_dslPackage.PROVIDER__CLIENT_ID:
			return getClientId();
		case Security_dslPackage.PROVIDER__CLIENT_SECRET:
			return getClientSecret();
		case Security_dslPackage.PROVIDER__REDIRECT_URI:
			return getRedirectUri();
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
		case Security_dslPackage.PROVIDER__NAME:
			setName((String) newValue);
			return;
		case Security_dslPackage.PROVIDER__CLIENT_ID:
			setClientId((String) newValue);
			return;
		case Security_dslPackage.PROVIDER__CLIENT_SECRET:
			setClientSecret((String) newValue);
			return;
		case Security_dslPackage.PROVIDER__REDIRECT_URI:
			setRedirectUri((String) newValue);
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
		case Security_dslPackage.PROVIDER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Security_dslPackage.PROVIDER__CLIENT_ID:
			setClientId(CLIENT_ID_EDEFAULT);
			return;
		case Security_dslPackage.PROVIDER__CLIENT_SECRET:
			setClientSecret(CLIENT_SECRET_EDEFAULT);
			return;
		case Security_dslPackage.PROVIDER__REDIRECT_URI:
			setRedirectUri(REDIRECT_URI_EDEFAULT);
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
		case Security_dslPackage.PROVIDER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Security_dslPackage.PROVIDER__CLIENT_ID:
			return CLIENT_ID_EDEFAULT == null ? clientId != null : !CLIENT_ID_EDEFAULT.equals(clientId);
		case Security_dslPackage.PROVIDER__CLIENT_SECRET:
			return CLIENT_SECRET_EDEFAULT == null ? clientSecret != null : !CLIENT_SECRET_EDEFAULT.equals(clientSecret);
		case Security_dslPackage.PROVIDER__REDIRECT_URI:
			return REDIRECT_URI_EDEFAULT == null ? redirectUri != null : !REDIRECT_URI_EDEFAULT.equals(redirectUri);
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
		result.append(", clientId: ");
		result.append(clientId);
		result.append(", clientSecret: ");
		result.append(clientSecret);
		result.append(", redirectUri: ");
		result.append(redirectUri);
		result.append(')');
		return result.toString();
	}

} //ProviderImpl
