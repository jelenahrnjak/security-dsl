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
	 * The feature id for the '<em><b>App database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_DATABASE = 0;

	/**
	 * The feature id for the '<em><b>App models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_MODELS = 1;

	/**
	 * The feature id for the '<em><b>App controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_CONTROLLERS = 2;

	/**
	 * The feature id for the '<em><b>App security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_SECURITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__GROUP = 6;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ARTIFACT = 7;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PACKAGE_NAME = 8;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PORT = 9;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HOSTNAME = 10;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Controller Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Controller Not Named User Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Has Database For Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___HAS_DATABASE_FOR_MODEL__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Unique Table Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Has User And Role Models For Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___HAS_USER_AND_ROLE_MODELS_FOR_CONTROLLER__DIAGNOSTICCHAIN_MAP = 4;

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
	 * The operation id for the '<em>Valid Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___VALID_PORT__DIAGNOSTICCHAIN_MAP = 7;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 8;

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
	 * The feature id for the '<em><b>Model attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL_ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TABLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Role Can Have Id And String Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ROLE_CAN_HAVE_ID_AND_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Role Cant Have Additional Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ROLE_CANT_HAVE_ADDITIONAL_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Unique Collumn Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Only One Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Unique Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Role Must Have String Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ROLE_MUST_HAVE_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 6;

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
	 * The operation id for the '<em>Method Allowed Registration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___METHOD_ALLOWED_REGISTRATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Endpoint Limits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Method Allowed Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___METHOD_ALLOWED_LOGIN__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Method Allowed Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___METHOD_ALLOWED_LOGOUT__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Login Existance For Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Authentication Limits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>Url Starts With Forward Slash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The operation id for the '<em>Unique Endpoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP = 7;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link security_dsl.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.SecurityImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 3;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.DatabaseImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 4;

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
	 * The meta object id for the '{@link security_dsl.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.AttributeImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

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
	 * The feature id for the '<em><b>Is Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Collumn Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COLLUMN_NAME = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.RoleImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 6;

	/**
	 * The feature id for the '<em><b>Model attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MODEL_ATTRIBUTES = MODEL__MODEL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TABLE_NAME = MODEL__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Role instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_INSTANCES = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Role Can Have Id And String Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ROLE_CAN_HAVE_ID_AND_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = MODEL___ROLE_CAN_HAVE_ID_AND_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Role Cant Have Additional Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ROLE_CANT_HAVE_ADDITIONAL_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = MODEL___ROLE_CANT_HAVE_ADDITIONAL_ATTRIBUTES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Collumn Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP = MODEL___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Only One Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP = MODEL___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Role Must Have String Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ROLE_MUST_HAVE_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = MODEL___ROLE_MUST_HAVE_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.UserImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getUser()
	 * @generated
	 */
	int USER = 7;

	/**
	 * The feature id for the '<em><b>Model attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MODEL_ATTRIBUTES = MODEL__MODEL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TABLE_NAME = MODEL__TABLE_NAME;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Role Can Have Id And String Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ROLE_CAN_HAVE_ID_AND_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = MODEL___ROLE_CAN_HAVE_ID_AND_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Role Cant Have Additional Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ROLE_CANT_HAVE_ADDITIONAL_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = MODEL___ROLE_CANT_HAVE_ADDITIONAL_ATTRIBUTES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Collumn Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP = MODEL___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Only One Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP = MODEL___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Attribute Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Role Must Have String Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ROLE_MUST_HAVE_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = MODEL___ROLE_MUST_HAVE_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.RoleInstanceImpl <em>Role Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.RoleInstanceImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getRoleInstance()
	 * @generated
	 */
	int ROLE_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.AuthenticationImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 9;

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
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Method Allowed Registration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___METHOD_ALLOWED_REGISTRATION__DIAGNOSTICCHAIN_MAP = CONTROLLER___METHOD_ALLOWED_REGISTRATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Endpoint Limits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP = CONTROLLER___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Method Allowed Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___METHOD_ALLOWED_LOGIN__DIAGNOSTICCHAIN_MAP = CONTROLLER___METHOD_ALLOWED_LOGIN__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Method Allowed Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___METHOD_ALLOWED_LOGOUT__DIAGNOSTICCHAIN_MAP = CONTROLLER___METHOD_ALLOWED_LOGOUT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Login Existance For Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP = CONTROLLER___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Authentication Limits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP = CONTROLLER___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Url Starts With Forward Slash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP = CONTROLLER___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Endpoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP = CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link security_dsl.impl.EndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.EndpointImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getEndpoint()
	 * @generated
	 */
	int ENDPOINT = 10;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__URL = 0;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Role authorities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__ROLE_AUTHORITIES = 4;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Unique Role Authorities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT___UNIQUE_ROLE_AUTHORITIES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link security_dsl.impl.JWTImpl <em>JWT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.JWTImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getJWT()
	 * @generated
	 */
	int JWT = 11;

	/**
	 * The feature id for the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT__SIGNATURE_ALGORITHM = SECURITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT__SECRET = SECURITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jwt claims</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT__JWT_CLAIMS = SECURITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Registeredclaims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT__REGISTEREDCLAIMS = SECURITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>JWT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_FEATURE_COUNT = SECURITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Unique Claims</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT___UNIQUE_CLAIMS__DIAGNOSTICCHAIN_MAP = SECURITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Registered Claim Subject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT___REGISTERED_CLAIM_SUBJECT__DIAGNOSTICCHAIN_MAP = SECURITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Single Registered Claim</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT___SINGLE_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP = SECURITY_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>JWT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_OPERATION_COUNT = SECURITY_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link security_dsl.impl.ClaimImpl <em>Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.ClaimImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getClaim()
	 * @generated
	 */
	int CLAIM = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Claim attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CLAIM_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__NAME = 2;

	/**
	 * The number of structural features of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Unique Claim Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM___UNIQUE_CLAIM_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link security_dsl.impl.RegisteredClaimsImpl <em>Registered Claims</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.impl.RegisteredClaimsImpl
	 * @see security_dsl.impl.Security_dslPackageImpl#getRegisteredClaims()
	 * @generated
	 */
	int REGISTERED_CLAIMS = 13;

	/**
	 * The feature id for the '<em><b>Expiration Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_CLAIMS__EXPIRATION_TIME = 0;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_CLAIMS__ISSUER = 1;

	/**
	 * The feature id for the '<em><b>Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_CLAIMS__AUDIENCE = 2;

	/**
	 * The number of structural features of the '<em>Registered Claims</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_CLAIMS_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Expiration Time Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_CLAIMS___EXPIRATION_TIME_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Registered Claims</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_CLAIMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link security_dsl.EDatabaseType <em>EDatabase Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.EDatabaseType
	 * @see security_dsl.impl.Security_dslPackageImpl#getEDatabaseType()
	 * @generated
	 */
	int EDATABASE_TYPE = 14;

	/**
	 * The meta object id for the '{@link security_dsl.ESecuirtyMechanism <em>ESecuirty Mechanism</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.ESecuirtyMechanism
	 * @see security_dsl.impl.Security_dslPackageImpl#getESecuirtyMechanism()
	 * @generated
	 */
	int ESECUIRTY_MECHANISM = 15;

	/**
	 * The meta object id for the '{@link security_dsl.EType <em>EType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.EType
	 * @see security_dsl.impl.Security_dslPackageImpl#getEType()
	 * @generated
	 */
	int ETYPE = 16;

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
	 * The meta object id for the '{@link security_dsl.EEndpointType <em>EEndpoint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.EEndpointType
	 * @see security_dsl.impl.Security_dslPackageImpl#getEEndpointType()
	 * @generated
	 */
	int EENDPOINT_TYPE = 18;

	/**
	 * The meta object id for the '{@link security_dsl.EClaimType <em>EClaim Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security_dsl.EClaimType
	 * @see security_dsl.impl.Security_dslPackageImpl#getEClaimType()
	 * @generated
	 */
	int ECLAIM_TYPE = 19;

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
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see security_dsl.Application#getGroup()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Group();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact</em>'.
	 * @see security_dsl.Application#getArtifact()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see security_dsl.Application#getPackageName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see security_dsl.Application#getPort()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Port();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Application#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see security_dsl.Application#getHostname()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Hostname();

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
	 * Returns the meta object for the '{@link security_dsl.Application#controllerNotNamedUserRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Controller Not Named User Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Controller Not Named User Role</em>' operation.
	 * @see security_dsl.Application#controllerNotNamedUserRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__ControllerNotNamedUserRole__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Application#hasDatabaseForModel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Database For Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Database For Model</em>' operation.
	 * @see security_dsl.Application#hasDatabaseForModel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__HasDatabaseForModel__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Application#uniqueTableName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Table Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Table Name</em>' operation.
	 * @see security_dsl.Application#uniqueTableName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__UniqueTableName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Application#hasUserAndRoleModelsForController(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has User And Role Models For Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has User And Role Models For Controller</em>' operation.
	 * @see security_dsl.Application#hasUserAndRoleModelsForController(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__HasUserAndRoleModelsForController__DiagnosticChain_Map();

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
	 * Returns the meta object for the '{@link security_dsl.Application#validPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Port</em>' operation.
	 * @see security_dsl.Application#validPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__ValidPort__DiagnosticChain_Map();

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
	 * Returns the meta object for the attribute '{@link security_dsl.Model#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see security_dsl.Model#getTableName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_TableName();

	/**
	 * Returns the meta object for the '{@link security_dsl.Model#roleCanHaveIdAndStringAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Role Can Have Id And String Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Role Can Have Id And String Attribute</em>' operation.
	 * @see security_dsl.Model#roleCanHaveIdAndStringAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getModel__RoleCanHaveIdAndStringAttribute__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Model#roleCantHaveAdditionalAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Role Cant Have Additional Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Role Cant Have Additional Attributes</em>' operation.
	 * @see security_dsl.Model#roleCantHaveAdditionalAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getModel__RoleCantHaveAdditionalAttributes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Model#uniqueCollumnName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Collumn Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Collumn Name</em>' operation.
	 * @see security_dsl.Model#uniqueCollumnName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getModel__UniqueCollumnName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Model#onlyOneIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only One Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only One Identifier</em>' operation.
	 * @see security_dsl.Model#onlyOneIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getModel__OnlyOneIdentifier__DiagnosticChain_Map();

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
	 * Returns the meta object for the '{@link security_dsl.Model#roleMustHaveStringAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Role Must Have String Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Role Must Have String Attribute</em>' operation.
	 * @see security_dsl.Model#roleMustHaveStringAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getModel__RoleMustHaveStringAttribute__DiagnosticChain_Map();

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
	 * Returns the meta object for the '{@link security_dsl.Controller#methodAllowedRegistration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Method Allowed Registration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Method Allowed Registration</em>' operation.
	 * @see security_dsl.Controller#methodAllowedRegistration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__MethodAllowedRegistration__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#endpointLimits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Endpoint Limits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Endpoint Limits</em>' operation.
	 * @see security_dsl.Controller#endpointLimits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__EndpointLimits__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#methodAllowedLogin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Method Allowed Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Method Allowed Login</em>' operation.
	 * @see security_dsl.Controller#methodAllowedLogin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__MethodAllowedLogin__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#methodAllowedLogout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Method Allowed Logout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Method Allowed Logout</em>' operation.
	 * @see security_dsl.Controller#methodAllowedLogout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__MethodAllowedLogout__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#loginExistanceForLogout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Login Existance For Logout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login Existance For Logout</em>' operation.
	 * @see security_dsl.Controller#loginExistanceForLogout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__LoginExistanceForLogout__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.Controller#authenticationLimits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Authentication Limits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authentication Limits</em>' operation.
	 * @see security_dsl.Controller#authenticationLimits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getController__AuthenticationLimits__DiagnosticChain_Map();

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
	 * Returns the meta object for class '{@link security_dsl.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see security_dsl.Security
	 * @generated
	 */
	EClass getSecurity();

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
	 * Returns the meta object for the attribute '{@link security_dsl.Attribute#isIsIdentifier <em>Is Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Identifier</em>'.
	 * @see security_dsl.Attribute#isIsIdentifier()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.Attribute#getCollumnName <em>Collumn Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collumn Name</em>'.
	 * @see security_dsl.Attribute#getCollumnName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_CollumnName();

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
	 * Returns the meta object for the containment reference list '{@link security_dsl.Role#getRole_instances <em>Role instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role instances</em>'.
	 * @see security_dsl.Role#getRole_instances()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Role_instances();

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
	 * Returns the meta object for class '{@link security_dsl.RoleInstance <em>Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Instance</em>'.
	 * @see security_dsl.RoleInstance
	 * @generated
	 */
	EClass getRoleInstance();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.RoleInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security_dsl.RoleInstance#getName()
	 * @see #getRoleInstance()
	 * @generated
	 */
	EAttribute getRoleInstance_Name();

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
	 * Returns the meta object for the attribute '{@link security_dsl.Endpoint#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see security_dsl.Endpoint#getFunctionName()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_FunctionName();

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
	 * Returns the meta object for the attribute '{@link security_dsl.Endpoint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see security_dsl.Endpoint#getType()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Type();

	/**
	 * Returns the meta object for the reference list '{@link security_dsl.Endpoint#getRole_authorities <em>Role authorities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role authorities</em>'.
	 * @see security_dsl.Endpoint#getRole_authorities()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_Role_authorities();

	/**
	 * Returns the meta object for the '{@link security_dsl.Endpoint#uniqueRoleAuthorities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Role Authorities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Role Authorities</em>' operation.
	 * @see security_dsl.Endpoint#uniqueRoleAuthorities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEndpoint__UniqueRoleAuthorities__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.JWT <em>JWT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JWT</em>'.
	 * @see security_dsl.JWT
	 * @generated
	 */
	EClass getJWT();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.JWT#getSignatureAlgorithm <em>Signature Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature Algorithm</em>'.
	 * @see security_dsl.JWT#getSignatureAlgorithm()
	 * @see #getJWT()
	 * @generated
	 */
	EAttribute getJWT_SignatureAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.JWT#getSecret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret</em>'.
	 * @see security_dsl.JWT#getSecret()
	 * @see #getJWT()
	 * @generated
	 */
	EAttribute getJWT_Secret();

	/**
	 * Returns the meta object for the containment reference list '{@link security_dsl.JWT#getJwt_claims <em>Jwt claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jwt claims</em>'.
	 * @see security_dsl.JWT#getJwt_claims()
	 * @see #getJWT()
	 * @generated
	 */
	EReference getJWT_Jwt_claims();

	/**
	 * Returns the meta object for the containment reference '{@link security_dsl.JWT#getRegisteredclaims <em>Registeredclaims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registeredclaims</em>'.
	 * @see security_dsl.JWT#getRegisteredclaims()
	 * @see #getJWT()
	 * @generated
	 */
	EReference getJWT_Registeredclaims();

	/**
	 * Returns the meta object for the '{@link security_dsl.JWT#uniqueClaims(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Claims</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Claims</em>' operation.
	 * @see security_dsl.JWT#uniqueClaims(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getJWT__UniqueClaims__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.JWT#registeredClaimSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Registered Claim Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Registered Claim Subject</em>' operation.
	 * @see security_dsl.JWT#registeredClaimSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getJWT__RegisteredClaimSubject__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link security_dsl.JWT#singleRegisteredClaim(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Single Registered Claim</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Single Registered Claim</em>' operation.
	 * @see security_dsl.JWT#singleRegisteredClaim(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getJWT__SingleRegisteredClaim__DiagnosticChain_Map();

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
	 * Returns the meta object for the attribute '{@link security_dsl.Claim#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see security_dsl.Claim#getType()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_Type();

	/**
	 * Returns the meta object for the reference '{@link security_dsl.Claim#getClaim_attribute <em>Claim attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Claim attribute</em>'.
	 * @see security_dsl.Claim#getClaim_attribute()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_Claim_attribute();

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
	 * Returns the meta object for the '{@link security_dsl.Claim#uniqueClaimAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Claim Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Claim Attribute</em>' operation.
	 * @see security_dsl.Claim#uniqueClaimAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClaim__UniqueClaimAttribute__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link security_dsl.RegisteredClaims <em>Registered Claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered Claims</em>'.
	 * @see security_dsl.RegisteredClaims
	 * @generated
	 */
	EClass getRegisteredClaims();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.RegisteredClaims#getExpirationTime <em>Expiration Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Time</em>'.
	 * @see security_dsl.RegisteredClaims#getExpirationTime()
	 * @see #getRegisteredClaims()
	 * @generated
	 */
	EAttribute getRegisteredClaims_ExpirationTime();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.RegisteredClaims#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer</em>'.
	 * @see security_dsl.RegisteredClaims#getIssuer()
	 * @see #getRegisteredClaims()
	 * @generated
	 */
	EAttribute getRegisteredClaims_Issuer();

	/**
	 * Returns the meta object for the attribute '{@link security_dsl.RegisteredClaims#getAudience <em>Audience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audience</em>'.
	 * @see security_dsl.RegisteredClaims#getAudience()
	 * @see #getRegisteredClaims()
	 * @generated
	 */
	EAttribute getRegisteredClaims_Audience();

	/**
	 * Returns the meta object for the '{@link security_dsl.RegisteredClaims#expirationTimeGreaterThanZero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Expiration Time Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Expiration Time Greater Than Zero</em>' operation.
	 * @see security_dsl.RegisteredClaims#expirationTimeGreaterThanZero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRegisteredClaims__ExpirationTimeGreaterThanZero__DiagnosticChain_Map();

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
	 * Returns the meta object for enum '{@link security_dsl.ESecuirtyMechanism <em>ESecuirty Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESecuirty Mechanism</em>'.
	 * @see security_dsl.ESecuirtyMechanism
	 * @generated
	 */
	EEnum getESecuirtyMechanism();

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
	 * Returns the meta object for enum '{@link security_dsl.EEndpointMethod <em>EEndpoint Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEndpoint Method</em>'.
	 * @see security_dsl.EEndpointMethod
	 * @generated
	 */
	EEnum getEEndpointMethod();

	/**
	 * Returns the meta object for enum '{@link security_dsl.EEndpointType <em>EEndpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEndpoint Type</em>'.
	 * @see security_dsl.EEndpointType
	 * @generated
	 */
	EEnum getEEndpointType();

	/**
	 * Returns the meta object for enum '{@link security_dsl.EClaimType <em>EClaim Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EClaim Type</em>'.
	 * @see security_dsl.EClaimType
	 * @generated
	 */
	EEnum getEClaimType();

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
		 * The meta object literal for the '<em><b>App database</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APP_DATABASE = eINSTANCE.getApplication_App_database();

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
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__GROUP = eINSTANCE.getApplication_Group();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__ARTIFACT = eINSTANCE.getApplication_Artifact();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PACKAGE_NAME = eINSTANCE.getApplication_PackageName();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PORT = eINSTANCE.getApplication_Port();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__HOSTNAME = eINSTANCE.getApplication_Hostname();

		/**
		 * The meta object literal for the '<em><b>Controller Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__ControllerPath__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Controller Not Named User Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__ControllerNotNamedUserRole__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has Database For Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___HAS_DATABASE_FOR_MODEL__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__HasDatabaseForModel__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Table Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__UniqueTableName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has User And Role Models For Controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___HAS_USER_AND_ROLE_MODELS_FOR_CONTROLLER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__HasUserAndRoleModelsForController__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Valid Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___VALID_PORT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getApplication__ValidPort__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Model attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MODEL_ATTRIBUTES = eINSTANCE.getModel_Model_attributes();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__TABLE_NAME = eINSTANCE.getModel_TableName();

		/**
		 * The meta object literal for the '<em><b>Role Can Have Id And String Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___ROLE_CAN_HAVE_ID_AND_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getModel__RoleCanHaveIdAndStringAttribute__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Role Cant Have Additional Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___ROLE_CANT_HAVE_ADDITIONAL_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getModel__RoleCantHaveAdditionalAttributes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Collumn Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getModel__UniqueCollumnName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Only One Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getModel__OnlyOneIdentifier__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Attribute Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getModel__UniqueAttributeName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Role Must Have String Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___ROLE_MUST_HAVE_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getModel__RoleMustHaveStringAttribute__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Method Allowed Registration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___METHOD_ALLOWED_REGISTRATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__MethodAllowedRegistration__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Endpoint Limits</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__EndpointLimits__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Method Allowed Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___METHOD_ALLOWED_LOGIN__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__MethodAllowedLogin__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Method Allowed Logout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___METHOD_ALLOWED_LOGOUT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__MethodAllowedLogout__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Login Existance For Logout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__LoginExistanceForLogout__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Authentication Limits</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getController__AuthenticationLimits__DiagnosticChain_Map();

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
		 * The meta object literal for the '{@link security_dsl.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.SecurityImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

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
		 * The meta object literal for the '<em><b>Is Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_IDENTIFIER = eINSTANCE.getAttribute_IsIdentifier();

		/**
		 * The meta object literal for the '<em><b>Collumn Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__COLLUMN_NAME = eINSTANCE.getAttribute_CollumnName();

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
		 * The meta object literal for the '<em><b>Role instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ROLE_INSTANCES = eINSTANCE.getRole_Role_instances();

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
		 * The meta object literal for the '{@link security_dsl.impl.RoleInstanceImpl <em>Role Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.RoleInstanceImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getRoleInstance()
		 * @generated
		 */
		EClass ROLE_INSTANCE = eINSTANCE.getRoleInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_INSTANCE__NAME = eINSTANCE.getRoleInstance_Name();

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
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__FUNCTION_NAME = eINSTANCE.getEndpoint_FunctionName();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__METHOD = eINSTANCE.getEndpoint_Method();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__TYPE = eINSTANCE.getEndpoint_Type();

		/**
		 * The meta object literal for the '<em><b>Role authorities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__ROLE_AUTHORITIES = eINSTANCE.getEndpoint_Role_authorities();

		/**
		 * The meta object literal for the '<em><b>Unique Role Authorities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENDPOINT___UNIQUE_ROLE_AUTHORITIES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEndpoint__UniqueRoleAuthorities__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.JWTImpl <em>JWT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.JWTImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getJWT()
		 * @generated
		 */
		EClass JWT = eINSTANCE.getJWT();

		/**
		 * The meta object literal for the '<em><b>Signature Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT__SIGNATURE_ALGORITHM = eINSTANCE.getJWT_SignatureAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT__SECRET = eINSTANCE.getJWT_Secret();

		/**
		 * The meta object literal for the '<em><b>Jwt claims</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JWT__JWT_CLAIMS = eINSTANCE.getJWT_Jwt_claims();

		/**
		 * The meta object literal for the '<em><b>Registeredclaims</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JWT__REGISTEREDCLAIMS = eINSTANCE.getJWT_Registeredclaims();

		/**
		 * The meta object literal for the '<em><b>Unique Claims</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT___UNIQUE_CLAIMS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getJWT__UniqueClaims__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Registered Claim Subject</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT___REGISTERED_CLAIM_SUBJECT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getJWT__RegisteredClaimSubject__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Single Registered Claim</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JWT___SINGLE_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getJWT__SingleRegisteredClaim__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__TYPE = eINSTANCE.getClaim_Type();

		/**
		 * The meta object literal for the '<em><b>Claim attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__CLAIM_ATTRIBUTE = eINSTANCE.getClaim_Claim_attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__NAME = eINSTANCE.getClaim_Name();

		/**
		 * The meta object literal for the '<em><b>Unique Claim Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLAIM___UNIQUE_CLAIM_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getClaim__UniqueClaimAttribute__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link security_dsl.impl.RegisteredClaimsImpl <em>Registered Claims</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.impl.RegisteredClaimsImpl
		 * @see security_dsl.impl.Security_dslPackageImpl#getRegisteredClaims()
		 * @generated
		 */
		EClass REGISTERED_CLAIMS = eINSTANCE.getRegisteredClaims();

		/**
		 * The meta object literal for the '<em><b>Expiration Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_CLAIMS__EXPIRATION_TIME = eINSTANCE.getRegisteredClaims_ExpirationTime();

		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_CLAIMS__ISSUER = eINSTANCE.getRegisteredClaims_Issuer();

		/**
		 * The meta object literal for the '<em><b>Audience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_CLAIMS__AUDIENCE = eINSTANCE.getRegisteredClaims_Audience();

		/**
		 * The meta object literal for the '<em><b>Expiration Time Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGISTERED_CLAIMS___EXPIRATION_TIME_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRegisteredClaims__ExpirationTimeGreaterThanZero__DiagnosticChain_Map();

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
		 * The meta object literal for the '{@link security_dsl.ESecuirtyMechanism <em>ESecuirty Mechanism</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.ESecuirtyMechanism
		 * @see security_dsl.impl.Security_dslPackageImpl#getESecuirtyMechanism()
		 * @generated
		 */
		EEnum ESECUIRTY_MECHANISM = eINSTANCE.getESecuirtyMechanism();

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
		 * The meta object literal for the '{@link security_dsl.EEndpointMethod <em>EEndpoint Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.EEndpointMethod
		 * @see security_dsl.impl.Security_dslPackageImpl#getEEndpointMethod()
		 * @generated
		 */
		EEnum EENDPOINT_METHOD = eINSTANCE.getEEndpointMethod();

		/**
		 * The meta object literal for the '{@link security_dsl.EEndpointType <em>EEndpoint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.EEndpointType
		 * @see security_dsl.impl.Security_dslPackageImpl#getEEndpointType()
		 * @generated
		 */
		EEnum EENDPOINT_TYPE = eINSTANCE.getEEndpointType();

		/**
		 * The meta object literal for the '{@link security_dsl.EClaimType <em>EClaim Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security_dsl.EClaimType
		 * @see security_dsl.impl.Security_dslPackageImpl#getEClaimType()
		 * @generated
		 */
		EEnum ECLAIM_TYPE = eINSTANCE.getEClaimType();

	}

} //Security_dslPackage
