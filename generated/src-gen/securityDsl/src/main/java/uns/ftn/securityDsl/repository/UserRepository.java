package uns.ftn.securityDsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uns.ftn.securityDsl.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	
    User findOneByUsername(String username);
}
