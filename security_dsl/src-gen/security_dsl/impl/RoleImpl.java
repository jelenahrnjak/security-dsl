/**
 */
package security_dsl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import org.eclipse.ocl.pivot.values.TupleValue;

import security_dsl.Entity;
import security_dsl.Role;
import security_dsl.RoleInstance;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.impl.RoleImpl#getRole_instances <em>Role instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends EntityImpl implements Role {
	/**
	 * The cached value of the '{@link #getRole_instances() <em>Role instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_instances()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleInstance> role_instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleInstance> getRole_instances() {
		if (role_instances == null) {
			role_instances = new EObjectContainmentEList<RoleInstance>(RoleInstance.class, this,
					Security_dslPackage.ROLE__ROLE_INSTANCES);
		}
		return role_instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueRoleEntity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Role::uniqueRoleEntity";
		try {
			/**
			 *
			 * inv uniqueRoleEntity:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = Entity.allInstances()
			 *           ->select(e | e.oclIsTypeOf(Role))
			 *           ->size() <= 1
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'There can be at most one entity of type "Role" in the model!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.ROLE___UNIQUE_ROLE_ENTITY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Entity_0 = idResolver
						.getClass(Security_dslTables.CLSSid_Entity, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
						.evaluate(executor, Security_dslTables.SET_CLSSid_Entity, TYP_security_dsl_c_c_Entity_0);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
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
					 * e.oclIsTypeOf(Role)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_Role = idResolver
							.getClass(Security_dslTables.CLSSid_Role, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, e_0, TYP_security_dsl_c_c_Role).booleanValue();
					//
					if (oclIsTypeOf) {
						accumulator.add(e_0);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean status = OclComparableLessThanEqualOperation.INSTANCE
						.evaluate(executor, size, Security_dslTables.INT_1).booleanValue();
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
							Security_dslTables.STR_There_32_can_32_be_32_at_32_most_32_one_32_entity_32_of_32_type_32_34_Role_34_32_in_32_the_32_model_33,
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
	public boolean uniqueRoleInstanceName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Role::uniqueRoleInstanceName";
		try {
			/**
			 *
			 * inv uniqueRoleInstanceName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = self.role_instances->isUnique(r | r.name)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Role instance names must be unique!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.ROLE___UNIQUE_ROLE_INSTANCE_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ List<RoleInstance> role_instances = this.getRole_instances();
				final /*@NonInvalid*/ OrderedSetValue BOXED_role_instances = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_RoleInstance, role_instances);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(Security_dslTables.ORD_CLSSid_RoleInstance);
				Iterator<Object> ITERATOR_r = BOXED_role_instances.iterator();
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
							Security_dslTables.STR_Role_32_instance_32_names_32_must_32_be_32_unique_33, status);
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
		case Security_dslPackage.ROLE__ROLE_INSTANCES:
			return ((InternalEList<?>) getRole_instances()).basicRemove(otherEnd, msgs);
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
		case Security_dslPackage.ROLE__ROLE_INSTANCES:
			return getRole_instances();
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
		case Security_dslPackage.ROLE__ROLE_INSTANCES:
			getRole_instances().clear();
			getRole_instances().addAll((Collection<? extends RoleInstance>) newValue);
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
		case Security_dslPackage.ROLE__ROLE_INSTANCES:
			getRole_instances().clear();
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
		case Security_dslPackage.ROLE__ROLE_INSTANCES:
			return role_instances != null && !role_instances.isEmpty();
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
		case Security_dslPackage.ROLE___UNIQUE_ROLE_ENTITY__DIAGNOSTICCHAIN_MAP:
			return uniqueRoleEntity((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.ROLE___UNIQUE_ROLE_INSTANCE_NAME__DIAGNOSTICCHAIN_MAP:
			return uniqueRoleInstanceName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoleImpl
