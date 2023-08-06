package uns.ftn.securityDsl.service;

import uns.ftn.securityDsl.model.User;
import uns.ftn.securityDsl.dto.UserRequestDTO;

public interface IUserService {

	User save(UserRequestDTO request);

}
