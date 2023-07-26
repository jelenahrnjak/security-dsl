package uns.ftn.securityDsl.service;

import uns.ftn.securityDsl.model.User;

import java.util.List;

public interface IUserService {

	User save(User user);

	List<User> findAll();

}
