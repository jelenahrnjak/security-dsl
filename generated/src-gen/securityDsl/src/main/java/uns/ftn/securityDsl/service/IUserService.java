package uns.ftn.securityDsl.service;

import uns.ftn.securityDsl.dto.UserRequestDTO;
import uns.ftn.securityDsl.model.User;

import java.util.List;

public interface IUserService {

	User save(UserRequestDTO request);

	List<User> findAll();

}
