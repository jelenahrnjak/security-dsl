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

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringAtOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import security_dsl.Controller;
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
			 *         result : Boolean[?] = self.controller_endpoints->isUnique(e | e.function_name) and
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
				final /*@NonInvalid*/ List<Endpoint> controller_endpoints_0 = this.getController_endpoints();
				final /*@NonInvalid*/ OrderedSetValue BOXED_controller_endpoints_0 = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Endpoint, controller_endpoints_0);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Endpoint);
				Iterator<Object> ITERATOR_e_0 = BOXED_controller_endpoints_0.iterator();
				/*@NonInvalid*/ boolean isUnique;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						isUnique = true;
						break;
					}
					/*@NonInvalid*/ Endpoint e_0 = (Endpoint) ITERATOR_e_0.next();
					/**
					 * e.function_name
					 */
					final /*@NonInvalid*/ String function_name = e_0.getFunction_name();
					//
					if (accumulator.includes(function_name) == ValueUtil.TRUE_VALUE) {
						isUnique = false;
						break; // Abort after second find
					} else {
						accumulator.add(function_name);
					}
				}
				final /*@NonInvalid*/ Boolean result;
				if (!isUnique) {
					result = ValueUtil.FALSE_VALUE;
				} else {
					/*@Thrown*/ Accumulator accumulator_0 = ValueUtil
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
						result = ValueUtil.TRUE_VALUE;
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
