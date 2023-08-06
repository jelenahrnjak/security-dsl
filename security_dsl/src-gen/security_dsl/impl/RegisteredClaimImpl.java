/**
 */
package security_dsl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

import org.eclipse.ocl.pivot.values.TupleValue;
import security_dsl.RegisteredClaim;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registered Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.RegisteredClaimImpl#getExpirationTime <em>Expiration Time</em>}</li>
 *   <li>{@link security_dsl.impl.RegisteredClaimImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link security_dsl.impl.RegisteredClaimImpl#getIssuer <em>Issuer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisteredClaimImpl extends MinimalEObjectImpl.Container implements RegisteredClaim {
	/**
	 * The default value of the '{@link #getExpirationTime() <em>Expiration Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationTime()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRATION_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpirationTime() <em>Expiration Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationTime()
	 * @generated
	 * @ordered
	 */
	protected int expirationTime = EXPIRATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudience() <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudience()
	 * @generated
	 * @ordered
	 */
	protected static final String AUDIENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAudience() <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudience()
	 * @generated
	 * @ordered
	 */
	protected String audience = AUDIENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssuer() <em>Issuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuer() <em>Issuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected String issuer = ISSUER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.REGISTERED_CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpirationTime() {
		return expirationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationTime(int newExpirationTime) {
		int oldExpirationTime = expirationTime;
		expirationTime = newExpirationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.REGISTERED_CLAIM__EXPIRATION_TIME,
					oldExpirationTime, expirationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAudience() {
		return audience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudience(String newAudience) {
		String oldAudience = audience;
		audience = newAudience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.REGISTERED_CLAIM__AUDIENCE,
					oldAudience, audience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssuer() {
		return issuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuer(String newIssuer) {
		String oldIssuer = issuer;
		issuer = newIssuer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.REGISTERED_CLAIM__ISSUER,
					oldIssuer, issuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean expirationTimeGreaterThanZero(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "RegisteredClaim::expirationTimeGreaterThanZero";
		try {
			/**
			 *
			 * inv expirationTimeGreaterThanZero:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[1] = self.expirationTime > 0
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Expiration time must be greater than zero!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.REGISTERED_CLAIM___EXPIRATION_TIME_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ int expirationTime = this.getExpirationTime();
				final /*@NonInvalid*/ IntegerValue BOXED_expirationTime = ValueUtil.integerValueOf(expirationTime);
				final /*@NonInvalid*/ boolean status = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, BOXED_expirationTime, Security_dslTables.INT_0).booleanValue();
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
							Security_dslTables.STR_Expiration_32_time_32_must_32_be_32_greater_32_than_32_zero_33,
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Security_dslPackage.REGISTERED_CLAIM__EXPIRATION_TIME:
			return getExpirationTime();
		case Security_dslPackage.REGISTERED_CLAIM__AUDIENCE:
			return getAudience();
		case Security_dslPackage.REGISTERED_CLAIM__ISSUER:
			return getIssuer();
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
		case Security_dslPackage.REGISTERED_CLAIM__EXPIRATION_TIME:
			setExpirationTime((Integer) newValue);
			return;
		case Security_dslPackage.REGISTERED_CLAIM__AUDIENCE:
			setAudience((String) newValue);
			return;
		case Security_dslPackage.REGISTERED_CLAIM__ISSUER:
			setIssuer((String) newValue);
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
		case Security_dslPackage.REGISTERED_CLAIM__EXPIRATION_TIME:
			setExpirationTime(EXPIRATION_TIME_EDEFAULT);
			return;
		case Security_dslPackage.REGISTERED_CLAIM__AUDIENCE:
			setAudience(AUDIENCE_EDEFAULT);
			return;
		case Security_dslPackage.REGISTERED_CLAIM__ISSUER:
			setIssuer(ISSUER_EDEFAULT);
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
		case Security_dslPackage.REGISTERED_CLAIM__EXPIRATION_TIME:
			return expirationTime != EXPIRATION_TIME_EDEFAULT;
		case Security_dslPackage.REGISTERED_CLAIM__AUDIENCE:
			return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
		case Security_dslPackage.REGISTERED_CLAIM__ISSUER:
			return ISSUER_EDEFAULT == null ? issuer != null : !ISSUER_EDEFAULT.equals(issuer);
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
		case Security_dslPackage.REGISTERED_CLAIM___EXPIRATION_TIME_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
			return expirationTimeGreaterThanZero((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
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
		result.append(" (expirationTime: ");
		result.append(expirationTime);
		result.append(", audience: ");
		result.append(audience);
		result.append(", issuer: ");
		result.append(issuer);
		result.append(')');
		return result.toString();
	}

} //RegisteredClaimImpl
