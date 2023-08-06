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
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;
import org.eclipse.ocl.pivot.values.TupleValue;
import security_dsl.Authentication;
import security_dsl.EEndpointType;
import security_dsl.Endpoint;
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
		case Security_dslPackage.AUTHENTICATION___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP:
			return loginExistanceForLogout((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.AUTHENTICATION___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP:
			return authenticationLimits((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AuthenticationImpl
