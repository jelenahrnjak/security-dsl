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
	 * The '<em><b>POSTGRES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTGRES_VALUE
	 * @generated
	 * @ordered
	 */
	POSTGRES(0, "POSTGRES", "POSTGRES"),

	/**
	 * The '<em><b>ORACLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE_VALUE
	 * @generated
	 * @ordered
	 */
	ORACLE(1, "ORACLE", "ORACLE"),

	/**
	 * The '<em><b>MYSQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MYSQL_VALUE
	 * @generated
	 * @ordered
	 */
	MYSQL(2, "MYSQL", "MYSQL");

	/**
	 * The '<em><b>POSTGRES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTGRES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSTGRES_VALUE = 0;

	/**
	 * The '<em><b>ORACLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORACLE_VALUE = 1;

	/**
	 * The '<em><b>MYSQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MYSQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MYSQL_VALUE = 2;

	/**
	 * An array of all the '<em><b>EDatabase Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EDatabaseType[] VALUES_ARRAY = new EDatabaseType[] { POSTGRES, ORACLE, MYSQL, };

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
		case POSTGRES_VALUE:
			return POSTGRES;
		case ORACLE_VALUE:
			return ORACLE;
		case MYSQL_VALUE:
			return MYSQL;
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
