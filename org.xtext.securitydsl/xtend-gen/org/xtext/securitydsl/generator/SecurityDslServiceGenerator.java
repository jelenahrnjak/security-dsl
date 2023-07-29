package org.xtext.securitydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import security_dsl.Application;
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
  public SecurityDslServiceGenerator(final Resource resource, final IFileSystemAccess2 fsa, final Application app, final String srcDestination) {
    Iterator<User> users = Iterators.<User>filter(resource.getAllContents(), User.class);
    Iterator<Role> roles = Iterators.<Role>filter(resource.getAllContents(), Role.class);
    if ((users.hasNext() && roles.hasNext())) {
      User user = users.next();
      Role role = roles.next();
      String userCredentialName = this.getCredential(user.getModel_attributes()).getName();
      String stringAttributeRole = this.getStringAttributeForRole(role.getModel_attributes()).getName();
      fsa.generateFile((srcDestination + "/service/IUserService.java"), this.generateIUserService(app.getPackageName(), userCredentialName));
      fsa.generateFile((srcDestination + "/service/impl/UserServiceImpl.java"), this.generateUserServiceImplBasic(app.getPackageName(), app.getApp_security(), userCredentialName, this.getNotClienRoles(role.getRole_instances())));
      fsa.generateFile((srcDestination + "/service/RoleServiceImpl.java"), this.generateRoleServiceImpl(app.getPackageName(), stringAttributeRole));
      fsa.generateFile((srcDestination + "/service/IRoleService.java"), this.generateIRoleService(app.getPackageName(), stringAttributeRole));
    }
  }

  public String generateUserServiceImplBasic(final String packageName, final Security sec, final String credentialName, final List<RoleInstance> notClientRoles) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".service.impl;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import  ");
    _builder.append(packageName);
    _builder.append(".model.User;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".repository.UserRepository;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".service.IUserService;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".dto.UserRequestDTO;");
    String content = _builder.toString();
    String endOfSave = "";
    if ((sec instanceof JWT)) {
      String _content = content;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("import ");
      _builder_1.append(packageName);
      _builder_1.append(".model.Role;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("import ");
      _builder_1.append(packageName);
      _builder_1.append(".service.IRoleService;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      content = (_content + _builder_1);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("newUser.setEnabled(true);");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("List<Role> roles = roleService.findByName(newUser.getRole();");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("newRole.setRoles(roles);");
      _builder_2.newLine();
      endOfSave = _builder_2.toString();
    } else {
      if ((sec instanceof BasicAuthentication)) {
        String _content_1 = content;
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("import ");
        _builder_3.append(packageName);
        _builder_3.append(".model.enumeration.Role;");
        _builder_3.newLineIfNotEmpty();
        content = (_content_1 + _builder_3);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("newUser.setRole(Role.valueOf(request.getRole()));");
        _builder_4.newLine();
        endOfSave = _builder_4.toString();
      }
    }
    String _content_2 = content;
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.newLine();
    _builder_5.append("import lombok.RequiredArgsConstructor;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.beans.BeanUtils;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.security.core.userdetails.UserDetails;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.security.core.userdetails.UserDetailsService;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.security.core.userdetails.UsernameNotFoundException;");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;\t\t");
    _builder_5.newLine();
    _builder_5.append("import org.springframework.security.access.AccessDeniedException;");
    _builder_5.newLine();
    _builder_5.newLine();
    _builder_5.append("import org.springframework.stereotype.Service;");
    _builder_5.newLine();
    _builder_5.newLine();
    _builder_5.append("import java.util.List;");
    _builder_5.newLine();
    _builder_5.newLine();
    _builder_5.append("@RequiredArgsConstructor(onConstructor = @__(@Autowired))");
    _builder_5.newLine();
    _builder_5.append("@Service");
    _builder_5.newLine();
    _builder_5.append("public class UserServiceImpl implements UserDetailsService, IUserService {");
    _builder_5.newLine();
    _builder_5.newLine();
    _builder_5.append("    ");
    _builder_5.append("private final UserRepository userRepository;");
    _builder_5.newLine();
    _builder_5.append("    ");
    _builder_5.append("private final BCryptPasswordEncoder bCryptPasswordEncoder;");
    _builder_5.newLine();
    content = (_content_2 + _builder_5);
    if ((sec instanceof JWT)) {
      String _content_3 = content;
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("    ");
      _builder_6.append("private final IRoleService roleService;");
      _builder_6.newLine();
      _builder_6.append(" ");
      _builder_6.newLine();
      content = (_content_3 + _builder_6);
    }
    String _content_4 = content;
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.append("    ");
    _builder_7.append("@Override");
    _builder_7.newLine();
    _builder_7.append("    ");
    _builder_7.append("public User save(UserRequestDTO request) {");
    _builder_7.newLine();
    _builder_7.append("    \t");
    _builder_7.append("User newUser = new User();");
    _builder_7.newLine();
    _builder_7.append("    \t");
    _builder_7.append("BeanUtils.copyProperties(request, newUser);");
    _builder_7.newLine();
    _builder_7.append("    \t");
    _builder_7.append(endOfSave, "    \t");
    _builder_7.newLineIfNotEmpty();
    _builder_7.append("    \t");
    _builder_7.append("if (userRepository.findBy");
    String _firstUpper = StringExtensions.toFirstUpper(credentialName);
    _builder_7.append(_firstUpper, "    \t");
    _builder_7.append("(newUser.get");
    String _firstUpper_1 = StringExtensions.toFirstUpper(credentialName);
    _builder_7.append(_firstUpper_1, "    \t");
    _builder_7.append("()).isPresent()) {");
    _builder_7.newLineIfNotEmpty();
    _builder_7.append("    \t\t");
    _builder_7.append("throw new RuntimeException(\"User already exists\");");
    _builder_7.newLine();
    _builder_7.newLine();
    _builder_7.append("    \t\t");
    _builder_7.append("}");
    _builder_7.newLine();
    _builder_7.append("    \t\t");
    _builder_7.newLine();
    _builder_7.append("\t\t");
    _builder_7.append("if(!checkRoleForRegistration(request.getRole())) { ");
    _builder_7.newLine();
    _builder_7.append("\t\t\t");
    _builder_7.append("throw new RuntimeException(\"Role not valid\");");
    _builder_7.newLine();
    _builder_7.append("\t\t");
    _builder_7.append("}");
    _builder_7.newLine();
    _builder_7.append("    \t");
    _builder_7.newLine();
    _builder_7.append("        ");
    _builder_7.append("String encoderPassword = bCryptPasswordEncoder.encode(newUser.getPassword());");
    _builder_7.newLine();
    _builder_7.append("        ");
    _builder_7.append("newUser.setPassword(encoderPassword);");
    _builder_7.newLine();
    _builder_7.append("    \t");
    _builder_7.append("return userRepository.saveAndFlush(newUser);");
    _builder_7.newLine();
    _builder_7.append("    ");
    _builder_7.append("}");
    _builder_7.newLine();
    _builder_7.newLine();
    _builder_7.append("\t");
    _builder_7.append("private boolean checkRoleForRegistration(String role) {");
    _builder_7.newLine();
    _builder_7.append("\t\t");
    _builder_7.newLine();
    content = (_content_4 + _builder_7);
    int _size = notClientRoles.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      String _content_5 = content;
      StringConcatenation _builder_8 = new StringConcatenation();
      _builder_8.append("        ");
      _builder_8.append("if(");
      content = (_content_5 + _builder_8);
      for (int i = 0; (i < notClientRoles.size()); i++) {
        {
          String _content_6 = content;
          StringConcatenation _builder_9 = new StringConcatenation();
          _builder_9.append("role.equals(");
          String _upperCase = notClientRoles.get(i).getName().toUpperCase();
          _builder_9.append(_upperCase);
          _builder_9.append(")");
          content = (_content_6 + _builder_9);
          int _size_1 = notClientRoles.size();
          int _minus = (_size_1 - 1);
          boolean _equals = (i == _minus);
          if (_equals) {
            String _content_7 = content;
            content = (_content_7 + ") {");
          } else {
            String _content_8 = content;
            content = (_content_8 + " or ");
          }
        }
      }
      String _content_6 = content;
      StringConcatenation _builder_9 = new StringConcatenation();
      _builder_9.append("        ");
      _builder_9.append("return false;");
      _builder_9.newLine();
      _builder_9.newLine();
      _builder_9.append("    ");
      _builder_9.append("}");
      _builder_9.newLine();
      _builder_9.newLine();
      content = (_content_6 + _builder_9);
    }
    String _content_7 = content;
    StringConcatenation _builder_10 = new StringConcatenation();
    _builder_10.append("    \t");
    _builder_10.append("return true;");
    _builder_10.newLine();
    _builder_10.append("    ");
    _builder_10.append("}");
    _builder_10.newLine();
    _builder_10.newLine();
    _builder_10.append("\t");
    _builder_10.append("@Override");
    _builder_10.newLine();
    _builder_10.append("\t");
    _builder_10.append("public UserDetails loadUserByUsername(String ");
    _builder_10.append(credentialName, "\t");
    _builder_10.append(") throws UsernameNotFoundException {");
    _builder_10.newLineIfNotEmpty();
    _builder_10.append(" \t\t");
    _builder_10.append("return userRepository.findBy");
    String _firstUpper_2 = StringExtensions.toFirstUpper(credentialName);
    _builder_10.append(_firstUpper_2, " \t\t");
    _builder_10.append("(");
    _builder_10.append(credentialName, " \t\t");
    _builder_10.append(")");
    _builder_10.newLineIfNotEmpty();
    _builder_10.append(" \t\t\t");
    _builder_10.append(".orElseThrow(() ->");
    _builder_10.newLine();
    _builder_10.append(" \t\t\t\t");
    _builder_10.append("new UsernameNotFoundException(\"User Not Found\"));");
    _builder_10.newLine();
    _builder_10.append(" \t");
    _builder_10.append("}");
    _builder_10.newLine();
    _builder_10.append(" ");
    _builder_10.append("}");
    _builder_10.newLine();
    content = (_content_7 + _builder_10);
    return content;
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

  public Attribute getCredential(final List<Attribute> attributes) {
    for (final Attribute a : attributes) {
      boolean _isCredential = a.isCredential();
      if (_isCredential) {
        return a;
      }
    }
    return null;
  }

  public String generateIUserService(final String packageName, final String credentialName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".service;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".model.User;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(packageName);
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
    String content = _builder.toString();
    return content;
  }

  public String generateIRoleService(final String packageName, final String roleStringAttribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".service;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(packageName);
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
    String _firstUpper = StringExtensions.toFirstUpper(roleStringAttribute);
    _builder.append(_firstUpper, "\t");
    _builder.append("(String ");
    _builder.append(roleStringAttribute, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String content = _builder.toString();
    return content;
  }

  public String generateRoleServiceImpl(final String packageName, final String roleStringAttribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".service.impl;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".model.Role;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".repository.RoleRepository;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".service.IRoleService;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class RoleServiceImpl implements IRoleService {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<Role> findBy");
    String _firstUpper = StringExtensions.toFirstUpper(roleStringAttribute);
    _builder.append(_firstUpper, "\t");
    _builder.append("(String ");
    _builder.append(roleStringAttribute, "\t");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this.roleRepository.findByName(name); ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String content = _builder.toString();
    return content;
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
}
