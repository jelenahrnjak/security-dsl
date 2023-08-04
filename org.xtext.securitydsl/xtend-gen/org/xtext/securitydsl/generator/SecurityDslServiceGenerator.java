package org.xtext.securitydsl.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import security_dsl.Attribute;
import security_dsl.BasicAuthentication;
import security_dsl.EType;
import security_dsl.JWT;
import security_dsl.Role;
import security_dsl.RoleInstance;
import security_dsl.Security;
import security_dsl.User;

@SuppressWarnings("all")
public class SecurityDslServiceGenerator {
  private String packageName;

  private String userCredential;

  private String roleStringAttribute;

  public SecurityDslServiceGenerator(final IFileSystemAccess2 fsa, final String packageName, final String srcDestination, final User user, final Role role, final Security security) {
    this.packageName = packageName;
    this.userCredential = SecurityDslGenerator.getCredential(user.getEntity_attributes()).getName();
    fsa.generateFile((srcDestination + "/service/IUserService.java"), this.generateIUserService());
    fsa.generateFile((srcDestination + "/service/impl/UserServiceImpl.java"), this.generateUserServiceImplBasic(security, this.getNotClienRoles(role.getRole_instances())));
    if ((security instanceof JWT)) {
      this.roleStringAttribute = this.getStringAttributeForRole(role.getEntity_attributes()).getName();
      fsa.generateFile((srcDestination + "/service/impl/RoleServiceImpl.java"), this.generateRoleServiceImpl());
      fsa.generateFile((srcDestination + "/service/IRoleService.java"), this.generateIRoleService());
    }
  }

