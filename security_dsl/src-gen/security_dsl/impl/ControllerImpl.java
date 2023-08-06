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

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringAtOperation;

import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
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
	public boolean methodRequiredForOtherType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Controller::methodRequiredForOtherType";
		try {
			/**
			 *
			 * inv methodRequiredForOtherType:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.controller_endpoints->select(e | e.type = EEndpointType::OTHER)
			 *           ->forAll(e | e.method <> null)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Endpoints of type "OTHER" must have a defined method!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___METHOD_REQUIRED_FOR_OTHER_TYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ List<Endpoint> controller_endpoints = this.getController_endpoints();
				final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Endpoint, controller_endpoints);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Endpoint);
				Iterator<Object> ITERATOR_e_0 = BOXED_controller_endpoints.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Endpoint e_0 = (Endpoint) ITERATOR_e_0.next();
					/**
					 * e.type = EEndpointType::OTHER
					 */
					final /*@NonInvalid*/ EEndpointType type = e_0.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EEndpointType
							.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_type == Security_dslTables.ELITid_OTHER;
					//
					if (eq) {
						accumulator.add(e_0);
					}
				}
				/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_e_1 = select.iterator();
				/*@NonInvalid*/ Boolean status;
				while (true) {
					if (!ITERATOR_e_1.hasNext()) {
						if (accumulator_0 == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator_0;
						}
						break;
					}
					/*@NonInvalid*/ Endpoint e_1 = (Endpoint) ITERATOR_e_1.next();
					/**
					 * e.method <> null
					 */
					final /*@NonInvalid*/ EEndpointMethod method = e_1.getMethod();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_method = method == null ? null
							: Security_dslTables.ENUMid_EEndpointMethod
									.getEnumerationLiteralId(ClassUtil.nonNullState(method.getName()));
					final /*@NonInvalid*/ boolean ne = BOXED_method != null;
					//
					if (!ne) { // Normal unsuccessful body evaluation result
						status = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (ne) { // Normal successful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean eq_0 = status == Boolean.TRUE;
				/*@NonInvalid*/ Object local_1;
				if (eq_0) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
							Security_dslTables.STR_Endpoints_32_of_32_type_32_34_OTHER_34_32_must_32_have_32_a_32_defined_32_method_33,
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
	public boolean controllerPath(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Controller::controllerPath";
		try {
			/**
			 *
			 * inv controllerPath:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[1] = self.path.at(1) = '/'
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Controller path should start with \'/\'!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ String path = this.getPath();
					final /*@Thrown*/ String at = StringAtOperation.INSTANCE.evaluate(path, Security_dslTables.INT_1);
					final /*@Thrown*/ boolean status = at.equals(Security_dslTables.STR_quot);
					/*@Thrown*/ Object local_1;
					if (status) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Controller_32_path_32_should_32_start_32_with_32_39_s_39_33,
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
	public boolean uniqueControllerPath(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Controller::uniqueControllerPath";
		try {
			/**
			 *
			 * inv uniqueControllerPath:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Controller.allInstances()
			 *           ->isUnique(c | c.path) and
			 *           Controller.allInstances()
			 *           ->forAll(c | '/' + c.name.toLower() <> c.path.toLower())
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Controller paths should be unique and different from names!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Controller_1 = idResolver
							.getClass(Security_dslTables.CLSSid_Controller, null);
					final /*@NonInvalid*/ SetValue allInstances_0 = ClassifierAllInstancesOperation.INSTANCE.evaluate(
							executor, Security_dslTables.SET_CLSSid_Controller, TYP_security_dsl_c_c_Controller_1);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Controller);
					Iterator<Object> ITERATOR_c = allInstances_0.iterator();
					/*@NonInvalid*/ boolean isUnique;
					while (true) {
						if (!ITERATOR_c.hasNext()) {
							isUnique = true;
							break;
						}
						/*@NonInvalid*/ Controller c = (Controller) ITERATOR_c.next();
						/**
						 * c.path
						 */
						final /*@NonInvalid*/ String path = c.getPath();
						//
						if (accumulator.includes(path) == ValueUtil.TRUE_VALUE) {
							isUnique = false;
							break; // Abort after second find
						} else {
							accumulator.add(path);
						}
					}
					final /*@Thrown*/ Boolean status;
					if (!isUnique) {
						status = ValueUtil.FALSE_VALUE;
					} else {
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_c_0 = allInstances_0.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_c_0.hasNext()) {
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ Controller c_0 = (Controller) ITERATOR_c_0.next();
							/**
							 * '/' + c.name.toLower() <> c.path.toLower()
							 */
							final /*@NonInvalid*/ String name = c_0.getName();
							final /*@NonInvalid*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(name);
							final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE
									.evaluate(Security_dslTables.STR_quot, toLower);
							final /*@NonInvalid*/ String path_0 = c_0.getPath();
							final /*@NonInvalid*/ String toLower_0 = StringToLowerCaseOperation.INSTANCE
									.evaluate(path_0);
							final /*@NonInvalid*/ boolean ne = !sum.equals(toLower_0);
							//
							if (!ne) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (ne) { // Normal successful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll == ValueUtil.FALSE_VALUE) {
							status = ValueUtil.FALSE_VALUE;
						} else {
							if (forAll == null) {
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
								Security_dslTables.STR_Controller_32_paths_32_should_32_be_32_unique_32_and_32_different_32_from_32_names_33,
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
	public boolean uniqueControllerName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Controller::uniqueControllerName";
		try {
			/**
			 *
			 * inv uniqueControllerName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = Controller.allInstances()
			 *           ->isUnique(c | c.name)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Controllers should have unique names!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Controller = idResolver
						.getClass(Security_dslTables.CLSSid_Controller, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
						.evaluate(executor, Security_dslTables.SET_CLSSid_Controller, TYP_security_dsl_c_c_Controller);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Controller);
				Iterator<Object> ITERATOR_c = allInstances.iterator();
				/*@NonInvalid*/ boolean status;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						status = true;
						break;
					}
					/*@NonInvalid*/ Controller c = (Controller) ITERATOR_c.next();
					/**
					 * c.name
					 */
					final /*@NonInvalid*/ String name = c.getName();
					//
					if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
						status = false;
						break; // Abort after second find
					} else {
						accumulator.add(name);
					}
				}
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
							Security_dslTables.STR_Controllers_32_should_32_have_32_unique_32_names_33, status);
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
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.controller_endpoints->forAll(e1, e2 | e1 <> e2 implies
			 *             (e1.functionName <> null and e2.functionName <> null implies e1.functionName <> e2.functionName
			 *             ) and
			 *             (e1.url <> null and e2.url <> null implies e1.url <> e2.url
			 *             ))
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Endpoints within a controller must have unique function names and URLs!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_10;
			if (le) {
				local_10 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_9;
				try {
					final /*@NonInvalid*/ List<Endpoint> controller_endpoints = this.getController_endpoints();
					final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Endpoint, controller_endpoints);
					final org.eclipse.ocl.pivot.Class TYPE_status_0 = executor.getStaticTypeOfValue(null,
							BOXED_controller_endpoints);
					final LibraryIterationExtension IMPL_status_0 = (LibraryIterationExtension) TYPE_status_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_status_0 = new AbstractSimpleOperation() {
						/**
						 * e1 <> e2 implies
						 * (e1.functionName <> null and e2.functionName <> null implies e1.functionName <> e2.functionName
						 * ) and
						 * (e1.url <> null and e2.url <> null implies e1.url <> e2.url
						 * )
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object e1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object e2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies_1;
							try {
								final /*@NonInvalid*/ Endpoint local_0 = (Endpoint) e1;
								final /*@NonInvalid*/ Endpoint local_1 = (Endpoint) e2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1)
										: (local_1 != null);
								final /*@Thrown*/ Boolean implies_1;
								if (!ne) {
									implies_1 = ValueUtil.TRUE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_and_1;
									try {
										/*@Caught*/ Object CAUGHT_implies;
										try {
											/*@Caught*/ Object CAUGHT_and;
											try {
												/*@Caught*/ Object CAUGHT_ne_0;
												try {
													if (local_0 == null) {
														throw new InvalidValueException(
																"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::functionName\'");
													}
													final /*@Thrown*/ String functionName = local_0.getFunctionName();
													final /*@Thrown*/ boolean ne_0 = functionName != null;
													CAUGHT_ne_0 = ne_0;
												} catch (Exception e) {
													CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
												}
												final /*@Thrown*/ Boolean and;
												if (CAUGHT_ne_0 == ValueUtil.FALSE_VALUE) {
													and = ValueUtil.FALSE_VALUE;
												} else {
													/*@Caught*/ Object CAUGHT_ne_1;
													try {
														if (local_1 == null) {
															throw new InvalidValueException(
																	"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::functionName\'");
														}
														final /*@Thrown*/ String functionName_0 = local_1
																.getFunctionName();
														final /*@Thrown*/ boolean ne_1 = functionName_0 != null;
														CAUGHT_ne_1 = ne_1;
													} catch (Exception e) {
														CAUGHT_ne_1 = ValueUtil.createInvalidValue(e);
													}
													if (CAUGHT_ne_1 == ValueUtil.FALSE_VALUE) {
														and = ValueUtil.FALSE_VALUE;
													} else {
														if (CAUGHT_ne_0 instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_ne_0;
														}
														if (CAUGHT_ne_1 instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_ne_1;
														}
														and = ValueUtil.TRUE_VALUE;
													}
												}
												CAUGHT_and = and;
											} catch (Exception e) {
												CAUGHT_and = ValueUtil.createInvalidValue(e);
											}
											final /*@Thrown*/ Boolean implies;
											if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
												implies = ValueUtil.TRUE_VALUE;
											} else {
												/*@Caught*/ Object CAUGHT_ne_2;
												try {
													if (local_0 == null) {
														throw new InvalidValueException(
																"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::functionName\'");
													}
													final /*@Thrown*/ String functionName_1 = local_0.getFunctionName();
													if (local_1 == null) {
														throw new InvalidValueException(
																"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::functionName\'");
													}
													final /*@Thrown*/ String functionName_2 = local_1.getFunctionName();
													final /*@Thrown*/ boolean ne_2 = (functionName_1 != null)
															? !functionName_1.equals(functionName_2)
															: (functionName_2 != null);
													CAUGHT_ne_2 = ne_2;
												} catch (Exception e) {
													CAUGHT_ne_2 = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_ne_2 == ValueUtil.TRUE_VALUE) {
													implies = ValueUtil.TRUE_VALUE;
												} else {
													if (CAUGHT_and instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_and;
													}
													if (CAUGHT_ne_2 instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_ne_2;
													}
													if (CAUGHT_and == null) {
														implies = null;
													} else {
														implies = ValueUtil.FALSE_VALUE;
													}
												}
											}
											CAUGHT_implies = implies;
										} catch (Exception e) {
											CAUGHT_implies = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean and_1;
										if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {
											and_1 = ValueUtil.FALSE_VALUE;
										} else {
											/*@Caught*/ Object CAUGHT_implies_0;
											try {
												final /*@NonInvalid*/ Boolean and_0 = ValueUtil.TRUE_VALUE;
												final /*@Thrown*/ Boolean implies_0;
												if (and_0 == ValueUtil.FALSE_VALUE) {
													implies_0 = ValueUtil.TRUE_VALUE;
												} else {
													/*@Caught*/ Object CAUGHT_ne_3;
													try {
														if (local_0 == null) {
															throw new InvalidValueException(
																	"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::url\'");
														}
														final /*@Thrown*/ String url = local_0.getUrl();
														if (local_1 == null) {
															throw new InvalidValueException(
																	"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::url\'");
														}
														final /*@Thrown*/ String url_0 = local_1.getUrl();
														final /*@Thrown*/ boolean ne_3 = !url.equals(url_0);
														CAUGHT_ne_3 = ne_3;
													} catch (Exception e) {
														CAUGHT_ne_3 = ValueUtil.createInvalidValue(e);
													}
													if (CAUGHT_ne_3 == ValueUtil.TRUE_VALUE) {
														implies_0 = ValueUtil.TRUE_VALUE;
													} else {
														if (CAUGHT_ne_3 instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_ne_3;
														}
														if (and_0 == null) {
															implies_0 = null;
														} else {
															implies_0 = ValueUtil.FALSE_VALUE;
														}
													}
												}
												CAUGHT_implies_0 = implies_0;
											} catch (Exception e) {
												CAUGHT_implies_0 = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_implies_0 == ValueUtil.FALSE_VALUE) {
												and_1 = ValueUtil.FALSE_VALUE;
											} else {
												if (CAUGHT_implies instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_implies;
												}
												if (CAUGHT_implies_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_implies_0;
												}
												if ((CAUGHT_implies == null) || (CAUGHT_implies_0 == null)) {
													and_1 = null;
												} else {
													and_1 = ValueUtil.TRUE_VALUE;
												}
											}
										}
										CAUGHT_and_1 = and_1;
									} catch (Exception e) {
										CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_and_1 == ValueUtil.TRUE_VALUE) {
										implies_1 = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_and_1 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_and_1;
										}
										if (CAUGHT_and_1 == null) {
											implies_1 = null;
										} else {
											implies_1 = ValueUtil.FALSE_VALUE;
										}
									}
								}
								CAUGHT_implies_1 = implies_1;
							} catch (Exception e) {
								CAUGHT_implies_1 = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies_1;
						}
					};
					final ExecutorMultipleIterationManager MGR_status_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_status_0, BOXED_controller_endpoints, ACC_status_0);
					final /*@Thrown*/ Boolean status = (Boolean) IMPL_status_0.evaluateIteration(MGR_status_0);
					final /*@Thrown*/ boolean eq = status == Boolean.TRUE;
					/*@Thrown*/ Object local_9;
					if (eq) {
						local_9 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_8 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Endpoints_32_within_32_a_32_controller_32_must_32_have_32_unique_32_function_32_names_32_an,
								status);
						local_9 = local_8;
					}
					CAUGHT_local_9 = local_9;
				} catch (Exception e) {
					CAUGHT_local_9 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_9, Security_dslTables.INT_0)
						.booleanValue();
				local_10 = logDiagnostic;
			}
			return local_10;
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
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not self.oclIsTypeOf(Authentication) implies
			 *           self.controller_endpoints->select(e | e.type = EEndpointType::REGISTRATION)
			 *           ->isEmpty() and
			 *           self.controller_endpoints->select(e | e.type = EEndpointType::LOGIN)
			 *           ->isEmpty() and
			 *           self.controller_endpoints->select(e | e.type = EEndpointType::LOGOUT)
			 *           ->isEmpty()
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Controllers of type other than "Authentication" should not have registration, login, or logout endpoints!', status = status
			 *             }
			 *           endif
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
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Authentication = idResolver
							.getClass(Security_dslTables.CLSSid_Authentication, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, this, TYP_security_dsl_c_c_Authentication).booleanValue();
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
					final /*@Thrown*/ Boolean status;
					if (not == ValueUtil.FALSE_VALUE) {
						status = ValueUtil.TRUE_VALUE;
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
								final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EEndpointType
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
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = Security_dslTables.ENUMid_EEndpointType
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
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_1 = Security_dslTables.ENUMid_EEndpointType
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
							status = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_0;
							}
							if ((not == null) || (CAUGHT_and_0 == null)) {
								status = null;
							} else {
								status = ValueUtil.FALSE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq_2 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_2) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Controllers_32_of_32_type_32_other_32_than_32_34_Authentication_34_32_should_32_not_32_have_32,
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
	public boolean controllerNotNamedUserRole(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Controller::controllerNotNamedUserRole";
		try {
			/**
			 *
			 * inv controllerNotNamedUserRole:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not Controller.allInstances()
			 *           ->exists(c |
			 *             (c.name.toLower() = 'user' or c.name.toLower() = 'role'
			 *             ))
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Controller names cannot be "User" or "Role"!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CONTROLLER___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					/*@Caught*/ Object CAUGHT_exists;
					try {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Controller_0 = idResolver
								.getClass(Security_dslTables.CLSSid_Controller, null);
						final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
								executor, Security_dslTables.SET_CLSSid_Controller, TYP_security_dsl_c_c_Controller_0);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_c = allInstances.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_c.hasNext()) {
								if (accumulator == null) {
									exists = null;
								} else if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Controller c = (Controller) ITERATOR_c.next();
							/**
							 * c.name.toLower() = 'user' or c.name.toLower() = 'role'
							 */
							final /*@NonInvalid*/ String name_0 = c.getName();
							final /*@NonInvalid*/ String toLower_0 = StringToLowerCaseOperation.INSTANCE
									.evaluate(name_0);
							final /*@NonInvalid*/ boolean eq = toLower_0.equals(Security_dslTables.STR_user);
							final /*@NonInvalid*/ Boolean or;
							if (eq) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean eq_0 = toLower_0.equals(Security_dslTables.STR_role);
								if (eq_0) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
							//
							if (or == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (or == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (or == null) { // Abnormal null body evaluation result
								if (accumulator == ValueUtil.FALSE_VALUE) {
									accumulator = null; // Cache a null failure
								}
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						CAUGHT_exists = exists;
					} catch (Exception e) {
						CAUGHT_exists = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_exists instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_exists;
					}
					final /*@Thrown*/ Boolean status;
					if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.FALSE_VALUE;
						} else {
							status = null;
						}
					}
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_1) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Controller_32_names_32_cannot_32_be_32_34_User_34_32_or_32_34_Role_34_33,
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
		case Security_dslPackage.CONTROLLER___METHOD_REQUIRED_FOR_OTHER_TYPE__DIAGNOSTICCHAIN_MAP:
			return methodRequiredForOtherType((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP:
			return controllerNotNamedUserRole((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___UNIQUE_ENDPOINTS__DIAGNOSTICCHAIN_MAP:
			return uniqueEndpoints((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___ENDPOINT_LIMITS__DIAGNOSTICCHAIN_MAP:
			return endpointLimits((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP:
			return controllerPath((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP:
			return uniqueControllerPath((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CONTROLLER___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP:
			return uniqueControllerName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
