package uns.ftn.securityDsl.service;

import uns.ftn.securityDsl.model.Role;

import java.util.List;

public interface IRoleService {

	List<Role> findByName(String name);

}