  public CharSequence generateUserServiceImplBasic(final Security sec, final List<RoleInstance> notClientRoles) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(".service.impl;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import  ");
    _builder.append(this.packageName);
    _builder.append(".model.User;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".repository.UserRepository;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".service.IUserService;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".dto.UserRequestDTO;");
    _builder.newLineIfNotEmpty();
    {
      if ((sec instanceof JWT)) {
        _builder.append("import ");
        _builder.append(this.packageName);
        _builder.append(".model.Role;");
        _builder.newLineIfNotEmpty();
        _builder.append("import ");
        _builder.append(this.packageName);
        _builder.append(".service.IRoleService;");
        _builder.newLineIfNotEmpty();
      } else {
        if ((sec instanceof BasicAuthentication)) {
          _builder.append("import ");
          _builder.append(this.packageName);
          _builder.append(".model.enumeration.Role;");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.newLine();
    _builder.append("import org.springframework.beans.BeanUtils;");
    _builder.newLine();
    _builder.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.userdetails.UserDetails;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.userdetails.UserDetailsService;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.userdetails.UsernameNotFoundException;");
    _builder.newLine();
    _builder.append("import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Service;");
    _builder.newLine();
    _builder.newLine();
    {
      if ((sec instanceof JWT)) {
        _builder.append("import java.util.List;");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.append("@Service");
    _builder.newLine();
    _builder.append("public class UserServiceImpl implements UserDetailsService, IUserService {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Autowired");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private UserRepository userRepository;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Autowired");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private BCryptPasswordEncoder bCryptPasswordEncoder;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    {
      if ((sec instanceof JWT)) {
        _builder.append("    ");
        _builder.append("@Autowired");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("private IRoleService roleService;");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public User save(UserRequestDTO request) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("User newUser = new User();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("BeanUtils.copyProperties(request, newUser);");
    _builder.newLine();
    {
      if ((sec instanceof JWT)) {
        _builder.append("\t\t");
        _builder.append("newUser.setEnabled(true);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("List<Role> roles = roleService.findByName(request.getRole());");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("newUser.setRoles(roles);");
        _builder.newLine();
      } else {
        if ((sec instanceof BasicAuthentication)) {
          _builder.append("\t\t");
          _builder.append("newUser.setRole(Role.valueOf(request.getRole()));");
          _builder.newLine();
        }
      }
    }
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (userRepository.findBy");
    String _firstUpper = StringExtensions.toFirstUpper(this.userCredential);
    _builder.append(_firstUpper, "\t\t");
    _builder.append("(newUser.get");
    String _firstUpper_1 = StringExtensions.toFirstUpper(this.userCredential);
    _builder.append(_firstUpper_1, "\t\t");
    _builder.append("()).isPresent()) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("throw new RuntimeException(\"User already exists\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(!checkRoleForRegistration(request.getRole())) { ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throw new RuntimeException(\"Role not valid\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    \t");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String encoderPassword = bCryptPasswordEncoder.encode(newUser.getPassword());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("newUser.setPassword(encoderPassword);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return userRepository.saveAndFlush(newUser);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private boolean checkRoleForRegistration(String role) {");
    _builder.newLine();
    _builder.newLine();
    {
      int _size = notClientRoles.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("\t\t");
        _builder.append("if(");
        {
          for(final RoleInstance r : notClientRoles) {
            _builder.append("role.equals(\"");
            String _name = r.getName();
            _builder.append(_name, "\t\t");
            _builder.append("\")");
            {
              int _indexOf = notClientRoles.indexOf(r);
              int _size_1 = notClientRoles.size();
              int _minus = (_size_1 - 1);
              boolean _equals = (_indexOf == _minus);
              if (_equals) {
                _builder.append(") {");
              } else {
                _builder.append(" || ");
              }
            }
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t ");
    _builder.newLine();
    _builder.append("\t \t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t    \t");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public UserDetails loadUserByUsername(String ");
    _builder.append(this.userCredential, "\t");
    _builder.append(") throws UsernameNotFoundException {");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t\t");
    _builder.append("return userRepository.findBy");
    String _firstUpper_2 = StringExtensions.toFirstUpper(this.userCredential);
    _builder.append(_firstUpper_2, " \t\t");
    _builder.append("(");
    _builder.append(this.userCredential, " \t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t\t\t");
    _builder.append(".orElseThrow(() ->");
    _builder.newLine();
    _builder.append(" \t\t\t\t");
    _builder.append("new UsernameNotFoundException(\"User Not Found\"));");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence generateIUserService() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(".service;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".model.User;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".dto.UserRequestDTO;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface IUserService {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("User save(UserRequestDTO request);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence generateIRoleService() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(".service;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".model.Role;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface IRoleService {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<Role> findBy");
    String _firstUpper = StringExtensions.toFirstUpper(this.roleStringAttribute);
    _builder.append(_firstUpper, "\t");
    _builder.append("(String ");
    _builder.append(this.roleStringAttribute, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence generateRoleServiceImpl() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(".service.impl;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".model.Role;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".repository.RoleRepository;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".service.IRoleService;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Service;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import lombok.RequiredArgsConstructor;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@RequiredArgsConstructor(onConstructor = @__(@Autowired))");
    _builder.newLine();
    _builder.append("@Service");
    _builder.newLine();
    _builder.append("public class RoleServiceImpl implements IRoleService {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final RoleRepository roleRepository;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<Role> findBy");
    String _firstUpper = StringExtensions.toFirstUpper(this.roleStringAttribute);
    _builder.append(_firstUpper, "\t");
    _builder.append("(String ");
    _builder.append(this.roleStringAttribute, "\t");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return this.roleRepository.findByName(name); ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public Attribute getStringAttributeForRole(final List<Attribute> unsortedAttributes) {
    final ArrayList<Attribute> attributes = CollectionLiterals.<Attribute>newArrayList();
    for (final Attribute a : unsortedAttributes) {
      boolean _isIdentifier = a.isIdentifier();
      if (_isIdentifier) {
        attributes.add(0, a);
      } else {
        attributes.add(a);
      }
    }
    for (final Attribute a_1 : attributes) {
      EType _type = a_1.getType();
      boolean _equals = Objects.equal(_type, EType.STRING);
      if (_equals) {
        return a_1;
      }
    }
    return null;
  }

  public ArrayList<RoleInstance> getNotClienRoles(final List<RoleInstance> instances) {
    ArrayList<RoleInstance> notClients = CollectionLiterals.<RoleInstance>newArrayList();
    for (final RoleInstance ri : instances) {
      boolean _isClient = ri.isClient();
      boolean _not = (!_isClient);
      if (_not) {
        notClients.add(ri);
      }
    }
    return notClients;
  }
}
