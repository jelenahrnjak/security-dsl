/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /security_dsl/model/security_dsl.ecore
 * using:
 *   /security_dsl/model/security_dsl.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package security_dsl;

import java.lang.String;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import security_dsl.Security_dslPackage;
// import security_dsl.Security_dslTables;

/**
 * Security_dslTables provides the dispatch tables for the security_dsl for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Security_dslTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Security_dslPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_security_dsl = IdManager.getNsURIPackageId("http://www.example.org/security_dsl", null, Security_dslPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Application = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Application", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Attribute = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Attribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Authentication = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Authentication", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BasicAuthentication = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("BasicAuthentication", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Claim = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Claim", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Security_dslTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Controller = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Controller", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Database = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Database", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Endpoint = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Endpoint", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entity = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_JWT = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("JWT", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OAuth2 = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("OAuth2", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Provider = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Provider", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RegisteredClaim = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("RegisteredClaim", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Role = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Role", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RoleInstance = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("RoleInstance", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Security = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Security", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_User = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("User", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Security_dslTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_ELongObject = Security_dslTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("ELongObject", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EClaimType = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getEnumerationId("EClaimType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EDatabaseType = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getEnumerationId("EDatabaseType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EEndpointMethod = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getEnumerationId("EEndpointMethod");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EEndpointType = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getEnumerationId("EEndpointType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EOAuthProvider = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getEnumerationId("EOAuthProvider");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EType = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getEnumerationId("EType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_1024 = ValueUtil.integerValueOf("1024");
	public static final /*@NonInvalid*/ IntegerValue INT_2 = ValueUtil.integerValueOf("2");
	public static final /*@NonInvalid*/ IntegerValue INT_49151 = ValueUtil.integerValueOf("49151");
	public static final /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ String STR_An_32_application_32_must_32_have_32_a_32_database_32_defined_32_if_32_it_32_has_32_entities_33 = "An application must have a database defined if it has entities!";
	public static final /*@NonInvalid*/ String STR_Attribute_32_names_32_within_32_an_32_entity_32_must_32_be_32_unique_33 = "Attribute names within an entity must be unique!";
	public static final /*@NonInvalid*/ String STR_Authentication_32_can_32_have_32_at_32_most_32_one_32_registration_44_32_login_44_32_and_32_log = "Authentication can have at most one registration, login, and logout endpoint!";
	public static final /*@NonInvalid*/ String STR_Authentication_32_controller_32_requires_32_at_32_least_32_one_32_User_32_entity_32_and_32 = "Authentication controller requires at least one User entity and one Role entity!";
	public static final /*@NonInvalid*/ String STR_Basic_32_authentication_32_cannot_32_have_32_role_32_attributes_33 = "Basic authentication cannot have role attributes!";
	public static final /*@NonInvalid*/ String STR_Claim_32_attributes_32_must_32_be_32_unique_33 = "Claim attributes must be unique!";
	public static final /*@NonInvalid*/ String STR_Column_32_names_32_must_32_be_32_unique_32_if_32_defined_33 = "Column names must be unique if defined!";
	public static final /*@NonInvalid*/ String STR_Controller_32_names_32_cannot_32_be_32_34_User_34_32_or_32_34_Role_34_33 = "Controller names cannot be \"User\" or \"Role\"!";
	public static final /*@NonInvalid*/ String STR_Controller_32_path_32_should_32_start_32_with_32_39_s_39_33 = "Controller path should start with \'/\'!";
	public static final /*@NonInvalid*/ String STR_Controller_32_paths_32_should_32_be_32_unique_32_and_32_different_32_from_32_names_33 = "Controller paths should be unique and different from names!";
	public static final /*@NonInvalid*/ String STR_Controllers_32_of_32_type_32_other_32_than_32_34_Authentication_34_32_should_32_not_32_have_32 = "Controllers of type other than \"Authentication\" should not have registration, login, or logout endpoints!";
	public static final /*@NonInvalid*/ String STR_Controllers_32_should_32_have_32_unique_32_names_33 = "Controllers should have unique names!";
	public static final /*@NonInvalid*/ String STR_Endpoint_32_URL_32_should_32_start_32_with_32_a_32_forward_32_slash_33 = "Endpoint URL should start with a forward slash!";
	public static final /*@NonInvalid*/ String STR_Endpoints_32_of_32_type_32_34_OTHER_34_32_must_32_have_32_a_32_defined_32_method_33 = "Endpoints of type \"OTHER\" must have a defined method!";
	public static final /*@NonInvalid*/ String STR_Endpoints_32_within_32_a_32_controller_32_must_32_have_32_unique_32_URLs_33 = "Endpoints within a controller must have unique URLs!";
	public static final /*@NonInvalid*/ String STR_Endpoints_32_within_32_a_32_controller_32_must_32_have_32_unique_32_method_32_names_33 = "Endpoints within a controller must have unique method names!";
	public static final /*@NonInvalid*/ String STR_Entities_32_other_32_than_32_User_32_cannot_32_have_32_a_32_credential_32_attribute_33 = "Entities other than User cannot have a credential attribute!";
	public static final /*@NonInvalid*/ String STR_Entity_32_must_32_have_32_exactly_32_one_32_identifier_32_attribute_33 = "Entity must have exactly one identifier attribute!";
	public static final /*@NonInvalid*/ String STR_Expiration_32_time_32_must_32_be_32_greater_32_than_32_zero_33 = "Expiration time must be greater than zero!";
	public static final /*@NonInvalid*/ String STR_Logout_32_endpoint_32_requires_32_a_32_corresponding_32_login_32_endpoint_33 = "Logout endpoint requires a corresponding login endpoint!";
	public static final /*@NonInvalid*/ String STR_OAuth2_32_authentication_32_requires_32_no_32_Role_32_entities_33 = "OAuth2 authentication requires no Role entities!";
	public static final /*@NonInvalid*/ String STR_Port_32_must_32_be_32_in_32_the_32_valid_32_range_32_of_32_1024_32_to_32_49151_33 = "Port must be in the valid range of 1024 to 49151!";
	public static final /*@NonInvalid*/ String STR_Providers_32_must_32_have_32_unique_32_names_33 = "Providers must have unique names!";
	public static final /*@NonInvalid*/ String STR_Role_32_authorities_32_must_32_be_32_unique_32_for_32_each_32_endpoint_33 = "Role authorities must be unique for each endpoint!";
	public static final /*@NonInvalid*/ String STR_Role_32_entities_32_can_32_have_32_at_32_most_32_two_32_attributes_33 = "Role entities can have at most two attributes!";
	public static final /*@NonInvalid*/ String STR_Role_32_entities_32_must_32_have_32_either_32_one_32_identifier_32_attribute_32_of_32_type_32 = "Role entities must have either one identifier attribute of type String or both identifier and non-identifier attributes of type String!";
	public static final /*@NonInvalid*/ String STR_Role_32_instance_32_names_32_must_32_be_32_unique_33 = "Role instance names must be unique!";
	public static final /*@NonInvalid*/ String STR_Table_32_names_32_must_32_be_32_unique_33 = "Table names must be unique!";
	public static final /*@NonInvalid*/ String STR_There_32_can_32_be_32_at_32_most_32_one_32_controller_32_of_32_type_32_34_Authentication_34_32_in_32 = "There can be at most one controller of type \"Authentication\" in the model!";
	public static final /*@NonInvalid*/ String STR_There_32_can_32_be_32_at_32_most_32_one_32_entity_32_of_32_type_32_34_Role_34_32_in_32_the_32_model_33 = "There can be at most one entity of type \"Role\" in the model!";
	public static final /*@NonInvalid*/ String STR_There_32_can_32_be_32_at_32_most_32_one_32_entity_32_of_32_type_32_34_User_34_32_in_32_the_32_model_33 = "There can be at most one entity of type \"User\" in the model!";
	public static final /*@NonInvalid*/ String STR_User_32_entity_32_cannot_32_have_32_an_32_attribute_32_named_32_34_password_34_33 = "User entity cannot have an attribute named \"password\"!";
	public static final /*@NonInvalid*/ String STR_User_32_entity_32_must_32_have_32_exactly_32_one_32_attribute_32_of_32_type_32_String_32_marke = "User entity must have exactly one attribute of type String marked as a credential!";
	public static final /*@NonInvalid*/ String STR_password = "password";
	public static final /*@NonInvalid*/ String STR_quot = "/";
	public static final /*@NonInvalid*/ String STR_role = "role";
	public static final /*@NonInvalid*/ String STR_subject = "subject";
	public static final /*@NonInvalid*/ String STR_user = "user";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Claim = TypeId.BAG.getSpecializedId(Security_dslTables.CLSSid_Claim);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Endpoint = TypeId.BAG.getSpecializedId(Security_dslTables.CLSSid_Endpoint);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_LOGIN = Security_dslTables.ENUMid_EEndpointType.getEnumerationLiteralId("LOGIN");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_LOGOUT = Security_dslTables.ENUMid_EEndpointType.getEnumerationLiteralId("LOGOUT");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_OTHER = Security_dslTables.ENUMid_EEndpointType.getEnumerationLiteralId("OTHER");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_REGISTERED = Security_dslTables.ENUMid_EClaimType.getEnumerationLiteralId("REGISTERED");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_REGISTRATION = Security_dslTables.ENUMid_EEndpointType.getEnumerationLiteralId("REGISTRATION");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_String = Security_dslTables.ENUMid_EType.getEnumerationLiteralId("String");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Attribute = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_Attribute);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Claim = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_Claim);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Controller = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_Controller);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Endpoint = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_Endpoint);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Entity = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_Entity);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Provider = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_Provider);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_RoleInstance = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_RoleInstance);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Claim = TypeId.SET.getSpecializedId(Security_dslTables.CLSSid_Claim);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Controller = TypeId.SET.getSpecializedId(Security_dslTables.CLSSid_Controller);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Database = TypeId.SET.getSpecializedId(Security_dslTables.CLSSid_Database);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Entity = TypeId.SET.getSpecializedId(Security_dslTables.CLSSid_Entity);
	public static final /*@NonInvalid*/ TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", Security_dslTables.PARTid_, Security_dslTables.PARTid__0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Security_dslTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Security_dslTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Application = new EcoreExecutorType(Security_dslPackage.Literals.APPLICATION, PACKAGE, 0);
		public static final EcoreExecutorType _Attribute = new EcoreExecutorType(Security_dslPackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _Authentication = new EcoreExecutorType(Security_dslPackage.Literals.AUTHENTICATION, PACKAGE, 0);
		public static final EcoreExecutorType _BasicAuthentication = new EcoreExecutorType(Security_dslPackage.Literals.BASIC_AUTHENTICATION, PACKAGE, 0);
		public static final EcoreExecutorType _Claim = new EcoreExecutorType(Security_dslPackage.Literals.CLAIM, PACKAGE, 0);
		public static final EcoreExecutorType _Controller = new EcoreExecutorType(Security_dslPackage.Literals.CONTROLLER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Database = new EcoreExecutorType(Security_dslPackage.Literals.DATABASE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EClaimType = new EcoreExecutorEnumeration(Security_dslPackage.Literals.ECLAIM_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EDatabaseType = new EcoreExecutorEnumeration(Security_dslPackage.Literals.EDATABASE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EEndpointMethod = new EcoreExecutorEnumeration(Security_dslPackage.Literals.EENDPOINT_METHOD, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EEndpointType = new EcoreExecutorEnumeration(Security_dslPackage.Literals.EENDPOINT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EOAuthProvider = new EcoreExecutorEnumeration(Security_dslPackage.Literals.EO_AUTH_PROVIDER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EType = new EcoreExecutorEnumeration(Security_dslPackage.Literals.ETYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Endpoint = new EcoreExecutorType(Security_dslPackage.Literals.ENDPOINT, PACKAGE, 0);
		public static final EcoreExecutorType _Entity = new EcoreExecutorType(Security_dslPackage.Literals.ENTITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _JWT = new EcoreExecutorType(Security_dslPackage.Literals.JWT, PACKAGE, 0);
		public static final EcoreExecutorType _OAuth2 = new EcoreExecutorType(Security_dslPackage.Literals.OAUTH2, PACKAGE, 0);
		public static final EcoreExecutorType _Provider = new EcoreExecutorType(Security_dslPackage.Literals.PROVIDER, PACKAGE, 0);
		public static final EcoreExecutorType _RegisteredClaim = new EcoreExecutorType(Security_dslPackage.Literals.REGISTERED_CLAIM, PACKAGE, 0);
		public static final EcoreExecutorType _Role = new EcoreExecutorType(Security_dslPackage.Literals.ROLE, PACKAGE, 0);
		public static final EcoreExecutorType _RoleInstance = new EcoreExecutorType(Security_dslPackage.Literals.ROLE_INSTANCE, PACKAGE, 0);
		public static final EcoreExecutorType _Security = new EcoreExecutorType(Security_dslPackage.Literals.SECURITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _User = new EcoreExecutorType(Security_dslPackage.Literals.USER, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Application,
			_Attribute,
			_Authentication,
			_BasicAuthentication,
			_Claim,
			_Controller,
			_Database,
			_EClaimType,
			_EDatabaseType,
			_EEndpointMethod,
			_EEndpointType,
			_EOAuthProvider,
			_EType,
			_Endpoint,
			_Entity,
			_JWT,
			_OAuth2,
			_Provider,
			_RegisteredClaim,
			_Role,
			_RoleInstance,
			_Security,
			_User
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Security_dslTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Application__Application = new ExecutorFragment(Types._Application, Security_dslTables.Types._Application);
		private static final ExecutorFragment _Application__OclAny = new ExecutorFragment(Types._Application, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Application__OclElement = new ExecutorFragment(Types._Application, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, Security_dslTables.Types._Attribute);
		private static final ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Authentication__Authentication = new ExecutorFragment(Types._Authentication, Security_dslTables.Types._Authentication);
		private static final ExecutorFragment _Authentication__Controller = new ExecutorFragment(Types._Authentication, Security_dslTables.Types._Controller);
		private static final ExecutorFragment _Authentication__OclAny = new ExecutorFragment(Types._Authentication, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Authentication__OclElement = new ExecutorFragment(Types._Authentication, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BasicAuthentication__BasicAuthentication = new ExecutorFragment(Types._BasicAuthentication, Security_dslTables.Types._BasicAuthentication);
		private static final ExecutorFragment _BasicAuthentication__OclAny = new ExecutorFragment(Types._BasicAuthentication, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BasicAuthentication__OclElement = new ExecutorFragment(Types._BasicAuthentication, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BasicAuthentication__Security = new ExecutorFragment(Types._BasicAuthentication, Security_dslTables.Types._Security);

		private static final ExecutorFragment _Claim__Claim = new ExecutorFragment(Types._Claim, Security_dslTables.Types._Claim);
		private static final ExecutorFragment _Claim__OclAny = new ExecutorFragment(Types._Claim, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Claim__OclElement = new ExecutorFragment(Types._Claim, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Controller__Controller = new ExecutorFragment(Types._Controller, Security_dslTables.Types._Controller);
		private static final ExecutorFragment _Controller__OclAny = new ExecutorFragment(Types._Controller, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Controller__OclElement = new ExecutorFragment(Types._Controller, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Database__Database = new ExecutorFragment(Types._Database, Security_dslTables.Types._Database);
		private static final ExecutorFragment _Database__OclAny = new ExecutorFragment(Types._Database, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Database__OclElement = new ExecutorFragment(Types._Database, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EClaimType__EClaimType = new ExecutorFragment(Types._EClaimType, Security_dslTables.Types._EClaimType);
		private static final ExecutorFragment _EClaimType__OclAny = new ExecutorFragment(Types._EClaimType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EClaimType__OclElement = new ExecutorFragment(Types._EClaimType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EClaimType__OclEnumeration = new ExecutorFragment(Types._EClaimType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EClaimType__OclType = new ExecutorFragment(Types._EClaimType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EDatabaseType__EDatabaseType = new ExecutorFragment(Types._EDatabaseType, Security_dslTables.Types._EDatabaseType);
		private static final ExecutorFragment _EDatabaseType__OclAny = new ExecutorFragment(Types._EDatabaseType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EDatabaseType__OclElement = new ExecutorFragment(Types._EDatabaseType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EDatabaseType__OclEnumeration = new ExecutorFragment(Types._EDatabaseType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EDatabaseType__OclType = new ExecutorFragment(Types._EDatabaseType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EEndpointMethod__EEndpointMethod = new ExecutorFragment(Types._EEndpointMethod, Security_dslTables.Types._EEndpointMethod);
		private static final ExecutorFragment _EEndpointMethod__OclAny = new ExecutorFragment(Types._EEndpointMethod, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EEndpointMethod__OclElement = new ExecutorFragment(Types._EEndpointMethod, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EEndpointMethod__OclEnumeration = new ExecutorFragment(Types._EEndpointMethod, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EEndpointMethod__OclType = new ExecutorFragment(Types._EEndpointMethod, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EEndpointType__EEndpointType = new ExecutorFragment(Types._EEndpointType, Security_dslTables.Types._EEndpointType);
		private static final ExecutorFragment _EEndpointType__OclAny = new ExecutorFragment(Types._EEndpointType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EEndpointType__OclElement = new ExecutorFragment(Types._EEndpointType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EEndpointType__OclEnumeration = new ExecutorFragment(Types._EEndpointType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EEndpointType__OclType = new ExecutorFragment(Types._EEndpointType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EOAuthProvider__EOAuthProvider = new ExecutorFragment(Types._EOAuthProvider, Security_dslTables.Types._EOAuthProvider);
		private static final ExecutorFragment _EOAuthProvider__OclAny = new ExecutorFragment(Types._EOAuthProvider, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EOAuthProvider__OclElement = new ExecutorFragment(Types._EOAuthProvider, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EOAuthProvider__OclEnumeration = new ExecutorFragment(Types._EOAuthProvider, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EOAuthProvider__OclType = new ExecutorFragment(Types._EOAuthProvider, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EType__EType = new ExecutorFragment(Types._EType, Security_dslTables.Types._EType);
		private static final ExecutorFragment _EType__OclAny = new ExecutorFragment(Types._EType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EType__OclElement = new ExecutorFragment(Types._EType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EType__OclEnumeration = new ExecutorFragment(Types._EType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EType__OclType = new ExecutorFragment(Types._EType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Endpoint__Endpoint = new ExecutorFragment(Types._Endpoint, Security_dslTables.Types._Endpoint);
		private static final ExecutorFragment _Endpoint__OclAny = new ExecutorFragment(Types._Endpoint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Endpoint__OclElement = new ExecutorFragment(Types._Endpoint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Entity__Entity = new ExecutorFragment(Types._Entity, Security_dslTables.Types._Entity);
		private static final ExecutorFragment _Entity__OclAny = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Entity__OclElement = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _JWT__JWT = new ExecutorFragment(Types._JWT, Security_dslTables.Types._JWT);
		private static final ExecutorFragment _JWT__OclAny = new ExecutorFragment(Types._JWT, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _JWT__OclElement = new ExecutorFragment(Types._JWT, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _JWT__Security = new ExecutorFragment(Types._JWT, Security_dslTables.Types._Security);

		private static final ExecutorFragment _OAuth2__OAuth2 = new ExecutorFragment(Types._OAuth2, Security_dslTables.Types._OAuth2);
		private static final ExecutorFragment _OAuth2__OclAny = new ExecutorFragment(Types._OAuth2, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OAuth2__OclElement = new ExecutorFragment(Types._OAuth2, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OAuth2__Security = new ExecutorFragment(Types._OAuth2, Security_dslTables.Types._Security);

		private static final ExecutorFragment _Provider__OclAny = new ExecutorFragment(Types._Provider, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Provider__OclElement = new ExecutorFragment(Types._Provider, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Provider__Provider = new ExecutorFragment(Types._Provider, Security_dslTables.Types._Provider);

		private static final ExecutorFragment _RegisteredClaim__OclAny = new ExecutorFragment(Types._RegisteredClaim, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RegisteredClaim__OclElement = new ExecutorFragment(Types._RegisteredClaim, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RegisteredClaim__RegisteredClaim = new ExecutorFragment(Types._RegisteredClaim, Security_dslTables.Types._RegisteredClaim);

		private static final ExecutorFragment _Role__Entity = new ExecutorFragment(Types._Role, Security_dslTables.Types._Entity);
		private static final ExecutorFragment _Role__OclAny = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Role__OclElement = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Role__Role = new ExecutorFragment(Types._Role, Security_dslTables.Types._Role);

		private static final ExecutorFragment _RoleInstance__OclAny = new ExecutorFragment(Types._RoleInstance, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RoleInstance__OclElement = new ExecutorFragment(Types._RoleInstance, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RoleInstance__RoleInstance = new ExecutorFragment(Types._RoleInstance, Security_dslTables.Types._RoleInstance);

		private static final ExecutorFragment _Security__OclAny = new ExecutorFragment(Types._Security, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Security__OclElement = new ExecutorFragment(Types._Security, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Security__Security = new ExecutorFragment(Types._Security, Security_dslTables.Types._Security);

		private static final ExecutorFragment _User__Entity = new ExecutorFragment(Types._User, Security_dslTables.Types._Entity);
		private static final ExecutorFragment _User__OclAny = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _User__OclElement = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _User__User = new ExecutorFragment(Types._User, Security_dslTables.Types._User);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Security_dslTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Security_dslTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Security_dslTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Application__app_controllers = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__APP_CONTROLLERS, Types._Application, 0);
		public static final ExecutorProperty _Application__app_database = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__APP_DATABASE, Types._Application, 1);
		public static final ExecutorProperty _Application__app_entities = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__APP_ENTITIES, Types._Application, 2);
		public static final ExecutorProperty _Application__app_security = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__APP_SECURITY, Types._Application, 3);
		public static final ExecutorProperty _Application__artifact = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__ARTIFACT, Types._Application, 4);
		public static final ExecutorProperty _Application__description = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__DESCRIPTION, Types._Application, 5);
		public static final ExecutorProperty _Application__group = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__GROUP, Types._Application, 6);
		public static final ExecutorProperty _Application__hostname = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__HOSTNAME, Types._Application, 7);
		public static final ExecutorProperty _Application__name = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__NAME, Types._Application, 8);
		public static final ExecutorProperty _Application__packageName = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__PACKAGE_NAME, Types._Application, 9);
		public static final ExecutorProperty _Application__port = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__PORT, Types._Application, 10);

		public static final ExecutorProperty _Attribute__collumnName = new EcoreExecutorProperty(Security_dslPackage.Literals.ATTRIBUTE__COLLUMN_NAME, Types._Attribute, 0);
		public static final ExecutorProperty _Attribute__credential = new EcoreExecutorProperty(Security_dslPackage.Literals.ATTRIBUTE__CREDENTIAL, Types._Attribute, 1);
		public static final ExecutorProperty _Attribute__identifier = new EcoreExecutorProperty(Security_dslPackage.Literals.ATTRIBUTE__IDENTIFIER, Types._Attribute, 2);
		public static final ExecutorProperty _Attribute__name = new EcoreExecutorProperty(Security_dslPackage.Literals.ATTRIBUTE__NAME, Types._Attribute, 3);
		public static final ExecutorProperty _Attribute__type = new EcoreExecutorProperty(Security_dslPackage.Literals.ATTRIBUTE__TYPE, Types._Attribute, 4);
		public static final ExecutorProperty _Attribute__Claim__claim_attribute = new ExecutorPropertyWithImplementation("Claim", Types._Attribute, 5, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.CLAIM__CLAIM_ATTRIBUTE));
		public static final ExecutorProperty _Attribute__Entity__entity_attributes = new ExecutorPropertyWithImplementation("Entity", Types._Attribute, 6, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.ENTITY__ENTITY_ATTRIBUTES));

		public static final ExecutorProperty _Claim__claim_attribute = new EcoreExecutorProperty(Security_dslPackage.Literals.CLAIM__CLAIM_ATTRIBUTE, Types._Claim, 0);
		public static final ExecutorProperty _Claim__name = new EcoreExecutorProperty(Security_dslPackage.Literals.CLAIM__NAME, Types._Claim, 1);
		public static final ExecutorProperty _Claim__type = new EcoreExecutorProperty(Security_dslPackage.Literals.CLAIM__TYPE, Types._Claim, 2);
		public static final ExecutorProperty _Claim__JWT__claims = new ExecutorPropertyWithImplementation("JWT", Types._Claim, 3, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.JWT__CLAIMS));

		public static final ExecutorProperty _Controller__controller_endpoints = new EcoreExecutorProperty(Security_dslPackage.Literals.CONTROLLER__CONTROLLER_ENDPOINTS, Types._Controller, 0);
		public static final ExecutorProperty _Controller__name = new EcoreExecutorProperty(Security_dslPackage.Literals.CONTROLLER__NAME, Types._Controller, 1);
		public static final ExecutorProperty _Controller__path = new EcoreExecutorProperty(Security_dslPackage.Literals.CONTROLLER__PATH, Types._Controller, 2);
		public static final ExecutorProperty _Controller__Application__app_controllers = new ExecutorPropertyWithImplementation("Application", Types._Controller, 3, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.APPLICATION__APP_CONTROLLERS));

		public static final ExecutorProperty _Database__password = new EcoreExecutorProperty(Security_dslPackage.Literals.DATABASE__PASSWORD, Types._Database, 0);
		public static final ExecutorProperty _Database__url = new EcoreExecutorProperty(Security_dslPackage.Literals.DATABASE__URL, Types._Database, 1);
		public static final ExecutorProperty _Database__username = new EcoreExecutorProperty(Security_dslPackage.Literals.DATABASE__USERNAME, Types._Database, 2);
		public static final ExecutorProperty _Database__vendorName = new EcoreExecutorProperty(Security_dslPackage.Literals.DATABASE__VENDOR_NAME, Types._Database, 3);
		public static final ExecutorProperty _Database__Application__app_database = new ExecutorPropertyWithImplementation("Application", Types._Database, 4, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.APPLICATION__APP_DATABASE));

		public static final ExecutorProperty _Endpoint__method = new EcoreExecutorProperty(Security_dslPackage.Literals.ENDPOINT__METHOD, Types._Endpoint, 0);
		public static final ExecutorProperty _Endpoint__methodName = new EcoreExecutorProperty(Security_dslPackage.Literals.ENDPOINT__METHOD_NAME, Types._Endpoint, 1);
		public static final ExecutorProperty _Endpoint__role_authorities = new EcoreExecutorProperty(Security_dslPackage.Literals.ENDPOINT__ROLE_AUTHORITIES, Types._Endpoint, 2);
		public static final ExecutorProperty _Endpoint__type = new EcoreExecutorProperty(Security_dslPackage.Literals.ENDPOINT__TYPE, Types._Endpoint, 3);
		public static final ExecutorProperty _Endpoint__url = new EcoreExecutorProperty(Security_dslPackage.Literals.ENDPOINT__URL, Types._Endpoint, 4);
		public static final ExecutorProperty _Endpoint__Controller__controller_endpoints = new ExecutorPropertyWithImplementation("Controller", Types._Endpoint, 5, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.CONTROLLER__CONTROLLER_ENDPOINTS));

		public static final ExecutorProperty _Entity__entity_attributes = new EcoreExecutorProperty(Security_dslPackage.Literals.ENTITY__ENTITY_ATTRIBUTES, Types._Entity, 0);
		public static final ExecutorProperty _Entity__tableName = new EcoreExecutorProperty(Security_dslPackage.Literals.ENTITY__TABLE_NAME, Types._Entity, 1);
		public static final ExecutorProperty _Entity__Application__app_entities = new ExecutorPropertyWithImplementation("Application", Types._Entity, 2, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.APPLICATION__APP_ENTITIES));

		public static final ExecutorProperty _JWT__claims = new EcoreExecutorProperty(Security_dslPackage.Literals.JWT__CLAIMS, Types._JWT, 0);
		public static final ExecutorProperty _JWT__registered_claims = new EcoreExecutorProperty(Security_dslPackage.Literals.JWT__REGISTERED_CLAIMS, Types._JWT, 1);
		public static final ExecutorProperty _JWT__secret = new EcoreExecutorProperty(Security_dslPackage.Literals.JWT__SECRET, Types._JWT, 2);
		public static final ExecutorProperty _JWT__signatureAlgorithm = new EcoreExecutorProperty(Security_dslPackage.Literals.JWT__SIGNATURE_ALGORITHM, Types._JWT, 3);

		public static final ExecutorProperty _OAuth2__providers = new EcoreExecutorProperty(Security_dslPackage.Literals.OAUTH2__PROVIDERS, Types._OAuth2, 0);

		public static final ExecutorProperty _Provider__clientId = new EcoreExecutorProperty(Security_dslPackage.Literals.PROVIDER__CLIENT_ID, Types._Provider, 0);
		public static final ExecutorProperty _Provider__clientSecret = new EcoreExecutorProperty(Security_dslPackage.Literals.PROVIDER__CLIENT_SECRET, Types._Provider, 1);
		public static final ExecutorProperty _Provider__name = new EcoreExecutorProperty(Security_dslPackage.Literals.PROVIDER__NAME, Types._Provider, 2);
		public static final ExecutorProperty _Provider__redirectUri = new EcoreExecutorProperty(Security_dslPackage.Literals.PROVIDER__REDIRECT_URI, Types._Provider, 3);
		public static final ExecutorProperty _Provider__OAuth2__providers = new ExecutorPropertyWithImplementation("OAuth2", Types._Provider, 4, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.OAUTH2__PROVIDERS));

		public static final ExecutorProperty _RegisteredClaim__audience = new EcoreExecutorProperty(Security_dslPackage.Literals.REGISTERED_CLAIM__AUDIENCE, Types._RegisteredClaim, 0);
		public static final ExecutorProperty _RegisteredClaim__expirationTime = new EcoreExecutorProperty(Security_dslPackage.Literals.REGISTERED_CLAIM__EXPIRATION_TIME, Types._RegisteredClaim, 1);
		public static final ExecutorProperty _RegisteredClaim__issuer = new EcoreExecutorProperty(Security_dslPackage.Literals.REGISTERED_CLAIM__ISSUER, Types._RegisteredClaim, 2);
		public static final ExecutorProperty _RegisteredClaim__JWT__registered_claims = new ExecutorPropertyWithImplementation("JWT", Types._RegisteredClaim, 3, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.JWT__REGISTERED_CLAIMS));

		public static final ExecutorProperty _Role__role_instances = new EcoreExecutorProperty(Security_dslPackage.Literals.ROLE__ROLE_INSTANCES, Types._Role, 0);

		public static final ExecutorProperty _RoleInstance__client = new EcoreExecutorProperty(Security_dslPackage.Literals.ROLE_INSTANCE__CLIENT, Types._RoleInstance, 0);
		public static final ExecutorProperty _RoleInstance__name = new EcoreExecutorProperty(Security_dslPackage.Literals.ROLE_INSTANCE__NAME, Types._RoleInstance, 1);
		public static final ExecutorProperty _RoleInstance__Endpoint__role_authorities = new ExecutorPropertyWithImplementation("Endpoint", Types._RoleInstance, 2, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.ENDPOINT__ROLE_AUTHORITIES));
		public static final ExecutorProperty _RoleInstance__Role__role_instances = new ExecutorPropertyWithImplementation("Role", Types._RoleInstance, 3, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.ROLE__ROLE_INSTANCES));

		public static final ExecutorProperty _Security__Application__app_security = new ExecutorPropertyWithImplementation("Application", Types._Security, 0, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.APPLICATION__APP_SECURITY));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Security_dslTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Application =
			{
				Fragments._Application__OclAny /* 0 */,
				Fragments._Application__OclElement /* 1 */,
				Fragments._Application__Application /* 2 */
			};
		private static final int /*@NonNull*/ [] __Application = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Attribute =
			{
				Fragments._Attribute__OclAny /* 0 */,
				Fragments._Attribute__OclElement /* 1 */,
				Fragments._Attribute__Attribute /* 2 */
			};
		private static final int /*@NonNull*/ [] __Attribute = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Authentication =
			{
				Fragments._Authentication__OclAny /* 0 */,
				Fragments._Authentication__OclElement /* 1 */,
				Fragments._Authentication__Controller /* 2 */,
				Fragments._Authentication__Authentication /* 3 */
			};
		private static final int /*@NonNull*/ [] __Authentication = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BasicAuthentication =
			{
				Fragments._BasicAuthentication__OclAny /* 0 */,
				Fragments._BasicAuthentication__OclElement /* 1 */,
				Fragments._BasicAuthentication__Security /* 2 */,
				Fragments._BasicAuthentication__BasicAuthentication /* 3 */
			};
		private static final int /*@NonNull*/ [] __BasicAuthentication = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Claim =
			{
				Fragments._Claim__OclAny /* 0 */,
				Fragments._Claim__OclElement /* 1 */,
				Fragments._Claim__Claim /* 2 */
			};
		private static final int /*@NonNull*/ [] __Claim = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Controller =
			{
				Fragments._Controller__OclAny /* 0 */,
				Fragments._Controller__OclElement /* 1 */,
				Fragments._Controller__Controller /* 2 */
			};
		private static final int /*@NonNull*/ [] __Controller = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Database =
			{
				Fragments._Database__OclAny /* 0 */,
				Fragments._Database__OclElement /* 1 */,
				Fragments._Database__Database /* 2 */
			};
		private static final int /*@NonNull*/ [] __Database = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EClaimType =
			{
				Fragments._EClaimType__OclAny /* 0 */,
				Fragments._EClaimType__OclElement /* 1 */,
				Fragments._EClaimType__OclType /* 2 */,
				Fragments._EClaimType__OclEnumeration /* 3 */,
				Fragments._EClaimType__EClaimType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EClaimType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EDatabaseType =
			{
				Fragments._EDatabaseType__OclAny /* 0 */,
				Fragments._EDatabaseType__OclElement /* 1 */,
				Fragments._EDatabaseType__OclType /* 2 */,
				Fragments._EDatabaseType__OclEnumeration /* 3 */,
				Fragments._EDatabaseType__EDatabaseType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EDatabaseType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EEndpointMethod =
			{
				Fragments._EEndpointMethod__OclAny /* 0 */,
				Fragments._EEndpointMethod__OclElement /* 1 */,
				Fragments._EEndpointMethod__OclType /* 2 */,
				Fragments._EEndpointMethod__OclEnumeration /* 3 */,
				Fragments._EEndpointMethod__EEndpointMethod /* 4 */
			};
		private static final int /*@NonNull*/ [] __EEndpointMethod = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EEndpointType =
			{
				Fragments._EEndpointType__OclAny /* 0 */,
				Fragments._EEndpointType__OclElement /* 1 */,
				Fragments._EEndpointType__OclType /* 2 */,
				Fragments._EEndpointType__OclEnumeration /* 3 */,
				Fragments._EEndpointType__EEndpointType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EEndpointType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EOAuthProvider =
			{
				Fragments._EOAuthProvider__OclAny /* 0 */,
				Fragments._EOAuthProvider__OclElement /* 1 */,
				Fragments._EOAuthProvider__OclType /* 2 */,
				Fragments._EOAuthProvider__OclEnumeration /* 3 */,
				Fragments._EOAuthProvider__EOAuthProvider /* 4 */
			};
		private static final int /*@NonNull*/ [] __EOAuthProvider = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EType =
			{
				Fragments._EType__OclAny /* 0 */,
				Fragments._EType__OclElement /* 1 */,
				Fragments._EType__OclType /* 2 */,
				Fragments._EType__OclEnumeration /* 3 */,
				Fragments._EType__EType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Endpoint =
			{
				Fragments._Endpoint__OclAny /* 0 */,
				Fragments._Endpoint__OclElement /* 1 */,
				Fragments._Endpoint__Endpoint /* 2 */
			};
		private static final int /*@NonNull*/ [] __Endpoint = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Entity =
			{
				Fragments._Entity__OclAny /* 0 */,
				Fragments._Entity__OclElement /* 1 */,
				Fragments._Entity__Entity /* 2 */
			};
		private static final int /*@NonNull*/ [] __Entity = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _JWT =
			{
				Fragments._JWT__OclAny /* 0 */,
				Fragments._JWT__OclElement /* 1 */,
				Fragments._JWT__Security /* 2 */,
				Fragments._JWT__JWT /* 3 */
			};
		private static final int /*@NonNull*/ [] __JWT = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OAuth2 =
			{
				Fragments._OAuth2__OclAny /* 0 */,
				Fragments._OAuth2__OclElement /* 1 */,
				Fragments._OAuth2__Security /* 2 */,
				Fragments._OAuth2__OAuth2 /* 3 */
			};
		private static final int /*@NonNull*/ [] __OAuth2 = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Provider =
			{
				Fragments._Provider__OclAny /* 0 */,
				Fragments._Provider__OclElement /* 1 */,
				Fragments._Provider__Provider /* 2 */
			};
		private static final int /*@NonNull*/ [] __Provider = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RegisteredClaim =
			{
				Fragments._RegisteredClaim__OclAny /* 0 */,
				Fragments._RegisteredClaim__OclElement /* 1 */,
				Fragments._RegisteredClaim__RegisteredClaim /* 2 */
			};
		private static final int /*@NonNull*/ [] __RegisteredClaim = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Role =
			{
				Fragments._Role__OclAny /* 0 */,
				Fragments._Role__OclElement /* 1 */,
				Fragments._Role__Entity /* 2 */,
				Fragments._Role__Role /* 3 */
			};
		private static final int /*@NonNull*/ [] __Role = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RoleInstance =
			{
				Fragments._RoleInstance__OclAny /* 0 */,
				Fragments._RoleInstance__OclElement /* 1 */,
				Fragments._RoleInstance__RoleInstance /* 2 */
			};
		private static final int /*@NonNull*/ [] __RoleInstance = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Security =
			{
				Fragments._Security__OclAny /* 0 */,
				Fragments._Security__OclElement /* 1 */,
				Fragments._Security__Security /* 2 */
			};
		private static final int /*@NonNull*/ [] __Security = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _User =
			{
				Fragments._User__OclAny /* 0 */,
				Fragments._User__OclElement /* 1 */,
				Fragments._User__Entity /* 2 */,
				Fragments._User__User /* 3 */
			};
		private static final int /*@NonNull*/ [] __User = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Application.initFragments(_Application, __Application);
			Types._Attribute.initFragments(_Attribute, __Attribute);
			Types._Authentication.initFragments(_Authentication, __Authentication);
			Types._BasicAuthentication.initFragments(_BasicAuthentication, __BasicAuthentication);
			Types._Claim.initFragments(_Claim, __Claim);
			Types._Controller.initFragments(_Controller, __Controller);
			Types._Database.initFragments(_Database, __Database);
			Types._EClaimType.initFragments(_EClaimType, __EClaimType);
			Types._EDatabaseType.initFragments(_EDatabaseType, __EDatabaseType);
			Types._EEndpointMethod.initFragments(_EEndpointMethod, __EEndpointMethod);
			Types._EEndpointType.initFragments(_EEndpointType, __EEndpointType);
			Types._EOAuthProvider.initFragments(_EOAuthProvider, __EOAuthProvider);
			Types._EType.initFragments(_EType, __EType);
			Types._Endpoint.initFragments(_Endpoint, __Endpoint);
			Types._Entity.initFragments(_Entity, __Entity);
			Types._JWT.initFragments(_JWT, __JWT);
			Types._OAuth2.initFragments(_OAuth2, __OAuth2);
			Types._Provider.initFragments(_Provider, __Provider);
			Types._RegisteredClaim.initFragments(_RegisteredClaim, __RegisteredClaim);
			Types._Role.initFragments(_Role, __Role);
			Types._RoleInstance.initFragments(_RoleInstance, __RoleInstance);
			Types._Security.initFragments(_Security, __Security);
			Types._User.initFragments(_User, __User);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Security_dslTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Application__Application = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Application__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Application__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Authentication__Authentication = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Authentication__Controller = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Authentication__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Authentication__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BasicAuthentication__BasicAuthentication = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicAuthentication__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicAuthentication__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicAuthentication__Security = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Claim__Claim = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Claim__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Claim__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Controller__Controller = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Controller__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Controller__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Database__Database = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Database__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Database__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EClaimType__EClaimType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EClaimType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EClaimType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EClaimType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EClaimType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EDatabaseType__EDatabaseType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EDatabaseType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EDatabaseType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EDatabaseType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EDatabaseType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EEndpointMethod__EEndpointMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EEndpointMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EEndpointMethod__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EEndpointMethod__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EEndpointMethod__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EEndpointType__EEndpointType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EEndpointType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EEndpointType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EEndpointType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EEndpointType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EOAuthProvider__EOAuthProvider = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EOAuthProvider__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EOAuthProvider__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EOAuthProvider__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EOAuthProvider__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EType__EType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Endpoint__Endpoint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Endpoint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Endpoint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Entity__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _JWT__JWT = {};
		private static final ExecutorOperation /*@NonNull*/ [] _JWT__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _JWT__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _JWT__Security = {};

		private static final ExecutorOperation /*@NonNull*/ [] _OAuth2__OAuth2 = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OAuth2__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OAuth2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OAuth2__Security = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Provider__Provider = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Provider__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Provider__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RegisteredClaim__RegisteredClaim = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RegisteredClaim__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RegisteredClaim__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Role__Role = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RoleInstance__RoleInstance = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RoleInstance__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RoleInstance__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Security__Security = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Security__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Security__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _User__User = {};
		private static final ExecutorOperation /*@NonNull*/ [] _User__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Application__Application.initOperations(_Application__Application);
			Fragments._Application__OclAny.initOperations(_Application__OclAny);
			Fragments._Application__OclElement.initOperations(_Application__OclElement);

			Fragments._Attribute__Attribute.initOperations(_Attribute__Attribute);
			Fragments._Attribute__OclAny.initOperations(_Attribute__OclAny);
			Fragments._Attribute__OclElement.initOperations(_Attribute__OclElement);

			Fragments._Authentication__Authentication.initOperations(_Authentication__Authentication);
			Fragments._Authentication__Controller.initOperations(_Authentication__Controller);
			Fragments._Authentication__OclAny.initOperations(_Authentication__OclAny);
			Fragments._Authentication__OclElement.initOperations(_Authentication__OclElement);

			Fragments._BasicAuthentication__BasicAuthentication.initOperations(_BasicAuthentication__BasicAuthentication);
			Fragments._BasicAuthentication__OclAny.initOperations(_BasicAuthentication__OclAny);
			Fragments._BasicAuthentication__OclElement.initOperations(_BasicAuthentication__OclElement);
			Fragments._BasicAuthentication__Security.initOperations(_BasicAuthentication__Security);

			Fragments._Claim__Claim.initOperations(_Claim__Claim);
			Fragments._Claim__OclAny.initOperations(_Claim__OclAny);
			Fragments._Claim__OclElement.initOperations(_Claim__OclElement);

			Fragments._Controller__Controller.initOperations(_Controller__Controller);
			Fragments._Controller__OclAny.initOperations(_Controller__OclAny);
			Fragments._Controller__OclElement.initOperations(_Controller__OclElement);

			Fragments._Database__Database.initOperations(_Database__Database);
			Fragments._Database__OclAny.initOperations(_Database__OclAny);
			Fragments._Database__OclElement.initOperations(_Database__OclElement);

			Fragments._EClaimType__EClaimType.initOperations(_EClaimType__EClaimType);
			Fragments._EClaimType__OclAny.initOperations(_EClaimType__OclAny);
			Fragments._EClaimType__OclElement.initOperations(_EClaimType__OclElement);
			Fragments._EClaimType__OclEnumeration.initOperations(_EClaimType__OclEnumeration);
			Fragments._EClaimType__OclType.initOperations(_EClaimType__OclType);

			Fragments._EDatabaseType__EDatabaseType.initOperations(_EDatabaseType__EDatabaseType);
			Fragments._EDatabaseType__OclAny.initOperations(_EDatabaseType__OclAny);
			Fragments._EDatabaseType__OclElement.initOperations(_EDatabaseType__OclElement);
			Fragments._EDatabaseType__OclEnumeration.initOperations(_EDatabaseType__OclEnumeration);
			Fragments._EDatabaseType__OclType.initOperations(_EDatabaseType__OclType);

			Fragments._EEndpointMethod__EEndpointMethod.initOperations(_EEndpointMethod__EEndpointMethod);
			Fragments._EEndpointMethod__OclAny.initOperations(_EEndpointMethod__OclAny);
			Fragments._EEndpointMethod__OclElement.initOperations(_EEndpointMethod__OclElement);
			Fragments._EEndpointMethod__OclEnumeration.initOperations(_EEndpointMethod__OclEnumeration);
			Fragments._EEndpointMethod__OclType.initOperations(_EEndpointMethod__OclType);

			Fragments._EEndpointType__EEndpointType.initOperations(_EEndpointType__EEndpointType);
			Fragments._EEndpointType__OclAny.initOperations(_EEndpointType__OclAny);
			Fragments._EEndpointType__OclElement.initOperations(_EEndpointType__OclElement);
			Fragments._EEndpointType__OclEnumeration.initOperations(_EEndpointType__OclEnumeration);
			Fragments._EEndpointType__OclType.initOperations(_EEndpointType__OclType);

			Fragments._EOAuthProvider__EOAuthProvider.initOperations(_EOAuthProvider__EOAuthProvider);
			Fragments._EOAuthProvider__OclAny.initOperations(_EOAuthProvider__OclAny);
			Fragments._EOAuthProvider__OclElement.initOperations(_EOAuthProvider__OclElement);
			Fragments._EOAuthProvider__OclEnumeration.initOperations(_EOAuthProvider__OclEnumeration);
			Fragments._EOAuthProvider__OclType.initOperations(_EOAuthProvider__OclType);

			Fragments._EType__EType.initOperations(_EType__EType);
			Fragments._EType__OclAny.initOperations(_EType__OclAny);
			Fragments._EType__OclElement.initOperations(_EType__OclElement);
			Fragments._EType__OclEnumeration.initOperations(_EType__OclEnumeration);
			Fragments._EType__OclType.initOperations(_EType__OclType);

			Fragments._Endpoint__Endpoint.initOperations(_Endpoint__Endpoint);
			Fragments._Endpoint__OclAny.initOperations(_Endpoint__OclAny);
			Fragments._Endpoint__OclElement.initOperations(_Endpoint__OclElement);

			Fragments._Entity__Entity.initOperations(_Entity__Entity);
			Fragments._Entity__OclAny.initOperations(_Entity__OclAny);
			Fragments._Entity__OclElement.initOperations(_Entity__OclElement);

			Fragments._JWT__JWT.initOperations(_JWT__JWT);
			Fragments._JWT__OclAny.initOperations(_JWT__OclAny);
			Fragments._JWT__OclElement.initOperations(_JWT__OclElement);
			Fragments._JWT__Security.initOperations(_JWT__Security);

			Fragments._OAuth2__OAuth2.initOperations(_OAuth2__OAuth2);
			Fragments._OAuth2__OclAny.initOperations(_OAuth2__OclAny);
			Fragments._OAuth2__OclElement.initOperations(_OAuth2__OclElement);
			Fragments._OAuth2__Security.initOperations(_OAuth2__Security);

			Fragments._Provider__OclAny.initOperations(_Provider__OclAny);
			Fragments._Provider__OclElement.initOperations(_Provider__OclElement);
			Fragments._Provider__Provider.initOperations(_Provider__Provider);

			Fragments._RegisteredClaim__OclAny.initOperations(_RegisteredClaim__OclAny);
			Fragments._RegisteredClaim__OclElement.initOperations(_RegisteredClaim__OclElement);
			Fragments._RegisteredClaim__RegisteredClaim.initOperations(_RegisteredClaim__RegisteredClaim);

			Fragments._Role__Entity.initOperations(_Role__Entity);
			Fragments._Role__OclAny.initOperations(_Role__OclAny);
			Fragments._Role__OclElement.initOperations(_Role__OclElement);
			Fragments._Role__Role.initOperations(_Role__Role);

			Fragments._RoleInstance__OclAny.initOperations(_RoleInstance__OclAny);
			Fragments._RoleInstance__OclElement.initOperations(_RoleInstance__OclElement);
			Fragments._RoleInstance__RoleInstance.initOperations(_RoleInstance__RoleInstance);

			Fragments._Security__OclAny.initOperations(_Security__OclAny);
			Fragments._Security__OclElement.initOperations(_Security__OclElement);
			Fragments._Security__Security.initOperations(_Security__Security);

			Fragments._User__Entity.initOperations(_User__Entity);
			Fragments._User__OclAny.initOperations(_User__OclAny);
			Fragments._User__OclElement.initOperations(_User__OclElement);
			Fragments._User__User.initOperations(_User__User);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Security_dslTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Application = {
			Security_dslTables.Properties._Application__app_controllers,
			Security_dslTables.Properties._Application__app_database,
			Security_dslTables.Properties._Application__app_entities,
			Security_dslTables.Properties._Application__app_security,
			Security_dslTables.Properties._Application__artifact,
			Security_dslTables.Properties._Application__description,
			Security_dslTables.Properties._Application__group,
			Security_dslTables.Properties._Application__hostname,
			Security_dslTables.Properties._Application__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Application__packageName,
			Security_dslTables.Properties._Application__port
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Attribute = {
			Security_dslTables.Properties._Attribute__collumnName,
			Security_dslTables.Properties._Attribute__credential,
			Security_dslTables.Properties._Attribute__identifier,
			Security_dslTables.Properties._Attribute__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Attribute__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Authentication = {
			Security_dslTables.Properties._Controller__controller_endpoints,
			Security_dslTables.Properties._Controller__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Controller__path
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BasicAuthentication = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Claim = {
			Security_dslTables.Properties._Claim__claim_attribute,
			Security_dslTables.Properties._Claim__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Claim__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Controller = {
			Security_dslTables.Properties._Controller__controller_endpoints,
			Security_dslTables.Properties._Controller__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Controller__path
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Database = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Database__password,
			Security_dslTables.Properties._Database__url,
			Security_dslTables.Properties._Database__username,
			Security_dslTables.Properties._Database__vendorName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EClaimType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EDatabaseType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EEndpointMethod = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EEndpointType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EOAuthProvider = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Endpoint = {
			Security_dslTables.Properties._Endpoint__method,
			Security_dslTables.Properties._Endpoint__methodName,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Endpoint__role_authorities,
			Security_dslTables.Properties._Endpoint__type,
			Security_dslTables.Properties._Endpoint__url
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Entity = {
			Security_dslTables.Properties._Entity__entity_attributes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Entity__tableName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _JWT = {
			Security_dslTables.Properties._JWT__claims,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._JWT__registered_claims,
			Security_dslTables.Properties._JWT__secret,
			Security_dslTables.Properties._JWT__signatureAlgorithm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OAuth2 = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._OAuth2__providers
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Provider = {
			Security_dslTables.Properties._Provider__clientId,
			Security_dslTables.Properties._Provider__clientSecret,
			Security_dslTables.Properties._Provider__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Provider__redirectUri
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RegisteredClaim = {
			Security_dslTables.Properties._RegisteredClaim__audience,
			Security_dslTables.Properties._RegisteredClaim__expirationTime,
			Security_dslTables.Properties._RegisteredClaim__issuer,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Role = {
			Security_dslTables.Properties._Entity__entity_attributes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Role__role_instances,
			Security_dslTables.Properties._Entity__tableName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RoleInstance = {
			Security_dslTables.Properties._RoleInstance__client,
			Security_dslTables.Properties._RoleInstance__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Security = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _User = {
			Security_dslTables.Properties._Entity__entity_attributes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Entity__tableName
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Application__Application.initProperties(_Application);
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._Authentication__Authentication.initProperties(_Authentication);
			Fragments._BasicAuthentication__BasicAuthentication.initProperties(_BasicAuthentication);
			Fragments._Claim__Claim.initProperties(_Claim);
			Fragments._Controller__Controller.initProperties(_Controller);
			Fragments._Database__Database.initProperties(_Database);
			Fragments._EClaimType__EClaimType.initProperties(_EClaimType);
			Fragments._EDatabaseType__EDatabaseType.initProperties(_EDatabaseType);
			Fragments._EEndpointMethod__EEndpointMethod.initProperties(_EEndpointMethod);
			Fragments._EEndpointType__EEndpointType.initProperties(_EEndpointType);
			Fragments._EOAuthProvider__EOAuthProvider.initProperties(_EOAuthProvider);
			Fragments._EType__EType.initProperties(_EType);
			Fragments._Endpoint__Endpoint.initProperties(_Endpoint);
			Fragments._Entity__Entity.initProperties(_Entity);
			Fragments._JWT__JWT.initProperties(_JWT);
			Fragments._OAuth2__OAuth2.initProperties(_OAuth2);
			Fragments._Provider__Provider.initProperties(_Provider);
			Fragments._RegisteredClaim__RegisteredClaim.initProperties(_RegisteredClaim);
			Fragments._Role__Role.initProperties(_Role);
			Fragments._RoleInstance__RoleInstance.initProperties(_RoleInstance);
			Fragments._Security__Security.initProperties(_Security);
			Fragments._User__User.initProperties(_User);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Security_dslTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _EClaimType__PRIVATE = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ECLAIM_TYPE.getEEnumLiteral("PRIVATE"), Types._EClaimType, 0);
		public static final EcoreExecutorEnumerationLiteral _EClaimType__PUBLIC = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ECLAIM_TYPE.getEEnumLiteral("PUBLIC"), Types._EClaimType, 1);
		public static final EcoreExecutorEnumerationLiteral _EClaimType__REGISTERED = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ECLAIM_TYPE.getEEnumLiteral("REGISTERED"), Types._EClaimType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EClaimType = {
			_EClaimType__PRIVATE,
			_EClaimType__PUBLIC,
			_EClaimType__REGISTERED
		};

		public static final EcoreExecutorEnumerationLiteral _EDatabaseType__PostgreSQL = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EDATABASE_TYPE.getEEnumLiteral("PostgreSQL"), Types._EDatabaseType, 0);
		public static final EcoreExecutorEnumerationLiteral _EDatabaseType__Oracle = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EDATABASE_TYPE.getEEnumLiteral("Oracle"), Types._EDatabaseType, 1);
		public static final EcoreExecutorEnumerationLiteral _EDatabaseType__MySQL = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EDATABASE_TYPE.getEEnumLiteral("MySQL"), Types._EDatabaseType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EDatabaseType = {
			_EDatabaseType__PostgreSQL,
			_EDatabaseType__Oracle,
			_EDatabaseType__MySQL
		};

		public static final EcoreExecutorEnumerationLiteral _EEndpointMethod__GET = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EENDPOINT_METHOD.getEEnumLiteral("GET"), Types._EEndpointMethod, 0);
		public static final EcoreExecutorEnumerationLiteral _EEndpointMethod__POST = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EENDPOINT_METHOD.getEEnumLiteral("POST"), Types._EEndpointMethod, 1);
		public static final EcoreExecutorEnumerationLiteral _EEndpointMethod__PUT = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EENDPOINT_METHOD.getEEnumLiteral("PUT"), Types._EEndpointMethod, 2);
		public static final EcoreExecutorEnumerationLiteral _EEndpointMethod__DELETE = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EENDPOINT_METHOD.getEEnumLiteral("DELETE"), Types._EEndpointMethod, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EEndpointMethod = {
			_EEndpointMethod__GET,
			_EEndpointMethod__POST,
			_EEndpointMethod__PUT,
			_EEndpointMethod__DELETE
		};

		public static final EcoreExecutorEnumerationLiteral _EEndpointType__REGISTRATION = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EENDPOINT_TYPE.getEEnumLiteral("REGISTRATION"), Types._EEndpointType, 0);
		public static final EcoreExecutorEnumerationLiteral _EEndpointType__LOGIN = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EENDPOINT_TYPE.getEEnumLiteral("LOGIN"), Types._EEndpointType, 1);
		public static final EcoreExecutorEnumerationLiteral _EEndpointType__LOGOUT = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EENDPOINT_TYPE.getEEnumLiteral("LOGOUT"), Types._EEndpointType, 2);
		public static final EcoreExecutorEnumerationLiteral _EEndpointType__OTHER = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EENDPOINT_TYPE.getEEnumLiteral("OTHER"), Types._EEndpointType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EEndpointType = {
			_EEndpointType__REGISTRATION,
			_EEndpointType__LOGIN,
			_EEndpointType__LOGOUT,
			_EEndpointType__OTHER
		};

		public static final EcoreExecutorEnumerationLiteral _EOAuthProvider__GOOGLE = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EO_AUTH_PROVIDER.getEEnumLiteral("GOOGLE"), Types._EOAuthProvider, 0);
		public static final EcoreExecutorEnumerationLiteral _EOAuthProvider__GITHUB = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EO_AUTH_PROVIDER.getEEnumLiteral("GITHUB"), Types._EOAuthProvider, 1);
		public static final EcoreExecutorEnumerationLiteral _EOAuthProvider__FACEBOOK = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EO_AUTH_PROVIDER.getEEnumLiteral("FACEBOOK"), Types._EOAuthProvider, 2);
		public static final EcoreExecutorEnumerationLiteral _EOAuthProvider__AZURE = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EO_AUTH_PROVIDER.getEEnumLiteral("AZURE"), Types._EOAuthProvider, 3);
		public static final EcoreExecutorEnumerationLiteral _EOAuthProvider__LINKEDIN = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EO_AUTH_PROVIDER.getEEnumLiteral("LINKEDIN"), Types._EOAuthProvider, 4);
		public static final EcoreExecutorEnumerationLiteral _EOAuthProvider__TWITTER = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EO_AUTH_PROVIDER.getEEnumLiteral("TWITTER"), Types._EOAuthProvider, 5);
		public static final EcoreExecutorEnumerationLiteral _EOAuthProvider__INSTAGRAM = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EO_AUTH_PROVIDER.getEEnumLiteral("INSTAGRAM"), Types._EOAuthProvider, 6);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EOAuthProvider = {
			_EOAuthProvider__GOOGLE,
			_EOAuthProvider__GITHUB,
			_EOAuthProvider__FACEBOOK,
			_EOAuthProvider__AZURE,
			_EOAuthProvider__LINKEDIN,
			_EOAuthProvider__TWITTER,
			_EOAuthProvider__INSTAGRAM
		};

		public static final EcoreExecutorEnumerationLiteral _EType__String = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("String"), Types._EType, 0);
		public static final EcoreExecutorEnumerationLiteral _EType__Float = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("Float"), Types._EType, 1);
		public static final EcoreExecutorEnumerationLiteral _EType__Long = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("Long"), Types._EType, 2);
		public static final EcoreExecutorEnumerationLiteral _EType__Integer = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("Integer"), Types._EType, 3);
		public static final EcoreExecutorEnumerationLiteral _EType__Double = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("Double"), Types._EType, 4);
		public static final EcoreExecutorEnumerationLiteral _EType__DateTime = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("DateTime"), Types._EType, 5);
		public static final EcoreExecutorEnumerationLiteral _EType__Date = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("Date"), Types._EType, 6);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EType = {
			_EType__String,
			_EType__Float,
			_EType__Long,
			_EType__Integer,
			_EType__Double,
			_EType__DateTime,
			_EType__Date
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._EClaimType.initLiterals(_EClaimType);
			Types._EDatabaseType.initLiterals(_EDatabaseType);
			Types._EEndpointMethod.initLiterals(_EEndpointMethod);
			Types._EEndpointType.initLiterals(_EEndpointType);
			Types._EOAuthProvider.initLiterals(_EOAuthProvider);
			Types._EType.initLiterals(_EType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Security_dslTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Security_dslTables();
	}

	private Security_dslTables() {
		super(Security_dslPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		Security_dslPackage.Literals.CLAIM,
		Security_dslPackage.Literals.CONTROLLER,
		Security_dslPackage.Literals.ENTITY
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
