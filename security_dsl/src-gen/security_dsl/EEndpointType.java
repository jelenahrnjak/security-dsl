/**
 */
package security_dsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EEndpoint Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see security_dsl.Security_dslPackage#getEEndpointType()
 * @model
 * @generated
 */
public enum EEndpointType implements Enumerator {
	/**
	 * The '<em><b>REGISTRATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTRATION(0, "REGISTRATION", "REGISTRATION"),

	/**
	 * The '<em><b>LOGIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIN_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIN(1, "LOGIN", "LOGIN"),

	/**
	 * The '<em><b>LOGOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGOUT_VALUE
	 * @generated
	 * @ordered
	 */
	LOGOUT(2, "LOGOUT", "LOGOUT"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "OTHER", "OTHER");

	/**
	 * The '<em><b>REGISTRATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTRATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRATION_VALUE = 0;

	/**
	 * The '<em><b>LOGIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGIN_VALUE = 1;

	/**
	 * The '<em><b>LOGOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGOUT_VALUE = 2;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * An array of all the '<em><b>EEndpoint Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EEndpointType[] VALUES_ARRAY = new EEndpointType[] { REGISTRATION, LOGIN, LOGOUT, OTHER, };

	/**
	 * A public read-only list of all the '<em><b>EEndpoint Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EEndpointType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EEndpoint Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EEndpointType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEndpointType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEndpoint Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EEndpointType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEndpointType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEndpoint Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EEndpointType get(int value) {
		switch (value) {
		case REGISTRATION_VALUE:
			return REGISTRATION;
		case LOGIN_VALUE:
			return LOGIN;
		case LOGOUT_VALUE:
			return LOGOUT;
		case OTHER_VALUE:
			return OTHER;
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
	private EEndpointType(int value, String name, String literal) {
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

} //EEndpointType
