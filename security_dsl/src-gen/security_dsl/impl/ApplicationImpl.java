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

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
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
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import security_dsl.Application;
import security_dsl.Controller;
import security_dsl.Database;
import security_dsl.Model;
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
 *   <li>{@link security_dsl.impl.ApplicationImpl#getApp_models <em>App models</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getApp_controllers <em>App controllers</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getApp_security <em>App security</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link security_dsl.impl.ApplicationImpl#getPackageName <em>Package Name</em>}</li>
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = "rs.ac.uns.ftn";

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
	 * The default value of the '{@link #getArtifact() <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_EDEFAULT = "demo";

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
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = "";

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
							if (path == null) {
								throw new InvalidValueException(
										"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
							}
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
			 *           (
			 *             c.name.toLower() = 'user' or
			 *             c.name.toLower() = 'role' or
			 *             c.name.toLower() = 'usercontroller' or
			 *             c.name.toLower() = 'rolecontroller'
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
							 *
							 * c.name.toLower() = 'user' or
							 * c.name.toLower() = 'role' or
							 * c.name.toLower() = 'usercontroller' or
							 * c.name.toLower() = 'rolecontroller'
							 */
							/*@Caught*/ Object CAUGHT_or_1;
							try {
								/*@Caught*/ Object CAUGHT_or_0;
								try {
									/*@Caught*/ Object CAUGHT_or;
									try {
										/*@Caught*/ Object CAUGHT_eq;
										try {
											final /*@NonInvalid*/ String name = c.getName();
											if (name == null) {
												throw new InvalidValueException(
														"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
											}
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
												final /*@NonInvalid*/ String name_0 = c.getName();
												if (name_0 == null) {
													throw new InvalidValueException(
															"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
												}
												final /*@Thrown*/ String toLower_0 = StringToLowerCaseOperation.INSTANCE
														.evaluate(name_0);
												final /*@Thrown*/ boolean eq_0 = toLower_0
														.equals(Security_dslTables.STR_role);
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
									final /*@Thrown*/ Boolean or_0;
									if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
										or_0 = ValueUtil.TRUE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_eq_1;
										try {
											final /*@NonInvalid*/ String name_1 = c.getName();
											if (name_1 == null) {
												throw new InvalidValueException(
														"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
											}
											final /*@Thrown*/ String toLower_1 = StringToLowerCaseOperation.INSTANCE
													.evaluate(name_1);
											final /*@Thrown*/ boolean eq_1 = toLower_1
													.equals(Security_dslTables.STR_usercontroller);
											CAUGHT_eq_1 = eq_1;
										} catch (Exception e) {
											CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
											or_0 = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_or instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_or;
											}
											if (CAUGHT_eq_1 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_1;
											}
											if (CAUGHT_or == null) {
												or_0 = null;
											} else {
												or_0 = ValueUtil.FALSE_VALUE;
											}
										}
									}
									CAUGHT_or_0 = or_0;
								} catch (Exception e) {
									CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean or_1;
								if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
									or_1 = ValueUtil.TRUE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_eq_2;
									try {
										final /*@NonInvalid*/ String name_2 = c.getName();
										if (name_2 == null) {
											throw new InvalidValueException(
													"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
										}
										final /*@Thrown*/ String toLower_2 = StringToLowerCaseOperation.INSTANCE
												.evaluate(name_2);
										final /*@Thrown*/ boolean eq_2 = toLower_2
												.equals(Security_dslTables.STR_rolecontroller);
										CAUGHT_eq_2 = eq_2;
									} catch (Exception e) {
										CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_eq_2 == ValueUtil.TRUE_VALUE) {
										or_1 = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_or_0 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_or_0;
										}
										if (CAUGHT_eq_2 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq_2;
										}
										if (CAUGHT_or_0 == null) {
											or_1 = null;
										} else {
											or_1 = ValueUtil.FALSE_VALUE;
										}
									}
								}
								CAUGHT_or_1 = or_1;
							} catch (Exception e) {
								CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_or_1 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_or_1 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (CAUGHT_or_1 == null) { // Abnormal null body evaluation result
								if (accumulator == ValueUtil.FALSE_VALUE) {
									accumulator = null; // Cache a null failure
								}
							} else if (CAUGHT_or_1 instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator = CAUGHT_or_1; // Cache an exception failure
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
	public boolean hasDatabaseForModel(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::hasDatabaseForModel";
		try {
			/**
			 *
			 * inv hasDatabaseForModel:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.app_models->isEmpty() or
			 *         not self.app_database->isEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___HAS_DATABASE_FOR_MODEL__DIAGNOSTICCHAIN_MAP);
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
					final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
							.evaluate(BOXED_app_models).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (isEmpty) {
						result = ValueUtil.TRUE_VALUE;
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
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not;
							}
							if (CAUGHT_not == null) {
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
	public boolean uniqueTableName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::uniqueTableName";
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
			 *         result : Boolean[1] = self.app_models->isUnique(m |
			 *           m.tableName.toLower())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP);
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
							.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Model);
					Iterator<Object> ITERATOR_m = BOXED_app_models.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR_m.hasNext()) {
							result = true;
							break;
						}
						/*@NonInvalid*/ Model m = (Model) ITERATOR_m.next();
						/**
						 * m.tableName.toLower()
						 */
						final /*@NonInvalid*/ String tableName = m.getTableName();
						if (tableName == null) {
							throw new InvalidValueException(
									"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(tableName);
						//
						if (accumulator.includes(toLower) == ValueUtil.TRUE_VALUE) {
							result = false;
							break; // Abort after second find
						} else {
							accumulator.add(toLower);
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
	public boolean hasUserAndRoleModelsForController(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Application::hasUserAndRoleModelsForController";
		try {
			/**
			 *
			 * inv hasUserAndRoleModelsForController:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.app_controllers->isEmpty() or
			 *         self.app_models->exists(m | m.oclIsTypeOf(User)) and
			 *         self.app_models->exists(m | m.oclIsTypeOf(Role))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___HAS_USER_AND_ROLE_MODELS_FOR_CONTROLLER__DIAGNOSTICCHAIN_MAP);
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
					final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
							.evaluate(BOXED_app_controllers).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (isEmpty) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_and;
						try {
							final /*@NonInvalid*/ List<Model> app_models_0 = this.getApp_models();
							final /*@NonInvalid*/ OrderedSetValue BOXED_app_models_0 = idResolver
									.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Model, app_models_0);
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_m = BOXED_app_models_0.iterator();
							/*@NonInvalid*/ Boolean exists;
							while (true) {
								if (!ITERATOR_m.hasNext()) {
									if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ Model m = (Model) ITERATOR_m.next();
								/**
								 * m.oclIsTypeOf(User)
								 */
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_User = idResolver
										.getClass(Security_dslTables.CLSSid_User, null);
								final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
										.evaluate(executor, m, TYP_security_dsl_c_c_User).booleanValue();
								//
								if (oclIsTypeOf) { // Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (!oclIsTypeOf) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							final /*@Thrown*/ Boolean and;
							if (exists == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_m_0 = BOXED_app_models_0.iterator();
								/*@NonInvalid*/ Boolean exists_0;
								while (true) {
									if (!ITERATOR_m_0.hasNext()) {
										if (accumulator_0 == ValueUtil.FALSE_VALUE) {
											exists_0 = ValueUtil.FALSE_VALUE;
										} else {
											throw (InvalidValueException) accumulator_0;
										}
										break;
									}
									/*@NonInvalid*/ Model m_0 = (Model) ITERATOR_m_0.next();
									/**
									 * m.oclIsTypeOf(Role)
									 */
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Role = idResolver
											.getClass(Security_dslTables.CLSSid_Role, null);
									final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE
											.evaluate(executor, m_0, TYP_security_dsl_c_c_Role).booleanValue();
									//
									if (oclIsTypeOf_0) { // Normal successful body evaluation result
										exists_0 = ValueUtil.TRUE_VALUE;
										break; // Stop immediately
									} else if (!oclIsTypeOf_0) { // Normal unsuccessful body evaluation result
										; // Carry on
									} else { // Impossible badly typed result
										accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody,
												"exists");
									}
								}
								if (exists_0 == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									if ((exists == null) || (exists_0 == null)) {
										and = null;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and = and;
						} catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if (CAUGHT_and == null) {
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
					/*@Caught*/ Object CAUGHT_isUnique;
					try {
						final /*@NonInvalid*/ List<Controller> app_controllers = this.getApp_controllers();
						final /*@NonInvalid*/ OrderedSetValue BOXED_app_controllers = idResolver
								.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Controller, app_controllers);
						/*@Thrown*/ Accumulator accumulator = ValueUtil
								.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Controller);
						Iterator<Object> ITERATOR_c = BOXED_app_controllers.iterator();
						/*@Thrown*/ boolean isUnique;
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
						CAUGHT_isUnique = isUnique;
					} catch (Exception e) {
						CAUGHT_isUnique = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_isUnique == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final /*@NonInvalid*/ List<Controller> app_controllers_0 = this.getApp_controllers();
							final /*@NonInvalid*/ OrderedSetValue BOXED_app_controllers_0 = idResolver
									.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Controller, app_controllers_0);
							/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_c_0 = BOXED_app_controllers_0.iterator();
							/*@Thrown*/ Boolean forAll;
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
								/*@Caught*/ Object CAUGHT_ne;
								try {
									final /*@NonInvalid*/ String name = c_0.getName();
									if (name == null) {
										throw new InvalidValueException(
												"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@Thrown*/ String toLower = StringToLowerCaseOperation.INSTANCE
											.evaluate(name);
									final /*@NonInvalid*/ String path_0 = c_0.getPath();
									if (path_0 == null) {
										throw new InvalidValueException(
												"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@Thrown*/ String toLower_0 = StringToLowerCaseOperation.INSTANCE
											.evaluate(path_0);
									final /*@Thrown*/ boolean ne = !toLower.equals(toLower_0);
									CAUGHT_ne = ne;
								} catch (Exception e) {
									CAUGHT_ne = ValueUtil.createInvalidValue(e);
								}
								//
								if (CAUGHT_ne == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break; // Stop immediately
								} else if (CAUGHT_ne == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									; // Carry on
								} else if (CAUGHT_ne instanceof InvalidValueException) { // Abnormal exception evaluation result
									accumulator_0 = CAUGHT_ne; // Cache an exception failure
								} else { // Impossible badly typed result
									accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						} catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_isUnique instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_isUnique;
							}
							if (CAUGHT_forAll instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_forAll;
							}
							if (CAUGHT_forAll == null) {
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
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Controller> app_controllers = this.getApp_controllers();
					final /*@NonInvalid*/ OrderedSetValue BOXED_app_controllers = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Controller, app_controllers);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Controller);
					Iterator<Object> ITERATOR_c = BOXED_app_controllers.iterator();
					/*@Thrown*/ boolean result;
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
	public boolean validPort(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::validPort";
		try {
			/**
			 *
			 * inv validPort:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.port >= 1024 and self.port <= 49151
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.APPLICATION___VALID_PORT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
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
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_ge == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
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
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_ge instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_ge;
							}
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Security_dslPackage.APPLICATION__APP_DATABASE:
			return basicSetApp_database(null, msgs);
		case Security_dslPackage.APPLICATION__APP_MODELS:
			return ((InternalEList<?>) getApp_models()).basicRemove(otherEnd, msgs);
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
		case Security_dslPackage.APPLICATION__APP_MODELS:
			return getApp_models();
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			return getApp_controllers();
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			return getApp_security();
		case Security_dslPackage.APPLICATION__NAME:
			return getName();
		case Security_dslPackage.APPLICATION__DESCRIPTION:
			return getDescription();
		case Security_dslPackage.APPLICATION__GROUP:
			return getGroup();
		case Security_dslPackage.APPLICATION__ARTIFACT:
			return getArtifact();
		case Security_dslPackage.APPLICATION__PACKAGE_NAME:
			return getPackageName();
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
		case Security_dslPackage.APPLICATION__NAME:
			setName((String) newValue);
			return;
		case Security_dslPackage.APPLICATION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Security_dslPackage.APPLICATION__GROUP:
			setGroup((String) newValue);
			return;
		case Security_dslPackage.APPLICATION__ARTIFACT:
			setArtifact((String) newValue);
			return;
		case Security_dslPackage.APPLICATION__PACKAGE_NAME:
			setPackageName((String) newValue);
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
		case Security_dslPackage.APPLICATION__APP_MODELS:
			getApp_models().clear();
			return;
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			getApp_controllers().clear();
			return;
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			setApp_security((Security) null);
			return;
		case Security_dslPackage.APPLICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Security_dslPackage.APPLICATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Security_dslPackage.APPLICATION__GROUP:
			setGroup(GROUP_EDEFAULT);
			return;
		case Security_dslPackage.APPLICATION__ARTIFACT:
			setArtifact(ARTIFACT_EDEFAULT);
			return;
		case Security_dslPackage.APPLICATION__PACKAGE_NAME:
			setPackageName(PACKAGE_NAME_EDEFAULT);
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
		case Security_dslPackage.APPLICATION__APP_MODELS:
			return app_models != null && !app_models.isEmpty();
		case Security_dslPackage.APPLICATION__APP_CONTROLLERS:
			return app_controllers != null && !app_controllers.isEmpty();
		case Security_dslPackage.APPLICATION__APP_SECURITY:
			return app_security != null;
		case Security_dslPackage.APPLICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Security_dslPackage.APPLICATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Security_dslPackage.APPLICATION__GROUP:
			return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
		case Security_dslPackage.APPLICATION__ARTIFACT:
			return ARTIFACT_EDEFAULT == null ? artifact != null : !ARTIFACT_EDEFAULT.equals(artifact);
		case Security_dslPackage.APPLICATION__PACKAGE_NAME:
			return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
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
		case Security_dslPackage.APPLICATION___CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP:
			return controllerPath((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___CONTROLLER_NOT_NAMED_USER_ROLE__DIAGNOSTICCHAIN_MAP:
			return controllerNotNamedUserRole((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___HAS_DATABASE_FOR_MODEL__DIAGNOSTICCHAIN_MAP:
			return hasDatabaseForModel((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___UNIQUE_TABLE_NAME__DIAGNOSTICCHAIN_MAP:
			return uniqueTableName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___HAS_USER_AND_ROLE_MODELS_FOR_CONTROLLER__DIAGNOSTICCHAIN_MAP:
			return hasUserAndRoleModelsForController((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___UNIQUE_CONTROLLER_PATH__DIAGNOSTICCHAIN_MAP:
			return uniqueControllerPath((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___UNIQUE_CONTROLLER_NAME__DIAGNOSTICCHAIN_MAP:
			return uniqueControllerName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.APPLICATION___VALID_PORT__DIAGNOSTICCHAIN_MAP:
			return validPort((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(", group: ");
		result.append(group);
		result.append(", artifact: ");
		result.append(artifact);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(", port: ");
		result.append(port);
		result.append(", hostname: ");
		result.append(hostname);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
