/**
 */
package security_dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security_dsl.Model#getModel_attributes <em>Model attributes</em>}</li>
 *   <li>{@link security_dsl.Model#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @see security_dsl.Security_dslPackage#getModel()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueCollumnName'"
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Model attributes</b></em>' containment reference list.
	 * The list contents are of type {@link security_dsl.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model attributes</em>' containment reference list.
	 * @see security_dsl.Security_dslPackage#getModel_Model_attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getModel_attributes();

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see security_dsl.Security_dslPackage#getModel_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link security_dsl.Model#getTableName <em>Table Name</em>}' attribute.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.oclIsTypeOf(User) implies\n\t\t\tself.model_attributes -&gt; select(a | a.credential) -&gt; size() = 1'"
	 * @generated
	 */
	boolean oneCredential(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.model_attributes -&gt; size() &gt; 0 implies self.model_attributes -&gt; select(a | a.identifier) -&gt; size() = 1'"
	 * @generated
	 */
	boolean onlyOneIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.model_attributes -&gt; isUnique(a | a.name)'"
	 * @generated
	 */
	boolean uniqueAttributeName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t self.model_attributes -&gt; exists(a | a.collumnName &lt;&gt; null) implies self.model_attributes -&gt; isUnique(a | a.collumnName)'"
	 * @generated
	 */
	boolean uniqueCollumnName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Model
