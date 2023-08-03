/**
 */
package security_dsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import security_dsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Security_dslFactoryImpl extends EFactoryImpl implements Security_dslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Security_dslFactory init() {
		try {
			Security_dslFactory theSecurity_dslFactory = (Security_dslFactory) EPackage.Registry.INSTANCE
					.getEFactory(Security_dslPackage.eNS_URI);
			if (theSecurity_dslFactory != null) {
				return theSecurity_dslFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Security_dslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security_dslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Security_dslPackage.APPLICATION:
			return createApplication();
		case Security_dslPackage.DATABASE:
			return createDatabase();
		case Security_dslPackage.ATTRIBUTE:
			return createAttribute();
		case Security_dslPackage.ROLE:
			return createRole();
		case Security_dslPackage.USER:
			return createUser();
		case Security_dslPackage.ROLE_INSTANCE:
			return createRoleInstance();
		case Security_dslPackage.AUTHENTICATION:
			return createAuthentication();
		case Security_dslPackage.ENDPOINT:
			return createEndpoint();
		case Security_dslPackage.JWT:
			return createJWT();
		case Security_dslPackage.CLAIM:
			return createClaim();
		case Security_dslPackage.REGISTERED_CLAIM:
			return createRegisteredClaim();
		case Security_dslPackage.OAUTH2:
			return createOAuth2();
		case Security_dslPackage.BASIC_AUTHENTICATION:
			return createBasicAuthentication();
		case Security_dslPackage.PROVIDER:
			return createProvider();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Security_dslPackage.EDATABASE_TYPE:
			return createEDatabaseTypeFromString(eDataType, initialValue);
		case Security_dslPackage.ETYPE:
			return createETypeFromString(eDataType, initialValue);
		case Security_dslPackage.EENDPOINT_METHOD:
			return createEEndpointMethodFromString(eDataType, initialValue);
		case Security_dslPackage.EENDPOINT_TYPE:
			return createEEndpointTypeFromString(eDataType, initialValue);
		case Security_dslPackage.ECLAIM_TYPE:
			return createEClaimTypeFromString(eDataType, initialValue);
		case Security_dslPackage.EO_AUTH_PROVIDER:
			return createEOAuthProviderFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Security_dslPackage.EDATABASE_TYPE:
			return convertEDatabaseTypeToString(eDataType, instanceValue);
		case Security_dslPackage.ETYPE:
			return convertETypeToString(eDataType, instanceValue);
		case Security_dslPackage.EENDPOINT_METHOD:
			return convertEEndpointMethodToString(eDataType, instanceValue);
		case Security_dslPackage.EENDPOINT_TYPE:
			return convertEEndpointTypeToString(eDataType, instanceValue);
		case Security_dslPackage.ECLAIM_TYPE:
			return convertEClaimTypeToString(eDataType, instanceValue);
		case Security_dslPackage.EO_AUTH_PROVIDER:
			return convertEOAuthProviderToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleInstance createRoleInstance() {
		RoleInstanceImpl roleInstance = new RoleInstanceImpl();
		return roleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authentication createAuthentication() {
		AuthenticationImpl authentication = new AuthenticationImpl();
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint createEndpoint() {
		EndpointImpl endpoint = new EndpointImpl();
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JWT createJWT() {
		JWTImpl jwt = new JWTImpl();
		return jwt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredClaim createRegisteredClaim() {
		RegisteredClaimImpl registeredClaim = new RegisteredClaimImpl();
		return registeredClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuth2 createOAuth2() {
		OAuth2Impl oAuth2 = new OAuth2Impl();
		return oAuth2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicAuthentication createBasicAuthentication() {
		BasicAuthenticationImpl basicAuthentication = new BasicAuthenticationImpl();
		return basicAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDatabaseType createEDatabaseTypeFromString(EDataType eDataType, String initialValue) {
		EDatabaseType result = EDatabaseType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDatabaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType createETypeFromString(EDataType eDataType, String initialValue) {
		EType result = EType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEndpointMethod createEEndpointMethodFromString(EDataType eDataType, String initialValue) {
		EEndpointMethod result = EEndpointMethod.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEndpointMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEndpointType createEEndpointTypeFromString(EDataType eDataType, String initialValue) {
		EEndpointType result = EEndpointType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEndpointTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClaimType createEClaimTypeFromString(EDataType eDataType, String initialValue) {
		EClaimType result = EClaimType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEClaimTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOAuthProvider createEOAuthProviderFromString(EDataType eDataType, String initialValue) {
		EOAuthProvider result = EOAuthProvider.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEOAuthProviderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security_dslPackage getSecurity_dslPackage() {
		return (Security_dslPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Security_dslPackage getPackage() {
		return Security_dslPackage.eINSTANCE;
	}

} //Security_dslFactoryImpl
