/**
 */
package security_dsl.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import security_dsl.Authentication;
import security_dsl.Controller;
import security_dsl.EEndpointType;
import security_dsl.Endpoint;
import security_dsl.Entity;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AuthenticationImpl extends ControllerImpl implements Authentication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasUserAndRoleForController(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Authentication::hasUserAndRoleForController";
		try {
			/**
			 *
			 * inv hasUserAndRoleForController:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Entity.allInstances()
			 *           ->exists(e | e.oclIsTypeOf(User)) and
			 *           Entity.allInstances()
			 *           ->exists(e | e.oclIsTypeOf(Role))
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Authentication controller requires at least one User entity and one Role entity!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.AUTHENTICATION___HAS_USER_AND_ROLE_FOR_CONTROLLER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Entity_1 = idResolver
							.getClass(Security_dslTables.CLSSid_Entity, null);
					final /*@NonInvalid*/ SetValue allInstances_0 = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, Security_dslTables.SET_CLSSid_Entity, TYP_security_dsl_c_c_Entity_1);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_e_0 = allInstances_0.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_e_0.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Entity e_0 = (Entity) ITERATOR_e_0.next();
						/**
						 * e.oclIsTypeOf(User)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_User_0 = idResolver
								.getClass(Security_dslTables.CLSSid_User, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
								.evaluate(executor, e_0, TYP_security_dsl_c_c_User_0).booleanValue();
						//
						if (oclIsTypeOf) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!oclIsTypeOf) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ Boolean status;
					if (exists == ValueUtil.FALSE_VALUE) {
						status = ValueUtil.FALSE_VALUE;
					} else {
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_e_1 = allInstances_0.iterator();
						/*@NonInvalid*/ Boolean exists_0;
						while (true) {
							if (!ITERATOR_e_1.hasNext()) {
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists_0 = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ Entity e_1 = (Entity) ITERATOR_e_1.next();
							/**
							 * e.oclIsTypeOf(Role)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Role_0 = idResolver
									.getClass(Security_dslTables.CLSSid_Role, null);
							final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE
									.evaluate(executor, e_1, TYP_security_dsl_c_c_Role_0).booleanValue();
							//
							if (oclIsTypeOf_0) { // Normal successful body evaluation result
								exists_0 = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!oclIsTypeOf_0) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						if (exists_0 == ValueUtil.FALSE_VALUE) {
							status = ValueUtil.FALSE_VALUE;
						} else {
							if ((exists == null) || (exists_0 == null)) {
								status = null;
							} else {
								status = ValueUtil.TRUE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Authentication_32_controller_32_requires_32_at_32_least_32_one_32_User_32_entity_32_and_32,
								status);
						local_1 = local_0;
					}
					CAUGHT_local_1 = local_1;
				} catch (Exception e) {
					CAUGHT_local_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_1, Security_dslTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean authenticationLimits(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Authentication::authenticationLimits";
		try {
			/**
			 *
			 * inv authenticationLimits:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.controller_endpoints->select(e |
			 *             (e.type = EEndpointType::REGISTRATION
			 *             ))
			 *           ->size() <= 1 and
			 *           self.controller_endpoints->select(e | (e.type = EEndpointType::LOGIN))
			 *           ->size() <= 1 and
			 *           self.controller_endpoints->select(e | (e.type = EEndpointType::LOGOUT))
			 *           ->size() <= 1
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Authentication can have at most one registration, login, and logout endpoint!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.AUTHENTICATION___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ List<Endpoint> controller_endpoints_1 = this.getController_endpoints();
					final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints_1 = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Endpoint, controller_endpoints_1);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Endpoint);
					Iterator<Object> ITERATOR_e_0 = BOXED_controller_endpoints_1.iterator();
					/*@NonInvalid*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_e_0.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Endpoint e_0 = (Endpoint) ITERATOR_e_0.next();
						/**
						 * e.type = EEndpointType::REGISTRATION
						 */
						final /*@NonInvalid*/ EEndpointType type = e_0.getType();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EEndpointType
								.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
						final /*@NonInvalid*/ boolean eq = BOXED_type == Security_dslTables.ELITid_REGISTRATION;
						//
						if (eq) {
							accumulator.add(e_0);
						}
					}
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
							.evaluate(executor, size, Security_dslTables.INT_1).booleanValue();
					final /*@NonInvalid*/ Boolean and;
					if (!le_0) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						/*@Thrown*/ Accumulator accumulator_0 = ValueUtil
								.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Endpoint);
						Iterator<Object> ITERATOR_e_1 = BOXED_controller_endpoints_1.iterator();
						/*@NonInvalid*/ OrderedSetValue select_0;
						while (true) {
							if (!ITERATOR_e_1.hasNext()) {
								select_0 = accumulator_0;
								break;
							}
							/*@NonInvalid*/ Endpoint e_1 = (Endpoint) ITERATOR_e_1.next();
							/**
							 * e.type = EEndpointType::LOGIN
							 */
							final /*@NonInvalid*/ EEndpointType type_0 = e_1.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = Security_dslTables.ENUMid_EEndpointType
									.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
							final /*@NonInvalid*/ boolean eq_0 = BOXED_type_0 == Security_dslTables.ELITid_LOGIN;
							//
							if (eq_0) {
								accumulator_0.add(e_1);
							}
						}
						final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(select_0);
						final /*@NonInvalid*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE
								.evaluate(executor, size_0, Security_dslTables.INT_1).booleanValue();
						if (!le_1) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							and = ValueUtil.TRUE_VALUE;
						}
					}
					final /*@Thrown*/ Boolean status;
					if (and == ValueUtil.FALSE_VALUE) {
						status = ValueUtil.FALSE_VALUE;
					} else {
						/*@Thrown*/ Accumulator accumulator_1 = ValueUtil
								.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Endpoint);
						Iterator<Object> ITERATOR_e_2 = BOXED_controller_endpoints_1.iterator();
						/*@NonInvalid*/ OrderedSetValue select_1;
						while (true) {
							if (!ITERATOR_e_2.hasNext()) {
								select_1 = accumulator_1;
								break;
							}
							/*@NonInvalid*/ Endpoint e_2 = (Endpoint) ITERATOR_e_2.next();
							/**
							 * e.type = EEndpointType::LOGOUT
							 */
							final /*@NonInvalid*/ EEndpointType type_1 = e_2.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_1 = Security_dslTables.ENUMid_EEndpointType
									.getEnumerationLiteralId(ClassUtil.nonNullState(type_1.getName()));
							final /*@NonInvalid*/ boolean eq_1 = BOXED_type_1 == Security_dslTables.ELITid_LOGOUT;
							//
							if (eq_1) {
								accumulator_1.add(e_2);
							}
						}
						final /*@NonInvalid*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE.evaluate(select_1);
						final /*@NonInvalid*/ boolean le_2 = OclComparableLessThanEqualOperation.INSTANCE
								.evaluate(executor, size_1, Security_dslTables.INT_1).booleanValue();
						if (!le_2) {
							status = ValueUtil.FALSE_VALUE;
						} else {
							if (and == null) {
								status = null;
							} else {
								status = ValueUtil.TRUE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq_2 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_2) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Authentication_32_can_32_have_32_at_32_most_32_one_32_registration_44_32_login_44_32_and_32_log,
								status);
						local_1 = local_0;
					}
					CAUGHT_local_1 = local_1;
				} catch (Exception e) {
					CAUGHT_local_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_1, Security_dslTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueAuthenticationController(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Authentication::uniqueAuthenticationController";
		try {
			/**
			 *
			 * inv uniqueAuthenticationController:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = Controller.allInstances()
			 *           ->select(c | c.oclIsTypeOf(Authentication))
			 *           ->size() <= 1
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'There can be at most one controller of type "Authentication" in the model!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.AUTHENTICATION___UNIQUE_AUTHENTICATION_CONTROLLER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Controller_0 = idResolver
						.getClass(Security_dslTables.CLSSid_Controller, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
						executor, Security_dslTables.SET_CLSSid_Controller, TYP_security_dsl_c_c_Controller_0);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Controller);
				Iterator<Object> ITERATOR_c = allInstances.iterator();
				/*@NonInvalid*/ SetValue select;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Controller c = (Controller) ITERATOR_c.next();
					/**
					 * c.oclIsTypeOf(Authentication)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Authentication_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Authentication, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, c, TYP_security_dsl_c_c_Authentication_0).booleanValue();
					//
					if (oclIsTypeOf) {
						accumulator.add(c);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean status = OclComparableLessThanEqualOperation.INSTANCE
						.evaluate(executor, size, Security_dslTables.INT_1).booleanValue();
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
							Security_dslTables.STR_There_32_can_32_be_32_at_32_most_32_one_32_controller_32_of_32_type_32_34_Authentication_34_32_in_32,
							status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, Security_dslTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean loginExistanceForLogout(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Authentication::loginExistanceForLogout";
		try {
			/**
			 *
			 * inv loginExistanceForLogout:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.controller_endpoints->select(e | e.type = EEndpointType::LOGOUT)
			 *           ->size() = 1 implies
			 *           self.controller_endpoints->select(e | e.type = EEndpointType::LOGIN)
			 *           ->size() = 1
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Logout endpoint requires a corresponding login endpoint!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.AUTHENTICATION___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ List<Endpoint> controller_endpoints_0 = this.getController_endpoints();
				final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints_0 = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Endpoint, controller_endpoints_0);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Endpoint);
				Iterator<Object> ITERATOR_e_0 = BOXED_controller_endpoints_0.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Endpoint e_0 = (Endpoint) ITERATOR_e_0.next();
					/**
					 * e.type = EEndpointType::LOGOUT
					 */
					final /*@NonInvalid*/ EEndpointType type = e_0.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EEndpointType
							.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_type == Security_dslTables.ELITid_LOGOUT;
					//
					if (eq) {
						accumulator.add(e_0);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean eq_0 = size.equals(Security_dslTables.INT_1);
				final /*@NonInvalid*/ Boolean status;
				if (!eq_0) {
					status = ValueUtil.TRUE_VALUE;
				} else {
					/*@Thrown*/ Accumulator accumulator_0 = ValueUtil
							.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Endpoint);
					Iterator<Object> ITERATOR_e_1 = BOXED_controller_endpoints_0.iterator();
					/*@NonInvalid*/ OrderedSetValue select_0;
					while (true) {
						if (!ITERATOR_e_1.hasNext()) {
							select_0 = accumulator_0;
							break;
						}
						/*@NonInvalid*/ Endpoint e_1 = (Endpoint) ITERATOR_e_1.next();
						/**
						 * e.type = EEndpointType::LOGIN
						 */
						final /*@NonInvalid*/ EEndpointType type_0 = e_1.getType();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = Security_dslTables.ENUMid_EEndpointType
								.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
						final /*@NonInvalid*/ boolean eq_1 = BOXED_type_0 == Security_dslTables.ELITid_LOGIN;
						//
						if (eq_1) {
							accumulator_0.add(e_1);
						}
					}
					final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(select_0);
					final /*@NonInvalid*/ boolean eq_2 = size_0.equals(Security_dslTables.INT_1);
					if (eq_2) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						status = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean eq_3 = status == Boolean.TRUE;
				/*@NonInvalid*/ Object local_1;
				if (eq_3) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
							Security_dslTables.STR_Logout_32_endpoint_32_requires_32_a_32_corresponding_32_login_32_endpoint_33,
							status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, Security_dslTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Security_dslPackage.AUTHENTICATION___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP:
			return authenticationLimits((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.AUTHENTICATION___UNIQUE_AUTHENTICATION_CONTROLLER__DIAGNOSTICCHAIN_MAP:
			return uniqueAuthenticationController((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.AUTHENTICATION___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP:
			return loginExistanceForLogout((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.AUTHENTICATION___HAS_USER_AND_ROLE_FOR_CONTROLLER__DIAGNOSTICCHAIN_MAP:
			return hasUserAndRoleForController((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AuthenticationImpl
