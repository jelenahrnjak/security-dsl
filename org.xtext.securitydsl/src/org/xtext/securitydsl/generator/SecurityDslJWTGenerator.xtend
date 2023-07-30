package org.xtext.securitydsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import security_dsl.Application
import security_dsl.JWT
import security_dsl.RegisteredClaims
import security_dsl.Attribute
import org.eclipse.emf.ecore.resource.Resource
import java.util.List
import java.util.ArrayList
import security_dsl.EType
import security_dsl.User
import security_dsl.Claim
import security_dsl.EClaimType
import security_dsl.Authentication
import security_dsl.Controller
import security_dsl.EEndpointType

class SecurityDslJWTGenerator {
	
	new(Resource resource, IFileSystemAccess2 fsa, Application app, String srcDestination){
		
    	var user = resource.allContents.filter(User).next() 
    	
		var credentialNameUser = getCredential(user.model_attributes).name
    	
		fsa.generateFile(srcDestination + '/config/WebConfig.java', generateWebConfig(app.packageName))
		fsa.generateFile(srcDestination + '/config/WebSecurityConfig.java', generateWebSecurityConfig(app.packageName, getAuthController(app.app_controllers)))
		fsa.generateFile(srcDestination + '/util/TokenUtils.java', generateTokenUtils(app.packageName, app.app_security as JWT, credentialNameUser))
		fsa.generateFile(srcDestination + '/dto/UserTokenStateDTO.java', generateUserTokenStateDTO(app.packageName))
    	
    	fsa.generateFile(srcDestination + '/security/auth/RestAuthenticationEntryPoint.java', generateRestAuthenticationEntryPoint(app.packageName))
		fsa.generateFile(srcDestination + '/security/auth/TokenBasedAuthentication.java', generateTokenBasedAuthentication(app.packageName))
		fsa.generateFile(srcDestination + '/security/auth/TokenAuthenticationFilter.java', generateTokenAuthenticationFilter(app.packageName))
		    	
		fsa.generateFile(srcDestination + '/security/auth/TokenAuthenticationFilter.java', generateTokenAuthenticationFilter(app.packageName))
		
		
	}
	
	
	def String generateTokenAuthenticationFilter(String packageName){
		var content = '''
		package «packageName».security.auth;
		
		import java.io.IOException;
		
		import javax.servlet.FilterChain;
		import javax.servlet.ServletException;
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;
		
		import «packageName».util.TokenUtils;
		import org.apache.commons.logging.Log;
		import org.apache.commons.logging.LogFactory;
		import org.springframework.security.core.context.SecurityContextHolder;
		import org.springframework.security.core.userdetails.UserDetails;
		import org.springframework.security.core.userdetails.UserDetailsService;
		import org.springframework.web.filter.OncePerRequestFilter;
		
		import io.jsonwebtoken.ExpiredJwtException;
		
		
		public class TokenAuthenticationFilter extends OncePerRequestFilter {
		
		    private TokenUtils tokenUtils;
		
		    private UserDetailsService userDetailsService;
		
		    protected final Log LOGGER = LogFactory.getLog(getClass());
		
		    public TokenAuthenticationFilter(TokenUtils tokenHelper, UserDetailsService userDetailsService) {
		        this.tokenUtils = tokenHelper;
		        this.userDetailsService = userDetailsService;
		    }
		
		    @Override
		    public void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
		            throws IOException, ServletException {
		
		        String credential;
		        String authToken = tokenUtils.getToken(request);
		
		        try {
		
		            if (authToken != null) {
		
		                credential = tokenUtils.getCredentialFromToken(authToken);
		
		                if (credential != null) {
		
		                    UserDetails userDetails = userDetailsService.loadUserByUsername(credential);
		
		                    if (tokenUtils.validateToken(authToken, userDetails)) {
		
		                        TokenBasedAuthentication authentication = new TokenBasedAuthentication(userDetails);
		                        authentication.setToken(authToken);
		                        SecurityContextHolder.getContext().setAuthentication(authentication);
		                    }
		                }
		            }
		
		        } catch (ExpiredJwtException ex) {
		            LOGGER.debug("Token expired!");
		        }
		
		        chain.doFilter(request, response);
		    }
		
		}
		
		'''
		return content;
	}
	
	def String generateTokenBasedAuthentication(String packageName){
		var content = '''
		package «packageName».security.auth;
		
		import org.springframework.security.authentication.AbstractAuthenticationToken;
		import org.springframework.security.core.userdetails.UserDetails;
		
		public class TokenBasedAuthentication extends AbstractAuthenticationToken {
		
		    private static final long serialVersionUID = 1L;
		
		    private String token;
		    private final UserDetails principle;
		
		    public TokenBasedAuthentication(UserDetails principle) {
		        super(principle.getAuthorities());
		        this.principle = principle;
		    }
		
		    public String getToken() {
		        return token;
		    }
		
		    public void setToken(String token) {
		        this.token = token;
		    }
		
		    @Override
		    public boolean isAuthenticated() {
		        return true;
		    }
		
		    @Override
		    public Object getCredentials() {
		        return token;
		    }
		
		    @Override
		    public UserDetails getPrincipal() {
		        return principle;
		    }
		
		}
		'''
		return content;
	}
	
	def String generateRestAuthenticationEntryPoint(String packageName){
		var content = '''
		package «packageName».security.auth;
		import org.springframework.security.core.AuthenticationException;
		import org.springframework.security.web.AuthenticationEntryPoint;
		import org.springframework.stereotype.Component;
		
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;
		import java.io.IOException;
		
		@Component
		public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
		
		    @Override
		    public void commence(HttpServletRequest request,
		                         HttpServletResponse response,
		                         AuthenticationException authException) throws IOException {
		        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
		    }
		}
		'''
		return content;
	}
	
	def String generateException(String packageName){
		var content = '''
		package «packageName».exception;
		
		public class ResourceConflictException extends RuntimeException {
			private static final long serialVersionUID = 1791564636123821405L;
		
			private Long resourceId;
		
			public ResourceConflictException(Long resourceId, String message) {
				super(message);
				this.setResourceId(resourceId);
			}
		
			public Long getResourceId() {
				return resourceId;
			}
		
			public void setResourceId(Long resourceId) {
				this.resourceId = resourceId;
			}
		
		}
		'''
		return content;
	}
	
	def getAuthController(List<Controller> controllers){
		 
		 for (c : controllers) {
    		if(c instanceof Authentication){
    			return c;
    		}
    	}
	}
	
	def String generateWebConfig(String packageName){
		var webConfig = '''
			package «packageName».config;
			
			import org.springframework.context.annotation.Configuration;
			import org.springframework.web.servlet.config.annotation.CorsRegistry;
			import org.springframework.web.servlet.config.annotation.EnableWebMvc;
			import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
			
			@Configuration
			@EnableWebMvc
			public class WebConfig implements WebMvcConfigurer {
			
			    @Override
			    public void addCorsMappings(CorsRegistry registry) {
			        registry.addMapping("/**")
			                .allowedHeaders("*")
			                .allowedMethods("GET", "POST", "DELETE", "PUT")
			                .allowedOrigins("http://localhost:4200");
			    }
			}
			'''
		return webConfig;
		
	}
	
	def generateWebSecurityConfig(String packageName, Authentication authController){
		
		var loginEndpoint = ''
		
		for (e : authController.controller_endpoints) {
			if(e.type == EEndpointType::LOGIN) loginEndpoint = authController.path + e.url
		}
		
		var config = '''
		package «packageName».config;
		
		import «packageName».security.auth.RestAuthenticationEntryPoint;
		import «packageName».security.auth.TokenAuthenticationFilter;
		import «packageName».service.impl.UserServiceImpl;
		import «packageName».util.TokenUtils;
		
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.context.annotation.Bean;
		import org.springframework.context.annotation.Configuration;
		import org.springframework.http.HttpMethod;
		import org.springframework.security.authentication.AuthenticationManager;
		import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
		import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
		import org.springframework.security.config.annotation.web.builders.HttpSecurity;
		import org.springframework.security.config.annotation.web.builders.WebSecurity;
		import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
		import org.springframework.security.config.http.SessionCreationPolicy;
		import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
		import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
		
		@Configuration
		@EnableGlobalMethodSecurity(prePostEnabled = true)
		public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
			
			@Autowired
			private UserServiceImpl userService;
			
			@Autowired
			private RestAuthenticationEntryPoint restAuthenticationEntryPoint;
			
			@Autowired
			private TokenUtils tokenUtils;
		
			@Bean
			public BCryptPasswordEncoder passwordEncoder() {
				return new BCryptPasswordEncoder();
			}

		
		    @Bean
		    @Override
		    public AuthenticationManager authenticationManagerBean() throws Exception {
		        return super.authenticationManagerBean();
		    }
		
		    @Override
		    public void configure(AuthenticationManagerBuilder auth) throws Exception {
		        auth
		
		                .userDetailsService(userService)
		                .passwordEncoder(passwordEncoder());
		    }
		
		    @Override
		    protected void configure(HttpSecurity http) throws Exception {
		        http
		
		                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
		
		                .exceptionHandling().authenticationEntryPoint(restAuthenticationEntryPoint).and()
		
		                .authorizeRequests().antMatchers("«authController.path»/**").permitAll()
		
		                .anyRequest().authenticated().and()
		                .cors().and()
		                .addFilterBefore(new TokenAuthenticationFilter(tokenUtils, userService), BasicAuthenticationFilter.class);
		
		        http.csrf().disable();
		    }
		
		    @Override
		    public void configure(WebSecurity web) throws Exception {
		
		        web.ignoring().antMatchers(HttpMethod.POST, "«loginEndpoint»");
		        web.ignoring().antMatchers(HttpMethod.GET, "/", "/webjars/**", "/*.html", "favicon.ico", "/**/*.html",
		                "/**/*.css", "/**/*.js");
		    }
		
		}
		'''	
	
		return config;
	}

