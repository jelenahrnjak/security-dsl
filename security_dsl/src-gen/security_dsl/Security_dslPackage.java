/**
 */
package security_dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see security_dsl.Security_dslFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Security_dslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security_dsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/security_dsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "security_dsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Security_dslPackage eINSTANCE = security_dsl.impl.Security_dslPackageImpl.init();

	/**
	 * The meta object id for the '{@link security_dsl.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.ApplicationImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>App models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_MODELS = 2;

	/**
	 * The feature id for the '<em><b>App controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_CONTROLLERS = 3;

	/**
	 * The feature id for the '<em><b>App security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_SECURITY = 4;

	/**
	 * The feature id for the '<em><b>App database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_DATABASE = 5;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Controller Not Named User Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Model Not Named User Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___MODEL_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Controller Model Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___CONTROLLER_MODEL_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Controller Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Unique Model Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___UNIQUE_MODEL_NAME__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Unique Controller Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>Unique Controller Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link security_dsl.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.ModelImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IDENTIFIER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Identifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IDENTIFIER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Model attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL_ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Unique Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link security_dsl.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.ControllerImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PATH = 1;

	/**
	 * The feature id for the '<em><b>Controller endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONTROLLER_ENDPOINTS = 2;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Url Starts With Forward Slash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Unique Endpoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link security_dsl.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.DatabaseImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 3;

	/**
	 * The feature id for the '<em><b>Vendor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__VENDOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__URL = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__USERNAME = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PASSWORD = 3;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.SecurityImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 4;

	/**
	 * The feature id for the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__MECHANISM = 0;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.JwtSecurityImpl <em>Jwt Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.JwtSecurityImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getJwtSecurity()
	 * @generated
	 */
	int JWT_SECURITY = 5;

	/**
	 * The feature id for the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SECURITY__MECHANISM = SECURITY__MECHANISM;

	/**
	 * The feature id for the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SECURITY__SIGNATURE_ALGORITHM = SECURITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SECURITY__ISSUER = SECURITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expiration Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SECURITY__EXPIRATION_TIME = SECURITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SECURITY__AUDIENCE = SECURITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SECURITY__SECRET = SECURITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Security claims</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SECURITY__SECURITY_CLAIMS = SECURITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Jwt Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SECURITY_FEATURE_COUNT = SECURITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Unique Claims</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SECURITY___UNIQUE_CLAIMS__DIAGNOSTICCHAIN_MAP = SECURITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Expiration Time Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SECURITY___EXPIRATION_TIME_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = SECURITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Jwt Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SECURITY_OPERATION_COUNT = SECURITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link security_dsl.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.UserImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getUser()
	 * @generated
	 */
	int USER = 6;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IDENTIFIER_NAME = MODEL__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Identifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IDENTIFIER_TYPE = MODEL__IDENTIFIER_TYPE;

	/**
	 * The feature id for the '<em><b>Model attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MODEL_ATTRIBUTES = MODEL__MODEL_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Unique Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.OtherModelImpl <em>Other Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.OtherModelImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getOtherModel()
	 * @generated
	 */
	int OTHER_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MODEL__IDENTIFIER_NAME = MODEL__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Identifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MODEL__IDENTIFIER_TYPE = MODEL__IDENTIFIER_TYPE;

	/**
	 * The feature id for the '<em><b>Model attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MODEL__MODEL_ATTRIBUTES = MODEL__MODEL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MODEL__NAME = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Other Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Other Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.AuthenticationImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__NAME = CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__PATH = CONTROLLER__PATH;

	/**
	 * The feature id for the '<em><b>Controller endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__CONTROLLER_ENDPOINTS = CONTROLLER__CONTROLLER_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Signup endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__SIGNUP_ENDPOINT = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Login endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__LOGIN_ENDPOINT = CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logout endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__LOGOUT_ENDPOINT = CONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Unique Endpoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP = CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Methods Allowed Sign Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___METHODS_ALLOWED_SIGN_UP__DIAGNOSTICCHAIN_MAP = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Methods Allowed Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___METHODS_ALLOWED_LOGIN__DIAGNOSTICCHAIN_MAP = CONTROLLER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Url Starts With Forward Slash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP = CONTROLLER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Methods Allowed Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___METHODS_ALLOWED_LOGOUT__DIAGNOSTICCHAIN_MAP = CONTROLLER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link security_dsl.impl.OtherControllerImpl <em>Other Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.OtherControllerImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getOtherController()
	 * @generated
	 */
	int OTHER_CONTROLLER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_CONTROLLER__NAME = CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_CONTROLLER__PATH = CONTROLLER__PATH;

	/**
	 * The feature id for the '<em><b>Controller endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_CONTROLLER__CONTROLLER_ENDPOINTS = CONTROLLER__CONTROLLER_ENDPOINTS;

	/**
	 * The number of structural features of the '<em>Other Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_CONTROLLER_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Url Starts With Forward Slash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_CONTROLLER___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP = CONTROLLER___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Endpoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP = CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Other Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_CONTROLLER_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.AttributeImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.EndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.EndpointImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getEndpoint()
	 * @generated
	 */
	int ENDPOINT = 11;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__URL = 0;

	/**
	 * The feature id for the '<em><b>Function name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__FUNCTION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__METHOD = 2;

	/**
	 * The feature id for the '<em><b>Roles authority</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__ROLES_AUTHORITY = 3;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.RoleImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 12;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IDENTIFIER_NAME = MODEL__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Identifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IDENTIFIER_TYPE = MODEL__IDENTIFIER_TYPE;

	/**
	 * The feature id for the '<em><b>Model attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MODEL_ATTRIBUTES = MODEL__MODEL_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Unique Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.ClaimImpl <em>Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.ClaimImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getClaim()
	 * @generated
	 */
	int CLAIM = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.PublicImpl <em>Public</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.PublicImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getPublic()
	 * @generated
	 */
	int PUBLIC = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC__NAME = CLAIM__NAME;

	/**
	 * The number of structural features of the '<em>Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_FEATURE_COUNT = CLAIM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_OPERATION_COUNT = CLAIM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.PrivateImpl <em>Private</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.PrivateImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getPrivate()
	 * @generated
	 */
	int PRIVATE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE__NAME = CLAIM__NAME;

	/**
	 * The number of structural features of the '<em>Private</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_FEATURE_COUNT = CLAIM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Private</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_OPERATION_COUNT = CLAIM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link security_dsl.EDatabaseType <em>EDatabase Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.EDatabaseType
	 * @see security_dsl.impl.Security_dslPackageImpl#getEDatabaseType()
	 * @generated
	 */
	int EDATABASE_TYPE = 16;

	/**
	 * The meta object id for the '{@link security_dsl.EEndpointMethod <em>EEndpoint Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.EEndpointMethod
	 * @see security_dsl.impl.Security_dslPackageImpl#getEEndpointMethod()
	 * @generated
	 */
	int EENDPOINT_METHOD = 17;

	/**
	 * The meta object id for the '{@link security_dsl.EType <em>EType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.EType
	 * @see security_dsl.impl.Security_dslPackageImpl#getEType()
	 * @generated
	 */
	int ETYPE = 18;

	/**
	 * The meta object id for the '{@link security_dsl.ESecurityMechanism <em>ESecurity Mechanism</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.ESecurityMechanism
	 * @see security_dsl.impl.Security_dslPackageImpl#getESecurityMechanism()
	 * @generated
	 */
	int ESECURITY_MECHANISM = 19;

	/**
	 * Returns the meta object for class '{@link security_dsl.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see security_dsl.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security_dsl.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see security_dsl.Application#getDescription()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.Application#getApp_models <em>App models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>App models</em>'.
	 * @see security_dsl.Application#getApp_models()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_App_models();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.Application#getApp_controllers <em>App controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>App controllers</em>'.
	 * @see security_dsl.Application#getApp_controllers()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_App_controllers();

	/**
	 * Returns the meta object for the containment reference '{@link security_dsl.Application#getApp_security <em>App security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>App security</em>'.
	 * @see security_dsl.Application#getApp_security()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_App_security();

	/**
	 * Returns the meta object for the containment reference '{@link security_dsl.Application#getApp_database <em>App database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>App database</em>'.
	 * @see security_dsl.Application#getApp_database()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_App_database();

	/**
	 * Returns the meta object for the '{@link security_dsl.Application#controllerNotNamedUserRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Controller Not Named User Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Controller Not Named User Role</em>' operation.
	 * @see security_dsl.Application#controllerNotNamedUserRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__ControllerNotNamedUserRole__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Application#modelNotNamedUserRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Model Not Named User Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Model Not Named User Role</em>' operation.
	 * @see security_dsl.Application#modelNotNamedUserRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__ModelNotNamedUserRole__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Application#controllerModelNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Controller Model Name Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Controller Model Name Unique</em>' operation.
	 * @see security_dsl.Application#controllerModelNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__ControllerModelNameUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Application#controllerPath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Controller Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Controller Path</em>' operation.
	 * @see security_dsl.Application#controllerPath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__ControllerPath__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Application#uniqueModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Model Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Model Name</em>' operation.
	 * @see security_dsl.Application#uniqueModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__UniqueModelName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Application#uniqueControllerPath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Controller Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Controller Path</em>' operation.
	 * @see security_dsl.Application#uniqueControllerPath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__UniqueControllerPath__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Application#uniqueControllerName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Controller Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Controller Name</em>' operation.
	 * @see security_dsl.Application#uniqueControllerName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__UniqueControllerName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see security_dsl.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Model#getIdentifierName <em>Identifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier Name</em>'.
	 * @see security_dsl.Model#getIdentifierName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_IdentifierName();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Model#getIdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier Type</em>'.
	 * @see security_dsl.Model#getIdentifierType()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_IdentifierType();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.Model#getModel_attributes <em>Model attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model attributes</em>'.
	 * @see security_dsl.Model#getModel_attributes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Model_attributes();

	/**
	 * Returns the meta object for the '{@link security_dsl.Model#uniqueAttributeName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Attribute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Attribute Name</em>' operation.
	 * @see security_dsl.Model#uniqueAttributeName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getModel__UniqueAttributeName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see security_dsl.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Controller#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security_dsl.Controller#getName()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Name();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Controller#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see security_dsl.Controller#getPath()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.Controller#getController_endpoints <em>Controller endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controller endpoints</em>'.
	 * @see security_dsl.Controller#getController_endpoints()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Controller_endpoints();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#urlStartsWithForwardSlash(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Url Starts With Forward Slash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Url Starts With Forward Slash</em>' operation.
	 * @see security_dsl.Controller#urlStartsWithForwardSlash(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__UrlStartsWithForwardSlash__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#uniqueEndpoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Endpoints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Endpoints</em>' operation.
	 * @see security_dsl.Controller#uniqueEndpoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__UniqueEndpoints__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see security_dsl.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Database#getVendorName <em>Vendor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor Name</em>'.
	 * @see security_dsl.Database#getVendorName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_VendorName();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Database#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see security_dsl.Database#getUrl()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Url();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Database#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see security_dsl.Database#getUsername()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Username();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Database#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see security_dsl.Database#getPassword()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Password();

	/**
	 * Returns the meta object for class '{@link security_dsl.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see security_dsl.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Security#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see security_dsl.Security#getMechanism()
	 * @see #getSecurity()
	 * @generated
	 */
	EAttribute getSecurity_Mechanism();

	/**
	 * Returns the meta object for class '{@link security_dsl.JwtSecurity <em>Jwt Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jwt Security</em>'.
	 * @see security_dsl.JwtSecurity
	 * @generated
	 */
	EClass getJwtSecurity();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.JwtSecurity#getSignatureAlgorithm <em>Signature Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature Algorithm</em>'.
	 * @see security_dsl.JwtSecurity#getSignatureAlgorithm()
	 * @see #getJwtSecurity()
	 * @generated
	 */
	EAttribute getJwtSecurity_SignatureAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.JwtSecurity#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer</em>'.
	 * @see security_dsl.JwtSecurity#getIssuer()
	 * @see #getJwtSecurity()
	 * @generated
	 */
	EAttribute getJwtSecurity_Issuer();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.JwtSecurity#getExpirationTime <em>Expiration Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Time</em>'.
	 * @see security_dsl.JwtSecurity#getExpirationTime()
	 * @see #getJwtSecurity()
	 * @generated
	 */
	EAttribute getJwtSecurity_ExpirationTime();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.JwtSecurity#getAudience <em>Audience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audience</em>'.
	 * @see security_dsl.JwtSecurity#getAudience()
	 * @see #getJwtSecurity()
	 * @generated
	 */
	EAttribute getJwtSecurity_Audience();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.JwtSecurity#getSecret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret</em>'.
	 * @see security_dsl.JwtSecurity#getSecret()
	 * @see #getJwtSecurity()
	 * @generated
	 */
	EAttribute getJwtSecurity_Secret();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.JwtSecurity#getSecurity_claims <em>Security claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security claims</em>'.
	 * @see security_dsl.JwtSecurity#getSecurity_claims()
	 * @see #getJwtSecurity()
	 * @generated
	 */
	EReference getJwtSecurity_Security_claims();

	/**
	 * Returns the meta object for the '{@link security_dsl.JwtSecurity#uniqueClaims(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Claims</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Claims</em>' operation.
	 * @see security_dsl.JwtSecurity#uniqueClaims(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getJwtSecurity__UniqueClaims__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.JwtSecurity#expirationTimeGreaterThanZero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Expiration Time Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Expiration Time Greater Than Zero</em>' operation.
	 * @see security_dsl.JwtSecurity#expirationTimeGreaterThanZero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getJwtSecurity__ExpirationTimeGreaterThanZero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see security_dsl.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link security_dsl.OtherModel <em>Other Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Model</em>'.
	 * @see security_dsl.OtherModel
	 * @generated
	 */
	EClass getOtherModel();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.OtherModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security_dsl.OtherModel#getName()
	 * @see #getOtherModel()
	 * @generated
	 */
	EAttribute getOtherModel_Name();

	/**
	 * Returns the meta object for class '{@link security_dsl.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see security_dsl.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the containment reference '{@link security_dsl.Authentication#getSignup_endpoint <em>Signup endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signup endpoint</em>'.
	 * @see security_dsl.Authentication#getSignup_endpoint()
	 * @see #getAuthentication()
	 * @generated
	 */
	EReference getAuthentication_Signup_endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link security_dsl.Authentication#getLogin_endpoint <em>Login endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Login endpoint</em>'.
	 * @see security_dsl.Authentication#getLogin_endpoint()
	 * @see #getAuthentication()
	 * @generated
	 */
	EReference getAuthentication_Login_endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link security_dsl.Authentication#getLogout_endpoint <em>Logout endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logout endpoint</em>'.
	 * @see security_dsl.Authentication#getLogout_endpoint()
	 * @see #getAuthentication()
	 * @generated
	 */
	EReference getAuthentication_Logout_endpoint();

	/**
	 * Returns the meta object for the '{@link security_dsl.Authentication#methodsAllowedSignUp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Methods Allowed Sign Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Methods Allowed Sign Up</em>' operation.
	 * @see security_dsl.Authentication#methodsAllowedSignUp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAuthentication__MethodsAllowedSignUp__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Authentication#methodsAllowedLogin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Methods Allowed Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Methods Allowed Login</em>' operation.
	 * @see security_dsl.Authentication#methodsAllowedLogin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAuthentication__MethodsAllowedLogin__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Authentication#urlStartsWithForwardSlash(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Url Starts With Forward Slash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Url Starts With Forward Slash</em>' operation.
	 * @see security_dsl.Authentication#urlStartsWithForwardSlash(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAuthentication__UrlStartsWithForwardSlash__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Authentication#methodsAllowedLogout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Methods Allowed Logout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Methods Allowed Logout</em>' operation.
	 * @see security_dsl.Authentication#methodsAllowedLogout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAuthentication__MethodsAllowedLogout__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.OtherController <em>Other Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Controller</em>'.
	 * @see security_dsl.OtherController
	 * @generated
	 */
	EClass getOtherController();

	/**
	 * Returns the meta object for class '{@link security_dsl.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see security_dsl.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security_dsl.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see security_dsl.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link security_dsl.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see security_dsl.Endpoint
	 * @generated
	 */
	EClass getEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Endpoint#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see security_dsl.Endpoint#getUrl()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Url();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Endpoint#getFunction_name <em>Function name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function name</em>'.
	 * @see security_dsl.Endpoint#getFunction_name()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Function_name();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Endpoint#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see security_dsl.Endpoint#getMethod()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Method();

	/**
	 * Returns the meta object for the reference list '{@link security_dsl.Endpoint#getRoles_authority <em>Roles authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles authority</em>'.
	 * @see security_dsl.Endpoint#getRoles_authority()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_Roles_authority();

	/**
	 * Returns the meta object for class '{@link security_dsl.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see security_dsl.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link security_dsl.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim</em>'.
	 * @see security_dsl.Claim
	 * @generated
	 */
	EClass getClaim();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Claim#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security_dsl.Claim#getName()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_Name();

	/**
	 * Returns the meta object for class '{@link security_dsl.Public <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public</em>'.
	 * @see security_dsl.Public
	 * @generated
	 */
	EClass getPublic();

	/**
	 * Returns the meta object for class '{@link security_dsl.Private <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private</em>'.
	 * @see security_dsl.Private
	 * @generated
	 */
	EClass getPrivate();

	/**
	 * Returns the meta object for enum '{@link security_dsl.EDatabaseType <em>EDatabase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EDatabase Type</em>'.
	 * @see security_dsl.EDatabaseType
	 * @generated
	 */
	EEnum getEDatabaseType();

	/**
	 * Returns the meta object for enum '{@link security_dsl.EEndpointMethod <em>EEndpoint Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEndpoint Method</em>'.
	 * @see security_dsl.EEndpointMethod
	 * @generated
	 */
	EEnum getEEndpointMethod();

	/**
	 * Returns the meta object for enum '{@link security_dsl.EType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EType</em>'.
	 * @see security_dsl.EType
	 * @generated
	 */
	EEnum getEType();

	/**
	 * Returns the meta object for enum '{@link security_dsl.ESecurityMechanism <em>ESecurity Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESecurity Mechanism</em>'.
	 * @see security_dsl.ESecurityMechanism
	 * @generated
	 */
	EEnum getESecurityMechanism();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Security_dslFactory getSecurity_dslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link security_dsl.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.ApplicationImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__DESCRIPTION = eINSTANCE.getApplication_Description();

		/**
		 * The meta object literal for the '<em><b>App models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APP_MODELS = eINSTANCE.getApplication_App_models();

		/**
		 * The meta object literal for the '<em><b>App controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APP_CONTROLLERS = eINSTANCE.getApplication_App_controllers();

		/**
		 * The meta object literal for the '<em><b>App security</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APP_SECURITY = eINSTANCE.getApplication_App_security();

		/**
		 * The meta object literal for the '<em><b>App database</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APP_DATABASE = eINSTANCE.getApplication_App_database();

		/**
		 * The meta object literal for the '<em><b>Controller Not Named User Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__ControllerNotNamedUserRole__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Model Not Named User Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___MODEL_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__ModelNotNamedUserRole__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Controller Model Name Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___CONTROLLER_MODEL_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__ControllerModelNameUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Controller Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__ControllerPath__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Model Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___UNIQUE_MODEL_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__UniqueModelName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Controller Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__UniqueControllerPath__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Controller Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__UniqueControllerName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.ModelImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Identifier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__IDENTIFIER_NAME = eINSTANCE.getModel_IdentifierName();

		/**
		 * The meta object literal for the '<em><b>Identifier Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__IDENTIFIER_TYPE = eINSTANCE.getModel_IdentifierType();

		/**
		 * The meta object literal for the '<em><b>Model attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MODEL_ATTRIBUTES = eINSTANCE.getModel_Model_attributes();

		/**
		 * The meta object literal for the '<em><b>Unique Attribute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getModel__UniqueAttributeName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.ControllerImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__NAME = eINSTANCE.getController_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__PATH = eINSTANCE.getController_Path();

		/**
		 * The meta object literal for the '<em><b>Controller endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__CONTROLLER_ENDPOINTS = eINSTANCE.getController_Controller_endpoints();

		/**
		 * The meta object literal for the '<em><b>Url Starts With Forward Slash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__UrlStartsWithForwardSlash__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Endpoints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__UniqueEndpoints__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.DatabaseImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Vendor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__VENDOR_NAME = eINSTANCE.getDatabase_VendorName();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__URL = eINSTANCE.getDatabase_Url();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__USERNAME = eINSTANCE.getDatabase_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PASSWORD = eINSTANCE.getDatabase_Password();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.SecurityImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '<em><b>Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY__MECHANISM = eINSTANCE.getSecurity_Mechanism();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.JwtSecurityImpl <em>Jwt Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.JwtSecurityImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getJwtSecurity()
		 * @generated
		 */
		EClass JWT_SECURITY = eINSTANCE.getJwtSecurity();

		/**
		 * The meta object literal for the '<em><b>Signature Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT_SECURITY__SIGNATURE_ALGORITHM = eINSTANCE.getJwtSecurity_SignatureAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT_SECURITY__ISSUER = eINSTANCE.getJwtSecurity_Issuer();

		/**
		 * The meta object literal for the '<em><b>Expiration Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT_SECURITY__EXPIRATION_TIME = eINSTANCE.getJwtSecurity_ExpirationTime();

		/**
		 * The meta object literal for the '<em><b>Audience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT_SECURITY__AUDIENCE = eINSTANCE.getJwtSecurity_Audience();

		/**
		 * The meta object literal for the '<em><b>Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT_SECURITY__SECRET = eINSTANCE.getJwtSecurity_Secret();

		/**
		 * The meta object literal for the '<em><b>Security claims</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JWT_SECURITY__SECURITY_CLAIMS = eINSTANCE.getJwtSecurity_Security_claims();

		/**
		 * The meta object literal for the '<em><b>Unique Claims</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT_SECURITY___UNIQUE_CLAIMS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getJwtSecurity__UniqueClaims__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Expiration Time Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT_SECURITY___EXPIRATION_TIME_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getJwtSecurity__ExpirationTimeGreaterThanZero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.UserImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.OtherModelImpl <em>Other Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.OtherModelImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getOtherModel()
		 * @generated
		 */
		EClass OTHER_MODEL = eINSTANCE.getOtherModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_MODEL__NAME = eINSTANCE.getOtherModel_Name();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.AuthenticationImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>Signup endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__SIGNUP_ENDPOINT = eINSTANCE.getAuthentication_Signup_endpoint();

		/**
		 * The meta object literal for the '<em><b>Login endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__LOGIN_ENDPOINT = eINSTANCE.getAuthentication_Login_endpoint();

		/**
		 * The meta object literal for the '<em><b>Logout endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__LOGOUT_ENDPOINT = eINSTANCE.getAuthentication_Logout_endpoint();

		/**
		 * The meta object literal for the '<em><b>Methods Allowed Sign Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___METHODS_ALLOWED_SIGN_UP__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAuthentication__MethodsAllowedSignUp__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Methods Allowed Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___METHODS_ALLOWED_LOGIN__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAuthentication__MethodsAllowedLogin__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Url Starts With Forward Slash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAuthentication__UrlStartsWithForwardSlash__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Methods Allowed Logout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___METHODS_ALLOWED_LOGOUT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAuthentication__MethodsAllowedLogout__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.OtherControllerImpl <em>Other Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.OtherControllerImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getOtherController()
		 * @generated
		 */
		EClass OTHER_CONTROLLER = eINSTANCE.getOtherController();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.AttributeImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.EndpointImpl <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.EndpointImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getEndpoint()
		 * @generated
		 */
		EClass ENDPOINT = eINSTANCE.getEndpoint();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__URL = eINSTANCE.getEndpoint_Url();

		/**
		 * The meta object literal for the '<em><b>Function name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__FUNCTION_NAME = eINSTANCE.getEndpoint_Function_name();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__METHOD = eINSTANCE.getEndpoint_Method();

		/**
		 * The meta object literal for the '<em><b>Roles authority</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__ROLES_AUTHORITY = eINSTANCE.getEndpoint_Roles_authority();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.RoleImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.ClaimImpl <em>Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.ClaimImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getClaim()
		 * @generated
		 */
		EClass CLAIM = eINSTANCE.getClaim();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__NAME = eINSTANCE.getClaim_Name();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.PublicImpl <em>Public</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.PublicImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getPublic()
		 * @generated
		 */
		EClass PUBLIC = eINSTANCE.getPublic();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.PrivateImpl <em>Private</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.PrivateImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getPrivate()
		 * @generated
		 */
		EClass PRIVATE = eINSTANCE.getPrivate();

		/**
		 * The meta object literal for the '{@link security_dsl.EDatabaseType <em>EDatabase Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.EDatabaseType
		 * @see security_dsl.impl.Security_dslPackageImpl#getEDatabaseType()
		 * @generated
		 */
		EEnum EDATABASE_TYPE = eINSTANCE.getEDatabaseType();

		/**
		 * The meta object literal for the '{@link security_dsl.EEndpointMethod <em>EEndpoint Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.EEndpointMethod
		 * @see security_dsl.impl.Security_dslPackageImpl#getEEndpointMethod()
		 * @generated
		 */
		EEnum EENDPOINT_METHOD = eINSTANCE.getEEndpointMethod();

		/**
		 * The meta object literal for the '{@link security_dsl.EType <em>EType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.EType
		 * @see security_dsl.impl.Security_dslPackageImpl#getEType()
		 * @generated
		 */
		EEnum ETYPE = eINSTANCE.getEType();

		/**
		 * The meta object literal for the '{@link security_dsl.ESecurityMechanism <em>ESecurity Mechanism</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.ESecurityMechanism
		 * @see security_dsl.impl.Security_dslPackageImpl#getESecurityMechanism()
		 * @generated
		 */
		EEnum ESECURITY_MECHANISM = eINSTANCE.getESecurityMechanism();

	}

} //Security_dslPackage
