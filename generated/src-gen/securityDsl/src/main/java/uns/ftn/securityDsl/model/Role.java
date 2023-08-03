package uns.ftn.securityDsl.model;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="roles")
public class Role implements GrantedAuthority {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String name;
    
    @JsonIgnore
    @Override
    public String getAuthority() {
    	return name;
    }

}
