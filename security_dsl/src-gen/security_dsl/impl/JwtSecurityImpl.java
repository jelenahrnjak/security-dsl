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

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import security_dsl.Claim;
import security_dsl.JwtSecurity;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jwt Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.JwtSecurityImpl#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link security_dsl.impl.JwtSecurityImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link security_dsl.impl.JwtSecurityImpl#getExpirationTime <em>Expiration Time</em>}</li>
 *   <li>{@link security_dsl.impl.JwtSecurityImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link security_dsl.impl.JwtSecurityImpl#getSecret <em>Secret</em>}</li>
 *   <li>{@link security_dsl.impl.JwtSecurityImpl#getSecurity_claims <em>Security claims</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JwtSecurityImpl extends SecurityImpl implements JwtSecurity {
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
	 * The default value of the '{@link #getSecret() <em>Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_EDEFAULT = null;

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
	 * The cached value of the '{@link #getSecurity_claims() <em>Security claims</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_claims()
	 * @generated
	 * @ordered
	 */
	protected EList<Claim> security_claims;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JwtSecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.JWT_SECURITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.JWT_SECURITY__SIGNATURE_ALGORITHM,
					oldSignatureAlgorithm, signatureAlgorithm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.JWT_SECURITY__ISSUER, oldIssuer,
					issuer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.JWT_SECURITY__EXPIRATION_TIME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.JWT_SECURITY__AUDIENCE,
					oldAudience, audience));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.JWT_SECURITY__SECRET, oldSecret,
					secret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Claim> getSecurity_claims() {
		if (security_claims == null) {
			security_claims = new EObjectContainmentEList<Claim>(Claim.class, this,
					Security_dslPackage.JWT_SECURITY__SECURITY_CLAIMS);
		}
		return security_claims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueClaims(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "JwtSecurity::uniqueClaims";
		try {
			/**
			 *
			 * inv uniqueClaims:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.security_claims->isUnique(c | c.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.JWT_SECURITY___UNIQUE_CLAIMS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ List<Claim> security_claims = this.getSecurity_claims();
				final /*@NonInvalid*/ OrderedSetValue BOXED_security_claims = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Claim, security_claims);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Claim);
				Iterator<Object> ITERATOR_c = BOXED_security_claims.iterator();
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
	public boolean expirationTimeGreaterThanZero(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "JwtSecurity::expirationTimeGreaterThanZero";
		try {
			/**
			 *
			 * inv expirationTimeGreaterThanZero:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.expirationTime > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.JWT_SECURITY___EXPIRATION_TIME_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ int expirationTime = this.getExpirationTime();
				final /*@NonInvalid*/ IntegerValue BOXED_expirationTime = ValueUtil.integerValueOf(expirationTime);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, BOXED_expirationTime, Security_dslTables.INT_0).booleanValue();
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
		case Security_dslPackage.JWT_SECURITY__SECURITY_CLAIMS:
			return ((InternalEList<?>) getSecurity_claims()).basicRemove(otherEnd, msgs);
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
		case Security_dslPackage.JWT_SECURITY__SIGNATURE_ALGORITHM:
			return getSignatureAlgorithm();
		case Security_dslPackage.JWT_SECURITY__ISSUER:
			return getIssuer();
		case Security_dslPackage.JWT_SECURITY__EXPIRATION_TIME:
			return getExpirationTime();
		case Security_dslPackage.JWT_SECURITY__AUDIENCE:
			return getAudience();
		case Security_dslPackage.JWT_SECURITY__SECRET:
			return getSecret();
		case Security_dslPackage.JWT_SECURITY__SECURITY_CLAIMS:
			return getSecurity_claims();
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
		case Security_dslPackage.JWT_SECURITY__SIGNATURE_ALGORITHM:
			setSignatureAlgorithm((String) newValue);
			return;
		case Security_dslPackage.JWT_SECURITY__ISSUER:
			setIssuer((String) newValue);
			return;
		case Security_dslPackage.JWT_SECURITY__EXPIRATION_TIME:
			setExpirationTime((Integer) newValue);
			return;
		case Security_dslPackage.JWT_SECURITY__AUDIENCE:
			setAudience((String) newValue);
			return;
		case Security_dslPackage.JWT_SECURITY__SECRET:
			setSecret((String) newValue);
			return;
		case Security_dslPackage.JWT_SECURITY__SECURITY_CLAIMS:
			getSecurity_claims().clear();
			getSecurity_claims().addAll((Collection<? extends Claim>) newValue);
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
		case Security_dslPackage.JWT_SECURITY__SIGNATURE_ALGORITHM:
			setSignatureAlgorithm(SIGNATURE_ALGORITHM_EDEFAULT);
			return;
		case Security_dslPackage.JWT_SECURITY__ISSUER:
			setIssuer(ISSUER_EDEFAULT);
			return;
		case Security_dslPackage.JWT_SECURITY__EXPIRATION_TIME:
			setExpirationTime(EXPIRATION_TIME_EDEFAULT);
			return;
		case Security_dslPackage.JWT_SECURITY__AUDIENCE:
			setAudience(AUDIENCE_EDEFAULT);
			return;
		case Security_dslPackage.JWT_SECURITY__SECRET:
			setSecret(SECRET_EDEFAULT);
			return;
		case Security_dslPackage.JWT_SECURITY__SECURITY_CLAIMS:
			getSecurity_claims().clear();
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
		case Security_dslPackage.JWT_SECURITY__SIGNATURE_ALGORITHM:
			return SIGNATURE_ALGORITHM_EDEFAULT == null ? signatureAlgorithm != null
					: !SIGNATURE_ALGORITHM_EDEFAULT.equals(signatureAlgorithm);
		case Security_dslPackage.JWT_SECURITY__ISSUER:
			return ISSUER_EDEFAULT == null ? issuer != null : !ISSUER_EDEFAULT.equals(issuer);
		case Security_dslPackage.JWT_SECURITY__EXPIRATION_TIME:
			return expirationTime != EXPIRATION_TIME_EDEFAULT;
		case Security_dslPackage.JWT_SECURITY__AUDIENCE:
			return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
		case Security_dslPackage.JWT_SECURITY__SECRET:
			return SECRET_EDEFAULT == null ? secret != null : !SECRET_EDEFAULT.equals(secret);
		case Security_dslPackage.JWT_SECURITY__SECURITY_CLAIMS:
			return security_claims != null && !security_claims.isEmpty();
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
		case Security_dslPackage.JWT_SECURITY___UNIQUE_CLAIMS__DIAGNOSTICCHAIN_MAP:
			return uniqueClaims((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.JWT_SECURITY___EXPIRATION_TIME_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (signatureAlgorithm: ");
		result.append(signatureAlgorithm);
		result.append(", issuer: ");
		result.append(issuer);
		result.append(", expirationTime: ");
		result.append(expirationTime);
		result.append(", audience: ");
		result.append(audience);
		result.append(", secret: ");
		result.append(secret);
		result.append(')');
		return result.toString();
	}

} //JwtSecurityImpl
