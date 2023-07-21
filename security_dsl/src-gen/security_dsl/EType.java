/**
 */
package security_dsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EType</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see security_dsl.Security_dslPackage#getEType()
 * @model
 * @generated
 */
public enum EType implements Enumerator {
	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(1, "String", "String"),

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(2, "Float", "Float"),

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(3, "Long", "Long"),

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(4, "Integer", "Integer"),

	/**
	 * The '<em><b>Char</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	CHAR(5, "char", "char"),

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(8, "Double", "Double"),

	/**
	 * The '<em><b>Date Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_TIME(9, "DateTime", "DateTime"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(10, "Date", "Date"),

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(0, "int", "int");

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 1;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model name="Float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 2;

	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model name="Long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 3;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model name="Integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 4;

	/**
	 * The '<em><b>Char</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR
	 * @model name="char"
	 * @generated
	 * @ordered
	 */
	public static final int CHAR_VALUE = 5;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model name="Double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 8;

	/**
	 * The '<em><b>Date Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME
	 * @model name="DateTime"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_VALUE = 9;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model name="Date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 10;

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model name="int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 0;

	/**
	 * An array of all the '<em><b>EType</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EType[] VALUES_ARRAY = new EType[] { STRING, FLOAT, LONG, INTEGER, CHAR, DOUBLE, DATE_TIME,
			DATE, INT, };

	/**
	 * A public read-only list of all the '<em><b>EType</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EType</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EType</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EType</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EType get(int value) {
		switch (value) {
		case STRING_VALUE:
			return STRING;
		case FLOAT_VALUE:
			return FLOAT;
		case LONG_VALUE:
			return LONG;
		case INTEGER_VALUE:
			return INTEGER;
		case CHAR_VALUE:
			return CHAR;
		case DOUBLE_VALUE:
			return DOUBLE;
		case DATE_TIME_VALUE:
			return DATE_TIME;
		case DATE_VALUE:
			return DATE;
		case INT_VALUE:
			return INT;
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
	private EType(int value, String name, String literal) {
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

} //EType
