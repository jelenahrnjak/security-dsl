/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Entity#getEntity_attributes <em>Entity attributes</em>}</li>
 *   <li>{@link security_dsl.Entity#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getEntity()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyOneIdentifier'"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity attributes</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity attributes</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getEntity_Entity_attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getEntity_attributes();

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see security_dsl.Security_dslPackage#getEntity_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link security_dsl.Entity#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Table names must be unique!\',\n\tstatus : Boolean = \n\t        Entity.allInstances() -&gt; select(e | e.tableName &lt;&gt; null) -&gt; isUnique(e | e.tableName)\n}.status'"
	 * @generated
	 */
	boolean uniqueTableName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Column names must be unique if defined!\',\n\tstatus : Boolean = \n\t        self.entity_attributes -&gt; exists(a | a.collumnName &lt;&gt; null) implies self.entity_attributes -&gt; isUnique(a | a.collumnName)\n}.status'"
	 * @generated
	 */
	boolean uniqueCollumnName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Entities other than User cannot have a credential attribute!\',\n\tstatus : Boolean = \n\t        not self.oclIsTypeOf(User) implies self.entity_attributes -&gt; select(a | a.credential) -&gt; isEmpty()\n}.status'"
	 * @generated
	 */
	boolean otherEntitiesDoesntHaveCredential(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Attribute names within an entity must be unique!\',\n\tstatus : Boolean = \n\t        self.entity_attributes -&gt; isUnique(a | a.name)\n}.status'"
	 * @generated
	 */
	boolean uniqueAttributeName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Entity must have exactly one identifier attribute!\',\n\tstatus : Boolean = \n\t        self.entity_attributes -&gt; size() &gt; 0 implies self.entity_attributes -&gt; select(a | a.identifier) -&gt; size() = 1\n}.status'"
	 * @generated
	 */
	boolean onlyOneIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Entity
