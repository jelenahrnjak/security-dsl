package uns.ftn.securityDsl.model;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Collection;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Getter
@Setter
@Entity
@Table(name="users")
public class User implements UserDetails {

    private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	

	@JsonIgnore
	@Column(name = "password")
	private String password;
	
	@Column(name = "enabled")
	private boolean enabled;
	
	@Column(name = "last_password_reset_date")
	private Timestamp lastPasswordResetDate;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_role",
	        joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
	        inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	private List<Role> roles;
	
	public void setPassword(String password) {
	    Timestamp now = new Timestamp(new Date().getTime());
	    this.setLastPasswordResetDate(now);
	    this.password = password;
	}
	
	@JsonIgnore
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	    return this.roles;
	}
	
	@Override
	public boolean isEnabled() {
	    return enabled;
	}
	
	@JsonIgnore
	@Override
	public boolean isAccountNonExpired() {
	    return true;
	}
	
	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
	    return true;
	}
	
	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
	    return true;
	}
}
