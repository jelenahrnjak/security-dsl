/**
 */
package security_dsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ESecurity Mechanism</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see security_dsl.Security_dslPackage#getESecurityMechanism()
 * @model
 * @generated
 */
public enum ESecurityMechanism implements Enumerator {
	/**
	 * The '<em><b>JWT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JWT_VALUE
	 * @generated
	 * @ordered
	 */
	JWT(0, "JWT", "JWT"),

	/**
	 * The '<em><b>Basic Authentication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_AUTHENTICATION_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC_AUTHENTICATION(1, "BasicAuthentication", "BasicAuthentication"),

	/**
	 * The '<em><b>OAuth2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OAUTH2_VALUE
	 * @generated
	 * @ordered
	 */
	OAUTH2(2, "OAuth2", "OAuth2");

	/**
	 * The '<em><b>JWT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JWT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JWT_VALUE = 0;

	/**
	 * The '<em><b>Basic Authentication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_AUTHENTICATION
	 * @model name="BasicAuthentication"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_AUTHENTICATION_VALUE = 1;

	/**
	 * The '<em><b>OAuth2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OAUTH2
	 * @model name="OAuth2"
	 * @generated
	 * @ordered
	 */
	public static final int OAUTH2_VALUE = 2;

	/**
	 * An array of all the '<em><b>ESecurity Mechanism</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESecurityMechanism[] VALUES_ARRAY = new ESecurityMechanism[] { JWT, BASIC_AUTHENTICATION,
			OAUTH2, };

	/**
	 * A public read-only list of all the '<em><b>ESecurity Mechanism</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ESecurityMechanism> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ESecurity Mechanism</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ESecurityMechanism get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESecurityMechanism result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESecurity Mechanism</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ESecurityMechanism getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESecurityMechanism result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESecurity Mechanism</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ESecurityMechanism get(int value) {
		switch (value) {
		case JWT_VALUE:
			return JWT;
		case BASIC_AUTHENTICATION_VALUE:
			return BASIC_AUTHENTICATION;
		case OAUTH2_VALUE:
			return OAUTH2;
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
	private ESecurityMechanism(int value, String name, String literal) {
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

} //ESecurityMechanism
