/**
 */
package security_dsl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringToIntegerOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import org.eclipse.ocl.pivot.values.TupleValue;

import security_dsl.Attribute;
import security_dsl.Claim;
import security_dsl.EClaimType;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.ClaimImpl#getType <em>Type</em>}</li>
 *   <li>{@link security_dsl.impl.ClaimImpl#getClaim_attribute <em>Claim attribute</em>}</li>
 *   <li>{@link security_dsl.impl.ClaimImpl#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.impl.ClaimImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimImpl extends MinimalEObjectImpl.Container implements Claim {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EClaimType TYPE_EDEFAULT = EClaimType.PRIVATE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EClaimType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClaim_attribute() <em>Claim attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaim_attribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute claim_attribute;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClaimType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EClaimType newType) {
		EClaimType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.CLAIM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getClaim_attribute() {
		if (claim_attribute != null && claim_attribute.eIsProxy()) {
			InternalEObject oldClaim_attribute = (InternalEObject) claim_attribute;
			claim_attribute = (Attribute) eResolveProxy(oldClaim_attribute);
			if (claim_attribute != oldClaim_attribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Security_dslPackage.CLAIM__CLAIM_ATTRIBUTE, oldClaim_attribute, claim_attribute));
			}
		}
		return claim_attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetClaim_attribute() {
		return claim_attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaim_attribute(Attribute newClaim_attribute) {
		Attribute oldClaim_attribute = claim_attribute;
		claim_attribute = newClaim_attribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.CLAIM__CLAIM_ATTRIBUTE,
					oldClaim_attribute, claim_attribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.CLAIM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.CLAIM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueClaimNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Claim::uniqueClaimNames";
		try {
			/**
			 *
			 * inv uniqueClaimNames:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = Claim.allInstances()
			 *           ->isUnique(c | c.name)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Claims must have unique names', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CLAIM___UNIQUE_CLAIM_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Claim_0 = idResolver
						.getClass(Security_dslTables.CLSSid_Claim, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
						.evaluate(executor, Security_dslTables.SET_CLSSid_Claim, TYP_security_dsl_c_c_Claim_0);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Claim);
				Iterator<Object> ITERATOR_c = allInstances.iterator();
				/*@NonInvalid*/ boolean status;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						status = true;
						break;
					}
					/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
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
							Security_dslTables.STR_Claims_32_must_32_have_32_unique_32_names, status);
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
	public boolean otherClaimsNoValue(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Claim::otherClaimsNoValue";
		try {
			/**
			 *
			 * inv otherClaimsNoValue:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Claim.allInstances()
			 *           ->select(c | c.name <> 'issuer' and c.name <> 'audience' and c.name <> 'expirationTime')
			 *           ->forAll(sc | sc.value = null and sc.claim_attribute <> null)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Claim must be linked to an attribute', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CLAIM___OTHER_CLAIMS_NO_VALUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Claim_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Claim, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, Security_dslTables.SET_CLSSid_Claim, TYP_security_dsl_c_c_Claim_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Claim);
					Iterator<Object> ITERATOR_c = allInstances.iterator();
					/*@Thrown*/ SetValue select;
					while (true) {
						if (!ITERATOR_c.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
						/**
						 * c.name <> 'issuer' and c.name <> 'audience' and c.name <> 'expirationTime'
						 */
						final /*@NonInvalid*/ String name_1 = c.getName();
						final /*@NonInvalid*/ boolean ne = !name_1.equals(Security_dslTables.STR_issuer);
						final /*@NonInvalid*/ Boolean and;
						if (!ne) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean ne_0 = !name_1.equals(Security_dslTables.STR_audience);
							if (!ne_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						final /*@Thrown*/ Boolean and_0;
						if (and == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean ne_1 = !name_1.equals(Security_dslTables.STR_expirationTime);
							if (!ne_1) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								if (and == null) {
									and_0 = null;
								} else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						if (and_0 == null) {
							throw new InvalidValueException(
									"Null body for \'Set(T).select(Set.T[?] | Lambda T() : Boolean[1]) : Set(T)\'");
						}
						//
						if (and_0 == ValueUtil.TRUE_VALUE) {
							accumulator.add(c);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_sc = select.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_sc.hasNext()) {
							if (accumulator_0 == null) {
								status = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								status = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Claim sc = (Claim) ITERATOR_sc.next();
						/**
						 * sc.value = null and sc.claim_attribute <> null
						 */
						final /*@NonInvalid*/ String value = sc.getValue();
						final /*@NonInvalid*/ boolean eq = value == null;
						final /*@NonInvalid*/ Boolean and_1;
						if (!eq) {
							and_1 = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ Attribute claim_attribute = sc.getClaim_attribute();
							final /*@NonInvalid*/ boolean ne_2 = claim_attribute != null;
							if (!ne_2) {
								and_1 = ValueUtil.FALSE_VALUE;
							} else {
								and_1 = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and_1 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							status = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (and_1 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (and_1 == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					final /*@Thrown*/ boolean eq_0 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_0) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Claim_32_must_32_be_32_linked_32_to_32_an_32_attribute, status);
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
	public boolean issuerRegisteredClaim(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Claim::issuerRegisteredClaim";
		try {
			/**
			 *
			 * inv issuerRegisteredClaim:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Claim.allInstances()
			 *           ->select(c | c.name = 'issuer')
			 *           ->forAll(sc | sc.type = EClaimType::REGISTERED)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'If claim name is "issuer", it must be of type REGISTERED', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CLAIM___ISSUER_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Claim_0 = idResolver
						.getClass(Security_dslTables.CLSSid_Claim, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
						.evaluate(executor, Security_dslTables.SET_CLSSid_Claim, TYP_security_dsl_c_c_Claim_0);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Claim);
				Iterator<Object> ITERATOR_c = allInstances.iterator();
				/*@NonInvalid*/ SetValue select;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
					/**
					 * c.name = 'issuer'
					 */
					final /*@NonInvalid*/ String name = c.getName();
					final /*@NonInvalid*/ boolean eq = name.equals(Security_dslTables.STR_issuer);
					//
					if (eq) {
						accumulator.add(c);
					}
				}
				/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_sc = select.iterator();
				/*@NonInvalid*/ Boolean status;
				while (true) {
					if (!ITERATOR_sc.hasNext()) {
						if (accumulator_0 == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator_0;
						}
						break;
					}
					/*@NonInvalid*/ Claim sc = (Claim) ITERATOR_sc.next();
					/**
					 * sc.type = EClaimType::REGISTERED
					 */
					final /*@NonInvalid*/ EClaimType type = sc.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EClaimType
							.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean eq_0 = BOXED_type == Security_dslTables.ELITid_REGISTERED;
					//
					if (!eq_0) { // Normal unsuccessful body evaluation result
						status = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (eq_0) { // Normal successful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean eq_1 = status == Boolean.TRUE;
				/*@NonInvalid*/ Object local_1;
				if (eq_1) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
							Security_dslTables.STR_If_32_claim_32_name_32_is_32_34_issuer_34_44_32_it_32_must_32_be_32_of_32_type_32_REGISTERED,
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
	public boolean uniqueClaimAttribute(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Claim::uniqueClaimAttribute";
		try {
			/**
			 *
			 * inv uniqueClaimAttribute:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = Claim.allInstances()
			 *           ->select(c | c.claim_attribute <> null)
			 *           ->isUnique(c | c.claim_attribute)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Claim attributes must be unique!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CLAIM___UNIQUE_CLAIM_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Claim = idResolver
							.getClass(Security_dslTables.CLSSid_Claim, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, Security_dslTables.SET_CLSSid_Claim, TYP_security_dsl_c_c_Claim);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Claim);
					Iterator<Object> ITERATOR_c = allInstances.iterator();
					/*@NonInvalid*/ SetValue select;
					while (true) {
						if (!ITERATOR_c.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
						/**
						 * c.claim_attribute <> null
						 */
						final /*@NonInvalid*/ Attribute claim_attribute = c.getClaim_attribute();
						final /*@NonInvalid*/ boolean ne = claim_attribute != null;
						//
						if (ne) {
							accumulator.add(c);
						}
					}
					/*@Thrown*/ Accumulator accumulator_0 = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Claim);
					Iterator<Object> ITERATOR_c_0 = select.iterator();
					/*@Thrown*/ boolean status;
					while (true) {
						if (!ITERATOR_c_0.hasNext()) {
							status = true;
							break;
						}
						/*@NonInvalid*/ Claim c_0 = (Claim) ITERATOR_c_0.next();
						/**
						 * c.claim_attribute
						 */
						final /*@NonInvalid*/ Attribute claim_attribute_0 = c_0.getClaim_attribute();
						//
						if (accumulator_0.includes(claim_attribute_0) == ValueUtil.TRUE_VALUE) {
							status = false;
							break; // Abort after second find
						} else {
							accumulator_0.add(claim_attribute_0);
						}
					}
					/*@Thrown*/ Object local_1;
					if (status) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Claim_32_attributes_32_must_32_be_32_unique_33, status);
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
	public boolean subjectRegisteredClaim(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Claim::subjectRegisteredClaim";
		try {
			/**
			 *
			 * inv subjectRegisteredClaim:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Claim.allInstances()
			 *           ->select(c | c.name = 'subject')
			 *           ->forAll(sc | sc.type = EClaimType::REGISTERED)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'If claim name is "subject", it must be of type REGISTERED', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CLAIM___SUBJECT_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Claim_0 = idResolver
						.getClass(Security_dslTables.CLSSid_Claim, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
						.evaluate(executor, Security_dslTables.SET_CLSSid_Claim, TYP_security_dsl_c_c_Claim_0);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Claim);
				Iterator<Object> ITERATOR_c = allInstances.iterator();
				/*@NonInvalid*/ SetValue select;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
					/**
					 * c.name = 'subject'
					 */
					final /*@NonInvalid*/ String name = c.getName();
					final /*@NonInvalid*/ boolean eq = name.equals(Security_dslTables.STR_subject);
					//
					if (eq) {
						accumulator.add(c);
					}
				}
				/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_sc = select.iterator();
				/*@NonInvalid*/ Boolean status;
				while (true) {
					if (!ITERATOR_sc.hasNext()) {
						if (accumulator_0 == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator_0;
						}
						break;
					}
					/*@NonInvalid*/ Claim sc = (Claim) ITERATOR_sc.next();
					/**
					 * sc.type = EClaimType::REGISTERED
					 */
					final /*@NonInvalid*/ EClaimType type = sc.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EClaimType
							.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean eq_0 = BOXED_type == Security_dslTables.ELITid_REGISTERED;
					//
					if (!eq_0) { // Normal unsuccessful body evaluation result
						status = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (eq_0) { // Normal successful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean eq_1 = status == Boolean.TRUE;
				/*@NonInvalid*/ Object local_1;
				if (eq_1) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
							Security_dslTables.STR_If_32_claim_32_name_32_is_32_34_subject_34_44_32_it_32_must_32_be_32_of_32_type_32_REGISTERED,
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
	public boolean audienceValueNotNull(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Claim::audienceValueNotNull";
		try {
			/**
			 *
			 * inv audienceValueNotNull:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Claim.allInstances()
			 *           ->select(c | c.name = 'audience')
			 *           ->forAll(sc | sc.value <> null and sc.claim_attribute = null)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'If the claim name is "audience", it must have value and must not be linked to an attribute', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CLAIM___AUDIENCE_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Claim_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Claim, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, Security_dslTables.SET_CLSSid_Claim, TYP_security_dsl_c_c_Claim_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Claim);
					Iterator<Object> ITERATOR_c = allInstances.iterator();
					/*@NonInvalid*/ SetValue select;
					while (true) {
						if (!ITERATOR_c.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
						/**
						 * c.name = 'audience'
						 */
						final /*@NonInvalid*/ String name = c.getName();
						final /*@NonInvalid*/ boolean eq = name.equals(Security_dslTables.STR_audience);
						//
						if (eq) {
							accumulator.add(c);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_sc = select.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_sc.hasNext()) {
							if (accumulator_0 == null) {
								status = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								status = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Claim sc = (Claim) ITERATOR_sc.next();
						/**
						 * sc.value <> null and sc.claim_attribute = null
						 */
						final /*@NonInvalid*/ String value = sc.getValue();
						final /*@NonInvalid*/ boolean ne = value != null;
						final /*@NonInvalid*/ Boolean and;
						if (!ne) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ Attribute claim_attribute = sc.getClaim_attribute();
							final /*@NonInvalid*/ boolean eq_0 = claim_attribute == null;
							if (!eq_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							status = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (and == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_1) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_If_32_the_32_claim_32_name_32_is_32_34_audience_34_44_32_it_32_must_32_have_32_value_32_and_32_must_32_not,
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
	public boolean expirationTimeValueIsPositiveNumeric(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Claim::expirationTimeValueIsPositiveNumeric";
		try {
			/**
			 *
			 * inv expirationTimeValueIsPositiveNumeric:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Claim.allInstances()
			 *           ->select(c | c.name = 'expirationTime')
			 *           ->forAll(sc | sc.value <> null and sc.value.toInteger() > 0)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'If the claim name is "expirationTime", the value must be a positive number', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CLAIM___EXPIRATION_TIME_VALUE_IS_POSITIVE_NUMERIC__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Claim_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Claim, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, Security_dslTables.SET_CLSSid_Claim, TYP_security_dsl_c_c_Claim_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Claim);
					Iterator<Object> ITERATOR_c = allInstances.iterator();
					/*@NonInvalid*/ SetValue select;
					while (true) {
						if (!ITERATOR_c.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
						/**
						 * c.name = 'expirationTime'
						 */
						final /*@NonInvalid*/ String name = c.getName();
						final /*@NonInvalid*/ boolean eq = name.equals(Security_dslTables.STR_expirationTime);
						//
						if (eq) {
							accumulator.add(c);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_sc = select.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_sc.hasNext()) {
							if (accumulator_0 == null) {
								status = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								status = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Claim sc = (Claim) ITERATOR_sc.next();
						/**
						 * sc.value <> null and sc.value.toInteger() > 0
						 */
						/*@Caught*/ Object CAUGHT_and;
						try {
							final /*@NonInvalid*/ String value = sc.getValue();
							final /*@NonInvalid*/ boolean ne = value != null;
							final /*@Thrown*/ Boolean and;
							if (!ne) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_gt;
								try {
									if (value == null) {
										throw new InvalidValueException(
												"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@Thrown*/ IntegerValue toInteger = StringToIntegerOperation.INSTANCE
											.evaluate(value);
									if (toInteger == null) {
										throw new InvalidValueException(
												"Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
											.evaluate(executor, toInteger, Security_dslTables.INT_0).booleanValue();
									CAUGHT_gt = gt;
								} catch (Exception e) {
									CAUGHT_gt = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_gt instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_gt;
									}
									and = ValueUtil.TRUE_VALUE;
								}
							}
							CAUGHT_and = and;
						} catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							status = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_and == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else if (CAUGHT_and instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator_0 = CAUGHT_and; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					final /*@Thrown*/ boolean eq_0 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_0) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_If_32_the_32_claim_32_name_32_is_32_34_expirationTime_34_44_32_the_32_value_32_must_32_be_32_a_32_posit,
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
	public boolean hasExpirationTimeClaim(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Claim::hasExpirationTimeClaim";
		try {
			/**
			 *
			 * inv hasExpirationTimeClaim:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Claim.allInstances()
			 *           ->exists(c | c.name = 'expirationTime' and c.type = EClaimType::REGISTERED)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'The claim "expirationTime" must exist and be of type REGISTERED', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CLAIM___HAS_EXPIRATION_TIME_CLAIM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Claim_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Claim, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, Security_dslTables.SET_CLSSid_Claim, TYP_security_dsl_c_c_Claim_0);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_c = allInstances.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_c.hasNext()) {
							if (accumulator == null) {
								status = null;
							} else if (accumulator == ValueUtil.FALSE_VALUE) {
								status = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
						/**
						 * c.name = 'expirationTime' and c.type = EClaimType::REGISTERED
						 */
						final /*@NonInvalid*/ String name = c.getName();
						final /*@NonInvalid*/ boolean eq = name.equals(Security_dslTables.STR_expirationTime);
						final /*@NonInvalid*/ Boolean and;
						if (!eq) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ EClaimType type = c.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EClaimType
									.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq_0 = BOXED_type == Security_dslTables.ELITid_REGISTERED;
							if (!eq_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							status = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else if (and == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.FALSE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_1) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_The_32_claim_32_34_expirationTime_34_32_must_32_exist_32_and_32_be_32_of_32_type_32_REGISTERED,
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
	public boolean hasAudienceClaim(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Claim::hasAudienceClaim";
		try {
			/**
			 *
			 * inv hasAudienceClaim:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Claim.allInstances()
			 *           ->exists(c | c.name = 'audience' and c.type = EClaimType::REGISTERED)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'The claim "audience" must exist and be of type REGISTERED', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CLAIM___HAS_AUDIENCE_CLAIM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Claim_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Claim, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, Security_dslTables.SET_CLSSid_Claim, TYP_security_dsl_c_c_Claim_0);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_c = allInstances.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_c.hasNext()) {
							if (accumulator == null) {
								status = null;
							} else if (accumulator == ValueUtil.FALSE_VALUE) {
								status = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
						/**
						 * c.name = 'audience' and c.type = EClaimType::REGISTERED
						 */
						final /*@NonInvalid*/ String name = c.getName();
						final /*@NonInvalid*/ boolean eq = name.equals(Security_dslTables.STR_audience);
						final /*@NonInvalid*/ Boolean and;
						if (!eq) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ EClaimType type = c.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EClaimType
									.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq_0 = BOXED_type == Security_dslTables.ELITid_REGISTERED;
							if (!eq_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							status = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else if (and == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.FALSE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_1) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_The_32_claim_32_34_audience_34_32_must_32_exist_32_and_32_be_32_of_32_type_32_REGISTERED,
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
	public boolean expirationTimeValueNotNull(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Claim::expirationTimeValueNotNull";
		try {
			/**
			 *
			 * inv expirationTimeValueNotNull:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Claim.allInstances()
			 *           ->select(c | c.name = 'expirationTime')
			 *           ->forAll(sc | sc.value <> null and sc.claim_attribute = null)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'If the claim name is "expirationTime", it must have value and must not be linked to an attribute', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CLAIM___EXPIRATION_TIME_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Claim_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Claim, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, Security_dslTables.SET_CLSSid_Claim, TYP_security_dsl_c_c_Claim_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Claim);
					Iterator<Object> ITERATOR_c = allInstances.iterator();
					/*@NonInvalid*/ SetValue select;
					while (true) {
						if (!ITERATOR_c.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
						/**
						 * c.name = 'expirationTime'
						 */
						final /*@NonInvalid*/ String name = c.getName();
						final /*@NonInvalid*/ boolean eq = name.equals(Security_dslTables.STR_expirationTime);
						//
						if (eq) {
							accumulator.add(c);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_sc = select.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_sc.hasNext()) {
							if (accumulator_0 == null) {
								status = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								status = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Claim sc = (Claim) ITERATOR_sc.next();
						/**
						 * sc.value <> null and sc.claim_attribute = null
						 */
						final /*@NonInvalid*/ String value = sc.getValue();
						final /*@NonInvalid*/ boolean ne = value != null;
						final /*@NonInvalid*/ Boolean and;
						if (!ne) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ Attribute claim_attribute = sc.getClaim_attribute();
							final /*@NonInvalid*/ boolean eq_0 = claim_attribute == null;
							if (!eq_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							status = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (and == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_1) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_If_32_the_32_claim_32_name_32_is_32_34_expirationTime_34_44_32_it_32_must_32_have_32_value_32_and_32_mu,
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
	public boolean issuerValueNotNull(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Claim::issuerValueNotNull";
		try {
			/**
			 *
			 * inv issuerValueNotNull:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = Claim.allInstances()
			 *           ->select(c | c.name = 'issuer')
			 *           ->forAll(sc | sc.value <> null and sc.claim_attribute = null)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'If the claim name is "issuer", it must have value and must not be linked to an attribute', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.CLAIM___ISSUER_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Claim_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Claim, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, Security_dslTables.SET_CLSSid_Claim, TYP_security_dsl_c_c_Claim_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Claim);
					Iterator<Object> ITERATOR_c = allInstances.iterator();
					/*@NonInvalid*/ SetValue select;
					while (true) {
						if (!ITERATOR_c.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Claim c = (Claim) ITERATOR_c.next();
						/**
						 * c.name = 'issuer'
						 */
						final /*@NonInvalid*/ String name = c.getName();
						final /*@NonInvalid*/ boolean eq = name.equals(Security_dslTables.STR_issuer);
						//
						if (eq) {
							accumulator.add(c);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_sc = select.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_sc.hasNext()) {
							if (accumulator_0 == null) {
								status = null;
							} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								status = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Claim sc = (Claim) ITERATOR_sc.next();
						/**
						 * sc.value <> null and sc.claim_attribute = null
						 */
						final /*@NonInvalid*/ String value = sc.getValue();
						final /*@NonInvalid*/ boolean ne = value != null;
						final /*@NonInvalid*/ Boolean and;
						if (!ne) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ Attribute claim_attribute = sc.getClaim_attribute();
							final /*@NonInvalid*/ boolean eq_0 = claim_attribute == null;
							if (!eq_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							status = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (and == null) { // Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_1) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_If_32_the_32_claim_32_name_32_is_32_34_issuer_34_44_32_it_32_must_32_have_32_value_32_and_32_must_32_not_32_b,
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Security_dslPackage.CLAIM__TYPE:
			return getType();
		case Security_dslPackage.CLAIM__CLAIM_ATTRIBUTE:
			if (resolve)
				return getClaim_attribute();
			return basicGetClaim_attribute();
		case Security_dslPackage.CLAIM__NAME:
			return getName();
		case Security_dslPackage.CLAIM__VALUE:
			return getValue();
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
		case Security_dslPackage.CLAIM__TYPE:
			setType((EClaimType) newValue);
			return;
		case Security_dslPackage.CLAIM__CLAIM_ATTRIBUTE:
			setClaim_attribute((Attribute) newValue);
			return;
		case Security_dslPackage.CLAIM__NAME:
			setName((String) newValue);
			return;
		case Security_dslPackage.CLAIM__VALUE:
			setValue((String) newValue);
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
		case Security_dslPackage.CLAIM__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Security_dslPackage.CLAIM__CLAIM_ATTRIBUTE:
			setClaim_attribute((Attribute) null);
			return;
		case Security_dslPackage.CLAIM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Security_dslPackage.CLAIM__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case Security_dslPackage.CLAIM__TYPE:
			return type != TYPE_EDEFAULT;
		case Security_dslPackage.CLAIM__CLAIM_ATTRIBUTE:
			return claim_attribute != null;
		case Security_dslPackage.CLAIM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Security_dslPackage.CLAIM__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		case Security_dslPackage.CLAIM___UNIQUE_CLAIM_NAMES__DIAGNOSTICCHAIN_MAP:
			return uniqueClaimNames((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CLAIM___OTHER_CLAIMS_NO_VALUE__DIAGNOSTICCHAIN_MAP:
			return otherClaimsNoValue((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CLAIM___ISSUER_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP:
			return issuerRegisteredClaim((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CLAIM___UNIQUE_CLAIM_ATTRIBUTE__DIAGNOSTICCHAIN_MAP:
			return uniqueClaimAttribute((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CLAIM___SUBJECT_REGISTERED_CLAIM__DIAGNOSTICCHAIN_MAP:
			return subjectRegisteredClaim((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CLAIM___AUDIENCE_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP:
			return audienceValueNotNull((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CLAIM___EXPIRATION_TIME_VALUE_IS_POSITIVE_NUMERIC__DIAGNOSTICCHAIN_MAP:
			return expirationTimeValueIsPositiveNumeric((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CLAIM___HAS_EXPIRATION_TIME_CLAIM__DIAGNOSTICCHAIN_MAP:
			return hasExpirationTimeClaim((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CLAIM___HAS_AUDIENCE_CLAIM__DIAGNOSTICCHAIN_MAP:
			return hasAudienceClaim((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CLAIM___EXPIRATION_TIME_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP:
			return expirationTimeValueNotNull((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.CLAIM___ISSUER_VALUE_NOT_NULL__DIAGNOSTICCHAIN_MAP:
			return issuerValueNotNull((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ClaimImpl
