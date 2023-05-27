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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Controller Not Named User Role' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__CONTROLLER_NOT_NAMED_USER_ROLE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Model Not Named User Role' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__MODEL_NOT_NAMED_USER_ROLE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Controller Model Name Unique' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__CONTROLLER_MODEL_NAME_UNIQUE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Controller Path' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__CONTROLLER_PATH = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Model Name' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__UNIQUE_MODEL_NAME = 5;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Attribute Name' of 'Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL__UNIQUE_ATTRIBUTE_NAME = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Url Starts With Forward Slash' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__URL_STARTS_WITH_FORWARD_SLASH = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Endpoints' of 'Controller'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER__UNIQUE_ENDPOINTS = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Claims' of 'Jwt Security'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JWT_SECURITY__UNIQUE_CLAIMS = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Expiration Time Greater Than Zero' of 'Jwt Security'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JWT_SECURITY__EXPIRATION_TIME_GREATER_THAN_ZERO = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Methods Allowed Sign Up' of 'Authentication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHENTICATION__METHODS_ALLOWED_SIGN_UP = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Methods Allowed Login' of 'Authentication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHENTICATION__METHODS_ALLOWED_LOGIN = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Url Starts With Forward Slash' of 'Authentication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHENTICATION__URL_STARTS_WITH_FORWARD_SLASH = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Methods Allowed Logout' of 'Authentication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHENTICATION__METHODS_ALLOWED_LOGOUT = 16;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 16;

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
		case Security_dslPackage.DATABASE:
			return validateDatabase((Database) value, diagnostics, context);
		case Security_dslPackage.SECURITY:
			return validateSecurity((Security) value, diagnostics, context);
		case Security_dslPackage.JWT_SECURITY:
			return validateJwtSecurity((JwtSecurity) value, diagnostics, context);
		case Security_dslPackage.USER:
			return validateUser((User) value, diagnostics, context);
		case Security_dslPackage.OTHER_MODEL:
			return validateOtherModel((OtherModel) value, diagnostics, context);
		case Security_dslPackage.AUTHENTICATION:
			return validateAuthentication((Authentication) value, diagnostics, context);
		case Security_dslPackage.OTHER_CONTROLLER:
			return validateOtherController((OtherController) value, diagnostics, context);
		case Security_dslPackage.ATTRIBUTE:
			return validateAttribute((Attribute) value, diagnostics, context);
		case Security_dslPackage.ENDPOINT:
			return validateEndpoint((Endpoint) value, diagnostics, context);
		case Security_dslPackage.ROLE:
			return validateRole((Role) value, diagnostics, context);
		case Security_dslPackage.CLAIM:
			return validateClaim((Claim) value, diagnostics, context);
		case Security_dslPackage.PUBLIC:
			return validatePublic((Public) value, diagnostics, context);
		case Security_dslPackage.PRIVATE:
			return validatePrivate((Private) value, diagnostics, context);
		case Security_dslPackage.EDATABASE_TYPE:
			return validateEDatabaseType((EDatabaseType) value, diagnostics, context);
		case Security_dslPackage.EENDPOINT_METHOD:
			return validateEEndpointMethod((EEndpointMethod) value, diagnostics, context);
		case Security_dslPackage.ETYPE:
			return validateEType((EType) value, diagnostics, context);
		case Security_dslPackage.ESECURITY_MECHANISM:
			return validateESecurityMechanism((ESecurityMechanism) value, diagnostics, context);
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
			result &= validateApplication_uniqueControllerName(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_controllerNotNamedUserRole(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_modelNotNamedUserRole(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_controllerModelNameUnique(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_controllerPath(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_uniqueModelName(application, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApplication_uniqueControllerPath(application, diagnostics, context);
		return result;
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
	 * Validates the modelNotNamedUserRole constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_modelNotNamedUserRole(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return application.modelNotNamedUserRole(diagnostics, context);
	}

	/**
	 * Validates the controllerModelNameUnique constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_controllerModelNameUnique(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return application.controllerModelNameUnique(diagnostics, context);
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
	 * Validates the uniqueModelName constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_uniqueModelName(Application application, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return application.uniqueModelName(diagnostics, context);
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
			result &= validateModel_uniqueAttributeName(model, diagnostics, context);
		return result;
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
			result &= validateController_uniqueEndpoints(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_urlStartsWithForwardSlash(controller, diagnostics, context);
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
	public boolean validateDatabase(Database database, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(database, diagnostics, context);
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
	public boolean validateJwtSecurity(JwtSecurity jwtSecurity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(jwtSecurity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(jwtSecurity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(jwtSecurity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(jwtSecurity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(jwtSecurity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(jwtSecurity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(jwtSecurity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(jwtSecurity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(jwtSecurity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJwtSecurity_expirationTimeGreaterThanZero(jwtSecurity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJwtSecurity_uniqueClaims(jwtSecurity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the expirationTimeGreaterThanZero constraint of '<em>Jwt Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJwtSecurity_expirationTimeGreaterThanZero(JwtSecurity jwtSecurity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return jwtSecurity.expirationTimeGreaterThanZero(diagnostics, context);
	}

	/**
	 * Validates the uniqueClaims constraint of '<em>Jwt Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJwtSecurity_uniqueClaims(JwtSecurity jwtSecurity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return jwtSecurity.uniqueClaims(diagnostics, context);
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
			result &= validateModel_uniqueAttributeName(user, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherModel(OtherModel otherModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(otherModel, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(otherModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(otherModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(otherModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(otherModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(otherModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(otherModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(otherModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(otherModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_uniqueAttributeName(otherModel, diagnostics, context);
		return result;
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
			result &= validateController_uniqueEndpoints(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAuthentication_urlStartsWithForwardSlash(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAuthentication_methodsAllowedLogout(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAuthentication_methodsAllowedSignUp(authentication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAuthentication_methodsAllowedLogin(authentication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the methodsAllowedLogout constraint of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication_methodsAllowedLogout(Authentication authentication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authentication.methodsAllowedLogout(diagnostics, context);
	}

	/**
	 * Validates the methodsAllowedSignUp constraint of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication_methodsAllowedSignUp(Authentication authentication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authentication.methodsAllowedSignUp(diagnostics, context);
	}

	/**
	 * Validates the methodsAllowedLogin constraint of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication_methodsAllowedLogin(Authentication authentication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authentication.methodsAllowedLogin(diagnostics, context);
	}

	/**
	 * Validates the urlStartsWithForwardSlash constraint of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication_urlStartsWithForwardSlash(Authentication authentication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authentication.urlStartsWithForwardSlash(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherController(OtherController otherController, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(otherController, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(otherController, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(otherController, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(otherController, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(otherController, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(otherController, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(otherController, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(otherController, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(otherController, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_uniqueEndpoints(otherController, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_urlStartsWithForwardSlash(otherController, diagnostics, context);
		return result;
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
	public boolean validateEndpoint(Endpoint endpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpoint, diagnostics, context);
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
			result &= validateModel_uniqueAttributeName(role, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaim(Claim claim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claim, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublic(Public public_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(public_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivate(Private private_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(private_, diagnostics, context);
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
	public boolean validateEEndpointMethod(EEndpointMethod eEndpointMethod, DiagnosticChain diagnostics,
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
	public boolean validateESecurityMechanism(ESecurityMechanism eSecurityMechanism, DiagnosticChain diagnostics,
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
