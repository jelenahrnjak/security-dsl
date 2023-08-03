package uns.ftn.securityDsl.service.impl;

import uns.ftn.securityDsl.model.Role;
import uns.ftn.securityDsl.repository.RoleRepository;
import uns.ftn.securityDsl.service.IRoleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class RoleServiceImpl implements IRoleService {

	private final RoleRepository roleRepository;

	@Override
	public List<Role> findByName(String name){
		return this.roleRepository.findByName(name); 
	}

}
