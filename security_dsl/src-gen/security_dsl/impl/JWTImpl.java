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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

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

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import security_dsl.Claim;
import security_dsl.EClaimType;
import security_dsl.JWT;
import security_dsl.RegisteredClaims;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JWT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.JWTImpl#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link security_dsl.impl.JWTImpl#getSecret <em>Secret</em>}</li>
 *   <li>{@link security_dsl.impl.JWTImpl#getJwt_claims <em>Jwt claims</em>}</li>
 *   <li>{@link security_dsl.impl.JWTImpl#getRegisteredclaims <em>Registeredclaims</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JWTImpl extends SecurityImpl implements JWT {
	/**
	 * The default value of the '{@link #getSignatureAlgorithm() <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureAlgorithm() <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String signatureAlgorithm = SIGNATURE_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecret() <em>Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_EDEFAULT = "somesecret";

	/**
	 * The cached value of the '{@link #getSecret() <em>Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret()
	 * @generated
	 * @ordered
	 */
	protected String secret = SECRET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJwt_claims() <em>Jwt claims</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJwt_claims()
	 * @generated
	 * @ordered
	 */
	protected EList<Claim> jwt_claims;

	/**
	 * The cached value of the '{@link #getRegisteredclaims() <em>Registeredclaims</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredclaims()
	 * @generated
	 * @ordered
	 */
	protected RegisteredClaims registeredclaims;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JWTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.JWT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureAlgorithm(String newSignatureAlgorithm) {
		String oldSignatureAlgorithm = signatureAlgorithm;
		signatureAlgorithm = newSignatureAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.JWT__SIGNATURE_ALGORITHM,
					oldSignatureAlgorithm, signatureAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecret() {
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecret(String newSecret) {
		String oldSecret = secret;
		secret = newSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.JWT__SECRET, oldSecret, secret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Claim> getJwt_claims() {
		if (jwt_claims == null) {
			jwt_claims = new EObjectContainmentEList<Claim>(Claim.class, this, Security_dslPackage.JWT__JWT_CLAIMS);
		}
		return jwt_claims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredClaims getRegisteredclaims() {
		return registeredclaims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisteredclaims(RegisteredClaims newRegisteredclaims, NotificationChain msgs) {
		RegisteredClaims oldRegisteredclaims = registeredclaims;
		registeredclaims = newRegisteredclaims;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Security_dslPackage.JWT__REGISTEREDCLAIMS, oldRegisteredclaims, newRegisteredclaims);
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
	public void setRegisteredclaims(RegisteredClaims newRegisteredclaims) {
		if (newRegisteredclaims != registeredclaims) {
			NotificationChain msgs = null;
			if (registeredclaims != null)
				msgs = ((InternalEObject) registeredclaims).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.JWT__REGISTEREDCLAIMS, null, msgs);
			if (newRegisteredclaims != null)
				msgs = ((InternalEObject) newRegisteredclaims).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.JWT__REGISTEREDCLAIMS, null, msgs);
			msgs = basicSetRegisteredclaims(newRegisteredclaims, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.JWT__REGISTEREDCLAIMS,
					newRegisteredclaims, newRegisteredclaims));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueClaims(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "JWT::uniqueClaims";
		try {
			/**
			 *
			 * inv uniqueClaims:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.jwt_claims->isUnique(c | c.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.JWT___UNIQUE_CLAIMS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ List<Claim> jwt_claims = this.getJwt_claims();
				final /*@NonInvalid*/ OrderedSetValue BOXED_jwt_claims = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Claim, jwt_claims);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Claim);
				Iterator<Object> ITERATOR_c = BOXED_jwt_claims.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
					/**
					 * c.name
					 */
					final /*@NonInvalid*/ String name = c.getName();
					//
					if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
						result = false;
						break; // Abort after second find
					} else {
						accumulator.add(name);
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
	public boolean registeredClaimSubject(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "JWT::registeredClaimSubject";
		try {
			/**
			 *
			 * inv registeredClaimSubject:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.jwt_claims->forAll(c | c.name = 'subject' implies c.type = EClaimType::REGISTERED)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.JWT___REGISTERED_CLAIM_SUBJECT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Claim> jwt_claims = this.getJwt_claims();
					final /*@NonInvalid*/ OrderedSetValue BOXED_jwt_claims = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Claim, jwt_claims);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_c = BOXED_jwt_claims.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_c.hasNext()) {
							if (accumulator == null) {
								result = null;
							} else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
						/**
						 * c.name = 'subject' implies c.type = EClaimType::REGISTERED
						 */
						final /*@NonInvalid*/ String name = c.getName();
						final /*@NonInvalid*/ boolean eq = name.equals(Security_dslTables.STR_subject);
						final /*@NonInvalid*/ Boolean implies;
						if (!eq) {
							implies = ValueUtil.TRUE_VALUE;
						} else {
							final /*@NonInvalid*/ EClaimType type = c.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null
									: Security_dslTables.ENUMid_EClaimType
											.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq_0 = BOXED_type == Security_dslTables.ELITid_REGISTERED;
							if (eq_0) {
								implies = ValueUtil.TRUE_VALUE;
							} else {
								implies = ValueUtil.FALSE_VALUE;
							}
						}
						//
						if (implies == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (implies == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (implies == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null; // Cache a null failure
							}
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
	public boolean singleRegisteredClaim(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "JWT::singleRegisteredClaim";
		try {
			/**
			 *
			 * inv singleRegisteredClaim:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.jwt_claims->select(c |
			 *           (c.type = EClaimType::REGISTERED and c.name = 'subject'
			 *           ))
			 *         ->size() <= 1 and
			 *         self.jwt_claims->select(c | (c.type = EClaimType::REGISTERED))
			 *         ->size() <= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.JWT___SINGLE_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Claim> jwt_claims_0 = this.getJwt_claims();
					final /*@NonInvalid*/ OrderedSetValue BOXED_jwt_claims_0 = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Claim, jwt_claims_0);
					/*@Caught*/ Object CAUGHT_le_0;
					try {
						/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator = ValueUtil
								.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Claim);
						Iterator<Object> ITERATOR_c = BOXED_jwt_claims_0.iterator();
						/*@Thrown*/ OrderedSetValue select;
						while (true) {
							if (!ITERATOR_c.hasNext()) {
								select = accumulator;
								break;
							}
							/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
							/**
							 * c.type = EClaimType::REGISTERED and c.name = 'subject'
							 */
							final /*@NonInvalid*/ EClaimType type = c.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null
									: Security_dslTables.ENUMid_EClaimType
											.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq = BOXED_type == Security_dslTables.ELITid_REGISTERED;
							final /*@NonInvalid*/ Boolean and;
							if (!eq) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ String name = c.getName();
								final /*@NonInvalid*/ boolean eq_0 = name.equals(Security_dslTables.STR_subject);
								if (!eq_0) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							if (and == null) {
								throw new InvalidValueException(
										"Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
							}
							//
							if (and == ValueUtil.TRUE_VALUE) {
								accumulator.add(c);
							}
						}
						final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
						final /*@Thrown*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
								.evaluate(executor, size, Security_dslTables.INT_1).booleanValue();
						CAUGHT_le_0 = le_0;
					} catch (Exception e) {
						CAUGHT_le_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_le_0 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator_0 = ValueUtil
								.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Claim);
						Iterator<Object> ITERATOR_c_0 = BOXED_jwt_claims_0.iterator();
						/*@NonInvalid*/ OrderedSetValue select_0;
						while (true) {
							if (!ITERATOR_c_0.hasNext()) {
								select_0 = accumulator_0;
								break;
							}
							/*@NonInvalid*/ Claim c_0 = (Claim) ITERATOR_c_0.next();
							/**
							 * c.type = EClaimType::REGISTERED
							 */
							final /*@NonInvalid*/ EClaimType type_0 = c_0.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = type_0 == null ? null
									: Security_dslTables.ENUMid_EClaimType
											.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
							final /*@NonInvalid*/ boolean eq_1 = BOXED_type_0 == Security_dslTables.ELITid_REGISTERED;
							//
							if (eq_1) {
								accumulator_0.add(c_0);
							}
						}
						final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(select_0);
						final /*@NonInvalid*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE
								.evaluate(executor, size_0, Security_dslTables.INT_1).booleanValue();
						if (!le_1) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_le_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_le_0;
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
		case Security_dslPackage.JWT__JWT_CLAIMS:
			return ((InternalEList<?>) getJwt_claims()).basicRemove(otherEnd, msgs);
		case Security_dslPackage.JWT__REGISTEREDCLAIMS:
			return basicSetRegisteredclaims(null, msgs);
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
		case Security_dslPackage.JWT__SIGNATURE_ALGORITHM:
			return getSignatureAlgorithm();
		case Security_dslPackage.JWT__SECRET:
			return getSecret();
		case Security_dslPackage.JWT__JWT_CLAIMS:
			return getJwt_claims();
		case Security_dslPackage.JWT__REGISTEREDCLAIMS:
			return getRegisteredclaims();
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
		case Security_dslPackage.JWT__SIGNATURE_ALGORITHM:
			setSignatureAlgorithm((String) newValue);
			return;
		case Security_dslPackage.JWT__SECRET:
			setSecret((String) newValue);
			return;
		case Security_dslPackage.JWT__JWT_CLAIMS:
			getJwt_claims().clear();
			getJwt_claims().addAll((Collection<? extends Claim>) newValue);
			return;
		case Security_dslPackage.JWT__REGISTEREDCLAIMS:
			setRegisteredclaims((RegisteredClaims) newValue);
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
		case Security_dslPackage.JWT__SIGNATURE_ALGORITHM:
			setSignatureAlgorithm(SIGNATURE_ALGORITHM_EDEFAULT);
			return;
		case Security_dslPackage.JWT__SECRET:
			setSecret(SECRET_EDEFAULT);
			return;
		case Security_dslPackage.JWT__JWT_CLAIMS:
			getJwt_claims().clear();
			return;
		case Security_dslPackage.JWT__REGISTEREDCLAIMS:
			setRegisteredclaims((RegisteredClaims) null);
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
		case Security_dslPackage.JWT__SIGNATURE_ALGORITHM:
			return SIGNATURE_ALGORITHM_EDEFAULT == null ? signatureAlgorithm != null
					: !SIGNATURE_ALGORITHM_EDEFAULT.equals(signatureAlgorithm);
		case Security_dslPackage.JWT__SECRET:
			return SECRET_EDEFAULT == null ? secret != null : !SECRET_EDEFAULT.equals(secret);
		case Security_dslPackage.JWT__JWT_CLAIMS:
			return jwt_claims != null && !jwt_claims.isEmpty();
		case Security_dslPackage.JWT__REGISTEREDCLAIMS:
			return registeredclaims != null;
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
		case Security_dslPackage.JWT___UNIQUE_CLAIMS__DIAGNOSTICCHAIN_MAP:
			return uniqueClaims((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.JWT___REGISTERED_CLAIM_SUBJECT__DIAGNOSTICCHAIN_MAP:
			return registeredClaimSubject((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.JWT___SINGLE_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP:
			return singleRegisteredClaim((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (signatureAlgorithm: ");
		result.append(signatureAlgorithm);
		result.append(", secret: ");
		result.append(secret);
		result.append(')');
		return result.toString();
	}

} //JWTImpl
