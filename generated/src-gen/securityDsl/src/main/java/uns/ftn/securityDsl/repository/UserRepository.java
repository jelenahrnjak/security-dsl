package uns.ftn.securityDsl.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import uns.ftn.securityDsl.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
    Optional<User> findByUsername(String username);

}
