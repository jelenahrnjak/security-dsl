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

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import security_dsl.Attribute;
import security_dsl.EType;
import security_dsl.Model;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.ModelImpl#getIdentifierName <em>Identifier Name</em>}</li>
 *   <li>{@link security_dsl.impl.ModelImpl#getIdentifierType <em>Identifier Type</em>}</li>
 *   <li>{@link security_dsl.impl.ModelImpl#getModel_attributes <em>Model attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The default value of the '{@link #getIdentifierName() <em>Identifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierName()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifierName() <em>Identifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierName()
	 * @generated
	 * @ordered
	 */
	protected String identifierName = IDENTIFIER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifierType() <em>Identifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierType()
	 * @generated
	 * @ordered
	 */
	protected static final EType IDENTIFIER_TYPE_EDEFAULT = EType.INT;

	/**
	 * The cached value of the '{@link #getIdentifierType() <em>Identifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierType()
	 * @generated
	 * @ordered
	 */
	protected EType identifierType = IDENTIFIER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModel_attributes() <em>Model attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel_attributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> model_attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifierName() {
		return identifierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifierName(String newIdentifierName) {
		String oldIdentifierName = identifierName;
		identifierName = newIdentifierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.MODEL__IDENTIFIER_NAME,
					oldIdentifierName, identifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType getIdentifierType() {
		return identifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifierType(EType newIdentifierType) {
		EType oldIdentifierType = identifierType;
		identifierType = newIdentifierType == null ? IDENTIFIER_TYPE_EDEFAULT : newIdentifierType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.MODEL__IDENTIFIER_TYPE,
					oldIdentifierType, identifierType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getModel_attributes() {
		if (model_attributes == null) {
			model_attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					Security_dslPackage.MODEL__MODEL_ATTRIBUTES);
		}
		return model_attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueAttributeName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Model::uniqueAttributeName";
		try {
			/**
			 *
			 * inv uniqueAttributeName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.model_attributes->isUnique(a | a.name) and
			 *         not self.model_attributes->exists(a | (a.name = self.identifierName))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Attribute> model_attributes = this.getModel_attributes();
					final /*@NonInvalid*/ OrderedSetValue BOXED_model_attributes = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute, model_attributes);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Attribute);
					Iterator<Object> ITERATOR_a = BOXED_model_attributes.iterator();
					/*@NonInvalid*/ boolean isUnique;
					while (true) {
						if (!ITERATOR_a.hasNext()) {
							isUnique = true;
							break;
						}
						/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
						/**
						 * a.name
						 */
						final /*@NonInvalid*/ String name = a.getName();
						//
						if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
							isUnique = false;
							break; // Abort after second find
						} else {
							accumulator.add(name);
						}
					}
					final /*@Thrown*/ Boolean result;
					if (!isUnique) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_not;
						try {
							/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_a_0 = BOXED_model_attributes.iterator();
							/*@NonInvalid*/ Boolean exists;
							while (true) {
								if (!ITERATOR_a_0.hasNext()) {
									if (accumulator_0 == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator_0;
									}
									break;
								}
								/*@NonInvalid*/ Attribute a_0 = (Attribute) ITERATOR_a_0.next();
								/**
								 * a.name = self.identifierName
								 */
								final /*@NonInvalid*/ String name_0 = a_0.getName();
								final /*@NonInvalid*/ String identifierName = this.getIdentifierName();
								final /*@NonInvalid*/ boolean eq = name_0.equals(identifierName);
								//
								if (eq) { // Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (!eq) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else { // Impossible badly typed result
									accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							final /*@Thrown*/ Boolean not;
							if (exists == ValueUtil.FALSE_VALUE) {
								not = ValueUtil.TRUE_VALUE;
							} else {
								if (exists == ValueUtil.TRUE_VALUE) {
									not = ValueUtil.FALSE_VALUE;
								} else {
									not = null;
								}
							}
							CAUGHT_not = not;
						} catch (Exception e) {
							CAUGHT_not = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_not == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not;
							}
							if (CAUGHT_not == null) {
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Security_dslPackage.MODEL__MODEL_ATTRIBUTES:
			return ((InternalEList<?>) getModel_attributes()).basicRemove(otherEnd, msgs);
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
		case Security_dslPackage.MODEL__IDENTIFIER_NAME:
			return getIdentifierName();
		case Security_dslPackage.MODEL__IDENTIFIER_TYPE:
			return getIdentifierType();
		case Security_dslPackage.MODEL__MODEL_ATTRIBUTES:
			return getModel_attributes();
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
		case Security_dslPackage.MODEL__IDENTIFIER_NAME:
			setIdentifierName((String) newValue);
			return;
		case Security_dslPackage.MODEL__IDENTIFIER_TYPE:
			setIdentifierType((EType) newValue);
			return;
		case Security_dslPackage.MODEL__MODEL_ATTRIBUTES:
			getModel_attributes().clear();
			getModel_attributes().addAll((Collection<? extends Attribute>) newValue);
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
		case Security_dslPackage.MODEL__IDENTIFIER_NAME:
			setIdentifierName(IDENTIFIER_NAME_EDEFAULT);
			return;
		case Security_dslPackage.MODEL__IDENTIFIER_TYPE:
			setIdentifierType(IDENTIFIER_TYPE_EDEFAULT);
			return;
		case Security_dslPackage.MODEL__MODEL_ATTRIBUTES:
			getModel_attributes().clear();
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
		case Security_dslPackage.MODEL__IDENTIFIER_NAME:
			return IDENTIFIER_NAME_EDEFAULT == null ? identifierName != null
					: !IDENTIFIER_NAME_EDEFAULT.equals(identifierName);
		case Security_dslPackage.MODEL__IDENTIFIER_TYPE:
			return identifierType != IDENTIFIER_TYPE_EDEFAULT;
		case Security_dslPackage.MODEL__MODEL_ATTRIBUTES:
			return model_attributes != null && !model_attributes.isEmpty();
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
		case Security_dslPackage.MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP:
			return uniqueAttributeName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (identifierName: ");
		result.append(identifierName);
		result.append(", identifierType: ");
		result.append(identifierType);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
