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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Controller Path' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__CONTROLLER_PATH = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Controller Not Named User Role' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__CONTROLLER_NOT_NAMED_USER_ROLE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Database For Model' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__HAS_DATABASE_FOR_MODEL = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Table Name' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__UNIQUE_TABLE_NAME = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has User And Role Models For Controller' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__HAS_USER_AND_ROLE_MODELS_FOR_CONTROLLER = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Controller Path' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__UNIQUE_CONTROLLER_PATH = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Controller Name' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__UNIQUE_CONTROLLER_NAME = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Port' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__VALID_PORT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Role Can Have Id And String Attribute' of 'Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL__ROLE_CAN_HAVE_ID_AND_STRING_ATTRIBUTE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Role Cant Have Additional Attributes' of 'Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL__ROLE_CANT_HAVE_ADDITIONAL_ATTRIBUTES = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Collumn Name' of 'Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL__UNIQUE_COLLUMN_NAME = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One Identifier' of 'Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL__ONLY_ONE_IDENTIFIER = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Credential' of 'Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL__ONE_CREDENTIAL = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Attribute Name' of 'Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL__UNIQUE_ATTRIBUTE_NAME = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Role Must Have String Attribute' of 'Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL__ROLE_MUST_HAVE_STRING_ATTRIBUTE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Method Allowed Registration' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__METHOD_ALLOWED_REGISTRATION = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Method Required For Other Type' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__METHOD_REQUIRED_FOR_OTHER_TYPE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Endpoint Limits' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__ENDPOINT_LIMITS = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Method Allowed Login' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__METHOD_ALLOWED_LOGIN = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Method Allowed Logout' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__METHOD_ALLOWED_LOGOUT = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Login Existance For Logout' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__LOGIN_EXISTANCE_FOR_LOGOUT = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Authentication Limits' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__AUTHENTICATION_LIMITS = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Url Starts With Forward Slash' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__URL_STARTS_WITH_FORWARD_SLASH = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Endpoints' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__UNIQUE_ENDPOINTS = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Role Authorities' of 'Endpoint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENDPOINT__UNIQUE_ROLE_AUTHORITIES = 25;

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
	public static final int JWT__REGISTERED_CLAIM_SUBJECT = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Single Registered Claim' of 'JWT'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JWT__SINGLE_REGISTERED_CLAIM = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Claim Attribute' of 'Claim'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLAIM__UNIQUE_CLAIM_ATTRIBUTE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Expiration Time Greater Than Zero' of 'Registered Claims'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REGISTERED_CLAIMS__EXPIRATION_TIME_GREATER_THAN_ZERO = 30;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 30;

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
		case Security_dslPackage.MODEL:
			return validateModel((Model) value, diagnostics, context);
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
		case Security_dslPackage.REGISTERED_CLAIMS:
			return validateRegisteredClaims((RegisteredClaims) value, diagnostics, context);
		case Security_dslPackage.OAUTH2:
			return validateOAuth2((OAuth2) value, diagnostics, context);
		case Security_dslPackage.BASIC_AUTHENTICATION:
			return validateBasicAuthentication((BasicAuthentication) value, diagnostics, context);
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
			result &= validateApplication_validPort(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_controllerPath(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_controllerNotNamedUserRole(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_hasDatabaseForModel(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_uniqueTableName(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_hasUserAndRoleModelsForController(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_uniqueControllerPath(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_uniqueControllerName(application, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validPort constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_validPort(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return application.validPort(diagnostics, context);
	}

	/**
	 * Validates the controllerPath constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_controllerPath(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return application.controllerPath(diagnostics, context);
	}

	/**
	 * Validates the controllerNotNamedUserRole constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_controllerNotNamedUserRole(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return application.controllerNotNamedUserRole(diagnostics, context);
	}

	/**
	 * Validates the hasDatabaseForModel constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_hasDatabaseForModel(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return application.hasDatabaseForModel(diagnostics, context);
	}

	/**
	 * Validates the uniqueTableName constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_uniqueTableName(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return application.uniqueTableName(diagnostics, context);
	}

	/**
	 * Validates the hasUserAndRoleModelsForController constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_hasUserAndRoleModelsForController(Application application,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return application.hasUserAndRoleModelsForController(diagnostics, context);
	}

	/**
	 * Validates the uniqueControllerPath constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_uniqueControllerPath(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return application.uniqueControllerPath(diagnostics, context);
	}

	/**
	 * Validates the uniqueControllerName constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_uniqueControllerName(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return application.uniqueControllerName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(model, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_uniqueCollumnName(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_roleCantHaveAdditionalAttributes(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_uniqueAttributeName(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_onlyOneIdentifier(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_oneCredential(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_roleMustHaveStringAttribute(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_roleCanHaveIdAndStringAttribute(model, diagnostics, context);
		return result;
	}

	/**
	 * Validates the roleMustHaveStringAttribute constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_roleMustHaveStringAttribute(Model model, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return model.roleMustHaveStringAttribute(diagnostics, context);
	}

	/**
	 * Validates the roleCanHaveIdAndStringAttribute constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_roleCanHaveIdAndStringAttribute(Model model, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return model.roleCanHaveIdAndStringAttribute(diagnostics, context);
	}

	/**
	 * Validates the roleCantHaveAdditionalAttributes constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_roleCantHaveAdditionalAttributes(Model model, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return model.roleCantHaveAdditionalAttributes(diagnostics, context);
	}

	/**
	 * Validates the uniqueCollumnName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_uniqueCollumnName(Model model, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return model.uniqueCollumnName(diagnostics, context);
	}

	/**
	 * Validates the onlyOneIdentifier constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_onlyOneIdentifier(Model model, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return model.onlyOneIdentifier(diagnostics, context);
	}

	/**
	 * Validates the oneCredential constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_oneCredential(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return model.oneCredential(diagnostics, context);
	}

	/**
	 * Validates the uniqueAttributeName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_uniqueAttributeName(Model model, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return model.uniqueAttributeName(diagnostics, context);
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
			result &= validateController_methodAllowedLogout(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_methodAllowedLogin(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_authenticationLimits(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_methodAllowedRegistration(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_methodRequiredForOtherType(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_uniqueEndpoints(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_urlStartsWithForwardSlash(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_loginExistanceForLogout(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_endpointLimits(controller, diagnostics, context);
		return result;
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
	 * Validates the methodAllowedRegistration constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_methodAllowedRegistration(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.methodAllowedRegistration(diagnostics, context);
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
	 * Validates the methodAllowedLogin constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_methodAllowedLogin(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.methodAllowedLogin(diagnostics, context);
	}

	/**
	 * Validates the methodAllowedLogout constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_methodAllowedLogout(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.methodAllowedLogout(diagnostics, context);
	}

	/**
	 * Validates the loginExistanceForLogout constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_loginExistanceForLogout(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.loginExistanceForLogout(diagnostics, context);
	}

	/**
	 * Validates the authenticationLimits constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_authenticationLimits(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.authenticationLimits(diagnostics, context);
	}

	/**
	 * Validates the urlStartsWithForwardSlash constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_urlStartsWithForwardSlash(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return controller.urlStartsWithForwardSlash(diagnostics, context);
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
			result &= validateModel_uniqueCollumnName(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_roleCantHaveAdditionalAttributes(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_uniqueAttributeName(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_onlyOneIdentifier(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_oneCredential(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_roleMustHaveStringAttribute(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_roleCanHaveIdAndStringAttribute(role, diagnostics, context);
		return result;
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
			result &= validateModel_uniqueCollumnName(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_roleCantHaveAdditionalAttributes(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_uniqueAttributeName(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_onlyOneIdentifier(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_oneCredential(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_roleMustHaveStringAttribute(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_roleCanHaveIdAndStringAttribute(user, diagnostics, context);
		return result;
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
			result &= validateController_methodAllowedLogout(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_methodAllowedLogin(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_authenticationLimits(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_methodAllowedRegistration(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_methodRequiredForOtherType(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_uniqueEndpoints(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_urlStartsWithForwardSlash(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_loginExistanceForLogout(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_endpointLimits(authentication, diagnostics, context);
		return result;
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
			result &= validateEndpoint_uniqueRoleAuthorities(endpoint, diagnostics, context);
		return result;
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
			result &= validateJWT_singleRegisteredClaim(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJWT_uniqueClaims(jwt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJWT_registeredClaimSubject(jwt, diagnostics, context);
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
	public boolean validateRegisteredClaims(RegisteredClaims registeredClaims, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(registeredClaims, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(registeredClaims, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(registeredClaims, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(registeredClaims, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(registeredClaims, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(registeredClaims, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(registeredClaims, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(registeredClaims, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(registeredClaims, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRegisteredClaims_expirationTimeGreaterThanZero(registeredClaims, diagnostics, context);
		return result;
	}

	/**
	 * Validates the expirationTimeGreaterThanZero constraint of '<em>Registered Claims</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisteredClaims_expirationTimeGreaterThanZero(RegisteredClaims registeredClaims,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return registeredClaims.expirationTimeGreaterThanZero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOAuth2(OAuth2 oAuth2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oAuth2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicAuthentication(BasicAuthentication basicAuthentication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicAuthentication, diagnostics, context);
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
