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

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

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

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

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
 *   <li>{@link security_dsl.impl.ModelImpl#getModel_attributes <em>Model attributes</em>}</li>
 *   <li>{@link security_dsl.impl.ModelImpl#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelImpl extends MinimalEObjectImpl.Container implements Model {
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
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

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
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.MODEL__TABLE_NAME, oldTableName,
					tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean roleCanHaveIdAndStringAttribute(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Model::roleCanHaveIdAndStringAttribute";
		try {
			/**
			 *
			 * inv roleCanHaveIdAndStringAttribute:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.oclIsTypeOf(Role) implies
			 *         self.model_attributes->select(a |
			 *           (a.type = EType::String and a.isIdentifier = true
			 *           ))
			 *         ->size() = 1 or
			 *         self.model_attributes->select(a |
			 *           (a.type = EType::String and a.isIdentifier = false
			 *           ))
			 *         ->size() = 1 and
			 *         self.model_attributes->select(a | a.isIdentifier = true)
			 *         ->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.MODEL___ROLE_CAN_HAVE_ID_AND_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Role_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Role, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, this, TYP_security_dsl_c_c_Role_0).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (!oclIsTypeOf) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_or;
						try {
							/*@Caught*/ Object CAUGHT_eq_0;
							try {
								final /*@NonInvalid*/ List<Attribute> model_attributes = this.getModel_attributes();
								final /*@NonInvalid*/ OrderedSetValue BOXED_model_attributes = idResolver
										.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute,
												model_attributes);
								/*@Thrown*/ Accumulator accumulator = ValueUtil
										.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Attribute);
								Iterator<Object> ITERATOR_a = BOXED_model_attributes.iterator();
								/*@Thrown*/ OrderedSetValue select;
								while (true) {
									if (!ITERATOR_a.hasNext()) {
										select = accumulator;
										break;
									}
									/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
									/**
									 * a.type = EType::String and a.isIdentifier = true
									 */
									final /*@NonInvalid*/ EType type = a.getType();
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EType
											.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
									final /*@NonInvalid*/ boolean eq = BOXED_type == Security_dslTables.ELITid_String;
									final /*@NonInvalid*/ Boolean and;
									if (!eq) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										final /*@NonInvalid*/ boolean isIdentifier = a.isIsIdentifier();
										if (!isIdentifier) {
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
										accumulator.add(a);
									}
								}
								final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
								final /*@Thrown*/ boolean eq_0 = size.equals(Security_dslTables.INT_1);
								CAUGHT_eq_0 = eq_0;
							} catch (Exception e) {
								CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or;
							if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_and_1;
								try {
									final /*@NonInvalid*/ List<Attribute> model_attributes_1 = this
											.getModel_attributes();
									final /*@NonInvalid*/ OrderedSetValue BOXED_model_attributes_1 = idResolver
											.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute,
													model_attributes_1);
									/*@Caught*/ Object CAUGHT_eq_3;
									try {
										/*@Thrown*/ Accumulator accumulator_0 = ValueUtil
												.createOrderedSetAccumulatorValue(
														Security_dslTables.ORD_CLSSid_Attribute);
										Iterator<Object> ITERATOR_a_0 = BOXED_model_attributes_1.iterator();
										/*@Thrown*/ OrderedSetValue select_0;
										while (true) {
											if (!ITERATOR_a_0.hasNext()) {
												select_0 = accumulator_0;
												break;
											}
											/*@NonInvalid*/ Attribute a_0 = (Attribute) ITERATOR_a_0.next();
											/**
											 * a.type = EType::String and a.isIdentifier = false
											 */
											final /*@NonInvalid*/ EType type_0 = a_0.getType();
											final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = Security_dslTables.ENUMid_EType
													.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
											final /*@NonInvalid*/ boolean eq_1 = BOXED_type_0 == Security_dslTables.ELITid_String;
											final /*@NonInvalid*/ Boolean and_0;
											if (!eq_1) {
												and_0 = ValueUtil.FALSE_VALUE;
											} else {
												final /*@NonInvalid*/ boolean isIdentifier_0 = a_0.isIsIdentifier();
												final /*@NonInvalid*/ boolean eq_2 = !isIdentifier_0;
												if (!eq_2) {
													and_0 = ValueUtil.FALSE_VALUE;
												} else {
													and_0 = ValueUtil.TRUE_VALUE;
												}
											}
											if (and_0 == null) {
												throw new InvalidValueException(
														"Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
											}
											//
											if (and_0 == ValueUtil.TRUE_VALUE) {
												accumulator_0.add(a_0);
											}
										}
										final /*@Thrown*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
												.evaluate(select_0);
										final /*@Thrown*/ boolean eq_3 = size_0.equals(Security_dslTables.INT_1);
										CAUGHT_eq_3 = eq_3;
									} catch (Exception e) {
										CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean and_1;
									if (CAUGHT_eq_3 == ValueUtil.FALSE_VALUE) {
										and_1 = ValueUtil.FALSE_VALUE;
									} else {
										/*@Thrown*/ Accumulator accumulator_1 = ValueUtil
												.createOrderedSetAccumulatorValue(
														Security_dslTables.ORD_CLSSid_Attribute);
										Iterator<Object> ITERATOR_a_1 = BOXED_model_attributes_1.iterator();
										/*@NonInvalid*/ OrderedSetValue select_1;
										while (true) {
											if (!ITERATOR_a_1.hasNext()) {
												select_1 = accumulator_1;
												break;
											}
											/*@NonInvalid*/ Attribute a_1 = (Attribute) ITERATOR_a_1.next();
											/**
											 * a.isIdentifier
											 */
											final /*@NonInvalid*/ boolean isIdentifier_1 = a_1.isIsIdentifier();
											//
											if (isIdentifier_1) {
												accumulator_1.add(a_1);
											}
										}
										final /*@NonInvalid*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE
												.evaluate(select_1);
										final /*@NonInvalid*/ boolean eq_4 = size_1.equals(Security_dslTables.INT_1);
										if (!eq_4) {
											and_1 = ValueUtil.FALSE_VALUE;
										} else {
											if (CAUGHT_eq_3 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_3;
											}
											and_1 = ValueUtil.TRUE_VALUE;
										}
									}
									CAUGHT_and_1 = and_1;
								} catch (Exception e) {
									CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_and_1 == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_eq_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq_0;
									}
									if (CAUGHT_and_1 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_1;
									}
									if (CAUGHT_and_1 == null) {
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
	public boolean roleCantHaveAdditionalAttributes(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Model::roleCantHaveAdditionalAttributes";
		try {
			/**
			 *
			 * inv roleCantHaveAdditionalAttributes:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.oclIsTypeOf(Role) implies
			 *         self.model_attributes->size() <= 2
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.MODEL___ROLE_CANT_HAVE_ADDITIONAL_ATTRIBUTES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Role_0 = idResolver
						.getClass(Security_dslTables.CLSSid_Role, null);
				final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
						.evaluate(executor, this, TYP_security_dsl_c_c_Role_0).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!oclIsTypeOf) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ List<Attribute> model_attributes = this.getModel_attributes();
					final /*@NonInvalid*/ OrderedSetValue BOXED_model_attributes = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute, model_attributes);
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
							.evaluate(BOXED_model_attributes);
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
							.evaluate(executor, size, Security_dslTables.INT_2).booleanValue();
					if (le_0) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
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
	public boolean uniqueCollumnName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Model::uniqueCollumnName";
		try {
			/**
			 *
			 * inv uniqueCollumnName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.model_attributes->exists(a | a.collumnName <> null) implies
			 *         self.model_attributes->isUnique(a | a.collumnName)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.MODEL___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP);
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
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_a = BOXED_model_attributes.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_a.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
						/**
						 * a.collumnName <> null
						 */
						final /*@NonInvalid*/ String collumnName = a.getCollumnName();
						final /*@NonInvalid*/ boolean ne = collumnName != null;
						//
						if (ne) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!ne) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ Boolean result;
					if (exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_isUnique;
						try {
							/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil
									.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Attribute);
							Iterator<Object> ITERATOR_a_0 = BOXED_model_attributes.iterator();
							/*@Thrown*/ boolean isUnique;
							while (true) {
								if (!ITERATOR_a_0.hasNext()) {
									isUnique = true;
									break;
								}
								/*@NonInvalid*/ Attribute a_0 = (Attribute) ITERATOR_a_0.next();
								/**
								 * a.collumnName
								 */
								final /*@NonInvalid*/ String collumnName_0 = a_0.getCollumnName();
								//
								if (accumulator_0.includes(collumnName_0) == ValueUtil.TRUE_VALUE) {
									isUnique = false;
									break; // Abort after second find
								} else {
									accumulator_0.add(collumnName_0);
								}
							}
							CAUGHT_isUnique = isUnique;
						} catch (Exception e) {
							CAUGHT_isUnique = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_isUnique == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_isUnique instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_isUnique;
							}
							if (exists == null) {
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
	public boolean onlyOneIdentifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Model::onlyOneIdentifier";
		try {
			/**
			 *
			 * inv onlyOneIdentifier:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.model_attributes->select(a | a.isIdentifier)
			 *         ->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.MODEL___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ List<Attribute> model_attributes = this.getModel_attributes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_model_attributes = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute, model_attributes);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Attribute);
				Iterator<Object> ITERATOR_a = BOXED_model_attributes.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_a.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
					/**
					 * a.isIdentifier
					 */
					final /*@NonInvalid*/ boolean isIdentifier = a.isIsIdentifier();
					//
					if (isIdentifier) {
						accumulator.add(a);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = size.equals(Security_dslTables.INT_1);
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
			 *       let result : Boolean[1] = self.model_attributes->isUnique(a | a.name)
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
				final /*@NonInvalid*/ List<Attribute> model_attributes = this.getModel_attributes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_model_attributes = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute, model_attributes);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Attribute);
				Iterator<Object> ITERATOR_a = BOXED_model_attributes.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_a.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
					/**
					 * a.name
					 */
					final /*@NonInvalid*/ String name = a.getName();
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
	public boolean roleMustHaveStringAttribute(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Model::roleMustHaveStringAttribute";
		try {
			/**
			 *
			 * inv roleMustHaveStringAttribute:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.oclIsTypeOf(Role) implies
			 *         self.model_attributes->exists(a | a.type = EType::String)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.MODEL___ROLE_MUST_HAVE_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Role_0 = idResolver
							.getClass(Security_dslTables.CLSSid_Role, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, this, TYP_security_dsl_c_c_Role_0).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (!oclIsTypeOf) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ List<Attribute> model_attributes = this.getModel_attributes();
						final /*@NonInvalid*/ OrderedSetValue BOXED_model_attributes = idResolver
								.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute, model_attributes);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_a = BOXED_model_attributes.iterator();
						/*@NonInvalid*/ Boolean exists;
						while (true) {
							if (!ITERATOR_a.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
							/**
							 * a.type = EType::String
							 */
							final /*@NonInvalid*/ EType type = a.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EType
									.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq = BOXED_type == Security_dslTables.ELITid_String;
							//
							if (eq) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!eq) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						if (exists == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (exists == null) {
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
		case Security_dslPackage.MODEL__MODEL_ATTRIBUTES:
			return getModel_attributes();
		case Security_dslPackage.MODEL__TABLE_NAME:
			return getTableName();
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
		case Security_dslPackage.MODEL__MODEL_ATTRIBUTES:
			getModel_attributes().clear();
			getModel_attributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case Security_dslPackage.MODEL__TABLE_NAME:
			setTableName((String) newValue);
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
		case Security_dslPackage.MODEL__MODEL_ATTRIBUTES:
			getModel_attributes().clear();
			return;
		case Security_dslPackage.MODEL__TABLE_NAME:
			setTableName(TABLE_NAME_EDEFAULT);
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
		case Security_dslPackage.MODEL__MODEL_ATTRIBUTES:
			return model_attributes != null && !model_attributes.isEmpty();
		case Security_dslPackage.MODEL__TABLE_NAME:
			return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
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
		case Security_dslPackage.MODEL___ROLE_CAN_HAVE_ID_AND_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP:
			return roleCanHaveIdAndStringAttribute((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.MODEL___ROLE_CANT_HAVE_ADDITIONAL_ATTRIBUTES__DIAGNOSTICCHAIN_MAP:
			return roleCantHaveAdditionalAttributes((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.MODEL___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP:
			return uniqueCollumnName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.MODEL___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP:
			return onlyOneIdentifier((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.MODEL___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP:
			return uniqueAttributeName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.MODEL___ROLE_MUST_HAVE_STRING_ATTRIBUTE__DIAGNOSTICCHAIN_MAP:
			return roleMustHaveStringAttribute((DiagnosticChain) arguments.get(0),
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
		result.append(" (tableName: ");
		result.append(tableName);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
