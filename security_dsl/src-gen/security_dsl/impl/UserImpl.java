/**
 */
package security_dsl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import security_dsl.Attribute;
import security_dsl.EType;
import security_dsl.Entity;
import security_dsl.Security_dslPackage;
import security_dsl.Security_dslTables;
import security_dsl.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UserImpl extends EntityImpl implements User {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Security_dslPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean oneStringTypeCredentialForUser(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "User::oneStringTypeCredentialForUser";
		try {
			/**
			 *
			 * inv oneStringTypeCredentialForUser:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.entity_attributes->select(a | a.credential)
			 *           ->size() = 1 and
			 *           self.entity_attributes->select(a | a.credential)
			 *           ->forAll(a | a.type = EType::String)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'User entity must have exactly one attribute of type String marked as a credential!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.USER___ONE_STRING_TYPE_CREDENTIAL_FOR_USER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ List<Attribute> entity_attributes_0 = this.getEntity_attributes();
					final /*@NonInvalid*/ OrderedSetValue BOXED_entity_attributes_0 = idResolver
							.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute, entity_attributes_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createOrderedSetAccumulatorValue(Security_dslTables.ORD_CLSSid_Attribute);
					Iterator<Object> ITERATOR_a_0 = BOXED_entity_attributes_0.iterator();
					/*@NonInvalid*/ OrderedSetValue select_0;
					while (true) {
						if (!ITERATOR_a_0.hasNext()) {
							select_0 = accumulator;
							break;
						}
						/*@NonInvalid*/ Attribute a_0 = (Attribute) ITERATOR_a_0.next();
						/**
						 * a.credential
						 */
						final /*@NonInvalid*/ boolean credential_0 = a_0.isCredential();
						//
						if (credential_0) {
							accumulator.add(a_0);
						}
					}
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select_0);
					final /*@NonInvalid*/ boolean eq = size.equals(Security_dslTables.INT_1);
					final /*@Thrown*/ Boolean status;
					if (!eq) {
						status = ValueUtil.FALSE_VALUE;
					} else {
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_a_1 = select_0.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_a_1.hasNext()) {
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ Attribute a_1 = (Attribute) ITERATOR_a_1.next();
							/**
							 * a.type = EType::String
							 */
							final /*@NonInvalid*/ EType type = a_1.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = Security_dslTables.ENUMid_EType
									.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq_0 = BOXED_type == Security_dslTables.ELITid_String;
							//
							if (!eq_0) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (eq_0) { // Normal successful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll == ValueUtil.FALSE_VALUE) {
							status = ValueUtil.FALSE_VALUE;
						} else {
							if (forAll == null) {
								status = null;
							} else {
								status = ValueUtil.TRUE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_1) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
								Security_dslTables.STR_User_32_entity_32_must_32_have_32_exactly_32_one_32_attribute_32_of_32_type_32_String_32_marke,
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
	public boolean uniqueUserEntity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "User::uniqueUserEntity";
		try {
			/**
			 *
			 * inv uniqueUserEntity:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = Entity.allInstances()
			 *           ->select(e | e.oclIsTypeOf(User))
			 *           ->size() <= 1
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'There can be at most one entity of type "User" in the model!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.USER___UNIQUE_USER_ENTITY__DIAGNOSTICCHAIN_MAP);
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
					 * e.oclIsTypeOf(User)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_security_dsl_c_c_User_0 = idResolver
							.getClass(Security_dslTables.CLSSid_User, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, e_0, TYP_security_dsl_c_c_User_0).booleanValue();
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
							Security_dslTables.STR_There_32_can_32_be_32_at_32_most_32_one_32_entity_32_of_32_type_32_34_User_34_32_in_32_the_32_model_33,
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
	public boolean noAttributeNamedPassword(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "User::noAttributeNamedPassword";
		try {
			/**
			 *
			 * inv noAttributeNamedPassword:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.entity_attributes->forAll(a |
			 *             a.name.toLower() <> 'password')
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'User entity cannot have an attribute named "password"!', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Security_dslPackage.Literals.USER___NO_ATTRIBUTE_NAMED_PASSWORD__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Security_dslTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ List<Attribute> entity_attributes = this.getEntity_attributes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_entity_attributes = idResolver
						.createOrderedSetOfAll(Security_dslTables.ORD_CLSSid_Attribute, entity_attributes);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_a = BOXED_entity_attributes.iterator();
				/*@NonInvalid*/ Boolean status;
				while (true) {
					if (!ITERATOR_a.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Attribute a = (Attribute) ITERATOR_a.next();
					/**
					 * a.name.toLower() <> 'password'
					 */
					final /*@NonInvalid*/ String name = a.getName();
					final /*@NonInvalid*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(name);
					final /*@NonInvalid*/ boolean ne = !toLower.equals(Security_dslTables.STR_password);
					//
					if (!ne) { // Normal unsuccessful body evaluation result
						status = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (ne) { // Normal successful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean eq = status == Boolean.TRUE;
				/*@NonInvalid*/ Object local_1;
				if (eq) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Security_dslTables.TUPLid_,
							Security_dslTables.STR_User_32_entity_32_cannot_32_have_32_an_32_attribute_32_named_32_34_password_34_33,
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Security_dslPackage.USER___ONE_STRING_TYPE_CREDENTIAL_FOR_USER__DIAGNOSTICCHAIN_MAP:
			return oneStringTypeCredentialForUser((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.USER___UNIQUE_USER_ENTITY__DIAGNOSTICCHAIN_MAP:
			return uniqueUserEntity((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Security_dslPackage.USER___NO_ATTRIBUTE_NAMED_PASSWORD__DIAGNOSTICCHAIN_MAP:
			return noAttributeNamedPassword((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //UserImpl
