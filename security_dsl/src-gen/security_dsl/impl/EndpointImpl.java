/**
 */
package security_dsl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.library.string.StringAtOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import org.eclipse.ocl.pivot.values.TupleValue;
import security_dsl.EEndpointMethod;
import security_dsl.EEndpointType;
import security_dsl.Endpoint;
import security_dsl.RoleInstance;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.EndpointImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link security_dsl.impl.EndpointImpl#getType <em>Type</em>}</li>
 *   <li>{@link security_dsl.impl.EndpointImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link security_dsl.impl.EndpointImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link security_dsl.impl.EndpointImpl#getRole_authorities <em>Role authorities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointImpl extends MinimalEObjectImpl.Container implements Endpoint {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EEndpointType TYPE_EDEFAULT = EEndpointType.OTHER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EEndpointType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final EEndpointMethod METHOD_EDEFAULT = EEndpointMethod.GET;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EEndpointMethod method = METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRole_authorities() <em>Role authorities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_authorities()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleInstance> role_authorities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ENDPOINT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEndpointType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EEndpointType newType) {
		EEndpointType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ENDPOINT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ENDPOINT__METHOD_NAME,
					oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEndpointMethod getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(EEndpointMethod newMethod) {
		EEndpointMethod oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ENDPOINT__METHOD, oldMethod,
					method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleInstance> getRole_authorities() {
		if (role_authorities == null) {
			role_authorities = new EObjectResolvingEList<RoleInstance>(RoleInstance.class, this,
					Security_dslPackage.ENDPOINT__ROLE_AUTHORITIES);
		}
		return role_authorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueRoleAuthorities(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Endpoint::uniqueRoleAuthorities";
		try {
			/**
			 *
			 * inv uniqueRoleAuthorities:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = self.role_authorities->isUnique(r | r.name)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Role authorities must be unique for each endpoint!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.ENDPOINT___UNIQUE_ROLE_AUTHORITIES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ List<RoleInstance> role_authorities = this.getRole_authorities();
				final /*@NonInvalid*/ OrderedSetValue BOXED_role_authorities = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_RoleInstance, role_authorities);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_RoleInstance);
				Iterator<Object> ITERATOR_r = BOXED_role_authorities.iterator();
				/*@NonInvalid*/ boolean status;
				while (true) {
					if (!ITERATOR_r.hasNext()) {
						status = true;
						break;
					}
					/*@NonInvalid*/ RoleInstance r = (RoleInstance) ITERATOR_r.next();
					/**
					 * r.name
					 */
					final /*@NonInvalid*/ String name = r.getName();
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
							Security_dslTables.STR_Role_32_authorities_32_must_32_be_32_unique_32_for_32_each_32_endpoint_33,
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
	public boolean urlStartsWithForwardSlash(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Endpoint::urlStartsWithForwardSlash";
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
			 *         result : OclAny[1] = let status : Boolean[1] = self.url.at(1) = '/'
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Endpoint URL should start with a forward slash!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.ENDPOINT___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ String url = this.getUrl();
					final /*@Thrown*/ String at = StringAtOperation.INSTANCE.evaluate(url, Security_dslTables.INT_1);
					final /*@Thrown*/ boolean status = at.equals(Security_dslTables.STR_quot);
					/*@Thrown*/ Object local_1;
					if (status) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Endpoint_32_URL_32_should_32_start_32_with_32_a_32_forward_32_slash_33,
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
		case Security_dslPackage.ENDPOINT__URL:
			return getUrl();
		case Security_dslPackage.ENDPOINT__TYPE:
			return getType();
		case Security_dslPackage.ENDPOINT__METHOD_NAME:
			return getMethodName();
		case Security_dslPackage.ENDPOINT__METHOD:
			return getMethod();
		case Security_dslPackage.ENDPOINT__ROLE_AUTHORITIES:
			return getRole_authorities();
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
		case Security_dslPackage.ENDPOINT__URL:
			setUrl((String) newValue);
			return;
		case Security_dslPackage.ENDPOINT__TYPE:
			setType((EEndpointType) newValue);
			return;
		case Security_dslPackage.ENDPOINT__METHOD_NAME:
			setMethodName((String) newValue);
			return;
		case Security_dslPackage.ENDPOINT__METHOD:
			setMethod((EEndpointMethod) newValue);
			return;
		case Security_dslPackage.ENDPOINT__ROLE_AUTHORITIES:
			getRole_authorities().clear();
			getRole_authorities().addAll((Collection<? extends RoleInstance>) newValue);
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
		case Security_dslPackage.ENDPOINT__URL:
			setUrl(URL_EDEFAULT);
			return;
		case Security_dslPackage.ENDPOINT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Security_dslPackage.ENDPOINT__METHOD_NAME:
			setMethodName(METHOD_NAME_EDEFAULT);
			return;
		case Security_dslPackage.ENDPOINT__METHOD:
			setMethod(METHOD_EDEFAULT);
			return;
		case Security_dslPackage.ENDPOINT__ROLE_AUTHORITIES:
			getRole_authorities().clear();
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
		case Security_dslPackage.ENDPOINT__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case Security_dslPackage.ENDPOINT__TYPE:
			return type != TYPE_EDEFAULT;
		case Security_dslPackage.ENDPOINT__METHOD_NAME:
			return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
		case Security_dslPackage.ENDPOINT__METHOD:
			return method != METHOD_EDEFAULT;
		case Security_dslPackage.ENDPOINT__ROLE_AUTHORITIES:
			return role_authorities != null && !role_authorities.isEmpty();
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
		case Security_dslPackage.ENDPOINT___UNIQUE_ROLE_AUTHORITIES__DIAGNOSTICCHAIN_MAP:
			return uniqueRoleAuthorities((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.ENDPOINT___URL_STARTS_WITH_FORWARD_SLASH__DIAGNOSTICCHAIN_MAP:
			return urlStartsWithForwardSlash((DiagnosticChain) arguments.get(0),
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
		result.append(" (url: ");
		result.append(url);
		result.append(", type: ");
		result.append(type);
		result.append(", methodName: ");
		result.append(methodName);
		result.append(", method: ");
		result.append(method);
		result.append(')');
		return result.toString();
	}

} //EndpointImpl
