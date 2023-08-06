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
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;
import org.eclipse.ocl.pivot.values.TupleValue;
import security_dsl.Attribute;
import security_dsl.Claim;
import security_dsl.EClaimType;
import security_dsl.EType;
import security_dsl.Entity;
import security_dsl.JWT;
import security_dsl.RegisteredClaim;
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
 *   <li>{@link security_dsl.impl.JWTImpl#getClaims <em>Claims</em>}</li>
 *   <li>{@link security_dsl.impl.JWTImpl#getRegistered_claims <em>Registered claims</em>}</li>
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
	 * The cached value of the '{@link #getClaims() <em>Claims</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaims()
	 * @generated
	 * @ordered
	 */
	protected EList<Claim> claims;

	/**
	 * The cached value of the '{@link #getRegistered_claims() <em>Registered claims</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistered_claims()
	 * @generated
	 * @ordered
	 */
	protected RegisteredClaim registered_claims;

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
	public EList<Claim> getClaims() {
		if (claims == null) {
			claims = new EObjectContainmentEList<Claim>(Claim.class, this, Security_dslPackage.JWT__CLAIMS);
		}
		return claims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredClaim getRegistered_claims() {
		return registered_claims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistered_claims(RegisteredClaim newRegistered_claims, NotificationChain msgs) {
		RegisteredClaim oldRegistered_claims = registered_claims;
		registered_claims = newRegistered_claims;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Security_dslPackage.JWT__REGISTERED_CLAIMS, oldRegistered_claims, newRegistered_claims);
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
	public void setRegistered_claims(RegisteredClaim newRegistered_claims) {
		if (newRegistered_claims != registered_claims) {
			NotificationChain msgs = null;
			if (registered_claims != null)
				msgs = ((InternalEObject) registered_claims).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.JWT__REGISTERED_CLAIMS, null, msgs);
			if (newRegistered_claims != null)
				msgs = ((InternalEObject) newRegistered_claims).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.JWT__REGISTERED_CLAIMS, null, msgs);
			msgs = basicSetRegistered_claims(newRegistered_claims, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.JWT__REGISTERED_CLAIMS,
					newRegistered_claims, newRegistered_claims));
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
			 *       let result : Boolean[1] = self.claims->isUnique(c | c.name)
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
				final /*@NonInvalid*/ List<Claim> claims = this.getClaims();
				final /*@NonInvalid*/ OrderedSetValue BOXED_claims = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Claim, claims);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Claim);
				Iterator<Object> ITERATOR_c = BOXED_claims.iterator();
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
			 *         result : Boolean[?] = self.claims->forAll(c | c.name = 'subject' implies c.type = EClaimType::REGISTERED)
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
					final /*@NonInvalid*/ List<Claim> claims = this.getClaims();
					final /*@NonInvalid*/ OrderedSetValue BOXED_claims = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Claim, claims);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_c = BOXED_claims.iterator();
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
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EClaimType
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
			 *         result : Boolean[?] = self.claims->select(c |
			 *           (c.type = EClaimType::REGISTERED and c.name = 'subject'
			 *           ))
			 *         ->size() <= 1 and
			 *         self.claims->select(c | (c.type = EClaimType::REGISTERED))
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
					final /*@NonInvalid*/ List<Claim> claims_0 = this.getClaims();
					final /*@NonInvalid*/ OrderedSetValue BOXED_claims_0 = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Claim, claims_0);
					/*@Caught*/ Object CAUGHT_le_0;
					try {
						/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator = ValueUtil
								.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Claim);
						Iterator<Object> ITERATOR_c = BOXED_claims_0.iterator();
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
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EClaimType
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
						Iterator<Object> ITERATOR_c_0 = BOXED_claims_0.iterator();
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
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = Security_dslTables.ENUMid_EClaimType
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
	public boolean roleMaxTwoAttributes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "JWT::roleMaxTwoAttributes";
		try {
			/**
			 *
			 * inv roleMaxTwoAttributes:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Entity.allInstances()
			 *           ->select(e | e.oclIsTypeOf(Role))
			 *           ->forAll(role | role.entity_attributes->size() <= 2)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Role entities can have at most two attributes!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.JWT___ROLE_MAX_TWO_ATTRIBUTES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Entity_0 = idResolver
						.getClass(Security_dslTables.CLSSid_Entity, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
						.evaluate(executor, Security_dslTables.SET_CLSSid_Entity, TYP_security_dsl_c_c_Entity_0);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Entity);
				Iterator<Object> ITERATOR_e_0 = allInstances.iterator();
				/*@NonInvalid*/ SetValue select;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Entity e_0 = (Entity) ITERATOR_e_0.next();
					/**
					 * e.oclIsTypeOf(Role)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Role_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Role, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, e_0, TYP_security_dsl_c_c_Role_0).booleanValue();
					//
					if (oclIsTypeOf) {
						accumulator.add(e_0);
					}
				}
				/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_role = select.iterator();
				/*@NonInvalid*/ Boolean status;
				while (true) {
					if (!ITERATOR_role.hasNext()) {
						if (accumulator_0 == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator_0;
						}
						break;
					}
					/*@NonInvalid*/ Entity role = (Entity) ITERATOR_role.next();
					/**
					 * role.entity_attributes->size() <= 2
					 */
					final /*@NonInvalid*/ List<Attribute> entity_attributes = role.getEntity_attributes();
					final /*@NonInvalid*/ OrderedSetValue BOXED_entity_attributes = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute, entity_attributes);
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
							.evaluate(BOXED_entity_attributes);
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
							.evaluate(executor, size, Security_dslTables.INT_2).booleanValue();
					//
					if (!le_0) { // Normal unsuccessful body evaluation result
						status = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (le_0) { // Normal successful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean eq = status == Boolean.TRUE;
				/*@NonInvalid*/ Object local_1;
				if (eq) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
							Security_dslTables.STR_Role_32_entities_32_can_32_have_32_at_32_most_32_two_32_attributes_33,
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
	public boolean roleAttributeType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "JWT::roleAttributeType";
		try {
			/**
			 *
			 * inv roleAttributeType:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Entity.allInstances()
			 *           ->select(e | e.oclIsTypeOf(Role))
			 *           ->forAll(role |
			 *             role.entity_attributes->select(a |
			 *               (a.identifier and a.type = EType::String
			 *               ))
			 *             ->size() = 1 and
			 *             role.entity_attributes->select(a | a.type = EType::String)
			 *             ->size() = 1 or
			 *             role.entity_attributes->select(a |
			 *               (a.identifier and a.type <> EType::String
			 *               ))
			 *             ->size() = 1 and
			 *             role.entity_attributes->select(a | a.type = EType::String)
			 *             ->size() = 1)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Role entities must have either one identifier attribute of type String or both identifier and non-identifier attributes of type String!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.JWT___ROLE_ATTRIBUTE_TYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Entity_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Entity, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, Security_dslTables.SET_CLSSid_Entity, TYP_security_dsl_c_c_Entity_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Entity);
					Iterator<Object> ITERATOR_e_0 = allInstances.iterator();
					/*@NonInvalid*/ SetValue select;
					while (true) {
						if (!ITERATOR_e_0.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Entity e_0 = (Entity) ITERATOR_e_0.next();
						/**
						 * e.oclIsTypeOf(Role)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Role_0 = idResolver
								.getClass(Security_dslTables.CLSSid_Role, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
								.evaluate(executor, e_0, TYP_security_dsl_c_c_Role_0).booleanValue();
						//
						if (oclIsTypeOf) {
							accumulator.add(e_0);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_role = select.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_role.hasNext()) {
							if (accumulator_0 == null) {
								status = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								status = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Entity role = (Entity) ITERATOR_role.next();
						/**
						 *
						 * role.entity_attributes->select(a |
						 *   (a.identifier and a.type = EType::String
						 *   ))
						 * ->size() = 1 and
						 * role.entity_attributes->select(a | a.type = EType::String)
						 * ->size() = 1 or
						 * role.entity_attributes->select(a |
						 *   (a.identifier and a.type <> EType::String
						 *   ))
						 * ->size() = 1 and
						 * role.entity_attributes->select(a | a.type = EType::String)
						 * ->size() = 1
						 */
						/*@Caught*/ Object CAUGHT_or;
						try {
							/*@Caught*/ Object CAUGHT_and_0;
							try {
								final /*@NonInvalid*/ List<Attribute> entity_attributes_0 = role.getEntity_attributes();
								final /*@NonInvalid*/ OrderedSetValue BOXED_entity_attributes_0 = idResolver
										.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute,
												entity_attributes_0);
								/*@Caught*/ Object CAUGHT_eq_0;
								try {
									/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator_1 = ValueUtil
											.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Attribute);
									Iterator<Object> ITERATOR_a = BOXED_entity_attributes_0.iterator();
									/*@Thrown*/ OrderedSetValue select_0;
									while (true) {
										if (!ITERATOR_a.hasNext()) {
											select_0 = accumulator_1;
											break;
										}
										/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
										/**
										 * a.identifier and a.type = EType::String
										 */
										final /*@NonInvalid*/ boolean identifier = a.isIdentifier();
										final /*@NonInvalid*/ Boolean and;
										if (!identifier) {
											and = ValueUtil.FALSE_VALUE;
										} else {
											final /*@NonInvalid*/ EType type = a.getType();
											final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EType
													.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
											final /*@NonInvalid*/ boolean eq = BOXED_type == Security_dslTables.ELITid_String;
											if (!eq) {
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
											accumulator_1.add(a);
										}
									}
									final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE
											.evaluate(select_0);
									final /*@Thrown*/ boolean eq_0 = size.equals(Security_dslTables.INT_1);
									CAUGHT_eq_0 = eq_0;
								} catch (Exception e) {
									CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean and_0;
								if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator_2 = ValueUtil
											.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Attribute);
									Iterator<Object> ITERATOR_a_0 = BOXED_entity_attributes_0.iterator();
									/*@NonInvalid*/ OrderedSetValue select_1;
									while (true) {
										if (!ITERATOR_a_0.hasNext()) {
											select_1 = accumulator_2;
											break;
										}
										/*@NonInvalid*/ Attribute a_0 = (Attribute) ITERATOR_a_0.next();
										/**
										 * a.type = EType::String
										 */
										final /*@NonInvalid*/ EType type_0 = a_0.getType();
										final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = Security_dslTables.ENUMid_EType
												.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
										final /*@NonInvalid*/ boolean eq_1 = BOXED_type_0 == Security_dslTables.ELITid_String;
										//
										if (eq_1) {
											accumulator_2.add(a_0);
										}
									}
									final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
											.evaluate(select_1);
									final /*@NonInvalid*/ boolean eq_2 = size_0.equals(Security_dslTables.INT_1);
									if (!eq_2) {
										and_0 = ValueUtil.FALSE_VALUE;
									} else {
										if (CAUGHT_eq_0 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq_0;
										}
										and_0 = ValueUtil.TRUE_VALUE;
									}
								}
								CAUGHT_and_0 = and_0;
							} catch (Exception e) {
								CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or;
							if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_and_2;
								try {
									final /*@NonInvalid*/ List<Attribute> entity_attributes_2 = role
											.getEntity_attributes();
									final /*@NonInvalid*/ OrderedSetValue BOXED_entity_attributes_2 = idResolver
											.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute,
													entity_attributes_2);
									/*@Caught*/ Object CAUGHT_eq_3;
									try {
										/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator_3 = ValueUtil
												.createOrderedSetAccumulatorValue(
														Security_dslTables.ORD_CLSSid_Attribute);
										Iterator<Object> ITERATOR_a_1 = BOXED_entity_attributes_2.iterator();
										/*@Thrown*/ OrderedSetValue select_2;
										while (true) {
											if (!ITERATOR_a_1.hasNext()) {
												select_2 = accumulator_3;
												break;
											}
											/*@NonInvalid*/ Attribute a_1 = (Attribute) ITERATOR_a_1.next();
											/**
											 * a.identifier and a.type <> EType::String
											 */
											final /*@NonInvalid*/ boolean identifier_0 = a_1.isIdentifier();
											final /*@NonInvalid*/ Boolean and_1;
											if (!identifier_0) {
												and_1 = ValueUtil.FALSE_VALUE;
											} else {
												final /*@NonInvalid*/ EType type_1 = a_1.getType();
												final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_1 = Security_dslTables.ENUMid_EType
														.getEnumerationLiteralId(
																ClassUtil.nonNullState(type_1.getName()));
												final /*@NonInvalid*/ boolean ne = BOXED_type_1 != Security_dslTables.ELITid_String;
												if (!ne) {
													and_1 = ValueUtil.FALSE_VALUE;
												} else {
													and_1 = ValueUtil.TRUE_VALUE;
												}
											}
											if (and_1 == null) {
												throw new InvalidValueException(
														"Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
											}
											//
											if (and_1 == ValueUtil.TRUE_VALUE) {
												accumulator_3.add(a_1);
											}
										}
										final /*@Thrown*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE
												.evaluate(select_2);
										final /*@Thrown*/ boolean eq_3 = size_1.equals(Security_dslTables.INT_1);
										CAUGHT_eq_3 = eq_3;
									} catch (Exception e) {
										CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean and_2;
									if (CAUGHT_eq_3 == ValueUtil.FALSE_VALUE) {
										and_2 = ValueUtil.FALSE_VALUE;
									} else {
										/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator_4 = ValueUtil
												.createOrderedSetAccumulatorValue(
														Security_dslTables.ORD_CLSSid_Attribute);
										Iterator<Object> ITERATOR_a_2 = BOXED_entity_attributes_2.iterator();
										/*@NonInvalid*/ OrderedSetValue select_3;
										while (true) {
											if (!ITERATOR_a_2.hasNext()) {
												select_3 = accumulator_4;
												break;
											}
											/*@NonInvalid*/ Attribute a_2 = (Attribute) ITERATOR_a_2.next();
											/**
											 * a.type = EType::String
											 */
											final /*@NonInvalid*/ EType type_2 = a_2.getType();
											final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_2 = Security_dslTables.ENUMid_EType
													.getEnumerationLiteralId(ClassUtil.nonNullState(type_2.getName()));
											final /*@NonInvalid*/ boolean eq_4 = BOXED_type_2 == Security_dslTables.ELITid_String;
											//
											if (eq_4) {
												accumulator_4.add(a_2);
											}
										}
										final /*@NonInvalid*/ IntegerValue size_2 = CollectionSizeOperation.INSTANCE
												.evaluate(select_3);
										final /*@NonInvalid*/ boolean eq_5 = size_2.equals(Security_dslTables.INT_1);
										if (!eq_5) {
											and_2 = ValueUtil.FALSE_VALUE;
										} else {
											if (CAUGHT_eq_3 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_3;
											}
											and_2 = ValueUtil.TRUE_VALUE;
										}
									}
									CAUGHT_and_2 = and_2;
								} catch (Exception e) {
									CAUGHT_and_2 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_and_2 == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_and_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_0;
									}
									if (CAUGHT_and_2 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_2;
									}
									if ((CAUGHT_and_0 == null) || (CAUGHT_and_2 == null)) {
										or = null;
									} else {
										or = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or = or;
						} catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_or == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							status = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_or == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_or == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else if (CAUGHT_or instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator_0 = CAUGHT_or; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					final /*@Thrown*/ boolean eq_6 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_6) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Role_32_entities_32_must_32_have_32_either_32_one_32_identifier_32_attribute_32_of_32_type_32,
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
		case Security_dslPackage.JWT__CLAIMS:
			return ((InternalEList<?>) getClaims()).basicRemove(otherEnd, msgs);
		case Security_dslPackage.JWT__REGISTERED_CLAIMS:
			return basicSetRegistered_claims(null, msgs);
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
		case Security_dslPackage.JWT__CLAIMS:
			return getClaims();
		case Security_dslPackage.JWT__REGISTERED_CLAIMS:
			return getRegistered_claims();
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
		case Security_dslPackage.JWT__CLAIMS:
			getClaims().clear();
			getClaims().addAll((Collection<? extends Claim>) newValue);
			return;
		case Security_dslPackage.JWT__REGISTERED_CLAIMS:
			setRegistered_claims((RegisteredClaim) newValue);
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
		case Security_dslPackage.JWT__CLAIMS:
			getClaims().clear();
			return;
		case Security_dslPackage.JWT__REGISTERED_CLAIMS:
			setRegistered_claims((RegisteredClaim) null);
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
		case Security_dslPackage.JWT__CLAIMS:
			return claims != null && !claims.isEmpty();
		case Security_dslPackage.JWT__REGISTERED_CLAIMS:
			return registered_claims != null;
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
		case Security_dslPackage.JWT___REGISTERED_CLAIM_SUBJECT__DIAGNOSTICCHAIN_MAP:
			return registeredClaimSubject((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.JWT___SINGLE_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP:
			return singleRegisteredClaim((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.JWT___ROLE_MAX_TWO_ATTRIBUTES__DIAGNOSTICCHAIN_MAP:
			return roleMaxTwoAttributes((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.JWT___ROLE_ATTRIBUTE_TYPE__DIAGNOSTICCHAIN_MAP:
			return roleAttributeType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.JWT___UNIQUE_CLAIMS__DIAGNOSTICCHAIN_MAP:
			return uniqueClaims((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
