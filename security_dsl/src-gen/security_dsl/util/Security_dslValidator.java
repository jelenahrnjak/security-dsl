/**
 */
package security_dsl.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import security_dsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see security_dsl.Security_dslPackage
 * @generated
 */
public class Security_dslValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Security_dslValidator INSTANCE = new Security_dslValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "security_dsl";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Database For Entity' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__HAS_DATABASE_FOR_ENTITY = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Table Name' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__UNIQUE_TABLE_NAME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Registered Port' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__VALID_REGISTERED_PORT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Collumn Name' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__UNIQUE_COLLUMN_NAME = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Other Entities Doesnt Have Credential' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__OTHER_ENTITIES_DOESNT_HAVE_CREDENTIAL = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Attribute Name' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__UNIQUE_ATTRIBUTE_NAME = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One Identifier' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__ONLY_ONE_IDENTIFIER = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Method Required For Other Type' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__METHOD_REQUIRED_FOR_OTHER_TYPE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Controller Path' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__CONTROLLER_PATH = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Controller Path' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__UNIQUE_CONTROLLER_PATH = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Controller Name' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__UNIQUE_CONTROLLER_NAME = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Endpoints' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__UNIQUE_ENDPOINTS = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Endpoint Limits' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__ENDPOINT_LIMITS = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Controller Not Named User Role' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__CONTROLLER_NOT_NAMED_USER_ROLE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Role Instance Name' of 'Role'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE__UNIQUE_ROLE_INSTANCE_NAME = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Credential For User' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__ONE_CREDENTIAL_FOR_USER = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Attribute Named Password' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__NO_ATTRIBUTE_NAMED_PASSWORD = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Authentication Limits' of 'Authentication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHENTICATION__AUTHENTICATION_LIMITS = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Login Existance For Logout' of 'Authentication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHENTICATION__LOGIN_EXISTANCE_FOR_LOGOUT = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Role Authorities' of 'Endpoint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENDPOINT__UNIQUE_ROLE_AUTHORITIES = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Url Starts With Forward Slash' of 'Endpoint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENDPOINT__URL_STARTS_WITH_FORWARD_SLASH = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Claims' of 'JWT'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JWT__UNIQUE_CLAIMS = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Registered Claim Subject' of 'JWT'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JWT__REGISTERED_CLAIM_SUBJECT = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Single Registered Claim' of 'JWT'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JWT__SINGLE_REGISTERED_CLAIM = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Role Max Two Attributes' of 'JWT'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JWT__ROLE_MAX_TWO_ATTRIBUTES = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Role Attribute Type' of 'JWT'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JWT__ROLE_ATTRIBUTE_TYPE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Claim Attribute' of 'Claim'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLAIM__UNIQUE_CLAIM_ATTRIBUTE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Expiration Time Greater Than Zero' of 'Registered Claim'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REGISTERED_CLAIM__EXPIRATION_TIME_GREATER_THAN_ZERO = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Providers' of 'OAuth2'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OAUTH2__UNIQUE_PROVIDERS = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Doesnt Have Role For Oauth' of 'OAuth2'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OAUTH2__DOESNT_HAVE_ROLE_FOR_OAUTH = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Doesnt Have Auth Controller For Oauth' of 'OAuth2'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OAUTH2__DOESNT_HAVE_AUTH_CONTROLLER_FOR_OAUTH = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Doesnt Have User For Oauth' of 'OAuth2'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OAUTH2__DOESNT_HAVE_USER_FOR_OAUTH = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Basic Auth No Role Attributes' of 'Basic Authentication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BASIC_AUTHENTICATION__BASIC_AUTH_NO_ROLE_ATTRIBUTES = 33;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 33;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security_dslValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Security_dslPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Security_dslPackage.APPLICATION:
			return validateApplication((Application) value, diagnostics, context);
		case Security_dslPackage.ENTITY:
			return validateEntity((Entity) value, diagnostics, context);
		case Security_dslPackage.CONTROLLER:
			return validateController((Controller) value, diagnostics, context);
		case Security_dslPackage.SECURITY:
			return validateSecurity((Security) value, diagnostics, context);
		case Security_dslPackage.DATABASE:
			return validateDatabase((Database) value, diagnostics, context);
		case Security_dslPackage.ATTRIBUTE:
			return validateAttribute((Attribute) value, diagnostics, context);
		case Security_dslPackage.ROLE:
			return validateRole((Role) value, diagnostics, context);
		case Security_dslPackage.USER:
			return validateUser((User) value, diagnostics, context);
		case Security_dslPackage.ROLE_INSTANCE:
			return validateRoleInstance((RoleInstance) value, diagnostics, context);
		case Security_dslPackage.AUTHENTICATION:
			return validateAuthentication((Authentication) value, diagnostics, context);
		case Security_dslPackage.ENDPOINT:
			return validateEndpoint((Endpoint) value, diagnostics, context);
		case Security_dslPackage.JWT:
			return validateJWT((JWT) value, diagnostics, context);
		case Security_dslPackage.CLAIM:
			return validateClaim((Claim) value, diagnostics, context);
		case Security_dslPackage.REGISTERED_CLAIM:
			return validateRegisteredClaim((RegisteredClaim) value, diagnostics, context);
		case Security_dslPackage.OAUTH2:
			return validateOAuth2((OAuth2) value, diagnostics, context);
		case Security_dslPackage.BASIC_AUTHENTICATION:
			return validateBasicAuthentication((BasicAuthentication) value, diagnostics, context);
		case Security_dslPackage.PROVIDER:
			return validateProvider((Provider) value, diagnostics, context);
		case Security_dslPackage.EDATABASE_TYPE:
			return validateEDatabaseType((EDatabaseType) value, diagnostics, context);
		case Security_dslPackage.ETYPE:
			return validateEType((EType) value, diagnostics, context);
		case Security_dslPackage.EENDPOINT_METHOD:
			return validateEEndpointMethod((EEndpointMethod) value, diagnostics, context);
		case Security_dslPackage.EENDPOINT_TYPE:
			return validateEEndpointType((EEndpointType) value, diagnostics, context);
		case Security_dslPackage.ECLAIM_TYPE:
			return validateEClaimType((EClaimType) value, diagnostics, context);
		case Security_dslPackage.EO_AUTH_PROVIDER:
			return validateEOAuthProvider((EOAuthProvider) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(application, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_hasDatabaseForEntity(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_validRegisteredPort(application, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validRegisteredPort constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_validRegisteredPort(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return application.validRegisteredPort(diagnostics, context);
	}

	/**
	 * Validates the hasDatabaseForEntity constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_hasDatabaseForEntity(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return application.hasDatabaseForEntity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_onlyOneIdentifier(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_uniqueTableName(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_uniqueCollumnName(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_otherEntitiesDoesntHaveCredential(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_uniqueAttributeName(entity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the onlyOneIdentifier constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_onlyOneIdentifier(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return entity.onlyOneIdentifier(diagnostics, context);
	}

	/**
	 * Validates the uniqueTableName constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_uniqueTableName(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return entity.uniqueTableName(diagnostics, context);
	}

	/**
	 * Validates the uniqueCollumnName constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_uniqueCollumnName(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return entity.uniqueCollumnName(diagnostics, context);
	}

	/**
	 * Validates the otherEntitiesDoesntHaveCredential constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_otherEntitiesDoesntHaveCredential(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return entity.otherEntitiesDoesntHaveCredential(diagnostics, context);
	}

	/**
	 * Validates the uniqueAttributeName constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_uniqueAttributeName(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return entity.uniqueAttributeName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController(Controller controller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controller, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_uniqueControllerName(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_methodRequiredForOtherType(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_controllerNotNamedUserRole(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_uniqueEndpoints(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_endpointLimits(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_controllerPath(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_uniqueControllerPath(controller, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueControllerPath constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_uniqueControllerPath(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.uniqueControllerPath(diagnostics, context);
	}

	/**
	 * Validates the methodRequiredForOtherType constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_methodRequiredForOtherType(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.methodRequiredForOtherType(diagnostics, context);
	}

	/**
	 * Validates the controllerPath constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_controllerPath(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.controllerPath(diagnostics, context);
	}

	/**
	 * Validates the uniqueControllerName constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_uniqueControllerName(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.uniqueControllerName(diagnostics, context);
	}

	/**
	 * Validates the uniqueEndpoints constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_uniqueEndpoints(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.uniqueEndpoints(diagnostics, context);
	}

	/**
	 * Validates the endpointLimits constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_endpointLimits(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.endpointLimits(diagnostics, context);
	}

	/**
	 * Validates the controllerNotNamedUserRole constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_controllerNotNamedUserRole(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.controllerNotNamedUserRole(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurity(Security security, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(security, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabase(Database database, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(database, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(role, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_onlyOneIdentifier(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_uniqueTableName(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_uniqueCollumnName(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_otherEntitiesDoesntHaveCredential(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_uniqueAttributeName(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRole_uniqueRoleInstanceName(role, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueRoleInstanceName constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_uniqueRoleInstanceName(Role role, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return role.uniqueRoleInstanceName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(user, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_onlyOneIdentifier(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_uniqueTableName(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_uniqueCollumnName(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_otherEntitiesDoesntHaveCredential(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_uniqueAttributeName(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUser_noAttributeNamedPassword(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUser_oneCredentialForUser(user, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noAttributeNamedPassword constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_noAttributeNamedPassword(User user, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return user.noAttributeNamedPassword(diagnostics, context);
	}

	/**
	 * Validates the oneCredentialForUser constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_oneCredentialForUser(User user, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return user.oneCredentialForUser(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleInstance(RoleInstance roleInstance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication(Authentication authentication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(authentication, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_uniqueControllerName(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_methodRequiredForOtherType(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_controllerNotNamedUserRole(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_uniqueEndpoints(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_endpointLimits(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_controllerPath(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_uniqueControllerPath(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAuthentication_authenticationLimits(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAuthentication_loginExistanceForLogout(authentication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the loginExistanceForLogout constraint of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication_loginExistanceForLogout(Authentication authentication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authentication.loginExistanceForLogout(diagnostics, context);
	}

	/**
	 * Validates the authenticationLimits constraint of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication_authenticationLimits(Authentication authentication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authentication.authenticationLimits(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpoint(Endpoint endpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endpoint, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(endpoint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(endpoint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(endpoint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(endpoint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(endpoint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(endpoint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(endpoint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(endpoint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEndpoint_urlStartsWithForwardSlash(endpoint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEndpoint_uniqueRoleAuthorities(endpoint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the urlStartsWithForwardSlash constraint of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpoint_urlStartsWithForwardSlash(Endpoint endpoint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return endpoint.urlStartsWithForwardSlash(diagnostics, context);
	}

	/**
	 * Validates the uniqueRoleAuthorities constraint of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpoint_uniqueRoleAuthorities(Endpoint endpoint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return endpoint.uniqueRoleAuthorities(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJWT(JWT jwt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(jwt, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJWT_uniqueClaims(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJWT_registeredClaimSubject(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJWT_singleRegisteredClaim(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJWT_roleMaxTwoAttributes(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJWT_roleAttributeType(jwt, diagnostics, context);
		return result;
	}

	/**
	 * Validates the singleRegisteredClaim constraint of '<em>JWT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJWT_singleRegisteredClaim(JWT jwt, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return jwt.singleRegisteredClaim(diagnostics, context);
	}

	/**
	 * Validates the roleMaxTwoAttributes constraint of '<em>JWT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJWT_roleMaxTwoAttributes(JWT jwt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return jwt.roleMaxTwoAttributes(diagnostics, context);
	}

	/**
	 * Validates the roleAttributeType constraint of '<em>JWT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJWT_roleAttributeType(JWT jwt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return jwt.roleAttributeType(diagnostics, context);
	}

	/**
	 * Validates the uniqueClaims constraint of '<em>JWT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJWT_uniqueClaims(JWT jwt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return jwt.uniqueClaims(diagnostics, context);
	}

	/**
	 * Validates the registeredClaimSubject constraint of '<em>JWT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJWT_registeredClaimSubject(JWT jwt, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return jwt.registeredClaimSubject(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaim(Claim claim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(claim, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(claim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(claim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(claim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(claim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(claim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(claim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(claim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(claim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateClaim_uniqueClaimAttribute(claim, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueClaimAttribute constraint of '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaim_uniqueClaimAttribute(Claim claim, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return claim.uniqueClaimAttribute(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisteredClaim(RegisteredClaim registeredClaim, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(registeredClaim, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(registeredClaim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(registeredClaim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(registeredClaim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(registeredClaim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(registeredClaim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(registeredClaim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(registeredClaim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(registeredClaim, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRegisteredClaim_expirationTimeGreaterThanZero(registeredClaim, diagnostics, context);
		return result;
	}

	/**
	 * Validates the expirationTimeGreaterThanZero constraint of '<em>Registered Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisteredClaim_expirationTimeGreaterThanZero(RegisteredClaim registeredClaim,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return registeredClaim.expirationTimeGreaterThanZero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOAuth2(OAuth2 oAuth2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oAuth2, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(oAuth2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(oAuth2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(oAuth2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(oAuth2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(oAuth2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(oAuth2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(oAuth2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(oAuth2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOAuth2_doesntHaveUserForOauth(oAuth2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOAuth2_uniqueProviders(oAuth2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOAuth2_doesntHaveRoleForOauth(oAuth2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOAuth2_doesntHaveAuthControllerForOauth(oAuth2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the doesntHaveUserForOauth constraint of '<em>OAuth2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOAuth2_doesntHaveUserForOauth(OAuth2 oAuth2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return oAuth2.doesntHaveUserForOauth(diagnostics, context);
	}

	/**
	 * Validates the uniqueProviders constraint of '<em>OAuth2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOAuth2_uniqueProviders(OAuth2 oAuth2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return oAuth2.uniqueProviders(diagnostics, context);
	}

	/**
	 * Validates the doesntHaveRoleForOauth constraint of '<em>OAuth2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOAuth2_doesntHaveRoleForOauth(OAuth2 oAuth2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return oAuth2.doesntHaveRoleForOauth(diagnostics, context);
	}

	/**
	 * Validates the doesntHaveAuthControllerForOauth constraint of '<em>OAuth2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOAuth2_doesntHaveAuthControllerForOauth(OAuth2 oAuth2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return oAuth2.doesntHaveAuthControllerForOauth(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicAuthentication(BasicAuthentication basicAuthentication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(basicAuthentication, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(basicAuthentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(basicAuthentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(basicAuthentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(basicAuthentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(basicAuthentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(basicAuthentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(basicAuthentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(basicAuthentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBasicAuthentication_basicAuthNoRoleAttributes(basicAuthentication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the basicAuthNoRoleAttributes constraint of '<em>Basic Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicAuthentication_basicAuthNoRoleAttributes(BasicAuthentication basicAuthentication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return basicAuthentication.basicAuthNoRoleAttributes(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvider(Provider provider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDatabaseType(EDatabaseType eDatabaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEType(EType eType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEndpointMethod(EEndpointMethod eEndpointMethod, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEndpointType(EEndpointType eEndpointType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClaimType(EClaimType eClaimType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOAuthProvider(EOAuthProvider eoAuthProvider, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Security_dslValidator
