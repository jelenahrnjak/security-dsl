package uns.ftn.securityDsl.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import uns.ftn.securityDsl.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	List<Role> findByName(String name);
}
