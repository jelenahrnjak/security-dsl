/**
 */
package security_dsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EDatabase Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see security_dsl.Security_dslPackage#getEDatabaseType()
 * @model
 * @generated
 */
public enum EDatabaseType implements Enumerator {
	/**
	 * The '<em><b>Postgre SQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTGRE_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	POSTGRE_SQL(0, "PostgreSQL", "PostgreSQL"),

	/**
	 * The '<em><b>Oracle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE_VALUE
	 * @generated
	 * @ordered
	 */
	ORACLE(1, "Oracle", "Oracle"),

	/**
	 * The '<em><b>My SQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	MY_SQL(2, "MySQL", "MySQL");

	/**
	 * The '<em><b>Postgre SQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTGRE_SQL
	 * @model name="PostgreSQL"
	 * @generated
	 * @ordered
	 */
	public static final int POSTGRE_SQL_VALUE = 0;

	/**
	 * The '<em><b>Oracle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE
	 * @model name="Oracle"
	 * @generated
	 * @ordered
	 */
	public static final int ORACLE_VALUE = 1;

	/**
	 * The '<em><b>My SQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_SQL
	 * @model name="MySQL"
	 * @generated
	 * @ordered
	 */
	public static final int MY_SQL_VALUE = 2;

	/**
	 * An array of all the '<em><b>EDatabase Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EDatabaseType[] VALUES_ARRAY = new EDatabaseType[] { POSTGRE_SQL, ORACLE, MY_SQL, };

	/**
	 * A public read-only list of all the '<em><b>EDatabase Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EDatabaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EDatabase Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EDatabaseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EDatabaseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EDatabase Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EDatabaseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EDatabaseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EDatabase Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EDatabaseType get(int value) {
		switch (value) {
		case POSTGRE_SQL_VALUE:
			return POSTGRE_SQL;
		case ORACLE_VALUE:
			return ORACLE;
		case MY_SQL_VALUE:
			return MY_SQL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDatabaseType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EDatabaseType
