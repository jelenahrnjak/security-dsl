/**
 */
package security_dsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EO Auth Provider</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see security_dsl.Security_dslPackage#getEOAuthProvider()
 * @model
 * @generated
 */
public enum EOAuthProvider implements Enumerator {
	/**
	 * The '<em><b>GOOGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_VALUE
	 * @generated
	 * @ordered
	 */
	GOOGLE(0, "GOOGLE", "GOOGLE"),

	/**
	 * The '<em><b>GITHUB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GITHUB_VALUE
	 * @generated
	 * @ordered
	 */
	GITHUB(1, "GITHUB", "GITHUB"),

	/**
	 * The '<em><b>FACEBOOK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACEBOOK_VALUE
	 * @generated
	 * @ordered
	 */
	FACEBOOK(2, "FACEBOOK", "FACEBOOK"),

	/**
	 * The '<em><b>AZURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AZURE_VALUE
	 * @generated
	 * @ordered
	 */
	AZURE(3, "AZURE", "AZURE"),

	/**
	 * The '<em><b>LINKEDIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINKEDIN_VALUE
	 * @generated
	 * @ordered
	 */
	LINKEDIN(4, "LINKEDIN", "LINKEDIN"),

	/**
	 * The '<em><b>TWITTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWITTER_VALUE
	 * @generated
	 * @ordered
	 */
	TWITTER(5, "TWITTER", "TWITTER"),

	/**
	 * The '<em><b>INSTAGRAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTAGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	INSTAGRAM(6, "INSTAGRAM", "INSTAGRAM");

	/**
	 * The '<em><b>GOOGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOGLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOOGLE_VALUE = 0;

	/**
	 * The '<em><b>GITHUB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GITHUB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GITHUB_VALUE = 1;

	/**
	 * The '<em><b>FACEBOOK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACEBOOK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FACEBOOK_VALUE = 2;

	/**
	 * The '<em><b>AZURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AZURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AZURE_VALUE = 3;

	/**
	 * The '<em><b>LINKEDIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINKEDIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINKEDIN_VALUE = 4;

	/**
	 * The '<em><b>TWITTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWITTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWITTER_VALUE = 5;

	/**
	 * The '<em><b>INSTAGRAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTAGRAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSTAGRAM_VALUE = 6;

	/**
	 * An array of all the '<em><b>EO Auth Provider</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EOAuthProvider[] VALUES_ARRAY = new EOAuthProvider[] { GOOGLE, GITHUB, FACEBOOK, AZURE,
			LINKEDIN, TWITTER, INSTAGRAM, };

	/**
	 * A public read-only list of all the '<em><b>EO Auth Provider</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EOAuthProvider> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EO Auth Provider</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EOAuthProvider get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EOAuthProvider result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EO Auth Provider</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EOAuthProvider getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EOAuthProvider result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EO Auth Provider</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EOAuthProvider get(int value) {
		switch (value) {
		case GOOGLE_VALUE:
			return GOOGLE;
		case GITHUB_VALUE:
			return GITHUB;
		case FACEBOOK_VALUE:
			return FACEBOOK;
		case AZURE_VALUE:
			return AZURE;
		case LINKEDIN_VALUE:
			return LINKEDIN;
		case TWITTER_VALUE:
			return TWITTER;
		case INSTAGRAM_VALUE:
			return INSTAGRAM;
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
	private EOAuthProvider(int value, String name, String literal) {
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

} //EOAuthProvider
