/**
 */
package security_dsl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
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
import org.eclipse.ocl.pivot.values.SetValue;

import security_dsl.Authentication;
import security_dsl.Controller;
import security_dsl.EEndpointMethod;
import security_dsl.Endpoint;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.AuthenticationImpl#getSignup_endpoint <em>Signup endpoint</em>}</li>
 *   <li>{@link security_dsl.impl.AuthenticationImpl#getLogin_endpoint <em>Login endpoint</em>}</li>
 *   <li>{@link security_dsl.impl.AuthenticationImpl#getLogout_endpoint <em>Logout endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationImpl extends ControllerImpl implements Authentication {
	/**
	 * The cached value of the '{@link #getSignup_endpoint() <em>Signup endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignup_endpoint()
	 * @generated
	 * @ordered
	 */
	protected Endpoint signup_endpoint;

	/**
	 * The cached value of the '{@link #getLogin_endpoint() <em>Login endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin_endpoint()
	 * @generated
	 * @ordered
	 */
	protected Endpoint login_endpoint;

	/**
	 * The cached value of the '{@link #getLogout_endpoint() <em>Logout endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogout_endpoint()
	 * @generated
	 * @ordered
	 */
	protected Endpoint logout_endpoint;

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
	public Endpoint getSignup_endpoint() {
		return signup_endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignup_endpoint(Endpoint newSignup_endpoint, NotificationChain msgs) {
		Endpoint oldSignup_endpoint = signup_endpoint;
		signup_endpoint = newSignup_endpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Security_dslPackage.AUTHENTICATION__SIGNUP_ENDPOINT, oldSignup_endpoint, newSignup_endpoint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignup_endpoint(Endpoint newSignup_endpoint) {
		if (newSignup_endpoint != signup_endpoint) {
			NotificationChain msgs = null;
			if (signup_endpoint != null)
				msgs = ((InternalEObject) signup_endpoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.AUTHENTICATION__SIGNUP_ENDPOINT, null, msgs);
			if (newSignup_endpoint != null)
				msgs = ((InternalEObject) newSignup_endpoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.AUTHENTICATION__SIGNUP_ENDPOINT, null, msgs);
			msgs = basicSetSignup_endpoint(newSignup_endpoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.AUTHENTICATION__SIGNUP_ENDPOINT,
					newSignup_endpoint, newSignup_endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint getLogin_endpoint() {
		return login_endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogin_endpoint(Endpoint newLogin_endpoint, NotificationChain msgs) {
		Endpoint oldLogin_endpoint = login_endpoint;
		login_endpoint = newLogin_endpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Security_dslPackage.AUTHENTICATION__LOGIN_ENDPOINT, oldLogin_endpoint, newLogin_endpoint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin_endpoint(Endpoint newLogin_endpoint) {
		if (newLogin_endpoint != login_endpoint) {
			NotificationChain msgs = null;
			if (login_endpoint != null)
				msgs = ((InternalEObject) login_endpoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.AUTHENTICATION__LOGIN_ENDPOINT, null, msgs);
			if (newLogin_endpoint != null)
				msgs = ((InternalEObject) newLogin_endpoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.AUTHENTICATION__LOGIN_ENDPOINT, null, msgs);
			msgs = basicSetLogin_endpoint(newLogin_endpoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.AUTHENTICATION__LOGIN_ENDPOINT,
					newLogin_endpoint, newLogin_endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint getLogout_endpoint() {
		return logout_endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogout_endpoint(Endpoint newLogout_endpoint, NotificationChain msgs) {
		Endpoint oldLogout_endpoint = logout_endpoint;
		logout_endpoint = newLogout_endpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Security_dslPackage.AUTHENTICATION__LOGOUT_ENDPOINT, oldLogout_endpoint, newLogout_endpoint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogout_endpoint(Endpoint newLogout_endpoint) {
		if (newLogout_endpoint != logout_endpoint) {
			NotificationChain msgs = null;
			if (logout_endpoint != null)
				msgs = ((InternalEObject) logout_endpoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.AUTHENTICATION__LOGOUT_ENDPOINT, null, msgs);
			if (newLogout_endpoint != null)
				msgs = ((InternalEObject) newLogout_endpoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.AUTHENTICATION__LOGOUT_ENDPOINT, null, msgs);
			msgs = basicSetLogout_endpoint(newLogout_endpoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.AUTHENTICATION__LOGOUT_ENDPOINT,
					newLogout_endpoint, newLogout_endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean methodsAllowedSignUp(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Authentication::methodsAllowedSignUp";
		try {
			/**
			 *
			 * inv methodsAllowedSignUp:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.signup_endpoint = null or self.signup_endpoint.method = EEndpointMethod::POST
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.AUTHENTICATION___METHODS_ALLOWED_SIGN_UP__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Endpoint signup_endpoint = this.getSignup_endpoint();
					final /*@NonInvalid*/ boolean eq = signup_endpoint == null;
					final /*@Thrown*/ Boolean result;
					if (eq) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_eq_0;
						try {
							if (signup_endpoint == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::method\'");
							}
							final /*@Thrown*/ EEndpointMethod method = signup_endpoint.getMethod();
							final /*@Thrown*/ EnumerationLiteralId BOXED_method = Security_dslTables.ENUMid_EEndpointMethod
									.getEnumerationLiteralId(ClassUtil.nonNullState(method.getName()));
							final /*@Thrown*/ boolean eq_0 = BOXED_method == Security_dslTables.ELITid_POST;
							CAUGHT_eq_0 = eq_0;
						} catch (Exception e) {
							CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_eq_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_eq_0;
							}
							result = ValueUtil.FALSE_VALUE;
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
	public boolean methodsAllowedLogout(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Authentication::methodsAllowedLogout";
		try {
			/**
			 *
			 * inv methodsAllowedLogout:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.logout_endpoint = null or self.logout_endpoint.method = EEndpointMethod::POST or self.logout_endpoint.method = EEndpointMethod::GET
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.AUTHENTICATION___METHODS_ALLOWED_LOGOUT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Endpoint logout_endpoint = this.getLogout_endpoint();
					final /*@NonInvalid*/ boolean eq = logout_endpoint == null;
					final /*@Thrown*/ Boolean result;
					if (eq) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_or;
						try {
							/*@Caught*/ Object CAUGHT_eq_0;
							try {
								if (logout_endpoint == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::method\'");
								}
								final /*@Thrown*/ EEndpointMethod method = logout_endpoint.getMethod();
								final /*@Thrown*/ EnumerationLiteralId BOXED_method = Security_dslTables.ENUMid_EEndpointMethod
										.getEnumerationLiteralId(ClassUtil.nonNullState(method.getName()));
								final /*@Thrown*/ boolean eq_0 = BOXED_method == Security_dslTables.ELITid_POST;
								CAUGHT_eq_0 = eq_0;
							} catch (Exception e) {
								CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or;
							if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_eq_1;
								try {
									if (logout_endpoint == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::method\'");
									}
									final /*@Thrown*/ EEndpointMethod method_0 = logout_endpoint.getMethod();
									final /*@Thrown*/ EnumerationLiteralId BOXED_method_0 = Security_dslTables.ENUMid_EEndpointMethod
											.getEnumerationLiteralId(ClassUtil.nonNullState(method_0.getName()));
									final /*@Thrown*/ boolean eq_1 = BOXED_method_0 == Security_dslTables.ELITid_GET;
									CAUGHT_eq_1 = eq_1;
								} catch (Exception e) {
									CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_eq_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq_0;
									}
									if (CAUGHT_eq_1 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq_1;
									}
									or = ValueUtil.FALSE_VALUE;
								}
							}
							CAUGHT_or = or;
						} catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_or instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or;
							}
							if (CAUGHT_or == null) {
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
	public boolean uniqueAuthEndpoint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Authentication::uniqueAuthEndpoint";
		try {
			/**
			 *
			 * inv uniqueAuthEndpoint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.signup_endpoint.url <> self.login_endpoint.url <> self.logout_endpoint.url
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.AUTHENTICATION___UNIQUE_AUTH_ENDPOINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Endpoint signup_endpoint = this.getSignup_endpoint();
					if (signup_endpoint == null) {
						throw new InvalidValueException(
								"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::url\'");
					}
					final /*@Thrown*/ String url = signup_endpoint.getUrl();
					final /*@NonInvalid*/ Endpoint login_endpoint = this.getLogin_endpoint();
					if (login_endpoint == null) {
						throw new InvalidValueException(
								"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::url\'");
					}
					final /*@Thrown*/ String url_0 = login_endpoint.getUrl();
					final /*@Thrown*/ boolean ne = !url.equals(url_0);
					final /*@NonInvalid*/ Endpoint logout_endpoint = this.getLogout_endpoint();
					if (logout_endpoint == null) {
						throw new InvalidValueException(
								"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::url\'");
					}
					final /*@Thrown*/ String url_1 = logout_endpoint.getUrl();
					final /*@Thrown*/ boolean result = ne != url_1;
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
		final String constraintName = "Authentication::urlStartsWithForwardSlash";
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
			 *         result : Boolean[?] = self.signup_endpoint->forAll(e |
			 *           e.url.at(1) = '/') and
			 *         self.login_endpoint->forAll(e | e.url.at(1) = '/') and
			 *         self.logout_endpoint->forAll(e | e.url.at(1) = '/')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.AUTHENTICATION___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and;
					try {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final /*@NonInvalid*/ Endpoint signup_endpoint = this.getSignup_endpoint();
							final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
									Security_dslTables.SET_CLSSid_Endpoint, signup_endpoint);
							/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_e_0 = oclAsSet.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR_e_0.hasNext()) {
									if (accumulator == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
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
									forAll = ValueUtil.FALSE_VALUE;
									break; // Stop immediately
								} else if (CAUGHT_eq == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									; // Carry on
								} else if (CAUGHT_eq instanceof InvalidValueException) { // Abnormal exception evaluation result
									accumulator = CAUGHT_eq; // Cache an exception failure
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						} catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and;
						if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_forAll_0;
							try {
								final /*@NonInvalid*/ Endpoint login_endpoint = this.getLogin_endpoint();
								final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE
										.evaluate(executor, Security_dslTables.SET_CLSSid_Endpoint, login_endpoint);
								/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
								Iterator<Object> ITERATOR_e_1 = oclAsSet_0.iterator();
								/*@Thrown*/ Boolean forAll_0;
								while (true) {
									if (!ITERATOR_e_1.hasNext()) {
										if (accumulator_0 == ValueUtil.TRUE_VALUE) {
											forAll_0 = ValueUtil.TRUE_VALUE;
										} else {
											throw (InvalidValueException) accumulator_0;
										}
										break;
									}
									/*@NonInvalid*/ Endpoint e_1 = (Endpoint) ITERATOR_e_1.next();
									/**
									 * e.url.at(1) = '/'
									 */
									/*@Caught*/ Object CAUGHT_eq_0;
									try {
										final /*@NonInvalid*/ String url_0 = e_1.getUrl();
										final /*@Thrown*/ String at_0 = StringAtOperation.INSTANCE.evaluate(url_0,
												Security_dslTables.INT_1);
										final /*@Thrown*/ boolean eq_0 = at_0.equals(Security_dslTables.STR_quot);
										CAUGHT_eq_0 = eq_0;
									} catch (Exception e) {
										CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
									}
									//
									if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
										forAll_0 = ValueUtil.FALSE_VALUE;
										break; // Stop immediately
									} else if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
										; // Carry on
									} else if (CAUGHT_eq_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
										accumulator_0 = CAUGHT_eq_0; // Cache an exception failure
									} else { // Impossible badly typed result
										accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody,
												"forAll");
									}
								}
								CAUGHT_forAll_0 = forAll_0;
							} catch (Exception e) {
								CAUGHT_forAll_0 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_forAll_0 == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_forAll instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_forAll;
								}
								if (CAUGHT_forAll_0 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_forAll_0;
								}
								if ((CAUGHT_forAll == null) || (CAUGHT_forAll_0 == null)) {
									and = null;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and = and;
					} catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_forAll_1;
						try {
							final /*@NonInvalid*/ Endpoint logout_endpoint = this.getLogout_endpoint();
							final /*@Thrown*/ SetValue oclAsSet_1 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
									Security_dslTables.SET_CLSSid_Endpoint, logout_endpoint);
							/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_e_2 = oclAsSet_1.iterator();
							/*@Thrown*/ Boolean forAll_1;
							while (true) {
								if (!ITERATOR_e_2.hasNext()) {
									if (accumulator_1 == ValueUtil.TRUE_VALUE) {
										forAll_1 = ValueUtil.TRUE_VALUE;
									} else {
										throw (InvalidValueException) accumulator_1;
									}
									break;
								}
								/*@NonInvalid*/ Endpoint e_2 = (Endpoint) ITERATOR_e_2.next();
								/**
								 * e.url.at(1) = '/'
								 */
								/*@Caught*/ Object CAUGHT_eq_1;
								try {
									final /*@NonInvalid*/ String url_1 = e_2.getUrl();
									final /*@Thrown*/ String at_1 = StringAtOperation.INSTANCE.evaluate(url_1,
											Security_dslTables.INT_1);
									final /*@Thrown*/ boolean eq_1 = at_1.equals(Security_dslTables.STR_quot);
									CAUGHT_eq_1 = eq_1;
								} catch (Exception e) {
									CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
								}
								//
								if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									forAll_1 = ValueUtil.FALSE_VALUE;
									break; // Stop immediately
								} else if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									; // Carry on
								} else if (CAUGHT_eq_1 instanceof InvalidValueException) { // Abnormal exception evaluation result
									accumulator_1 = CAUGHT_eq_1; // Cache an exception failure
								} else { // Impossible badly typed result
									accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll_1 = forAll_1;
						} catch (Exception e) {
							CAUGHT_forAll_1 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll_1 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if (CAUGHT_forAll_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_forAll_1;
							}
							if ((CAUGHT_and == null) || (CAUGHT_forAll_1 == null)) {
								result = null;
							} else {
								result = ValueUtil.TRUE_VALUE;
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
	public boolean methodsAllowedLogin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Authentication::methodsAllowedLogin";
		try {
			/**
			 *
			 * inv methodsAllowedLogin:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.login_endpoint = null or self.login_endpoint.method = EEndpointMethod::POST or self.login_endpoint.method = EEndpointMethod::GET
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.AUTHENTICATION___METHODS_ALLOWED_LOGIN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Endpoint login_endpoint = this.getLogin_endpoint();
					final /*@NonInvalid*/ boolean eq = login_endpoint == null;
					final /*@Thrown*/ Boolean result;
					if (eq) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_or;
						try {
							/*@Caught*/ Object CAUGHT_eq_0;
							try {
								if (login_endpoint == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::method\'");
								}
								final /*@Thrown*/ EEndpointMethod method = login_endpoint.getMethod();
								final /*@Thrown*/ EnumerationLiteralId BOXED_method = Security_dslTables.ENUMid_EEndpointMethod
										.getEnumerationLiteralId(ClassUtil.nonNullState(method.getName()));
								final /*@Thrown*/ boolean eq_0 = BOXED_method == Security_dslTables.ELITid_POST;
								CAUGHT_eq_0 = eq_0;
							} catch (Exception e) {
								CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or;
							if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_eq_1;
								try {
									if (login_endpoint == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/security_dsl\'::Endpoint::method\'");
									}
									final /*@Thrown*/ EEndpointMethod method_0 = login_endpoint.getMethod();
									final /*@Thrown*/ EnumerationLiteralId BOXED_method_0 = Security_dslTables.ENUMid_EEndpointMethod
											.getEnumerationLiteralId(ClassUtil.nonNullState(method_0.getName()));
									final /*@Thrown*/ boolean eq_1 = BOXED_method_0 == Security_dslTables.ELITid_GET;
									CAUGHT_eq_1 = eq_1;
								} catch (Exception e) {
									CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_eq_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq_0;
									}
									if (CAUGHT_eq_1 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq_1;
									}
									or = ValueUtil.FALSE_VALUE;
								}
							}
							CAUGHT_or = or;
						} catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_or instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or;
							}
							if (CAUGHT_or == null) {
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Security_dslPackage.AUTHENTICATION__SIGNUP_ENDPOINT:
			return basicSetSignup_endpoint(null, msgs);
		case Security_dslPackage.AUTHENTICATION__LOGIN_ENDPOINT:
			return basicSetLogin_endpoint(null, msgs);
		case Security_dslPackage.AUTHENTICATION__LOGOUT_ENDPOINT:
			return basicSetLogout_endpoint(null, msgs);
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
		case Security_dslPackage.AUTHENTICATION__SIGNUP_ENDPOINT:
			return getSignup_endpoint();
		case Security_dslPackage.AUTHENTICATION__LOGIN_ENDPOINT:
			return getLogin_endpoint();
		case Security_dslPackage.AUTHENTICATION__LOGOUT_ENDPOINT:
			return getLogout_endpoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Security_dslPackage.AUTHENTICATION__SIGNUP_ENDPOINT:
			setSignup_endpoint((Endpoint) newValue);
			return;
		case Security_dslPackage.AUTHENTICATION__LOGIN_ENDPOINT:
			setLogin_endpoint((Endpoint) newValue);
			return;
		case Security_dslPackage.AUTHENTICATION__LOGOUT_ENDPOINT:
			setLogout_endpoint((Endpoint) newValue);
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
		case Security_dslPackage.AUTHENTICATION__SIGNUP_ENDPOINT:
			setSignup_endpoint((Endpoint) null);
			return;
		case Security_dslPackage.AUTHENTICATION__LOGIN_ENDPOINT:
			setLogin_endpoint((Endpoint) null);
			return;
		case Security_dslPackage.AUTHENTICATION__LOGOUT_ENDPOINT:
			setLogout_endpoint((Endpoint) null);
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
		case Security_dslPackage.AUTHENTICATION__SIGNUP_ENDPOINT:
			return signup_endpoint != null;
		case Security_dslPackage.AUTHENTICATION__LOGIN_ENDPOINT:
			return login_endpoint != null;
		case Security_dslPackage.AUTHENTICATION__LOGOUT_ENDPOINT:
			return logout_endpoint != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Controller.class) {
			switch (baseOperationID) {
			case Security_dslPackage.CONTROLLER___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP:
				return Security_dslPackage.AUTHENTICATION___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
		case Security_dslPackage.AUTHENTICATION___METHODS_ALLOWED_SIGN_UP__DIAGNOSTICCHAIN_MAP:
			return methodsAllowedSignUp((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.AUTHENTICATION___METHODS_ALLOWED_LOGOUT__DIAGNOSTICCHAIN_MAP:
			return methodsAllowedLogout((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.AUTHENTICATION___UNIQUE_AUTH_ENDPOINT__DIAGNOSTICCHAIN_MAP:
			return uniqueAuthEndpoint((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.AUTHENTICATION___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP:
			return urlStartsWithForwardSlash((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.AUTHENTICATION___METHODS_ALLOWED_LOGIN__DIAGNOSTICCHAIN_MAP:
			return methodsAllowedLogin((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AuthenticationImpl
