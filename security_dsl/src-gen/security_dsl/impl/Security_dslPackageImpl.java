/**
 */
package security_dsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import security_dsl.Application;
import security_dsl.Attribute;
import security_dsl.Authentication;
import security_dsl.Claim;
import security_dsl.Controller;
import security_dsl.Database;
import security_dsl.EDatabaseType;
import security_dsl.EEndpointMethod;
import security_dsl.ESecurityMechanism;
import security_dsl.EType;
import security_dsl.Endpoint;
import security_dsl.JwtSecurity;
import security_dsl.Model;
import security_dsl.OtherController;
import security_dsl.OtherModel;
import security_dsl.Private;
import security_dsl.Public;
import security_dsl.Role;
import security_dsl.Security;
import security_dsl.Security_dslFactory;
import security_dsl.Security_dslPackage;
import security_dsl.User;

import security_dsl.util.Security_dslValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Security_dslPackageImpl extends EPackageImpl implements Security_dslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jwtSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eDatabaseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEndpointMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eSecurityMechanismEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see security_dsl.Security_dslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Security_dslPackageImpl() {
		super(eNS_URI, Security_dslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Security_dslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Security_dslPackage init() {
		if (isInited)
			return (Security_dslPackage) EPackage.Registry.INSTANCE.getEPackage(Security_dslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSecurity_dslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Security_dslPackageImpl theSecurity_dslPackage = registeredSecurity_dslPackage instanceof Security_dslPackageImpl
				? (Security_dslPackageImpl) registeredSecurity_dslPackage
				: new Security_dslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSecurity_dslPackage.createPackageContents();

		// Initialize created meta-data
		theSecurity_dslPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theSecurity_dslPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return Security_dslValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theSecurity_dslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Security_dslPackage.eNS_URI, theSecurity_dslPackage);
		return theSecurity_dslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Name() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Description() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_App_models() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_App_controllers() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_App_security() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_App_database() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__ControllerNotNamedUserRole__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__ModelNotNamedUserRole__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__ControllerModelNameUnique__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__ControllerPath__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__UniqueModelName__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__UniqueControllerPath__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__UniqueControllerName__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_IdentifierName() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_IdentifierType() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Model_attributes() {
		return (EReference) modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__UniqueAttributeName__DiagnosticChain_Map() {
		return modelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Name() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Path() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Controller_endpoints() {
		return (EReference) controllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__UrlStartsWithForwardSlash__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__UniqueEndpoints__DiagnosticChain_Map() {
		return controllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_VendorName() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Url() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Username() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Password() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurity_Mechanism() {
		return (EAttribute) securityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJwtSecurity() {
		return jwtSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJwtSecurity_SignatureAlgorithm() {
		return (EAttribute) jwtSecurityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJwtSecurity_Issuer() {
		return (EAttribute) jwtSecurityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJwtSecurity_ExpirationTime() {
		return (EAttribute) jwtSecurityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJwtSecurity_Audience() {
		return (EAttribute) jwtSecurityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJwtSecurity_Secret() {
		return (EAttribute) jwtSecurityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJwtSecurity_Security_claims() {
		return (EReference) jwtSecurityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJwtSecurity__UniqueClaims__DiagnosticChain_Map() {
		return jwtSecurityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJwtSecurity__ExpirationTimeGreaterThanZero__DiagnosticChain_Map() {
		return jwtSecurityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherModel() {
		return otherModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherModel_Name() {
		return (EAttribute) otherModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthentication_Signup_endpoint() {
		return (EReference) authenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthentication_Login_endpoint() {
		return (EReference) authenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthentication_Logout_endpoint() {
		return (EReference) authenticationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthentication__MethodsAllowedSignUp__DiagnosticChain_Map() {
		return authenticationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthentication__MethodsAllowedLogin__DiagnosticChain_Map() {
		return authenticationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthentication__UrlStartsWithForwardSlash__DiagnosticChain_Map() {
		return authenticationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthentication__MethodsAllowedLogout__DiagnosticChain_Map() {
		return authenticationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherController() {
		return otherControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpoint() {
		return endpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Url() {
		return (EAttribute) endpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Function_name() {
		return (EAttribute) endpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Method() {
		return (EAttribute) endpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_Roles_authority() {
		return (EReference) endpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaim() {
		return claimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaim_Name() {
		return (EAttribute) claimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublic() {
		return publicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivate() {
		return privateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEDatabaseType() {
		return eDatabaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEndpointMethod() {
		return eEndpointMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEType() {
		return eTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getESecurityMechanism() {
		return eSecurityMechanismEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security_dslFactory getSecurity_dslFactory() {
		return (Security_dslFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEAttribute(applicationEClass, APPLICATION__DESCRIPTION);
		createEReference(applicationEClass, APPLICATION__APP_MODELS);
		createEReference(applicationEClass, APPLICATION__APP_CONTROLLERS);
		createEReference(applicationEClass, APPLICATION__APP_SECURITY);
		createEReference(applicationEClass, APPLICATION__APP_DATABASE);
		createEOperation(applicationEClass, APPLICATION___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___MODEL_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___CONTROLLER_MODEL_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___UNIQUE_MODEL_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__IDENTIFIER_NAME);
		createEAttribute(modelEClass, MODEL__IDENTIFIER_TYPE);
		createEReference(modelEClass, MODEL__MODEL_ATTRIBUTES);
		createEOperation(modelEClass, MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__NAME);
		createEAttribute(controllerEClass, CONTROLLER__PATH);
		createEReference(controllerEClass, CONTROLLER__CONTROLLER_ENDPOINTS);
		createEOperation(controllerEClass, CONTROLLER___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerEClass, CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP);

		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__VENDOR_NAME);
		createEAttribute(databaseEClass, DATABASE__URL);
		createEAttribute(databaseEClass, DATABASE__USERNAME);
		createEAttribute(databaseEClass, DATABASE__PASSWORD);

		securityEClass = createEClass(SECURITY);
		createEAttribute(securityEClass, SECURITY__MECHANISM);

		jwtSecurityEClass = createEClass(JWT_SECURITY);
		createEAttribute(jwtSecurityEClass, JWT_SECURITY__SIGNATURE_ALGORITHM);
		createEAttribute(jwtSecurityEClass, JWT_SECURITY__ISSUER);
		createEAttribute(jwtSecurityEClass, JWT_SECURITY__EXPIRATION_TIME);
		createEAttribute(jwtSecurityEClass, JWT_SECURITY__AUDIENCE);
		createEAttribute(jwtSecurityEClass, JWT_SECURITY__SECRET);
		createEReference(jwtSecurityEClass, JWT_SECURITY__SECURITY_CLAIMS);
		createEOperation(jwtSecurityEClass, JWT_SECURITY___UNIQUE_CLAIMS__DIAGNOSTICCHAIN_MAP);
		createEOperation(jwtSecurityEClass, JWT_SECURITY___EXPIRATION_TIME_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		userEClass = createEClass(USER);

		otherModelEClass = createEClass(OTHER_MODEL);
		createEAttribute(otherModelEClass, OTHER_MODEL__NAME);

		authenticationEClass = createEClass(AUTHENTICATION);
		createEReference(authenticationEClass, AUTHENTICATION__SIGNUP_ENDPOINT);
		createEReference(authenticationEClass, AUTHENTICATION__LOGIN_ENDPOINT);
		createEReference(authenticationEClass, AUTHENTICATION__LOGOUT_ENDPOINT);
		createEOperation(authenticationEClass, AUTHENTICATION___METHODS_ALLOWED_SIGN_UP__DIAGNOSTICCHAIN_MAP);
		createEOperation(authenticationEClass, AUTHENTICATION___METHODS_ALLOWED_LOGIN__DIAGNOSTICCHAIN_MAP);
		createEOperation(authenticationEClass, AUTHENTICATION___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP);
		createEOperation(authenticationEClass, AUTHENTICATION___METHODS_ALLOWED_LOGOUT__DIAGNOSTICCHAIN_MAP);

		otherControllerEClass = createEClass(OTHER_CONTROLLER);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

		endpointEClass = createEClass(ENDPOINT);
		createEAttribute(endpointEClass, ENDPOINT__URL);
		createEAttribute(endpointEClass, ENDPOINT__FUNCTION_NAME);
		createEAttribute(endpointEClass, ENDPOINT__METHOD);
		createEReference(endpointEClass, ENDPOINT__ROLES_AUTHORITY);

		roleEClass = createEClass(ROLE);

		claimEClass = createEClass(CLAIM);
		createEAttribute(claimEClass, CLAIM__NAME);

		publicEClass = createEClass(PUBLIC);

		privateEClass = createEClass(PRIVATE);

		// Create enums
		eDatabaseTypeEEnum = createEEnum(EDATABASE_TYPE);
		eEndpointMethodEEnum = createEEnum(EENDPOINT_METHOD);
		eTypeEEnum = createEEnum(ETYPE);
		eSecurityMechanismEEnum = createEEnum(ESECURITY_MECHANISM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jwtSecurityEClass.getESuperTypes().add(this.getSecurity());
		userEClass.getESuperTypes().add(this.getModel());
		otherModelEClass.getESuperTypes().add(this.getModel());
		authenticationEClass.getESuperTypes().add(this.getController());
		otherControllerEClass.getESuperTypes().add(this.getController());
		roleEClass.getESuperTypes().add(this.getModel());
		publicEClass.getESuperTypes().add(this.getClaim());
		privateEClass.getESuperTypes().add(this.getClaim());

		// Initialize classes, features, and operations; add parameters
		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 1, 1, Application.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_App_models(), this.getModel(), null, "app_models", null, 0, -1, Application.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_App_controllers(), this.getController(), null, "app_controllers", null, 0, -1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_App_security(), this.getSecurity(), null, "app_security", null, 0, 1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_App_database(), this.getDatabase(), null, "app_database", null, 0, 1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getApplication__ControllerNotNamedUserRole__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "controllerNotNamedUserRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__ModelNotNamedUserRole__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"modelNotNamedUserRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__ControllerModelNameUnique__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "controllerModelNameUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__ControllerPath__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"controllerPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__UniqueModelName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueModelName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__UniqueControllerPath__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueControllerPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__UniqueControllerName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueControllerName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_IdentifierName(), ecorePackage.getEString(), "identifierName", null, 1, 1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_IdentifierType(), this.getEType(), "identifierType", null, 1, 1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Model_attributes(), this.getAttribute(), null, "model_attributes", null, 0, -1,
				Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getModel__UniqueAttributeName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueAttributeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_Name(), ecorePackage.getEString(), "name", null, 1, 1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getController_Path(), ecorePackage.getEString(), "path", null, 1, 1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Controller_endpoints(), this.getEndpoint(), null, "controller_endpoints", null, 0,
				-1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getController__UrlStartsWithForwardSlash__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"urlStartsWithForwardSlash", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getController__UniqueEndpoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueEndpoints", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_VendorName(), this.getEDatabaseType(), "vendorName", null, 1, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Url(), ecorePackage.getEString(), "url", null, 1, 1, Database.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Username(), ecorePackage.getEString(), "username", null, 1, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Password(), ecorePackage.getEString(), "password", null, 1, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityEClass, Security.class, "Security", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurity_Mechanism(), this.getESecurityMechanism(), "mechanism", null, 1, 1, Security.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jwtSecurityEClass, JwtSecurity.class, "JwtSecurity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJwtSecurity_SignatureAlgorithm(), ecorePackage.getEString(), "signatureAlgorithm", null, 1, 1,
				JwtSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJwtSecurity_Issuer(), ecorePackage.getEString(), "issuer", null, 1, 1, JwtSecurity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJwtSecurity_ExpirationTime(), ecorePackage.getEInt(), "expirationTime", null, 1, 1,
				JwtSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJwtSecurity_Audience(), ecorePackage.getEString(), "audience", null, 1, 1, JwtSecurity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJwtSecurity_Secret(), ecorePackage.getEString(), "secret", null, 1, 1, JwtSecurity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJwtSecurity_Security_claims(), this.getClaim(), null, "security_claims", null, 0, -1,
				JwtSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJwtSecurity__UniqueClaims__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueClaims", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJwtSecurity__ExpirationTimeGreaterThanZero__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "expirationTimeGreaterThanZero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherModelEClass, OtherModel.class, "OtherModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOtherModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, OtherModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthentication_Signup_endpoint(), this.getEndpoint(), null, "signup_endpoint", null, 0, 1,
				Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthentication_Login_endpoint(), this.getEndpoint(), null, "login_endpoint", null, 0, 1,
				Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthentication_Logout_endpoint(), this.getEndpoint(), null, "logout_endpoint", null, 0, 1,
				Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAuthentication__MethodsAllowedSignUp__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"methodsAllowedSignUp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAuthentication__MethodsAllowedLogin__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"methodsAllowedLogin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAuthentication__UrlStartsWithForwardSlash__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "urlStartsWithForwardSlash", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAuthentication__MethodsAllowedLogout__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"methodsAllowedLogout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(otherControllerEClass, OtherController.class, "OtherController", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), this.getEType(), "type", null, 1, 1, Attribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointEClass, Endpoint.class, "Endpoint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpoint_Url(), ecorePackage.getEString(), "url", null, 1, 1, Endpoint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_Function_name(), ecorePackage.getEString(), "function_name", null, 1, 1,
				Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_Method(), this.getEEndpointMethod(), "method", null, 1, 1, Endpoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpoint_Roles_authority(), this.getRole(), null, "roles_authority", null, 0, -1,
				Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(claimEClass, Claim.class, "Claim", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClaim_Name(), ecorePackage.getEString(), "name", null, 1, 1, Claim.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicEClass, Public.class, "Public", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(privateEClass, Private.class, "Private", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(eDatabaseTypeEEnum, EDatabaseType.class, "EDatabaseType");
		addEEnumLiteral(eDatabaseTypeEEnum, EDatabaseType.POSTGRES);
		addEEnumLiteral(eDatabaseTypeEEnum, EDatabaseType.ORACLE);
		addEEnumLiteral(eDatabaseTypeEEnum, EDatabaseType.MYSQL);

		initEEnum(eEndpointMethodEEnum, EEndpointMethod.class, "EEndpointMethod");
		addEEnumLiteral(eEndpointMethodEEnum, EEndpointMethod.GET);
		addEEnumLiteral(eEndpointMethodEEnum, EEndpointMethod.PUT);
		addEEnumLiteral(eEndpointMethodEEnum, EEndpointMethod.POST);
		addEEnumLiteral(eEndpointMethodEEnum, EEndpointMethod.DELETE);

		initEEnum(eTypeEEnum, EType.class, "EType");
		addEEnumLiteral(eTypeEEnum, EType.INT);
		addEEnumLiteral(eTypeEEnum, EType.STRING);
		addEEnumLiteral(eTypeEEnum, EType.FLOAT);
		addEEnumLiteral(eTypeEEnum, EType.LONG);
		addEEnumLiteral(eTypeEEnum, EType.CHAR);
		addEEnumLiteral(eTypeEEnum, EType.BOOLEAN);
		addEEnumLiteral(eTypeEEnum, EType.DOUBLE);
		addEEnumLiteral(eTypeEEnum, EType.BYTE);
		addEEnumLiteral(eTypeEEnum, EType.SHORT);

		initEEnum(eSecurityMechanismEEnum, ESecurityMechanism.class, "ESecurityMechanism");
		addEEnumLiteral(eSecurityMechanismEEnum, ESecurityMechanism.JWT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(applicationEClass, source, new String[] { "constraints", "uniqueControllerName" });
		addAnnotation(modelEClass, source, new String[] { "constraints", "uniqueAttributeName" });
		addAnnotation(controllerEClass, source, new String[] { "constraints", "uniqueEndpoints" });
		addAnnotation(jwtSecurityEClass, source, new String[] { "constraints", "expirationTimeGreaterThanZero" });
		addAnnotation(authenticationEClass, source, new String[] { "constraints", "methodsAllowedLogout" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getApplication__ControllerNotNamedUserRole__DiagnosticChain_Map(), source, new String[] { "body",
				"not self.app_controllers -> exists(c | c.name.toLower() = \'user\' or c.name.toLower() = \'role\')" });
		addAnnotation(getApplication__ModelNotNamedUserRole__DiagnosticChain_Map(), source, new String[] { "body",
				"not self.app_models -> select(m | m.oclIsTypeOf(OtherModel) and not m.oclAsType(OtherModel).oclIsKindOf(Role)) ->\n    \t\t\texists(m | m.oclAsType(OtherModel).name.toLower() = \'user\' or m.oclAsType(OtherModel).name.toLower() = \'role\')" });
		addAnnotation(getApplication__ControllerModelNameUnique__DiagnosticChain_Map(), source, new String[] { "body",
				"self.app_controllers -> forAll(c | not self.app_models -> exists(m |  m.oclIsTypeOf(OtherModel) and \n\t\t        m.oclAsType(OtherModel).name.toLower() = c.name.toLower()))" });
		addAnnotation(getApplication__ControllerPath__DiagnosticChain_Map(), source,
				new String[] { "body", "self.app_controllers -> forAll(c | c.path.at(1) = \'/\')" });
		addAnnotation(getApplication__UniqueModelName__DiagnosticChain_Map(), source, new String[] { "body",
				"self.app_models -> select(m | m.oclIsTypeOf(OtherModel)) -> isUnique(m | m.oclAsType(OtherModel).name)" });
		addAnnotation(getApplication__UniqueControllerPath__DiagnosticChain_Map(), source, new String[] { "body",
				" self.app_controllers -> isUnique(c | c.path) and self.app_controllers -> forAll(c | c.name.toLower() <> c.path.toLower())" });
		addAnnotation(getApplication__UniqueControllerName__DiagnosticChain_Map(), source,
				new String[] { "body", "self.app_controllers -> isUnique(c | c.name)" });
		addAnnotation(getModel__UniqueAttributeName__DiagnosticChain_Map(), source, new String[] { "body",
				"self.model_attributes -> isUnique(a | a.name) and not self.model_attributes -> exists(a | a.name = self.identifierName)" });
		addAnnotation(getController__UrlStartsWithForwardSlash__DiagnosticChain_Map(), source,
				new String[] { "body", "self.controller_endpoints -> forAll(e | e.url.at(1) = \'/\')" });
		addAnnotation(getController__UniqueEndpoints__DiagnosticChain_Map(), source, new String[] { "body",
				"self.controller_endpoints -> isUnique(e | e.function_name) and self.controller_endpoints -> isUnique(e | e.url)" });
		addAnnotation(getJwtSecurity__UniqueClaims__DiagnosticChain_Map(), source,
				new String[] { "body", "self.security_claims -> isUnique(c | c.name)" });
		addAnnotation(getJwtSecurity__ExpirationTimeGreaterThanZero__DiagnosticChain_Map(), source,
				new String[] { "body", "self.expirationTime > 0" });
		addAnnotation(getAuthentication__MethodsAllowedSignUp__DiagnosticChain_Map(), source, new String[] { "body",
				"self.signup_endpoint = null or self.signup_endpoint.method = EEndpointMethod::POST" });
		addAnnotation(getAuthentication__MethodsAllowedLogin__DiagnosticChain_Map(), source, new String[] { "body",
				"self.login_endpoint = null or ( self.login_endpoint.method = EEndpointMethod::POST or self.login_endpoint.method = EEndpointMethod::GET)" });
		addAnnotation(getAuthentication__UrlStartsWithForwardSlash__DiagnosticChain_Map(), source, new String[] {
				"body",
				"self.signup_endpoint -> forAll(e | e.url.at(1) = \'/\') and self.login_endpoint -> forAll(e | e.url.at(1) = \'/\') and\n\t\t\tself.logout_endpoint -> forAll(e | e.url.at(1) = \'/\')" });
		addAnnotation(getAuthentication__MethodsAllowedLogout__DiagnosticChain_Map(), source, new String[] { "body",
				"self.logout_endpoint = null or (self.logout_endpoint.method = EEndpointMethod::POST or self.logout_endpoint.method = EEndpointMethod::GET)" });
	}

} //Security_dslPackageImpl
