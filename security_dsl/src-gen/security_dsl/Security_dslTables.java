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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
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
	public static final /*@NonInvalid*/ ClassId CLSSid_Claims = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Claims", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Security_dslTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Controller = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Controller", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Database = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Database", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Endpoint = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Endpoint", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_JwtSecurity = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("JwtSecurity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Model = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Model", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OtherModel = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("OtherModel", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Role = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Role", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Security = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getClassId("Security", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Security_dslTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EDatabaseType = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getEnumerationId("EDatabaseType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EEndpointMethod = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getEnumerationId("EEndpointMethod");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ESecurityMechanism = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getEnumerationId("ESecurityMechanism");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EType = Security_dslTables.PACKid_http_c_s_s_www_example_org_s_security_dsl.getEnumerationId("EType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ String STR_quot = "/";
	public static final /*@NonInvalid*/ String STR_role = "role";
	public static final /*@NonInvalid*/ String STR_user = "user";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Endpoint = TypeId.BAG.getSpecializedId(Security_dslTables.CLSSid_Endpoint);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_GET = Security_dslTables.ENUMid_EEndpointMethod.getEnumerationLiteralId("GET");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_POST = Security_dslTables.ENUMid_EEndpointMethod.getEnumerationLiteralId("POST");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Attribute = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_Attribute);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Claims = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_Claims);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Controller = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_Controller);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Endpoint = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_Endpoint);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Model = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_Model);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Role = TypeId.ORDERED_SET.getSpecializedId(Security_dslTables.CLSSid_Role);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Endpoint = TypeId.SET.getSpecializedId(Security_dslTables.CLSSid_Endpoint);

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
		public static final EcoreExecutorType _Claims = new EcoreExecutorType(Security_dslPackage.Literals.CLAIMS, PACKAGE, 0);
		public static final EcoreExecutorType _Controller = new EcoreExecutorType(Security_dslPackage.Literals.CONTROLLER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Database = new EcoreExecutorType(Security_dslPackage.Literals.DATABASE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EDatabaseType = new EcoreExecutorEnumeration(Security_dslPackage.Literals.EDATABASE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EEndpointMethod = new EcoreExecutorEnumeration(Security_dslPackage.Literals.EENDPOINT_METHOD, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ESecurityMechanism = new EcoreExecutorEnumeration(Security_dslPackage.Literals.ESECURITY_MECHANISM, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EType = new EcoreExecutorEnumeration(Security_dslPackage.Literals.ETYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Endpoint = new EcoreExecutorType(Security_dslPackage.Literals.ENDPOINT, PACKAGE, 0);
		public static final EcoreExecutorType _JwtSecurity = new EcoreExecutorType(Security_dslPackage.Literals.JWT_SECURITY, PACKAGE, 0);
		public static final EcoreExecutorType _Model = new EcoreExecutorType(Security_dslPackage.Literals.MODEL, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _OtherController = new EcoreExecutorType(Security_dslPackage.Literals.OTHER_CONTROLLER, PACKAGE, 0);
		public static final EcoreExecutorType _OtherModel = new EcoreExecutorType(Security_dslPackage.Literals.OTHER_MODEL, PACKAGE, 0);
		public static final EcoreExecutorType _Role = new EcoreExecutorType(Security_dslPackage.Literals.ROLE, PACKAGE, 0);
		public static final EcoreExecutorType _Security = new EcoreExecutorType(Security_dslPackage.Literals.SECURITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _User = new EcoreExecutorType(Security_dslPackage.Literals.USER, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Application,
			_Attribute,
			_Authentication,
			_Claims,
			_Controller,
			_Database,
			_EDatabaseType,
			_EEndpointMethod,
			_ESecurityMechanism,
			_EType,
			_Endpoint,
			_JwtSecurity,
			_Model,
			_OtherController,
			_OtherModel,
			_Role,
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

		private static final ExecutorFragment _Claims__Claims = new ExecutorFragment(Types._Claims, Security_dslTables.Types._Claims);
		private static final ExecutorFragment _Claims__OclAny = new ExecutorFragment(Types._Claims, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Claims__OclElement = new ExecutorFragment(Types._Claims, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Controller__Controller = new ExecutorFragment(Types._Controller, Security_dslTables.Types._Controller);
		private static final ExecutorFragment _Controller__OclAny = new ExecutorFragment(Types._Controller, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Controller__OclElement = new ExecutorFragment(Types._Controller, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Database__Database = new ExecutorFragment(Types._Database, Security_dslTables.Types._Database);
		private static final ExecutorFragment _Database__OclAny = new ExecutorFragment(Types._Database, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Database__OclElement = new ExecutorFragment(Types._Database, OCLstdlibTables.Types._OclElement);

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

		private static final ExecutorFragment _ESecurityMechanism__ESecurityMechanism = new ExecutorFragment(Types._ESecurityMechanism, Security_dslTables.Types._ESecurityMechanism);
		private static final ExecutorFragment _ESecurityMechanism__OclAny = new ExecutorFragment(Types._ESecurityMechanism, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ESecurityMechanism__OclElement = new ExecutorFragment(Types._ESecurityMechanism, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ESecurityMechanism__OclEnumeration = new ExecutorFragment(Types._ESecurityMechanism, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ESecurityMechanism__OclType = new ExecutorFragment(Types._ESecurityMechanism, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EType__EType = new ExecutorFragment(Types._EType, Security_dslTables.Types._EType);
		private static final ExecutorFragment _EType__OclAny = new ExecutorFragment(Types._EType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EType__OclElement = new ExecutorFragment(Types._EType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EType__OclEnumeration = new ExecutorFragment(Types._EType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EType__OclType = new ExecutorFragment(Types._EType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Endpoint__Endpoint = new ExecutorFragment(Types._Endpoint, Security_dslTables.Types._Endpoint);
		private static final ExecutorFragment _Endpoint__OclAny = new ExecutorFragment(Types._Endpoint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Endpoint__OclElement = new ExecutorFragment(Types._Endpoint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _JwtSecurity__JwtSecurity = new ExecutorFragment(Types._JwtSecurity, Security_dslTables.Types._JwtSecurity);
		private static final ExecutorFragment _JwtSecurity__OclAny = new ExecutorFragment(Types._JwtSecurity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _JwtSecurity__OclElement = new ExecutorFragment(Types._JwtSecurity, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _JwtSecurity__Security = new ExecutorFragment(Types._JwtSecurity, Security_dslTables.Types._Security);

		private static final ExecutorFragment _Model__Model = new ExecutorFragment(Types._Model, Security_dslTables.Types._Model);
		private static final ExecutorFragment _Model__OclAny = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Model__OclElement = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _OtherController__Controller = new ExecutorFragment(Types._OtherController, Security_dslTables.Types._Controller);
		private static final ExecutorFragment _OtherController__OclAny = new ExecutorFragment(Types._OtherController, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OtherController__OclElement = new ExecutorFragment(Types._OtherController, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OtherController__OtherController = new ExecutorFragment(Types._OtherController, Security_dslTables.Types._OtherController);

		private static final ExecutorFragment _OtherModel__Model = new ExecutorFragment(Types._OtherModel, Security_dslTables.Types._Model);
		private static final ExecutorFragment _OtherModel__OclAny = new ExecutorFragment(Types._OtherModel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OtherModel__OclElement = new ExecutorFragment(Types._OtherModel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OtherModel__OtherModel = new ExecutorFragment(Types._OtherModel, Security_dslTables.Types._OtherModel);

		private static final ExecutorFragment _Role__Model = new ExecutorFragment(Types._Role, Security_dslTables.Types._Model);
		private static final ExecutorFragment _Role__OclAny = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Role__OclElement = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Role__Role = new ExecutorFragment(Types._Role, Security_dslTables.Types._Role);

		private static final ExecutorFragment _Security__OclAny = new ExecutorFragment(Types._Security, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Security__OclElement = new ExecutorFragment(Types._Security, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Security__Security = new ExecutorFragment(Types._Security, Security_dslTables.Types._Security);

		private static final ExecutorFragment _User__Model = new ExecutorFragment(Types._User, Security_dslTables.Types._Model);
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
		public static final ExecutorProperty _Application__app_models = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__APP_MODELS, Types._Application, 2);
		public static final ExecutorProperty _Application__app_security = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__APP_SECURITY, Types._Application, 3);
		public static final ExecutorProperty _Application__description = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__DESCRIPTION, Types._Application, 4);
		public static final ExecutorProperty _Application__name = new EcoreExecutorProperty(Security_dslPackage.Literals.APPLICATION__NAME, Types._Application, 5);

		public static final ExecutorProperty _Attribute__name = new EcoreExecutorProperty(Security_dslPackage.Literals.ATTRIBUTE__NAME, Types._Attribute, 0);
		public static final ExecutorProperty _Attribute__type = new EcoreExecutorProperty(Security_dslPackage.Literals.ATTRIBUTE__TYPE, Types._Attribute, 1);
		public static final ExecutorProperty _Attribute__Model__model_attributes = new ExecutorPropertyWithImplementation("Model", Types._Attribute, 2, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.MODEL__MODEL_ATTRIBUTES));

		public static final ExecutorProperty _Authentication__login_endpoint = new EcoreExecutorProperty(Security_dslPackage.Literals.AUTHENTICATION__LOGIN_ENDPOINT, Types._Authentication, 0);
		public static final ExecutorProperty _Authentication__logout_endpoint = new EcoreExecutorProperty(Security_dslPackage.Literals.AUTHENTICATION__LOGOUT_ENDPOINT, Types._Authentication, 1);
		public static final ExecutorProperty _Authentication__signup_endpoint = new EcoreExecutorProperty(Security_dslPackage.Literals.AUTHENTICATION__SIGNUP_ENDPOINT, Types._Authentication, 2);

		public static final ExecutorProperty _Claims__isPublic = new EcoreExecutorProperty(Security_dslPackage.Literals.CLAIMS__IS_PUBLIC, Types._Claims, 0);
		public static final ExecutorProperty _Claims__name = new EcoreExecutorProperty(Security_dslPackage.Literals.CLAIMS__NAME, Types._Claims, 1);
		public static final ExecutorProperty _Claims__JwtSecurity__security_claims = new ExecutorPropertyWithImplementation("JwtSecurity", Types._Claims, 2, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.JWT_SECURITY__SECURITY_CLAIMS));

		public static final ExecutorProperty _Controller__controller_endpoints = new EcoreExecutorProperty(Security_dslPackage.Literals.CONTROLLER__CONTROLLER_ENDPOINTS, Types._Controller, 0);
		public static final ExecutorProperty _Controller__name = new EcoreExecutorProperty(Security_dslPackage.Literals.CONTROLLER__NAME, Types._Controller, 1);
		public static final ExecutorProperty _Controller__path = new EcoreExecutorProperty(Security_dslPackage.Literals.CONTROLLER__PATH, Types._Controller, 2);
		public static final ExecutorProperty _Controller__Application__app_controllers = new ExecutorPropertyWithImplementation("Application", Types._Controller, 3, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.APPLICATION__APP_CONTROLLERS));

		public static final ExecutorProperty _Database__password = new EcoreExecutorProperty(Security_dslPackage.Literals.DATABASE__PASSWORD, Types._Database, 0);
		public static final ExecutorProperty _Database__url = new EcoreExecutorProperty(Security_dslPackage.Literals.DATABASE__URL, Types._Database, 1);
		public static final ExecutorProperty _Database__username = new EcoreExecutorProperty(Security_dslPackage.Literals.DATABASE__USERNAME, Types._Database, 2);
		public static final ExecutorProperty _Database__vendorName = new EcoreExecutorProperty(Security_dslPackage.Literals.DATABASE__VENDOR_NAME, Types._Database, 3);
		public static final ExecutorProperty _Database__Application__app_database = new ExecutorPropertyWithImplementation("Application", Types._Database, 4, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.APPLICATION__APP_DATABASE));

		public static final ExecutorProperty _Endpoint__function_name = new EcoreExecutorProperty(Security_dslPackage.Literals.ENDPOINT__FUNCTION_NAME, Types._Endpoint, 0);
		public static final ExecutorProperty _Endpoint__method = new EcoreExecutorProperty(Security_dslPackage.Literals.ENDPOINT__METHOD, Types._Endpoint, 1);
		public static final ExecutorProperty _Endpoint__roles_authority = new EcoreExecutorProperty(Security_dslPackage.Literals.ENDPOINT__ROLES_AUTHORITY, Types._Endpoint, 2);
		public static final ExecutorProperty _Endpoint__url = new EcoreExecutorProperty(Security_dslPackage.Literals.ENDPOINT__URL, Types._Endpoint, 3);
		public static final ExecutorProperty _Endpoint__Authentication__login_endpoint = new ExecutorPropertyWithImplementation("Authentication", Types._Endpoint, 4, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.AUTHENTICATION__LOGIN_ENDPOINT));
		public static final ExecutorProperty _Endpoint__Authentication__logout_endpoint = new ExecutorPropertyWithImplementation("Authentication", Types._Endpoint, 5, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.AUTHENTICATION__LOGOUT_ENDPOINT));
		public static final ExecutorProperty _Endpoint__Authentication__signup_endpoint = new ExecutorPropertyWithImplementation("Authentication", Types._Endpoint, 6, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.AUTHENTICATION__SIGNUP_ENDPOINT));
		public static final ExecutorProperty _Endpoint__Controller__controller_endpoints = new ExecutorPropertyWithImplementation("Controller", Types._Endpoint, 7, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.CONTROLLER__CONTROLLER_ENDPOINTS));

		public static final ExecutorProperty _JwtSecurity__audience = new EcoreExecutorProperty(Security_dslPackage.Literals.JWT_SECURITY__AUDIENCE, Types._JwtSecurity, 0);
		public static final ExecutorProperty _JwtSecurity__expirationTime = new EcoreExecutorProperty(Security_dslPackage.Literals.JWT_SECURITY__EXPIRATION_TIME, Types._JwtSecurity, 1);
		public static final ExecutorProperty _JwtSecurity__issuer = new EcoreExecutorProperty(Security_dslPackage.Literals.JWT_SECURITY__ISSUER, Types._JwtSecurity, 2);
		public static final ExecutorProperty _JwtSecurity__secret = new EcoreExecutorProperty(Security_dslPackage.Literals.JWT_SECURITY__SECRET, Types._JwtSecurity, 3);
		public static final ExecutorProperty _JwtSecurity__security_claims = new EcoreExecutorProperty(Security_dslPackage.Literals.JWT_SECURITY__SECURITY_CLAIMS, Types._JwtSecurity, 4);
		public static final ExecutorProperty _JwtSecurity__signatureAlgorithm = new EcoreExecutorProperty(Security_dslPackage.Literals.JWT_SECURITY__SIGNATURE_ALGORITHM, Types._JwtSecurity, 5);

		public static final ExecutorProperty _Model__identifierName = new EcoreExecutorProperty(Security_dslPackage.Literals.MODEL__IDENTIFIER_NAME, Types._Model, 0);
		public static final ExecutorProperty _Model__identifierType = new EcoreExecutorProperty(Security_dslPackage.Literals.MODEL__IDENTIFIER_TYPE, Types._Model, 1);
		public static final ExecutorProperty _Model__model_attributes = new EcoreExecutorProperty(Security_dslPackage.Literals.MODEL__MODEL_ATTRIBUTES, Types._Model, 2);
		public static final ExecutorProperty _Model__Application__app_models = new ExecutorPropertyWithImplementation("Application", Types._Model, 3, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.APPLICATION__APP_MODELS));

		public static final ExecutorProperty _OtherModel__name = new EcoreExecutorProperty(Security_dslPackage.Literals.OTHER_MODEL__NAME, Types._OtherModel, 0);

		public static final ExecutorProperty _Role__Endpoint__roles_authority = new ExecutorPropertyWithImplementation("Endpoint", Types._Role, 0, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.ENDPOINT__ROLES_AUTHORITY));

		public static final ExecutorProperty _Security__mechanism = new EcoreExecutorProperty(Security_dslPackage.Literals.SECURITY__MECHANISM, Types._Security, 0);
		public static final ExecutorProperty _Security__Application__app_security = new ExecutorPropertyWithImplementation("Application", Types._Security, 1, new EcoreLibraryOppositeProperty(Security_dslPackage.Literals.APPLICATION__APP_SECURITY));
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

		private static final ExecutorFragment /*@NonNull*/ [] _Claims =
			{
				Fragments._Claims__OclAny /* 0 */,
				Fragments._Claims__OclElement /* 1 */,
				Fragments._Claims__Claims /* 2 */
			};
		private static final int /*@NonNull*/ [] __Claims = { 1,1,1 };

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

		private static final ExecutorFragment /*@NonNull*/ [] _ESecurityMechanism =
			{
				Fragments._ESecurityMechanism__OclAny /* 0 */,
				Fragments._ESecurityMechanism__OclElement /* 1 */,
				Fragments._ESecurityMechanism__OclType /* 2 */,
				Fragments._ESecurityMechanism__OclEnumeration /* 3 */,
				Fragments._ESecurityMechanism__ESecurityMechanism /* 4 */
			};
		private static final int /*@NonNull*/ [] __ESecurityMechanism = { 1,1,1,1,1 };

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

		private static final ExecutorFragment /*@NonNull*/ [] _JwtSecurity =
			{
				Fragments._JwtSecurity__OclAny /* 0 */,
				Fragments._JwtSecurity__OclElement /* 1 */,
				Fragments._JwtSecurity__Security /* 2 */,
				Fragments._JwtSecurity__JwtSecurity /* 3 */
			};
		private static final int /*@NonNull*/ [] __JwtSecurity = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Model =
			{
				Fragments._Model__OclAny /* 0 */,
				Fragments._Model__OclElement /* 1 */,
				Fragments._Model__Model /* 2 */
			};
		private static final int /*@NonNull*/ [] __Model = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OtherController =
			{
				Fragments._OtherController__OclAny /* 0 */,
				Fragments._OtherController__OclElement /* 1 */,
				Fragments._OtherController__Controller /* 2 */,
				Fragments._OtherController__OtherController /* 3 */
			};
		private static final int /*@NonNull*/ [] __OtherController = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OtherModel =
			{
				Fragments._OtherModel__OclAny /* 0 */,
				Fragments._OtherModel__OclElement /* 1 */,
				Fragments._OtherModel__Model /* 2 */,
				Fragments._OtherModel__OtherModel /* 3 */
			};
		private static final int /*@NonNull*/ [] __OtherModel = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Role =
			{
				Fragments._Role__OclAny /* 0 */,
				Fragments._Role__OclElement /* 1 */,
				Fragments._Role__Model /* 2 */,
				Fragments._Role__Role /* 3 */
			};
		private static final int /*@NonNull*/ [] __Role = { 1,1,1,1 };

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
				Fragments._User__Model /* 2 */,
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
			Types._Claims.initFragments(_Claims, __Claims);
			Types._Controller.initFragments(_Controller, __Controller);
			Types._Database.initFragments(_Database, __Database);
			Types._EDatabaseType.initFragments(_EDatabaseType, __EDatabaseType);
			Types._EEndpointMethod.initFragments(_EEndpointMethod, __EEndpointMethod);
			Types._ESecurityMechanism.initFragments(_ESecurityMechanism, __ESecurityMechanism);
			Types._EType.initFragments(_EType, __EType);
			Types._Endpoint.initFragments(_Endpoint, __Endpoint);
			Types._JwtSecurity.initFragments(_JwtSecurity, __JwtSecurity);
			Types._Model.initFragments(_Model, __Model);
			Types._OtherController.initFragments(_OtherController, __OtherController);
			Types._OtherModel.initFragments(_OtherModel, __OtherModel);
			Types._Role.initFragments(_Role, __Role);
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

		private static final ExecutorOperation /*@NonNull*/ [] _Claims__Claims = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Claims__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Claims__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _ESecurityMechanism__ESecurityMechanism = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ESecurityMechanism__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ESecurityMechanism__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ESecurityMechanism__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ESecurityMechanism__OclType = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _JwtSecurity__JwtSecurity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _JwtSecurity__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _JwtSecurity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _JwtSecurity__Security = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Model__Model = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Model__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Model__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OtherController__OtherController = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OtherController__Controller = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OtherController__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _OtherController__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OtherModel__OtherModel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OtherModel__Model = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OtherModel__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _OtherModel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Role__Role = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__Model = {};
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
		private static final ExecutorOperation /*@NonNull*/ [] _User__Model = {};
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

			Fragments._Claims__Claims.initOperations(_Claims__Claims);
			Fragments._Claims__OclAny.initOperations(_Claims__OclAny);
			Fragments._Claims__OclElement.initOperations(_Claims__OclElement);

			Fragments._Controller__Controller.initOperations(_Controller__Controller);
			Fragments._Controller__OclAny.initOperations(_Controller__OclAny);
			Fragments._Controller__OclElement.initOperations(_Controller__OclElement);

			Fragments._Database__Database.initOperations(_Database__Database);
			Fragments._Database__OclAny.initOperations(_Database__OclAny);
			Fragments._Database__OclElement.initOperations(_Database__OclElement);

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

			Fragments._ESecurityMechanism__ESecurityMechanism.initOperations(_ESecurityMechanism__ESecurityMechanism);
			Fragments._ESecurityMechanism__OclAny.initOperations(_ESecurityMechanism__OclAny);
			Fragments._ESecurityMechanism__OclElement.initOperations(_ESecurityMechanism__OclElement);
			Fragments._ESecurityMechanism__OclEnumeration.initOperations(_ESecurityMechanism__OclEnumeration);
			Fragments._ESecurityMechanism__OclType.initOperations(_ESecurityMechanism__OclType);

			Fragments._EType__EType.initOperations(_EType__EType);
			Fragments._EType__OclAny.initOperations(_EType__OclAny);
			Fragments._EType__OclElement.initOperations(_EType__OclElement);
			Fragments._EType__OclEnumeration.initOperations(_EType__OclEnumeration);
			Fragments._EType__OclType.initOperations(_EType__OclType);

			Fragments._Endpoint__Endpoint.initOperations(_Endpoint__Endpoint);
			Fragments._Endpoint__OclAny.initOperations(_Endpoint__OclAny);
			Fragments._Endpoint__OclElement.initOperations(_Endpoint__OclElement);

			Fragments._JwtSecurity__JwtSecurity.initOperations(_JwtSecurity__JwtSecurity);
			Fragments._JwtSecurity__OclAny.initOperations(_JwtSecurity__OclAny);
			Fragments._JwtSecurity__OclElement.initOperations(_JwtSecurity__OclElement);
			Fragments._JwtSecurity__Security.initOperations(_JwtSecurity__Security);

			Fragments._Model__Model.initOperations(_Model__Model);
			Fragments._Model__OclAny.initOperations(_Model__OclAny);
			Fragments._Model__OclElement.initOperations(_Model__OclElement);

			Fragments._OtherController__Controller.initOperations(_OtherController__Controller);
			Fragments._OtherController__OclAny.initOperations(_OtherController__OclAny);
			Fragments._OtherController__OclElement.initOperations(_OtherController__OclElement);
			Fragments._OtherController__OtherController.initOperations(_OtherController__OtherController);

			Fragments._OtherModel__Model.initOperations(_OtherModel__Model);
			Fragments._OtherModel__OclAny.initOperations(_OtherModel__OclAny);
			Fragments._OtherModel__OclElement.initOperations(_OtherModel__OclElement);
			Fragments._OtherModel__OtherModel.initOperations(_OtherModel__OtherModel);

			Fragments._Role__Model.initOperations(_Role__Model);
			Fragments._Role__OclAny.initOperations(_Role__OclAny);
			Fragments._Role__OclElement.initOperations(_Role__OclElement);
			Fragments._Role__Role.initOperations(_Role__Role);

			Fragments._Security__OclAny.initOperations(_Security__OclAny);
			Fragments._Security__OclElement.initOperations(_Security__OclElement);
			Fragments._Security__Security.initOperations(_Security__Security);

			Fragments._User__Model.initOperations(_User__Model);
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
			Security_dslTables.Properties._Application__app_models,
			Security_dslTables.Properties._Application__app_security,
			Security_dslTables.Properties._Application__description,
			Security_dslTables.Properties._Application__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Attribute = {
			Security_dslTables.Properties._Attribute__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Attribute__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Authentication = {
			Security_dslTables.Properties._Controller__controller_endpoints,
			Security_dslTables.Properties._Authentication__login_endpoint,
			Security_dslTables.Properties._Authentication__logout_endpoint,
			Security_dslTables.Properties._Controller__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Controller__path,
			Security_dslTables.Properties._Authentication__signup_endpoint
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Claims = {
			Security_dslTables.Properties._Claims__isPublic,
			Security_dslTables.Properties._Claims__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
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

		private static final ExecutorProperty /*@NonNull*/ [] _EDatabaseType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EEndpointMethod = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ESecurityMechanism = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Endpoint = {
			Security_dslTables.Properties._Endpoint__function_name,
			Security_dslTables.Properties._Endpoint__method,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Endpoint__roles_authority,
			Security_dslTables.Properties._Endpoint__url
		};

		private static final ExecutorProperty /*@NonNull*/ [] _JwtSecurity = {
			Security_dslTables.Properties._JwtSecurity__audience,
			Security_dslTables.Properties._JwtSecurity__expirationTime,
			Security_dslTables.Properties._JwtSecurity__issuer,
			Security_dslTables.Properties._Security__mechanism,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._JwtSecurity__secret,
			Security_dslTables.Properties._JwtSecurity__security_claims,
			Security_dslTables.Properties._JwtSecurity__signatureAlgorithm
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Model = {
			Security_dslTables.Properties._Model__identifierName,
			Security_dslTables.Properties._Model__identifierType,
			Security_dslTables.Properties._Model__model_attributes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OtherController = {
			Security_dslTables.Properties._Controller__controller_endpoints,
			Security_dslTables.Properties._Controller__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Security_dslTables.Properties._Controller__path
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OtherModel = {
			Security_dslTables.Properties._Model__identifierName,
			Security_dslTables.Properties._Model__identifierType,
			Security_dslTables.Properties._Model__model_attributes,
			Security_dslTables.Properties._OtherModel__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Role = {
			Security_dslTables.Properties._Model__identifierName,
			Security_dslTables.Properties._Model__identifierType,
			Security_dslTables.Properties._Model__model_attributes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Security = {
			Security_dslTables.Properties._Security__mechanism,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _User = {
			Security_dslTables.Properties._Model__identifierName,
			Security_dslTables.Properties._Model__identifierType,
			Security_dslTables.Properties._Model__model_attributes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Application__Application.initProperties(_Application);
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._Authentication__Authentication.initProperties(_Authentication);
			Fragments._Claims__Claims.initProperties(_Claims);
			Fragments._Controller__Controller.initProperties(_Controller);
			Fragments._Database__Database.initProperties(_Database);
			Fragments._EDatabaseType__EDatabaseType.initProperties(_EDatabaseType);
			Fragments._EEndpointMethod__EEndpointMethod.initProperties(_EEndpointMethod);
			Fragments._ESecurityMechanism__ESecurityMechanism.initProperties(_ESecurityMechanism);
			Fragments._EType__EType.initProperties(_EType);
			Fragments._Endpoint__Endpoint.initProperties(_Endpoint);
			Fragments._JwtSecurity__JwtSecurity.initProperties(_JwtSecurity);
			Fragments._Model__Model.initProperties(_Model);
			Fragments._OtherController__OtherController.initProperties(_OtherController);
			Fragments._OtherModel__OtherModel.initProperties(_OtherModel);
			Fragments._Role__Role.initProperties(_Role);
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

		public static final EcoreExecutorEnumerationLiteral _EDatabaseType__POSTGRES = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EDATABASE_TYPE.getEEnumLiteral("POSTGRES"), Types._EDatabaseType, 0);
		public static final EcoreExecutorEnumerationLiteral _EDatabaseType__ORACLE = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EDATABASE_TYPE.getEEnumLiteral("ORACLE"), Types._EDatabaseType, 1);
		public static final EcoreExecutorEnumerationLiteral _EDatabaseType__MYSQL = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EDATABASE_TYPE.getEEnumLiteral("MYSQL"), Types._EDatabaseType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EDatabaseType = {
			_EDatabaseType__POSTGRES,
			_EDatabaseType__ORACLE,
			_EDatabaseType__MYSQL
		};

		public static final EcoreExecutorEnumerationLiteral _EEndpointMethod__GET = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EENDPOINT_METHOD.getEEnumLiteral("GET"), Types._EEndpointMethod, 0);
		public static final EcoreExecutorEnumerationLiteral _EEndpointMethod__PUT = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EENDPOINT_METHOD.getEEnumLiteral("PUT"), Types._EEndpointMethod, 1);
		public static final EcoreExecutorEnumerationLiteral _EEndpointMethod__POST = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EENDPOINT_METHOD.getEEnumLiteral("POST"), Types._EEndpointMethod, 2);
		public static final EcoreExecutorEnumerationLiteral _EEndpointMethod__DELETE = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.EENDPOINT_METHOD.getEEnumLiteral("DELETE"), Types._EEndpointMethod, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EEndpointMethod = {
			_EEndpointMethod__GET,
			_EEndpointMethod__PUT,
			_EEndpointMethod__POST,
			_EEndpointMethod__DELETE
		};

		public static final EcoreExecutorEnumerationLiteral _ESecurityMechanism__JWT = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ESECURITY_MECHANISM.getEEnumLiteral("JWT"), Types._ESecurityMechanism, 0);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ESecurityMechanism = {
			_ESecurityMechanism__JWT
		};

		public static final EcoreExecutorEnumerationLiteral _EType__INT = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("INT"), Types._EType, 0);
		public static final EcoreExecutorEnumerationLiteral _EType__STRING = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("STRING"), Types._EType, 1);
		public static final EcoreExecutorEnumerationLiteral _EType__FLOAT = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("FLOAT"), Types._EType, 2);
		public static final EcoreExecutorEnumerationLiteral _EType__LONG = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("LONG"), Types._EType, 3);
		public static final EcoreExecutorEnumerationLiteral _EType__CHAR = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("CHAR"), Types._EType, 4);
		public static final EcoreExecutorEnumerationLiteral _EType__BOOLEAN = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("BOOLEAN"), Types._EType, 5);
		public static final EcoreExecutorEnumerationLiteral _EType__DOUBLE = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("DOUBLE"), Types._EType, 6);
		public static final EcoreExecutorEnumerationLiteral _EType__BYTE = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("BYTE"), Types._EType, 7);
		public static final EcoreExecutorEnumerationLiteral _EType__SHORT = new EcoreExecutorEnumerationLiteral(Security_dslPackage.Literals.ETYPE.getEEnumLiteral("SHORT"), Types._EType, 8);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EType = {
			_EType__INT,
			_EType__STRING,
			_EType__FLOAT,
			_EType__LONG,
			_EType__CHAR,
			_EType__BOOLEAN,
			_EType__DOUBLE,
			_EType__BYTE,
			_EType__SHORT
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._EDatabaseType.initLiterals(_EDatabaseType);
			Types._EEndpointMethod.initLiterals(_EEndpointMethod);
			Types._ESecurityMechanism.initLiterals(_ESecurityMechanism);
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
}