	def String generateTokenUtils(String packageName, JWT jwt, String credentialNameUser){

		var RegisteredClaims regClaim = jwt.registeredclaims;
		
		var utils = '''
		package «packageName».util;
		
		import java.util.Date;
		
		import javax.servlet.http.HttpServletRequest;
		
		import org.springframework.beans.factory.annotation.Value;
		import org.springframework.security.core.userdetails.UserDetails;
		import org.springframework.stereotype.Component;
		
		import io.jsonwebtoken.Claims;
		import io.jsonwebtoken.ExpiredJwtException;
		import io.jsonwebtoken.Jwts;
		import io.jsonwebtoken.SignatureAlgorithm;
		import «packageName».model.User;
		
		@Component
		public class TokenUtils {
		
			private String ISSUER = "«regClaim.issuer»";

			public String SECRET = "«jwt.secret»";
		
			private int EXPIRES_IN = «regClaim.expirationTime»;
			
			@Value("Authorization")
			private String AUTH_HEADER;
			
			private static final String AUDIENCE_WEB = "«regClaim.audience»";
			// Algoritam za potpisivanje JWT
			private SignatureAlgorithm SIGNATURE_ALGORITHM = SignatureAlgorithm.«jwt.signatureAlgorithm»;
			
		
			public String generateToken(String «credentialNameUser») {
				return Jwts.builder()
						.setIssuer(ISSUER)
						.setSubject(«findSubjectClaim(jwt.jwt_claims).claim_attribute.name»)
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
					&& credential.equals(userDetails.get«credentialNameUser.toFirstUpper»()) 
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
		'''
		return utils;
	}


	def findSubjectClaim(List<Claim> claims){
		
		for (c : claims) {
			if(c.type == EClaimType::REGISTERED && c.name.toLowerCase == 'subject') return c;
		}
		
		return null;
	}
	
	def getIdentifier(List<Attribute> attributes){
		
		for (a : attributes) {
		    if (a.isIdentifier) {
		        return a
		    } 
		}
		
	}
	
	def getCredential(List<Attribute> attributes){
		
		for (a : attributes) {
		    if (a.isCredential) {
		        return a
		    } 
		}
		
	}
	
	def getStringAttributeForRole(List<Attribute> unsortedAttributes){
		
		val ArrayList<Attribute> attributes = newArrayList	
		
		for (a : unsortedAttributes) {
		    if (a.isIdentifier) {
		        attributes.add(0, a)
		    } else {
		        attributes.add(a)
		    }
		}
		
		for(a : attributes){
			if(a.type == EType::STRING)
			return a;
		}
	}
	
	def String generateUserTokenStateDTO(String packageName){
		var content = '''
		package «packageName».dto;
		
		public class UserTokenStateDTO {
			
		    private String accessToken;
		    private Long expiresIn;
		
		    public UserTokenStateDTO() {
		        this.accessToken = null;
		        this.expiresIn = null;
		    }
		
		    public UserTokenStateDTO(String accessToken, long expiresIn) {
		        this.accessToken = accessToken;
		        this.expiresIn = expiresIn;
		    }
		
		    public String getAccessToken() {
		        return accessToken;
		    }
		
		    public void setAccessToken(String accessToken) {
		        this.accessToken = accessToken;
		    }
		
		    public Long getExpiresIn() {
		        return expiresIn;
		    }
		
		    public void setExpiresIn(Long expiresIn) {
		        this.expiresIn = expiresIn;
		    }
		    
		}
		'''
		return content;
	}

}