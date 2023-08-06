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

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import security_dsl.Attribute;
import security_dsl.Entity;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.EntityImpl#getEntity_attributes <em>Entity attributes</em>}</li>
 *   <li>{@link security_dsl.impl.EntityImpl#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The cached value of the '{@link #getEntity_attributes() <em>Entity attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_attributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> entity_attributes;

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
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getEntity_attributes() {
		if (entity_attributes == null) {
			entity_attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					Security_dslPackage.ENTITY__ENTITY_ATTRIBUTES);
		}
		return entity_attributes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.ENTITY__TABLE_NAME, oldTableName,
					tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueTableName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entity::uniqueTableName";
		try {
			/**
			 *
			 * inv uniqueTableName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = Entity.allInstances()
			 *           ->select(e | e.tableName <> null)
			 *           ->isUnique(e | e.tableName.toLower())
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Table names must be unique!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.ENTITY___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Entity = idResolver
							.getClass(Security_dslTables.CLSSid_Entity, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, Security_dslTables.SET_CLSSid_Entity, TYP_security_dsl_c_c_Entity);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil
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
						 * e.tableName <> null
						 */
						final /*@NonInvalid*/ String tableName = e_0.getTableName();
						final /*@NonInvalid*/ boolean ne = tableName != null;
						//
						if (ne) {
							accumulator.add(e_0);
						}
					}
					/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.SET_CLSSid_Entity);
					Iterator<Object> ITERATOR_e_1 = select.iterator();
					/*@Thrown*/ boolean status;
					while (true) {
						if (!ITERATOR_e_1.hasNext()) {
							status = true;
							break;
						}
						/*@NonInvalid*/ Entity e_1 = (Entity) ITERATOR_e_1.next();
						/**
						 * e.tableName.toLower()
						 */
						final /*@NonInvalid*/ String tableName_0 = e_1.getTableName();
						if (tableName_0 == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(tableName_0);
						//
						if (accumulator_0.includes(toLower) == ValueUtil.TRUE_VALUE) {
							status = false;
							break; // Abort after second find
						} else {
							accumulator_0.add(toLower);
						}
					}
					/*@Thrown*/ Object local_1;
					if (status) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Table_32_names_32_must_32_be_32_unique_33, status);
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
	public boolean uniqueCollumnName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entity::uniqueCollumnName";
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
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.entity_attributes->exists(a | a.collumnName <> null) implies
			 *           self.entity_attributes->isUnique(a | a.collumnName)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Column names must be unique if defined!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.ENTITY___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ List<Attribute> entity_attributes = this.getEntity_attributes();
					final /*@NonInvalid*/ OrderedSetValue BOXED_entity_attributes = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute, entity_attributes);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_a = BOXED_entity_attributes.iterator();
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
					final /*@Thrown*/ Boolean status;
					if (exists == ValueUtil.FALSE_VALUE) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_isUnique;
						try {
							/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil
									.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Attribute);
							Iterator<Object> ITERATOR_a_0 = BOXED_entity_attributes.iterator();
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
							status = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_isUnique instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_isUnique;
							}
							if (exists == null) {
								status = null;
							} else {
								status = ValueUtil.FALSE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Column_32_names_32_must_32_be_32_unique_32_if_32_defined_33,
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
	public boolean otherEntitiesDoesntHaveCredential(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Entity::otherEntitiesDoesntHaveCredential";
		try {
			/**
			 *
			 * inv otherEntitiesDoesntHaveCredential:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not self.oclIsTypeOf(User) implies
			 *           self.entity_attributes->select(a | a.credential)
			 *           ->isEmpty()
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Entities other than User cannot have a credential attribute!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.ENTITY___OTHER_ENTITIES_DOESNT_HAVE_CREDENTIAL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_User = idResolver
							.getClass(Security_dslTables.CLSSid_User, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, this, TYP_security_dsl_c_c_User).booleanValue();
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsTypeOf) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsTypeOf) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					final /*@Thrown*/ Boolean status;
					if (not == ValueUtil.FALSE_VALUE) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ List<Attribute> entity_attributes = this.getEntity_attributes();
						final /*@NonInvalid*/ OrderedSetValue BOXED_entity_attributes = idResolver
								.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute, entity_attributes);
						/*@Thrown*/ Accumulator accumulator = ValueUtil
								.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Attribute);
						Iterator<Object> ITERATOR_a = BOXED_entity_attributes.iterator();
						/*@NonInvalid*/ OrderedSetValue select;
						while (true) {
							if (!ITERATOR_a.hasNext()) {
								select = accumulator;
								break;
							}
							/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
							/**
							 * a.credential
							 */
							final /*@NonInvalid*/ boolean credential = a.isCredential();
							//
							if (credential) {
								accumulator.add(a);
							}
						}
						final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(select)
								.booleanValue();
						if (isEmpty) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							if (not == null) {
								status = null;
							} else {
								status = ValueUtil.FALSE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Entities_32_other_32_than_32_User_32_cannot_32_have_32_a_32_credential_32_attribute_33,
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
	public boolean uniqueAttributeName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entity::uniqueAttributeName";
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
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = self.entity_attributes->isUnique(a | a.name)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Attribute names within an entity must be unique!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.ENTITY___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ List<Attribute> entity_attributes = this.getEntity_attributes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_entity_attributes = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute, entity_attributes);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Attribute);
				Iterator<Object> ITERATOR_a = BOXED_entity_attributes.iterator();
				/*@NonInvalid*/ boolean status;
				while (true) {
					if (!ITERATOR_a.hasNext()) {
						status = true;
						break;
					}
					/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
					/**
					 * a.name
					 */
					final /*@NonInvalid*/ String name = a.getName();
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
							Security_dslTables.STR_Attribute_32_names_32_within_32_an_32_entity_32_must_32_be_32_unique_33,
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
	public boolean onlyOneIdentifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entity::onlyOneIdentifier";
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
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.entity_attributes->size() > 0 implies
			 *           self.entity_attributes->select(a | a.identifier)
			 *           ->size() = 1
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Entity must have exactly one identifier attribute!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.ENTITY___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ List<Attribute> entity_attributes = this.getEntity_attributes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_entity_attributes = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute, entity_attributes);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
						.evaluate(BOXED_entity_attributes);
				final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, size, Security_dslTables.INT_0).booleanValue();
				final /*@NonInvalid*/ Boolean status;
				if (!gt) {
					status = ValueUtil.TRUE_VALUE;
				} else {
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Attribute);
					Iterator<Object> ITERATOR_a = BOXED_entity_attributes.iterator();
					/*@NonInvalid*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_a.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
						/**
						 * a.identifier
						 */
						final /*@NonInvalid*/ boolean identifier = a.isIdentifier();
						//
						if (identifier) {
							accumulator.add(a);
						}
					}
					final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ boolean eq = size_0.equals(Security_dslTables.INT_1);
					if (eq) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						status = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean eq_0 = status == Boolean.TRUE;
				/*@NonInvalid*/ Object local_1;
				if (eq_0) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
							Security_dslTables.STR_Entity_32_must_32_have_32_exactly_32_one_32_identifier_32_attribute_33,
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Security_dslPackage.ENTITY__ENTITY_ATTRIBUTES:
			return ((InternalEList<?>) getEntity_attributes()).basicRemove(otherEnd, msgs);
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
		case Security_dslPackage.ENTITY__ENTITY_ATTRIBUTES:
			return getEntity_attributes();
		case Security_dslPackage.ENTITY__TABLE_NAME:
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
		case Security_dslPackage.ENTITY__ENTITY_ATTRIBUTES:
			getEntity_attributes().clear();
			getEntity_attributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case Security_dslPackage.ENTITY__TABLE_NAME:
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
		case Security_dslPackage.ENTITY__ENTITY_ATTRIBUTES:
			getEntity_attributes().clear();
			return;
		case Security_dslPackage.ENTITY__TABLE_NAME:
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
		case Security_dslPackage.ENTITY__ENTITY_ATTRIBUTES:
			return entity_attributes != null && !entity_attributes.isEmpty();
		case Security_dslPackage.ENTITY__TABLE_NAME:
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
		case Security_dslPackage.ENTITY___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP:
			return uniqueTableName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.ENTITY___UNIQUE_COLLUMN_NAME__DIAGNOSTICCHAIN_MAP:
			return uniqueCollumnName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.ENTITY___OTHER_ENTITIES_DOESNT_HAVE_CREDENTIAL__DIAGNOSTICCHAIN_MAP:
			return otherEntitiesDoesntHaveCredential((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.ENTITY___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP:
			return uniqueAttributeName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.ENTITY___ONLY_ONE_IDENTIFIER__DIAGNOSTICCHAIN_MAP:
			return onlyOneIdentifier((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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

} //EntityImpl
