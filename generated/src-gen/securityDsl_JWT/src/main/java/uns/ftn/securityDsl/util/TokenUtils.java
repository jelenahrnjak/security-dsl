package uns.ftn.securityDsl.util;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import uns.ftn.securityDsl.model.User;

@Component
public class TokenUtils {

	private String ISSUER = "securityDsl";

	public String SECRET = "somesecret";

	private int EXPIRES_IN = 1800000;
	
	@Value("Authorization")
	private String AUTH_HEADER;
	
	private static final String AUDIENCE_WEB = "AUDIENCE_WEB";
	// Algoritam za potpisivanje JWT
	private SignatureAlgorithm SIGNATURE_ALGORITHM = SignatureAlgorithm.HS512;
	

	public String generateToken(String username) {
		return Jwts.builder()
				.setIssuer(ISSUER)
				.setSubject(username)
				.setAudience(generateAudience())
				.setIssuedAt(new Date())
				.setExpiration(generateExpirationDate())
				.signWith(SIGNATURE_ALGORITHM, SECRET).compact();
		

	}
	
	private String generateAudience() {
		
		return AUDIENCE_WEB;
	}

	
	private Date generateExpirationDate() {
		return new Date(new Date().getTime() + EXPIRES_IN);
	}
	
	
	public String getToken(HttpServletRequest request) {
		String authHeader = getAuthHeaderFromHeader(request);

		if (authHeader != null && authHeader.startsWith("Bearer ")) {
			return authHeader.substring(7); 
		}

		return null;
	}
	
	public String getCredentialFromToken(String token) {
		
		String credential;
		
		try {
			final Claims claims = this.getAllClaimsFromToken(token);
			credential = claims.getSubject();
		} catch (ExpiredJwtException ex) {
			throw ex;
		} catch (Exception e) {
			credential = null;
		}
		
		return credential;
	}

	public Date getIssuedAtDateFromToken(String token) {
		Date issueAt;
		try {
			final Claims claims = this.getAllClaimsFromToken(token);
			issueAt = claims.getIssuedAt();
		} catch (ExpiredJwtException ex) {
			throw ex;
		} catch (Exception e) {
			issueAt = null;
		}
		return issueAt;
	}

	public String getAudienceFromToken(String token) {
		String audience;
		try {
			final Claims claims = this.getAllClaimsFromToken(token);
			audience = claims.getAudience();
		} catch (ExpiredJwtException ex) {
			throw ex;
		} catch (Exception e) {
			audience = null;
		}
		return audience;
	}

	public Date getExpirationDateFromToken(String token) {
		Date expiration;
		try {
			final Claims claims = this.getAllClaimsFromToken(token);
			expiration = claims.getExpiration();
		} catch (ExpiredJwtException ex) {
			throw ex;
		} catch (Exception e) {
			expiration = null;
		}
		
		return expiration;
	}
	
	
	private Claims getAllClaimsFromToken(String token) {
		Claims claims;
		try {
			claims = Jwts.parser()
					.setSigningKey(SECRET)
					.parseClaimsJws(token)
					.getBody();
		} catch (ExpiredJwtException ex) {
			throw ex;
		} catch (Exception e) {
			claims = null;
		}
		
		
		return claims;
	}
	
	
	public Boolean validateToken(String token, UserDetails userDetails) {
		User user = (User) userDetails;
		final String credential = getCredentialFromToken(token);
		final Date created = getIssuedAtDateFromToken(token);
	
		return (credential != null 
			&& credential.equals(userDetails.getUsername()) 
			&& !isCreatedBeforeLastPasswordReset(created, user.getLastPasswordResetDate()));  
	}
	
	
	private Boolean isCreatedBeforeLastPasswordReset(Date created, Date lastPasswordReset) {
		return (lastPasswordReset != null && created.before(lastPasswordReset));
	}

	public int getExpiredIn() {
		return EXPIRES_IN;
	}

	
	public String getAuthHeaderFromHeader(HttpServletRequest request) {
		return request.getHeader(AUTH_HEADER);
	}
	
}
