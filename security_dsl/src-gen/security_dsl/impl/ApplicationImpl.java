/**
 */
package security_dsl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
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

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import security_dsl.Application;
import security_dsl.Controller;
import security_dsl.Database;
import security_dsl.Entity;
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
 *   <li>{@link security_dsl.impl.ApplicationImpl#getApp_database <em>App database</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getApp_entities <em>App entities</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getApp_controllers <em>App controllers</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getApp_security <em>App security</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getPort <em>Port</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getHostname <em>Hostname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
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
	 * The cached value of the '{@link #getApp_entities() <em>App entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_entities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> app_entities;

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
	 * The default value of the '{@link #getArtifact() <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected String artifact = ARTIFACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

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
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "Security dsl generated application";

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
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final Long PORT_EDEFAULT = new Long(8080L);

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Long port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = "localhost";

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

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
	public EList<Entity> getApp_entities() {
		if (app_entities == null) {
			app_entities = new EObjectContainmentEList<Entity>(Entity.class, this,
					Security_dslPackage.APPLICATION__APP_ENTITIES);
		}
		return app_entities;
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
	public String getArtifact() {
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifact(String newArtifact) {
		String oldArtifact = artifact;
		artifact = newArtifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.APPLICATION__ARTIFACT,
					oldArtifact, artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.APPLICATION__GROUP, oldGroup,
					group));
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
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.APPLICATION__PACKAGE_NAME,
					oldPackageName, packageName));
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
	public Long getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Long newPort) {
		Long oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.APPLICATION__PORT, oldPort,
					port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Security_dslPackage.APPLICATION__HOSTNAME,
					oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validRegisteredPort(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::validRegisteredPort";
		try {
			/**
			 *
			 * inv validRegisteredPort:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[?] = self.port >= 1024 and self.port <= 49151
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Port must be in the valid range of 1024 to 49151!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___VALID_REGISTERED_PORT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					/*@Caught*/ Object CAUGHT_ge;
					try {
						final /*@NonInvalid*/ Long port = this.getPort();
						if (port == null) {
							throw new InvalidValueException(
									"Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ IntegerValue BOXED_port = ValueUtil.integerValueOf(port);
						final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
								.evaluate(executor, BOXED_port, Security_dslTables.INT_1024).booleanValue();
						CAUGHT_ge = ge;
					} catch (Exception e) {
						CAUGHT_ge = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean status;
					if (CAUGHT_ge == ValueUtil.FALSE_VALUE) {
						status = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_le_0;
						try {
							final /*@NonInvalid*/ Long port_0 = this.getPort();
							if (port_0 == null) {
								throw new InvalidValueException(
										"Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ IntegerValue BOXED_port_0 = ValueUtil.integerValueOf(port_0);
							final /*@Thrown*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
									.evaluate(executor, BOXED_port_0, Security_dslTables.INT_49151).booleanValue();
							CAUGHT_le_0 = le_0;
						} catch (Exception e) {
							CAUGHT_le_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_le_0 == ValueUtil.FALSE_VALUE) {
							status = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_ge instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_ge;
							}
							if (CAUGHT_le_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_le_0;
							}
							status = ValueUtil.TRUE_VALUE;
						}
					}
					final /*@Thrown*/ boolean eq = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_Port_32_must_32_be_32_in_32_the_32_valid_32_range_32_of_32_1024_32_to_32_49151_33,
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
	public boolean hasDatabaseForEntity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::hasDatabaseForEntity";
		try {
			/**
			 *
			 * inv hasDatabaseForEntity:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.app_entities->isEmpty() or
			 *           not self.app_database->isEmpty()
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'An application must have a database defined if it has entities!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___HAS_DATABASE_FOR_ENTITY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ List<Entity> app_entities = this.getApp_entities();
					final /*@NonInvalid*/ OrderedSetValue BOXED_app_entities = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Entity, app_entities);
					final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
							.evaluate(BOXED_app_entities).booleanValue();
					final /*@Thrown*/ Boolean status;
					if (isEmpty) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_not;
						try {
							/*@Caught*/ Object CAUGHT_isEmpty_0;
							try {
								final /*@NonInvalid*/ Database app_database = this.getApp_database();
								final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE
										.evaluate(executor, Security_dslTables.SET_CLSSid_Database, app_database);
								final /*@Thrown*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE
										.evaluate(oclAsSet).booleanValue();
								CAUGHT_isEmpty_0 = isEmpty_0;
							} catch (Exception e) {
								CAUGHT_isEmpty_0 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_isEmpty_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_isEmpty_0;
							}
							final /*@Thrown*/ Boolean not;
							if (CAUGHT_isEmpty_0 == ValueUtil.FALSE_VALUE) {
								not = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_isEmpty_0 == ValueUtil.TRUE_VALUE) {
									not = ValueUtil.FALSE_VALUE;
								} else {
									not = null;
								}
							}
							CAUGHT_not = not;
						} catch (Exception e) {
							CAUGHT_not = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_not == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not;
							}
							if (CAUGHT_not == null) {
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
								Security_dslTables.STR_An_32_application_32_must_32_have_32_a_32_database_32_defined_32_if_32_it_32_has_32_entities_33,
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
		case Security_dslPackage.APPLICATION__APP_DATABASE:
			return basicSetApp_database(null, msgs);
		case Security_dslPackage.APPLICATION__APP_ENTITIES:
			return ((InternalEList<?>) getApp_entities()).basicRemove(otherEnd, msgs);
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			return ((InternalEList<?>) getApp_controllers()).basicRemove(otherEnd, msgs);
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			return basicSetApp_security(null, msgs);
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
		case Security_dslPackage.APPLICATION__APP_DATABASE:
			return getApp_database();
		case Security_dslPackage.APPLICATION__APP_ENTITIES:
			return getApp_entities();
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			return getApp_controllers();
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			return getApp_security();
		case Security_dslPackage.APPLICATION__ARTIFACT:
			return getArtifact();
		case Security_dslPackage.APPLICATION__GROUP:
			return getGroup();
		case Security_dslPackage.APPLICATION__NAME:
			return getName();
		case Security_dslPackage.APPLICATION__PACKAGE_NAME:
			return getPackageName();
		case Security_dslPackage.APPLICATION__DESCRIPTION:
			return getDescription();
		case Security_dslPackage.APPLICATION__PORT:
			return getPort();
		case Security_dslPackage.APPLICATION__HOSTNAME:
			return getHostname();
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
		case Security_dslPackage.APPLICATION__APP_DATABASE:
			setApp_database((Database) newValue);
			return;
		case Security_dslPackage.APPLICATION__APP_ENTITIES:
			getApp_entities().clear();
			getApp_entities().addAll((Collection<? extends Entity>) newValue);
			return;
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			getApp_controllers().clear();
			getApp_controllers().addAll((Collection<? extends Controller>) newValue);
			return;
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			setApp_security((Security) newValue);
			return;
		case Security_dslPackage.APPLICATION__ARTIFACT:
			setArtifact((String) newValue);
			return;
		case Security_dslPackage.APPLICATION__GROUP:
			setGroup((String) newValue);
			return;
		case Security_dslPackage.APPLICATION__NAME:
			setName((String) newValue);
			return;
		case Security_dslPackage.APPLICATION__PACKAGE_NAME:
			setPackageName((String) newValue);
			return;
		case Security_dslPackage.APPLICATION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Security_dslPackage.APPLICATION__PORT:
			setPort((Long) newValue);
			return;
		case Security_dslPackage.APPLICATION__HOSTNAME:
			setHostname((String) newValue);
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
		case Security_dslPackage.APPLICATION__APP_DATABASE:
			setApp_database((Database) null);
			return;
		case Security_dslPackage.APPLICATION__APP_ENTITIES:
			getApp_entities().clear();
			return;
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			getApp_controllers().clear();
			return;
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			setApp_security((Security) null);
			return;
		case Security_dslPackage.APPLICATION__ARTIFACT:
			setArtifact(ARTIFACT_EDEFAULT);
			return;
		case Security_dslPackage.APPLICATION__GROUP:
			setGroup(GROUP_EDEFAULT);
			return;
		case Security_dslPackage.APPLICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Security_dslPackage.APPLICATION__PACKAGE_NAME:
			setPackageName(PACKAGE_NAME_EDEFAULT);
			return;
		case Security_dslPackage.APPLICATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Security_dslPackage.APPLICATION__PORT:
			setPort(PORT_EDEFAULT);
			return;
		case Security_dslPackage.APPLICATION__HOSTNAME:
			setHostname(HOSTNAME_EDEFAULT);
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
		case Security_dslPackage.APPLICATION__APP_DATABASE:
			return app_database != null;
		case Security_dslPackage.APPLICATION__APP_ENTITIES:
			return app_entities != null && !app_entities.isEmpty();
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			return app_controllers != null && !app_controllers.isEmpty();
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			return app_security != null;
		case Security_dslPackage.APPLICATION__ARTIFACT:
			return ARTIFACT_EDEFAULT == null ? artifact != null : !ARTIFACT_EDEFAULT.equals(artifact);
		case Security_dslPackage.APPLICATION__GROUP:
			return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
		case Security_dslPackage.APPLICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Security_dslPackage.APPLICATION__PACKAGE_NAME:
			return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
		case Security_dslPackage.APPLICATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Security_dslPackage.APPLICATION__PORT:
			return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
		case Security_dslPackage.APPLICATION__HOSTNAME:
			return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
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
		case Security_dslPackage.APPLICATION___VALID_REGISTERED_PORT__DIAGNOSTICCHAIN_MAP:
			return validRegisteredPort((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___HAS_DATABASE_FOR_ENTITY__DIAGNOSTICCHAIN_MAP:
			return hasDatabaseForEntity((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (artifact: ");
		result.append(artifact);
		result.append(", group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(", description: ");
		result.append(description);
		result.append(", port: ");
		result.append(port);
		result.append(", hostname: ");
		result.append(hostname);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
