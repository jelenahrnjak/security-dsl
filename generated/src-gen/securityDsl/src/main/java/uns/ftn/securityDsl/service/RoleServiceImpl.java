package uns.ftn.securityDsl.service.impl;

import uns.ftn.securityDsl.model.Role;
import uns.ftn.securityDsl.repository.RoleRepository;
import uns.ftn.securityDsl.service.IRoleService;

import java.util.List;

public class RoleServiceImpl implements IRoleService {

	@Override
	List<Role> findByName(String name){
	return this.roleRepository.findByName(name); 
	}

}
