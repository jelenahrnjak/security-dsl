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

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringAtOperation;
import org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import security_dsl.Application;
import security_dsl.Controller;
import security_dsl.Database;
import security_dsl.Model;
import security_dsl.OtherModel;
import security_dsl.Security;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getApp_models <em>App models</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getApp_controllers <em>App controllers</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getApp_security <em>App security</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getApp_database <em>App database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApp_models() <em>App models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_models()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> app_models;

	/**
	 * The cached value of the '{@link #getApp_controllers() <em>App controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_controllers()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> app_controllers;

	/**
	 * The cached value of the '{@link #getApp_security() <em>App security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_security()
	 * @generated
	 * @ordered
	 */
	protected Security app_security;

	/**
	 * The cached value of the '{@link #getApp_database() <em>App database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_database()
	 * @generated
	 * @ordered
	 */
	protected Database app_database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.APPLICATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.APPLICATION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getApp_models() {
		if (app_models == null) {
			app_models = new EObjectContainmentEList<Model>(Model.class, this,
					Security_dslPackage.APPLICATION__APP_MODELS);
		}
		return app_models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getApp_controllers() {
		if (app_controllers == null) {
			app_controllers = new EObjectContainmentEList<Controller>(Controller.class, this,
					Security_dslPackage.APPLICATION__APP_CONTROLLERS);
		}
		return app_controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security getApp_security() {
		return app_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApp_security(Security newApp_security, NotificationChain msgs) {
		Security oldApp_security = app_security;
		app_security = newApp_security;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Security_dslPackage.APPLICATION__APP_SECURITY, oldApp_security, newApp_security);
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
	public void setApp_security(Security newApp_security) {
		if (newApp_security != app_security) {
			NotificationChain msgs = null;
			if (app_security != null)
				msgs = ((InternalEObject) app_security).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.APPLICATION__APP_SECURITY, null, msgs);
			if (newApp_security != null)
				msgs = ((InternalEObject) newApp_security).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.APPLICATION__APP_SECURITY, null, msgs);
			msgs = basicSetApp_security(newApp_security, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.APPLICATION__APP_SECURITY,
					newApp_security, newApp_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getApp_database() {
		return app_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApp_database(Database newApp_database, NotificationChain msgs) {
		Database oldApp_database = app_database;
		app_database = newApp_database;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Security_dslPackage.APPLICATION__APP_DATABASE, oldApp_database, newApp_database);
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
	public void setApp_database(Database newApp_database) {
		if (newApp_database != app_database) {
			NotificationChain msgs = null;
			if (app_database != null)
				msgs = ((InternalEObject) app_database).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.APPLICATION__APP_DATABASE, null, msgs);
			if (newApp_database != null)
				msgs = ((InternalEObject) newApp_database).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Security_dslPackage.APPLICATION__APP_DATABASE, null, msgs);
			msgs = basicSetApp_database(newApp_database, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.APPLICATION__APP_DATABASE,
					newApp_database, newApp_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean controllerNotNamedUserRole(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::controllerNotNamedUserRole";
		try {
			/**
			 *
			 * inv controllerNotNamedUserRole:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.app_controllers->exists(c |
			 *           (c.name.toLower() = 'user' or c.name.toLower() = 'role'
			 *           ))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_exists;
					try {
						final /*@NonInvalid*/ List<Controller> app_controllers = this.getApp_controllers();
						final /*@NonInvalid*/ OrderedSetValue BOXED_app_controllers = idResolver
								.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Controller, app_controllers);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_c = BOXED_app_controllers.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_c.hasNext()) {
								if (accumulator == null) {
									exists = null;
								} else if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Controller c = (Controller) ITERATOR_c.next();
							/**
							 * c.name.toLower() = 'user' or c.name.toLower() = 'role'
							 */
							final /*@NonInvalid*/ String name_0 = c.getName();
							final /*@NonInvalid*/ String toLower_0 = StringToLowerCaseOperation.INSTANCE
									.evaluate(name_0);
							final /*@NonInvalid*/ boolean eq = toLower_0.equals(Security_dslTables.STR_user);
							final /*@NonInvalid*/ Boolean or;
							if (eq) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean eq_0 = toLower_0.equals(Security_dslTables.STR_role);
								if (eq_0) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
							//
							if (or == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (or == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (or == null) { // Abnormal null body evaluation result
								if (accumulator == ValueUtil.FALSE_VALUE) {
									accumulator = null; // Cache a null failure
								}
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						CAUGHT_exists = exists;
					} catch (Exception e) {
						CAUGHT_exists = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_exists instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_exists;
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							result = null;
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
	public boolean modelNotNamedUserRole(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::modelNotNamedUserRole";
		try {
			/**
			 *
			 * inv modelNotNamedUserRole:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.app_models->select(m |
			 *           (
			 *             m.oclIsTypeOf(OtherModel) and
			 *             not m.oclAsType(OtherModel)
			 *             .oclIsKindOf(Role)
			 *           ))
			 *         ->exists(m |
			 *           (
			 *             m.oclAsType(OtherModel)
			 *             .name.toLower() = 'user' or
			 *             m.oclAsType(OtherModel)
			 *             .name.toLower() = 'role'
			 *           ))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___MODEL_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_exists;
					try {
						final /*@NonInvalid*/ List<Model> app_models = this.getApp_models();
						final /*@NonInvalid*/ OrderedSetValue BOXED_app_models = idResolver
								.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Model, app_models);
						/*@Thrown*/ Accumulator accumulator = ValueUtil
								.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Model);
						Iterator<Object> ITERATOR_m = BOXED_app_models.iterator();
						/*@Thrown*/ OrderedSetValue select;
						while (true) {
							if (!ITERATOR_m.hasNext()) {
								select = accumulator;
								break;
							}
							/*@NonInvalid*/ Model m = (Model) ITERATOR_m.next();
							/**
							 *
							 * m.oclIsTypeOf(OtherModel) and
							 * not m.oclAsType(OtherModel)
							 * .oclIsKindOf(Role)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_OtherModel_0 = idResolver
									.getClass(Security_dslTables.CLSSid_OtherModel, null);
							final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
									.evaluate(executor, m, TYP_security_dsl_c_c_OtherModel_0).booleanValue();
							final /*@Thrown*/ Boolean and;
							if (!oclIsTypeOf) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_not;
								try {
									/*@Caught*/ Object CAUGHT_oclIsKindOf;
									try {
										final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Role = idResolver
												.getClass(Security_dslTables.CLSSid_Role, null);
										final /*@Thrown*/ OtherModel oclAsType = (OtherModel) OclAnyOclAsTypeOperation.INSTANCE
												.evaluate(executor, m, TYP_security_dsl_c_c_OtherModel_0);
										final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
												.evaluate(executor, oclAsType, TYP_security_dsl_c_c_Role)
												.booleanValue();
										CAUGHT_oclIsKindOf = oclIsKindOf;
									} catch (Exception e) {
										CAUGHT_oclIsKindOf = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_oclIsKindOf instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_oclIsKindOf;
									}
									final /*@Thrown*/ Boolean not;
									if (CAUGHT_oclIsKindOf == ValueUtil.FALSE_VALUE) {
										not = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_oclIsKindOf == ValueUtil.TRUE_VALUE) {
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
									and = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_not instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_not;
									}
									if (CAUGHT_not == null) {
										and = null;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
							}
							if (and == null) {
								throw new InvalidValueException(
										"Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
							}
							//
							if (and == ValueUtil.TRUE_VALUE) {
								accumulator.add(m);
							}
						}
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_m_0 = select.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_m_0.hasNext()) {
								if (accumulator_0 == null) {
									exists = null;
								} else if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ Model m_0 = (Model) ITERATOR_m_0.next();
							/**
							 *
							 * m.oclAsType(OtherModel)
							 * .name.toLower() = 'user' or
							 * m.oclAsType(OtherModel)
							 * .name.toLower() = 'role'
							 */
							/*@Caught*/ Object CAUGHT_or;
							try {
								/*@Caught*/ Object CAUGHT_eq;
								try {
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_OtherModel_2 = idResolver
											.getClass(Security_dslTables.CLSSid_OtherModel, null);
									final /*@Thrown*/ OtherModel oclAsType_0 = (OtherModel) OclAnyOclAsTypeOperation.INSTANCE
											.evaluate(executor, m_0, TYP_security_dsl_c_c_OtherModel_2);
									final /*@Thrown*/ String name = oclAsType_0.getName();
									final /*@Thrown*/ String toLower = StringToLowerCaseOperation.INSTANCE
											.evaluate(name);
									final /*@Thrown*/ boolean eq = toLower.equals(Security_dslTables.STR_user);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean or;
								if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_eq_0;
									try {
										final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_OtherModel_3 = idResolver
												.getClass(Security_dslTables.CLSSid_OtherModel, null);
										final /*@Thrown*/ OtherModel oclAsType_1 = (OtherModel) OclAnyOclAsTypeOperation.INSTANCE
												.evaluate(executor, m_0, TYP_security_dsl_c_c_OtherModel_3);
										final /*@Thrown*/ String name_0 = oclAsType_1.getName();
										final /*@Thrown*/ String toLower_0 = StringToLowerCaseOperation.INSTANCE
												.evaluate(name_0);
										final /*@Thrown*/ boolean eq_0 = toLower_0.equals(Security_dslTables.STR_role);
										CAUGHT_eq_0 = eq_0;
									} catch (Exception e) {
										CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
										or = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq;
										}
										if (CAUGHT_eq_0 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq_0;
										}
										or = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_or = or;
							} catch (Exception e) {
								CAUGHT_or = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_or == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_or == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (CAUGHT_or == null) { // Abnormal null body evaluation result
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									accumulator_0 = null; // Cache a null failure
								}
							} else if (CAUGHT_or instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator_0 = CAUGHT_or; // Cache an exception failure
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						CAUGHT_exists = exists;
					} catch (Exception e) {
						CAUGHT_exists = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_exists instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_exists;
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							result = null;
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
	public boolean controllerModelNameUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::controllerModelNameUnique";
		try {
			/**
			 *
			 * inv controllerModelNameUnique:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.app_controllers->forAll(c |
			 *           not self.app_models->exists(m |
			 *             (
			 *               m.oclIsTypeOf(OtherModel) and
			 *               m.oclAsType(OtherModel)
			 *               .name.toLower() =
			 *               c.name.toLower()
			 *             )))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___CONTROLLER_MODEL_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Controller> app_controllers = this.getApp_controllers();
					final /*@NonInvalid*/ OrderedSetValue BOXED_app_controllers = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Controller, app_controllers);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_c = BOXED_app_controllers.iterator();
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
						/*@NonInvalid*/ Controller c = (Controller) ITERATOR_c.next();
						/**
						 *
						 * not self.app_models->exists(m |
						 *   (
						 *     m.oclIsTypeOf(OtherModel) and
						 *     m.oclAsType(OtherModel)
						 *     .name.toLower() =
						 *     c.name.toLower()
						 *   ))
						 */
						/*@Caught*/ Object CAUGHT_not;
						try {
							/*@Caught*/ Object CAUGHT_exists;
							try {
								final /*@NonInvalid*/ List<Model> app_models = this.getApp_models();
								final /*@NonInvalid*/ OrderedSetValue BOXED_app_models = idResolver
										.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Model, app_models);
								/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_m = BOXED_app_models.iterator();
								/*@Thrown*/ Boolean exists;
								while (true) {
									if (!ITERATOR_m.hasNext()) {
										if (accumulator_0 == null) {
											exists = null;
										} else if (accumulator_0 == ValueUtil.FALSE_VALUE) {
											exists = ValueUtil.FALSE_VALUE;
										} else {
											throw (InvalidValueException) accumulator_0;
										}
										break;
									}
									/*@NonInvalid*/ Model m = (Model) ITERATOR_m.next();
									/**
									 *
									 * m.oclIsTypeOf(OtherModel) and
									 * m.oclAsType(OtherModel)
									 * .name.toLower() =
									 * c.name.toLower()
									 */
									/*@Caught*/ Object CAUGHT_and;
									try {
										final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_OtherModel_0 = idResolver
												.getClass(Security_dslTables.CLSSid_OtherModel, null);
										final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
												.evaluate(executor, m, TYP_security_dsl_c_c_OtherModel_0)
												.booleanValue();
										final /*@Thrown*/ Boolean and;
										if (!oclIsTypeOf) {
											and = ValueUtil.FALSE_VALUE;
										} else {
											/*@Caught*/ Object CAUGHT_eq;
											try {
												final /*@Thrown*/ OtherModel oclAsType = (OtherModel) OclAnyOclAsTypeOperation.INSTANCE
														.evaluate(executor, m, TYP_security_dsl_c_c_OtherModel_0);
												final /*@Thrown*/ String name = oclAsType.getName();
												final /*@Thrown*/ String toLower = StringToLowerCaseOperation.INSTANCE
														.evaluate(name);
												final /*@NonInvalid*/ String name_0 = c.getName();
												final /*@NonInvalid*/ String toLower_0 = StringToLowerCaseOperation.INSTANCE
														.evaluate(name_0);
												final /*@Thrown*/ boolean eq = toLower.equals(toLower_0);
												CAUGHT_eq = eq;
											} catch (Exception e) {
												CAUGHT_eq = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
												and = ValueUtil.FALSE_VALUE;
											} else {
												if (CAUGHT_eq instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_eq;
												}
												and = ValueUtil.TRUE_VALUE;
											}
										}
										CAUGHT_and = and;
									} catch (Exception e) {
										CAUGHT_and = ValueUtil.createInvalidValue(e);
									}
									//
									if (CAUGHT_and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
										exists = ValueUtil.TRUE_VALUE;
										break; // Stop immediately
									} else if (CAUGHT_and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
										; // Carry on
									} else if (CAUGHT_and == null) { // Abnormal null body evaluation result
										if (accumulator_0 == ValueUtil.FALSE_VALUE) {
											accumulator_0 = null; // Cache a null failure
										}
									} else if (CAUGHT_and instanceof InvalidValueException) { // Abnormal exception evaluation result
										accumulator_0 = CAUGHT_and; // Cache an exception failure
									} else { // Impossible badly typed result
										accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody,
												"exists");
									}
								}
								CAUGHT_exists = exists;
							} catch (Exception e) {
								CAUGHT_exists = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_exists instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_exists;
							}
							final /*@Thrown*/ Boolean not;
							if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
								not = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
									not = ValueUtil.FALSE_VALUE;
								} else {
									not = null;
								}
							}
							CAUGHT_not = not;
						} catch (Exception e) {
							CAUGHT_not = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_not == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_not == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_not == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else if (CAUGHT_not instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_not; // Cache an exception failure
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
	public boolean controllerPath(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::controllerPath";
		try {
			/**
			 *
			 * inv controllerPath:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.app_controllers->forAll(c |
			 *           c.path.at(1) = '/')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Controller> app_controllers = this.getApp_controllers();
					final /*@NonInvalid*/ OrderedSetValue BOXED_app_controllers = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Controller, app_controllers);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_c = BOXED_app_controllers.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_c.hasNext()) {
							if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Controller c = (Controller) ITERATOR_c.next();
						/**
						 * c.path.at(1) = '/'
						 */
						/*@Caught*/ Object CAUGHT_eq;
						try {
							final /*@NonInvalid*/ String path = c.getPath();
							final /*@Thrown*/ String at = StringAtOperation.INSTANCE.evaluate(path,
									Security_dslTables.INT_1);
							final /*@Thrown*/ boolean eq = at.equals(Security_dslTables.STR_quot);
							CAUGHT_eq = eq;
						} catch (Exception e) {
							CAUGHT_eq = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_eq == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_eq == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_eq instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_eq; // Cache an exception failure
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
	public boolean uniqueModelName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::uniqueModelName";
		try {
			/**
			 *
			 * inv uniqueModelName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.app_models->select(m |
			 *           m.oclIsTypeOf(OtherModel))
			 *         ->isUnique(m | m.oclAsType(OtherModel).name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___UNIQUE_MODEL_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Model> app_models = this.getApp_models();
					final /*@NonInvalid*/ OrderedSetValue BOXED_app_models = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Model, app_models);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Model);
					Iterator<Object> ITERATOR_m = BOXED_app_models.iterator();
					/*@NonInvalid*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_m.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Model m = (Model) ITERATOR_m.next();
						/**
						 * m.oclIsTypeOf(OtherModel)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_OtherModel = idResolver
								.getClass(Security_dslTables.CLSSid_OtherModel, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
								.evaluate(executor, m, TYP_security_dsl_c_c_OtherModel).booleanValue();
						//
						if (oclIsTypeOf) {
							accumulator.add(m);
						}
					}
					/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Model);
					Iterator<Object> ITERATOR_m_0 = select.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR_m_0.hasNext()) {
							result = true;
							break;
						}
						/*@NonInvalid*/ Model m_0 = (Model) ITERATOR_m_0.next();
						/**
						 * m.oclAsType(OtherModel).name
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_OtherModel_0 = idResolver
								.getClass(Security_dslTables.CLSSid_OtherModel, null);
						final /*@Thrown*/ OtherModel oclAsType = (OtherModel) OclAnyOclAsTypeOperation.INSTANCE
								.evaluate(executor, m_0, TYP_security_dsl_c_c_OtherModel_0);
						final /*@Thrown*/ String name = oclAsType.getName();
						//
						if (accumulator_0.includes(name) == ValueUtil.TRUE_VALUE) {
							result = false;
							break; // Abort after second find
						} else {
							accumulator_0.add(name);
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
	public boolean uniqueControllerPath(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::uniqueControllerPath";
		try {
			/**
			 *
			 * inv uniqueControllerPath:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.app_controllers->isUnique(c | c.path) and
			 *         self.app_controllers->forAll(c |
			 *           c.name.toLower() <>
			 *           c.path.toLower())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Controller> app_controllers_0 = this.getApp_controllers();
					final /*@NonInvalid*/ OrderedSetValue BOXED_app_controllers_0 = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Controller, app_controllers_0);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Controller);
					Iterator<Object> ITERATOR_c = BOXED_app_controllers_0.iterator();
					/*@NonInvalid*/ boolean isUnique;
					while (true) {
						if (!ITERATOR_c.hasNext()) {
							isUnique = true;
							break;
						}
						/*@NonInvalid*/ Controller c = (Controller) ITERATOR_c.next();
						/**
						 * c.path
						 */
						final /*@NonInvalid*/ String path = c.getPath();
						//
						if (accumulator.includes(path) == ValueUtil.TRUE_VALUE) {
							isUnique = false;
							break; // Abort after second find
						} else {
							accumulator.add(path);
						}
					}
					final /*@Thrown*/ Boolean result;
					if (!isUnique) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_c_0 = BOXED_app_controllers_0.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_c_0.hasNext()) {
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ Controller c_0 = (Controller) ITERATOR_c_0.next();
							/**
							 * c.name.toLower() <> c.path.toLower()
							 */
							final /*@NonInvalid*/ String name = c_0.getName();
							final /*@NonInvalid*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(name);
							final /*@NonInvalid*/ String path_0 = c_0.getPath();
							final /*@NonInvalid*/ String toLower_0 = StringToLowerCaseOperation.INSTANCE
									.evaluate(path_0);
							final /*@NonInvalid*/ boolean ne = !toLower.equals(toLower_0);
							//
							if (!ne) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (ne) { // Normal successful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (forAll == null) {
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
	public boolean uniqueControllerName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::uniqueControllerName";
		try {
			/**
			 *
			 * inv uniqueControllerName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.app_controllers->isUnique(c | c.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ List<Controller> app_controllers = this.getApp_controllers();
				final /*@NonInvalid*/ OrderedSetValue BOXED_app_controllers = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Controller, app_controllers);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Controller);
				Iterator<Object> ITERATOR_c = BOXED_app_controllers.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Controller c = (Controller) ITERATOR_c.next();
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Security_dslPackage.APPLICATION__APP_MODELS:
			return ((InternalEList<?>) getApp_models()).basicRemove(otherEnd, msgs);
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			return ((InternalEList<?>) getApp_controllers()).basicRemove(otherEnd, msgs);
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			return basicSetApp_security(null, msgs);
		case Security_dslPackage.APPLICATION__APP_DATABASE:
			return basicSetApp_database(null, msgs);
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
		case Security_dslPackage.APPLICATION__NAME:
			return getName();
		case Security_dslPackage.APPLICATION__DESCRIPTION:
			return getDescription();
		case Security_dslPackage.APPLICATION__APP_MODELS:
			return getApp_models();
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			return getApp_controllers();
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			return getApp_security();
		case Security_dslPackage.APPLICATION__APP_DATABASE:
			return getApp_database();
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
		case Security_dslPackage.APPLICATION__NAME:
			setName((String) newValue);
			return;
		case Security_dslPackage.APPLICATION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Security_dslPackage.APPLICATION__APP_MODELS:
			getApp_models().clear();
			getApp_models().addAll((Collection<? extends Model>) newValue);
			return;
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			getApp_controllers().clear();
			getApp_controllers().addAll((Collection<? extends Controller>) newValue);
			return;
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			setApp_security((Security) newValue);
			return;
		case Security_dslPackage.APPLICATION__APP_DATABASE:
			setApp_database((Database) newValue);
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
		case Security_dslPackage.APPLICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Security_dslPackage.APPLICATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Security_dslPackage.APPLICATION__APP_MODELS:
			getApp_models().clear();
			return;
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			getApp_controllers().clear();
			return;
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			setApp_security((Security) null);
			return;
		case Security_dslPackage.APPLICATION__APP_DATABASE:
			setApp_database((Database) null);
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
		case Security_dslPackage.APPLICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Security_dslPackage.APPLICATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Security_dslPackage.APPLICATION__APP_MODELS:
			return app_models != null && !app_models.isEmpty();
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			return app_controllers != null && !app_controllers.isEmpty();
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			return app_security != null;
		case Security_dslPackage.APPLICATION__APP_DATABASE:
			return app_database != null;
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
		case Security_dslPackage.APPLICATION___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP:
			return controllerNotNamedUserRole((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___MODEL_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP:
			return modelNotNamedUserRole((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___CONTROLLER_MODEL_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP:
			return controllerModelNameUnique((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP:
			return controllerPath((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___UNIQUE_MODEL_NAME__DIAGNOSTICCHAIN_MAP:
			return uniqueModelName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP:
			return uniqueControllerPath((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP:
			return uniqueControllerName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
