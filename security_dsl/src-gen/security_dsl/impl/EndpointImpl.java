/**
 */
package security_dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import security_dsl.EEndpointMethod;
import security_dsl.Endpoint;
import security_dsl.Role;
import security_dsl.Security_dslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.EndpointImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link security_dsl.impl.EndpointImpl#getFunction_name <em>Function name</em>}</li>
 *   <li>{@link security_dsl.impl.EndpointImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link security_dsl.impl.EndpointImpl#getRoles_authority <em>Roles authority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointImpl extends MinimalEObjectImpl.Container implements Endpoint {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction_name() <em>Function name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction_name()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction_name() <em>Function name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction_name()
	 * @generated
	 * @ordered
	 */
	protected String function_name = FUNCTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final EEndpointMethod METHOD_EDEFAULT = EEndpointMethod.GET;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EEndpointMethod method = METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles_authority() <em>Roles authority</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles_authority()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles_authority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ENDPOINT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction_name() {
		return function_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction_name(String newFunction_name) {
		String oldFunction_name = function_name;
		function_name = newFunction_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ENDPOINT__FUNCTION_NAME,
					oldFunction_name, function_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEndpointMethod getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(EEndpointMethod newMethod) {
		EEndpointMethod oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ENDPOINT__METHOD, oldMethod,
					method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles_authority() {
		if (roles_authority == null) {
			roles_authority = new EObjectResolvingEList<Role>(Role.class, this,
					Security_dslPackage.ENDPOINT__ROLES_AUTHORITY);
		}
		return roles_authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Security_dslPackage.ENDPOINT__URL:
			return getUrl();
		case Security_dslPackage.ENDPOINT__FUNCTION_NAME:
			return getFunction_name();
		case Security_dslPackage.ENDPOINT__METHOD:
			return getMethod();
		case Security_dslPackage.ENDPOINT__ROLES_AUTHORITY:
			return getRoles_authority();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Security_dslPackage.ENDPOINT__URL:
			setUrl((String) newValue);
			return;
		case Security_dslPackage.ENDPOINT__FUNCTION_NAME:
			setFunction_name((String) newValue);
			return;
		case Security_dslPackage.ENDPOINT__METHOD:
			setMethod((EEndpointMethod) newValue);
			return;
		case Security_dslPackage.ENDPOINT__ROLES_AUTHORITY:
			getRoles_authority().clear();
			getRoles_authority().addAll((Collection<? extends Role>) newValue);
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
		case Security_dslPackage.ENDPOINT__URL:
			setUrl(URL_EDEFAULT);
			return;
		case Security_dslPackage.ENDPOINT__FUNCTION_NAME:
			setFunction_name(FUNCTION_NAME_EDEFAULT);
			return;
		case Security_dslPackage.ENDPOINT__METHOD:
			setMethod(METHOD_EDEFAULT);
			return;
		case Security_dslPackage.ENDPOINT__ROLES_AUTHORITY:
			getRoles_authority().clear();
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
		case Security_dslPackage.ENDPOINT__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case Security_dslPackage.ENDPOINT__FUNCTION_NAME:
			return FUNCTION_NAME_EDEFAULT == null ? function_name != null
					: !FUNCTION_NAME_EDEFAULT.equals(function_name);
		case Security_dslPackage.ENDPOINT__METHOD:
			return method != METHOD_EDEFAULT;
		case Security_dslPackage.ENDPOINT__ROLES_AUTHORITY:
			return roles_authority != null && !roles_authority.isEmpty();
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
		result.append(" (url: ");
		result.append(url);
		result.append(", function_name: ");
		result.append(function_name);
		result.append(", method: ");
		result.append(method);
		result.append(')');
		return result.toString();
	}

} //EndpointImpl
