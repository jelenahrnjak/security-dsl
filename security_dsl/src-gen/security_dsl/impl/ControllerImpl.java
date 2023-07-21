/**
 */
package security_dsl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringAtOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import org.eclipse.ocl.pivot.values.SetValue;

import security_dsl.Controller;
import security_dsl.EEndpointMethod;
import security_dsl.EEndpointType;
import security_dsl.Endpoint;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.ControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.impl.ControllerImpl#getPath <em>Path</em>}</li>
 *   <li>{@link security_dsl.impl.ControllerImpl#getController_endpoints <em>Controller endpoints</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControllerImpl extends MinimalEObjectImpl.Container implements Controller {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getController_endpoints() <em>Controller endpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController_endpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Endpoint> controller_endpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.CONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.CONTROLLER__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Endpoint> getController_endpoints() {
		if (controller_endpoints == null) {
			controller_endpoints = new EObjectContainmentEList<Endpoint>(Endpoint.class, this,
					Security_dslPackage.CONTROLLER__CONTROLLER_ENDPOINTS);
		}
		return controller_endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean methodAllowedRegistration(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Controller::methodAllowedRegistration";
		try {
			/**
			 *
			 * inv methodAllowedRegistration:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.controller_endpoints->select(e |
			 *           (e.type = EEndpointType::REGISTRATION and
			 *             (e.method = EEndpointMethod::POST or e.method->isEmpty()
			 *             )
			 *           ))
			 *         ->size() <= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___METHOD_ALLOWED_REGISTRATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Endpoint> controller_endpoints = this.getController_endpoints();
					final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Endpoint, controller_endpoints);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Endpoint);
					Iterator<Object> ITERATOR_e_0 = BOXED_controller_endpoints.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_e_0.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Endpoint e_0 = (Endpoint) ITERATOR_e_0.next();
						/**
						 * e.type = EEndpointType::REGISTRATION and
						 * (e.method = EEndpointMethod::POST or e.method->isEmpty()
						 * )
						 */
						final /*@NonInvalid*/ EEndpointType type = e_0.getType();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null
								: Security_dslTables.ENUMid_EEndpointType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
						final /*@NonInvalid*/ boolean eq = BOXED_type == Security_dslTables.ELITid_REGISTRATION;
						final /*@Thrown*/ Boolean and;
						if (!eq) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_or;
							try {
								final /*@NonInvalid*/ EEndpointMethod method = e_0.getMethod();
								final /*@NonInvalid*/ EnumerationLiteralId BOXED_method = method == null ? null
										: Security_dslTables.ENUMid_EEndpointMethod
												.getEnumerationLiteralId(ClassUtil.nonNullState(method.getName()));
								final /*@NonInvalid*/ boolean eq_0 = BOXED_method == Security_dslTables.ELITid_POST;
								final /*@Thrown*/ Boolean or;
								if (eq_0) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_isEmpty;
									try {
										final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(
												executor, Security_dslTables.SET_ENUMid_EEndpointMethod, BOXED_method);
										final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
												.evaluate(oclAsSet).booleanValue();
										CAUGHT_isEmpty = isEmpty;
									} catch (Exception e) {
										CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_isEmpty == ValueUtil.TRUE_VALUE) {
										or = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_isEmpty instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_isEmpty;
										}
										or = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_or = or;
							} catch (Exception e) {
								CAUGHT_or = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_or == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_or instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_or;
								}
								if (CAUGHT_or == null) {
									and = null;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						if (and == null) {
							throw new InvalidValueException(
									"Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
						}
						//
						if (and == ValueUtil.TRUE_VALUE) {
							accumulator.add(e_0);
						}
					}
					final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@Thrown*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE
							.evaluate(executor, size, Security_dslTables.INT_1).booleanValue();
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Security_dslTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean endpointLimits(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Controller::endpointLimits";
		try {
			/**
			 *
			 * inv endpointLimits:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.oclIsTypeOf(Authentication) implies
			 *         self.controller_endpoints->select(e | e.type = EEndpointType::REGISTRATION)
			 *         ->isEmpty() and
			 *         self.controller_endpoints->select(e | e.type = EEndpointType::LOGIN)
			 *         ->isEmpty() and
			 *         self.controller_endpoints->select(e | e.type = EEndpointType::LOGOUT)
			 *         ->isEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Authentication_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Authentication, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, this, TYP_security_dsl_c_c_Authentication_0).booleanValue();
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsTypeOf) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsTypeOf) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (not == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							final /*@NonInvalid*/ List<Endpoint> controller_endpoints_1 = this
									.getController_endpoints();
							final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints_1 = idResolver
									.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Endpoint,
											controller_endpoints_1);
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
								final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null
										: Security_dslTables.ENUMid_EEndpointType
												.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
								final /*@NonInvalid*/ boolean eq = BOXED_type == Security_dslTables.ELITid_REGISTRATION;
								//
								if (eq) {
									accumulator.add(e_0);
								}
							}
							final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(select)
									.booleanValue();
							final /*@NonInvalid*/ Boolean and;
							if (!isEmpty) {
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
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = type_0 == null ? null
											: Security_dslTables.ENUMid_EEndpointType
													.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
									final /*@NonInvalid*/ boolean eq_0 = BOXED_type_0 == Security_dslTables.ELITid_LOGIN;
									//
									if (eq_0) {
										accumulator_0.add(e_1);
									}
								}
								final /*@NonInvalid*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE
										.evaluate(select_0).booleanValue();
								if (!isEmpty_0) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							final /*@Thrown*/ Boolean and_0;
							if (and == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
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
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_1 = type_1 == null ? null
											: Security_dslTables.ENUMid_EEndpointType
													.getEnumerationLiteralId(ClassUtil.nonNullState(type_1.getName()));
									final /*@NonInvalid*/ boolean eq_1 = BOXED_type_1 == Security_dslTables.ELITid_LOGOUT;
									//
									if (eq_1) {
										accumulator_1.add(e_2);
									}
								}
								final /*@NonInvalid*/ boolean isEmpty_1 = CollectionIsEmptyOperation.INSTANCE
										.evaluate(select_1).booleanValue();
								if (!isEmpty_1) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									if (and == null) {
										and_0 = null;
									} else {
										and_0 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_0 = and_0;
						} catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_0;
							}
							if ((not == null) || (CAUGHT_and_0 == null)) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Security_dslTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean methodAllowedLogin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Controller::methodAllowedLogin";
		try {
			/**
			 *
			 * inv methodAllowedLogin:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.controller_endpoints->select(e |
			 *           (e.type = EEndpointType::LOGIN and
			 *             (e.method = EEndpointMethod::PUT or e.method = EEndpointMethod::DELETE
			 *             )
			 *           ))
			 *         ->size() = 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___METHOD_ALLOWED_LOGIN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Endpoint> controller_endpoints = this.getController_endpoints();
					final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Endpoint, controller_endpoints);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Endpoint);
					Iterator<Object> ITERATOR_e_0 = BOXED_controller_endpoints.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_e_0.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Endpoint e_0 = (Endpoint) ITERATOR_e_0.next();
						/**
						 * e.type = EEndpointType::LOGIN and
						 * (e.method = EEndpointMethod::PUT or e.method = EEndpointMethod::DELETE
						 * )
						 */
						final /*@NonInvalid*/ EEndpointMethod method_0 = e_0.getMethod();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_method_0 = method_0 == null ? null
								: Security_dslTables.ENUMid_EEndpointMethod
										.getEnumerationLiteralId(ClassUtil.nonNullState(method_0.getName()));
						final /*@NonInvalid*/ EEndpointType type = e_0.getType();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null
								: Security_dslTables.ENUMid_EEndpointType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
						final /*@NonInvalid*/ boolean eq = BOXED_type == Security_dslTables.ELITid_LOGIN;
						final /*@Thrown*/ Boolean and;
						if (!eq) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean eq_0 = BOXED_method_0 == Security_dslTables.ELITid_PUT;
							final /*@NonInvalid*/ Boolean or;
							if (eq_0) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean eq_1 = BOXED_method_0 == Security_dslTables.ELITid_DELETE;
								if (eq_1) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
							if (or == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (or == null) {
									and = null;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						if (and == null) {
							throw new InvalidValueException(
									"Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
						}
						//
						if (and == ValueUtil.TRUE_VALUE) {
							accumulator.add(e_0);
						}
					}
					final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@Thrown*/ boolean result = size.equals(Security_dslTables.INT_0);
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Security_dslTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean methodAllowedLogout(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Controller::methodAllowedLogout";
		try {
			/**
			 *
			 * inv methodAllowedLogout:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.controller_endpoints->select(e |
			 *           (e.type = EEndpointType::LOGOUT and
			 *             (e.method = EEndpointMethod::PUT or e.method = EEndpointMethod::DELETE
			 *             )
			 *           ))
			 *         ->size() = 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___METHOD_ALLOWED_LOGOUT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Endpoint> controller_endpoints = this.getController_endpoints();
					final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Endpoint, controller_endpoints);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Endpoint);
					Iterator<Object> ITERATOR_e_0 = BOXED_controller_endpoints.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_e_0.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Endpoint e_0 = (Endpoint) ITERATOR_e_0.next();
						/**
						 * e.type = EEndpointType::LOGOUT and
						 * (e.method = EEndpointMethod::PUT or e.method = EEndpointMethod::DELETE
						 * )
						 */
						final /*@NonInvalid*/ EEndpointMethod method_0 = e_0.getMethod();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_method_0 = method_0 == null ? null
								: Security_dslTables.ENUMid_EEndpointMethod
										.getEnumerationLiteralId(ClassUtil.nonNullState(method_0.getName()));
						final /*@NonInvalid*/ EEndpointType type = e_0.getType();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null
								: Security_dslTables.ENUMid_EEndpointType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
						final /*@NonInvalid*/ boolean eq = BOXED_type == Security_dslTables.ELITid_LOGOUT;
						final /*@Thrown*/ Boolean and;
						if (!eq) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean eq_0 = BOXED_method_0 == Security_dslTables.ELITid_PUT;
							final /*@NonInvalid*/ Boolean or;
							if (eq_0) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean eq_1 = BOXED_method_0 == Security_dslTables.ELITid_DELETE;
								if (eq_1) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
							if (or == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (or == null) {
									and = null;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						if (and == null) {
							throw new InvalidValueException(
									"Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
						}
						//
						if (and == ValueUtil.TRUE_VALUE) {
							accumulator.add(e_0);
						}
					}
					final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@Thrown*/ boolean result = size.equals(Security_dslTables.INT_0);
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Security_dslTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
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
		final String constraintName = "Controller::loginExistanceForLogout";
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
			 *         result : Boolean[?] = self.controller_endpoints->select(e | e.type = EEndpointType::LOGOUT)
			 *         ->size() = 1 implies
			 *         self.controller_endpoints->select(e | e.type = EEndpointType::LOGIN)
			 *         ->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
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
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null
							: Security_dslTables.ENUMid_EEndpointType
									.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_type == Security_dslTables.ELITid_LOGOUT;
					//
					if (eq) {
						accumulator.add(e_0);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean eq_0 = size.equals(Security_dslTables.INT_1);
				final /*@NonInvalid*/ Boolean result;
				if (!eq_0) {
					result = ValueUtil.TRUE_VALUE;
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
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = type_0 == null ? null
								: Security_dslTables.ENUMid_EEndpointType
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
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, Security_dslTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
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
		final String constraintName = "Controller::authenticationLimits";
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
			 *         result : Boolean[?] = self.oclIsTypeOf(Authentication) implies
			 *         self.controller_endpoints->select(e | (e.type = EEndpointType::REGISTRATION))
			 *         ->size() <= 1 and
			 *         self.controller_endpoints->select(e | (e.type = EEndpointType::LOGIN))
			 *         ->size() <= 1 and
			 *         self.controller_endpoints->select(e | (e.type = EEndpointType::LOGOUT))
			 *         ->size() <= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Authentication = idResolver
							.getClass(Security_dslTables.CLSSid_Authentication, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, this, TYP_security_dsl_c_c_Authentication).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (!oclIsTypeOf) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							final /*@NonInvalid*/ List<Endpoint> controller_endpoints_1 = this
									.getController_endpoints();
							final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints_1 = idResolver
									.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Endpoint,
											controller_endpoints_1);
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
								final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null
										: Security_dslTables.ENUMid_EEndpointType
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
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = type_0 == null ? null
											: Security_dslTables.ENUMid_EEndpointType
													.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
									final /*@NonInvalid*/ boolean eq_0 = BOXED_type_0 == Security_dslTables.ELITid_LOGIN;
									//
									if (eq_0) {
										accumulator_0.add(e_1);
									}
								}
								final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
										.evaluate(select_0);
								final /*@NonInvalid*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE
										.evaluate(executor, size_0, Security_dslTables.INT_1).booleanValue();
								if (!le_1) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							final /*@Thrown*/ Boolean and_0;
							if (and == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
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
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_1 = type_1 == null ? null
											: Security_dslTables.ENUMid_EEndpointType
													.getEnumerationLiteralId(ClassUtil.nonNullState(type_1.getName()));
									final /*@NonInvalid*/ boolean eq_1 = BOXED_type_1 == Security_dslTables.ELITid_LOGOUT;
									//
									if (eq_1) {
										accumulator_1.add(e_2);
									}
								}
								final /*@NonInvalid*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE
										.evaluate(select_1);
								final /*@NonInvalid*/ boolean le_2 = OclComparableLessThanEqualOperation.INSTANCE
										.evaluate(executor, size_1, Security_dslTables.INT_1).booleanValue();
								if (!le_2) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									if (and == null) {
										and_0 = null;
									} else {
										and_0 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_0 = and_0;
						} catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_0;
							}
							if (CAUGHT_and_0 == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Security_dslTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean urlStartsWithForwardSlash(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Controller::urlStartsWithForwardSlash";
		try {
			/**
			 *
			 * inv urlStartsWithForwardSlash:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.controller_endpoints->forAll(e |
			 *           e.url.at(1) = '/')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Endpoint> controller_endpoints = this.getController_endpoints();
					final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Endpoint, controller_endpoints);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_e_0 = BOXED_controller_endpoints.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_e_0.hasNext()) {
							if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Endpoint e_0 = (Endpoint) ITERATOR_e_0.next();
						/**
						 * e.url.at(1) = '/'
						 */
						/*@Caught*/ Object CAUGHT_eq;
						try {
							final /*@NonInvalid*/ String url = e_0.getUrl();
							final /*@Thrown*/ String at = StringAtOperation.INSTANCE.evaluate(url,
									Security_dslTables.INT_1);
							final /*@Thrown*/ boolean eq = at.equals(Security_dslTables.STR_quot);
							CAUGHT_eq = eq;
						} catch (Exception e) {
							CAUGHT_eq = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_eq == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_eq == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_eq instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_eq; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Security_dslTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueEndpoints(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Controller::uniqueEndpoints";
		try {
			/**
			 *
			 * inv uniqueEndpoints:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.controller_endpoints->isUnique(e | e.functionName) and
			 *         self.controller_endpoints->isUnique(e | e.url)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Endpoint> controller_endpoints_0 = this.getController_endpoints();
					final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints_0 = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Endpoint, controller_endpoints_0);
					/*@Caught*/ Object CAUGHT_isUnique;
					try {
						/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil
								.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Endpoint);
						Iterator<Object> ITERATOR_e_0 = BOXED_controller_endpoints_0.iterator();
						/*@Thrown*/ boolean isUnique;
						while (true) {
							if (!ITERATOR_e_0.hasNext()) {
								isUnique = true;
								break;
							}
							/*@NonInvalid*/ Endpoint e_0 = (Endpoint) ITERATOR_e_0.next();
							/**
							 * e.functionName
							 */
							final /*@NonInvalid*/ String functionName = e_0.getFunctionName();
							//
							if (accumulator.includes(functionName) == ValueUtil.TRUE_VALUE) {
								isUnique = false;
								break; // Abort after second find
							} else {
								accumulator.add(functionName);
							}
						}
						CAUGHT_isUnique = isUnique;
					} catch (Exception e) {
						CAUGHT_isUnique = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_isUnique == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil
								.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Endpoint);
						Iterator<Object> ITERATOR_e_1 = BOXED_controller_endpoints_0.iterator();
						/*@NonInvalid*/ boolean isUnique_0;
						while (true) {
							if (!ITERATOR_e_1.hasNext()) {
								isUnique_0 = true;
								break;
							}
							/*@NonInvalid*/ Endpoint e_1 = (Endpoint) ITERATOR_e_1.next();
							/**
							 * e.url
							 */
							final /*@NonInvalid*/ String url = e_1.getUrl();
							//
							if (accumulator_0.includes(url) == ValueUtil.TRUE_VALUE) {
								isUnique_0 = false;
								break; // Abort after second find
							} else {
								accumulator_0.add(url);
							}
						}
						if (!isUnique_0) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_isUnique instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_isUnique;
							}
							result = ValueUtil.TRUE_VALUE;
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Security_dslTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Security_dslPackage.CONTROLLER__CONTROLLER_ENDPOINTS:
			return ((InternalEList<?>) getController_endpoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Security_dslPackage.CONTROLLER__NAME:
			return getName();
		case Security_dslPackage.CONTROLLER__PATH:
			return getPath();
		case Security_dslPackage.CONTROLLER__CONTROLLER_ENDPOINTS:
			return getController_endpoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Security_dslPackage.CONTROLLER__NAME:
			setName((String) newValue);
			return;
		case Security_dslPackage.CONTROLLER__PATH:
			setPath((String) newValue);
			return;
		case Security_dslPackage.CONTROLLER__CONTROLLER_ENDPOINTS:
			getController_endpoints().clear();
			getController_endpoints().addAll((Collection<? extends Endpoint>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Security_dslPackage.CONTROLLER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Security_dslPackage.CONTROLLER__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case Security_dslPackage.CONTROLLER__CONTROLLER_ENDPOINTS:
			getController_endpoints().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Security_dslPackage.CONTROLLER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Security_dslPackage.CONTROLLER__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case Security_dslPackage.CONTROLLER__CONTROLLER_ENDPOINTS:
			return controller_endpoints != null && !controller_endpoints.isEmpty();
		}
		return super.eIsSet(featureID);
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
		case Security_dslPackage.CONTROLLER___METHOD_ALLOWED_REGISTRATION__DIAGNOSTICCHAIN_MAP:
			return methodAllowedRegistration((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP:
			return endpointLimits((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___METHOD_ALLOWED_LOGIN__DIAGNOSTICCHAIN_MAP:
			return methodAllowedLogin((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___METHOD_ALLOWED_LOGOUT__DIAGNOSTICCHAIN_MAP:
			return methodAllowedLogout((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___LOGIN_EXISTANCE_FOR_LOGOUT__DIAGNOSTICCHAIN_MAP:
			return loginExistanceForLogout((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___AUTHENTICATION_LIMITS__DIAGNOSTICCHAIN_MAP:
			return authenticationLimits((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP:
			return urlStartsWithForwardSlash((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP:
			return uniqueEndpoints((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
