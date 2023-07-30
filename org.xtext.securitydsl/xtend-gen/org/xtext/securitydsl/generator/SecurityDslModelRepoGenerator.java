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
public class SecurityDslModelRepoGenerator {
  public SecurityDslModelRepoGenerator(final Resource resource, final IFileSystemAccess2 fsa, final Application app, final String srcDestination) {
    Iterator<User> users = Iterators.<User>filter(resource.getAllContents(), User.class);
    Iterator<Role> roles = Iterators.<Role>filter(resource.getAllContents(), Role.class);
    boolean _hasNext = users.hasNext();
    if (_hasNext) {
      User user = users.next();
      String credentialNameUser = this.getCredential(user.getModel_attributes()).getName();
      String _tableName = user.getTableName();
      boolean _tripleEquals = (_tableName == null);
      if (_tripleEquals) {
        user.setTableName("users");
      }
      fsa.generateFile((srcDestination + "/model/User.java"), this.generateUserModel(app.getPackageName(), user, app.getApp_security(), credentialNameUser));
      fsa.generateFile((srcDestination + "/repository/UserRepository.java"), this.generateUserRepository(app.getPackageName(), user, credentialNameUser));
      fsa.generateFile((srcDestination + "/dto/UserRequestDTO.java"), this.generateUserRequestDto(app.getPackageName(), user));
      fsa.generateFile((srcDestination + "/dto/AuthenticationRequestDTO.java"), this.generateAuthenticationRequestDTO(app.getPackageName(), credentialNameUser));
    }
    if ((roles.hasNext() && (app.getApp_security() instanceof JWT))) {
      Role role = roles.next();
      String _tableName_1 = role.getTableName();
      boolean _tripleEquals_1 = (_tableName_1 == null);
      if (_tripleEquals_1) {
        role.setTableName("roles");
      }
      String stringAttribute = this.getStringAttributeForRole(role.getModel_attributes()).getName();
      String roleId = this.getIdentifier(role.getModel_attributes()).getName();
      fsa.generateFile((srcDestination + "/model/Role.java"), this.generateRoleModel(app.getPackageName(), role));
      fsa.generateFile((srcDestination + "/repository/RoleRepository.java"), this.generateRoleRepository(app.getPackageName(), role, stringAttribute));
      String _artifact = app.getArtifact();
      String _plus = (_artifact + "/src/main/resources/data.sql");
      fsa.generateFile(_plus, this.generateSQLScript(role.getTableName(), stringAttribute, role.getRole_instances(), roleId));
    }
  }

  public String generateAuthenticationRequestDTO(final String packageName, final String credentialNameUser) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".dto;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class AuthenticationRequestDTO {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String ");
    _builder.append(credentialNameUser, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private String password;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public AuthenticationRequestDTO() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public AuthenticationRequestDTO(String ");
    _builder.append(credentialNameUser, "    ");
    _builder.append(", String password) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("this.set");
    String _firstUpper = StringExtensions.toFirstUpper(credentialNameUser);
    _builder.append(_firstUpper, "        ");
    _builder.append("(");
    _builder.append(credentialNameUser, "        ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("this.setPassword(password);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String get");
    String _firstUpper_1 = StringExtensions.toFirstUpper(credentialNameUser);
    _builder.append(_firstUpper_1, "    ");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return this.");
    _builder.append(credentialNameUser, "        ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void set");
    String _firstUpper_2 = StringExtensions.toFirstUpper(credentialNameUser);
    _builder.append(_firstUpper_2, "    ");
    _builder.append("(String ");
    _builder.append(credentialNameUser, "    ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("this.");
    _builder.append(credentialNameUser, "        ");
    _builder.append("= ");
    _builder.append(credentialNameUser, "        ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getPassword() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return this.password;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setPassword(String password) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.password = password;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String content = _builder.toString();
    return content;
  }

  public String generateUserRepository(final String packageName, final User user, final String credentialName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.Optional;");
    _builder.newLine();
    _builder.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".model.User;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface UserRepository extends JpaRepository<User, ");
    EType _type = this.getIdentifier(user.getModel_attributes()).getType();
    _builder.append(_type);
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Optional<User> findBy");
    String _firstUpper = StringExtensions.toFirstUpper(credentialName);
    _builder.append(_firstUpper, "    ");
    _builder.append("(String ");
    _builder.append(credentialName, "    ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String content = _builder.toString();
    return content;
  }

  public String generateRoleRepository(final String packageName, final Role role, final String stringAttribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(packageName);
    _builder.append(".model.Role;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface RoleRepository extends JpaRepository<Role, ");
    EType _type = this.getIdentifier(role.getModel_attributes()).getType();
    _builder.append(_type);
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<Role> findBy");
    String _firstUpper = StringExtensions.toFirstUpper(stringAttribute);
    _builder.append(_firstUpper, "\t");
    _builder.append("(String ");
    _builder.append(stringAttribute, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    String content = _builder.toString();
    return content;
  }

  public String generateUserRequestDto(final String packageName, final User user) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".dto;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import lombok.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Getter");
    _builder.newLine();
    _builder.append("@Setter");
    _builder.newLine();
    _builder.append("@ToString");
    _builder.newLine();
    _builder.append("@AllArgsConstructor");
    _builder.newLine();
    _builder.append("@NoArgsConstructor");
    _builder.newLine();
    _builder.append("public class UserRequestDTO {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    String _generateAttributesForDto = this.generateAttributesForDto(user.getModel_attributes());
    _builder.append(_generateAttributesForDto, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private String password;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String role;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String content = _builder.toString();
    return content;
  }

  public String generateAttributesForDto(final List<Attribute> attributes) {
    String content = "";
    for (final Attribute a : attributes) {
      boolean _isIdentifier = a.isIdentifier();
      boolean _not = (!_isIdentifier);
      if (_not) {
        String _content = content;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("private ");
        EType _type = a.getType();
        _builder.append(_type);
        _builder.append(" ");
        String _name = a.getName();
        _builder.append(_name);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        content = (_content + _builder);
      }
    }
    return content;
  }

  public String generateUserModel(final String packageName, final User user, final Security security, final String credentialName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".model;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String userContent = _builder.toString();
    if ((security instanceof BasicAuthentication)) {
      String _userContent = userContent;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("import ");
      _builder_1.append(packageName);
      _builder_1.append(".model.enumeration.Role;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      userContent = (_userContent + _builder_1);
    }
    String _userContent_1 = userContent;
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("import java.sql.Timestamp;");
    _builder_2.newLine();
    _builder_2.append("import java.util.ArrayList;");
    _builder_2.newLine();
    _builder_2.append("import java.util.Collection;");
    _builder_2.newLine();
    _builder_2.append("import java.util.Date;");
    _builder_2.newLine();
    _builder_2.append("import java.util.List;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("import javax.persistence.Column;");
    _builder_2.newLine();
    _builder_2.append("import javax.persistence.Entity;");
    _builder_2.newLine();
    _builder_2.append("import javax.persistence.EnumType;");
    _builder_2.newLine();
    _builder_2.append("import javax.persistence.Enumerated;");
    _builder_2.newLine();
    _builder_2.append("import javax.persistence.FetchType;");
    _builder_2.newLine();
    _builder_2.append("import javax.persistence.GeneratedValue;");
    _builder_2.newLine();
    _builder_2.append("import javax.persistence.GenerationType;");
    _builder_2.newLine();
    _builder_2.append("import javax.persistence.Id;");
    _builder_2.newLine();
    _builder_2.append("import javax.persistence.JoinColumn;");
    _builder_2.newLine();
    _builder_2.append("import javax.persistence.JoinTable;");
    _builder_2.newLine();
    _builder_2.append("import javax.persistence.ManyToMany;");
    _builder_2.newLine();
    _builder_2.append("import javax.persistence.Table;");
    _builder_2.newLine();
    _builder_2.append("import lombok.Getter;");
    _builder_2.newLine();
    _builder_2.append("import lombok.Setter;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.core.GrantedAuthority;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.core.authority.SimpleGrantedAuthority;");
    _builder_2.newLine();
    _builder_2.append("import org.springframework.security.core.userdetails.UserDetails;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("import com.fasterxml.jackson.annotation.JsonIgnore;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("@Getter");
    _builder_2.newLine();
    _builder_2.append("@Setter");
    _builder_2.newLine();
    _builder_2.append("@Entity");
    _builder_2.newLine();
    _builder_2.append("@Table(name=\"");
    String _tableName = user.getTableName();
    _builder_2.append(_tableName);
    _builder_2.append("\")");
    _builder_2.newLineIfNotEmpty();
    _builder_2.append("public class User implements UserDetails {");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("private static final long serialVersionUID = 1L;");
    _builder_2.newLine();
    _builder_2.newLine();
    userContent = (_userContent_1 + _builder_2);
    String _userContent_2 = userContent;
    String _generateAttributes = this.generateAttributes(user.getModel_attributes());
    userContent = (_userContent_2 + _generateAttributes);
    if ((security instanceof JWT)) {
      String _userContent_3 = userContent;
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("    ");
      _builder_3.append("@JsonIgnore");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@Column(name = \"password\")");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("private String password;");
      _builder_3.newLine();
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@Column(name = \"enabled\")");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("private boolean enabled;");
      _builder_3.newLine();
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@Column(name = \"last_password_reset_date\")");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("private Timestamp lastPasswordResetDate;");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@ManyToMany(fetch = FetchType.EAGER)");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@JoinTable(name = \"user_role\",");
      _builder_3.newLine();
      _builder_3.append("            ");
      _builder_3.append("joinColumns = @JoinColumn(name = \"user_id\", referencedColumnName = \"id\"),");
      _builder_3.newLine();
      _builder_3.append("            ");
      _builder_3.append("inverseJoinColumns = @JoinColumn(name = \"role_id\", referencedColumnName = \"id\"))");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("private List<Role> roles;");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("public void setPassword(String password) {");
      _builder_3.newLine();
      _builder_3.append("        ");
      _builder_3.append("Timestamp now = new Timestamp(new Date().getTime());");
      _builder_3.newLine();
      _builder_3.append("        ");
      _builder_3.append("this.setLastPasswordResetDate(now);");
      _builder_3.newLine();
      _builder_3.append("        ");
      _builder_3.append("this.password = password;");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("}");
      _builder_3.newLine();
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@JsonIgnore");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@Override");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("public Collection<? extends GrantedAuthority> getAuthorities() {");
      _builder_3.newLine();
      _builder_3.append("        ");
      _builder_3.append("return this.roles;");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("}");
      _builder_3.newLine();
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@Override");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("public boolean isEnabled() {");
      _builder_3.newLine();
      _builder_3.append("        ");
      _builder_3.append("return enabled;");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("}");
      _builder_3.newLine();
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@JsonIgnore");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@Override");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("public boolean isAccountNonExpired() {");
      _builder_3.newLine();
      _builder_3.append("        ");
      _builder_3.append("return true;");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("}");
      _builder_3.newLine();
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@JsonIgnore");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@Override");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("public boolean isAccountNonLocked() {");
      _builder_3.newLine();
      _builder_3.append("        ");
      _builder_3.append("return true;");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("}");
      _builder_3.newLine();
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@JsonIgnore");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("@Override");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("public boolean isCredentialsNonExpired() {");
      _builder_3.newLine();
      _builder_3.append("        ");
      _builder_3.append("return true;");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("}");
      _builder_3.newLine();
      _builder_3.newLine();
      userContent = (_userContent_3 + _builder_3);
    }
    if ((security instanceof BasicAuthentication)) {
      String _userContent_4 = userContent;
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("    ");
      _builder_4.append("private String password;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t");
      _builder_4.newLine();
      _builder_4.append("    ");
      _builder_4.append("@Enumerated(EnumType.STRING)");
      _builder_4.newLine();
      _builder_4.append("    ");
      _builder_4.append("private Role role;");
      _builder_4.newLine();
      _builder_4.append("    ");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("@JsonIgnore");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("@Override");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("public boolean isEnabled() {");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("return true;");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("}");
      _builder_4.newLine();
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("@JsonIgnore");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("@Override");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("public boolean isCredentialsNonExpired() {");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("return true;");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("}");
      _builder_4.newLine();
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("@JsonIgnore");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("@Override");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("public boolean isAccountNonLocked() {");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("return true;");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("}");
      _builder_4.newLine();
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("@JsonIgnore");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("@Override");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("public boolean isAccountNonExpired() {");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("return true;");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("}");
      _builder_4.newLine();
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("@JsonIgnore");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("@Override");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("public Collection<? extends GrantedAuthority> getAuthorities() {");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("Collection<GrantedAuthority> authorities = new ArrayList<>();");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("authorities.add(new SimpleGrantedAuthority(role.getAuthority()));");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("return authorities;");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("}");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("@Override");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("public String getPassword() {");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("// TODO Auto-generated method stub");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("return password;");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("}");
      _builder_4.newLine();
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("@Override");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("public String getUsername() {");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("// TODO Auto-generated method stub");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("return ");
      _builder_4.append(credentialName, "\t\t");
      _builder_4.append(";");
      _builder_4.newLineIfNotEmpty();
      _builder_4.append("\t");
      _builder_4.append("}");
      _builder_4.newLine();
      userContent = (_userContent_4 + _builder_4);
    }
    String _userContent_5 = userContent;
    userContent = (_userContent_5 + "}");
    return userContent;
  }

  public String generateRoleModel(final String packageName, final Role role) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(".model;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import lombok.Getter;");
    _builder.newLine();
    _builder.append("import lombok.Setter;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.fasterxml.jackson.annotation.JsonIgnore;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.GrantedAuthority;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.persistence.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Getter");
    _builder.newLine();
    _builder.append("@Setter");
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("@Table(name=\"");
    String _tableName = role.getTableName();
    _builder.append(_tableName);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("public class Role implements GrantedAuthority {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    _builder.newLine();
    String content = _builder.toString();
    String _content = content;
    String _generateAttributes = this.generateAttributes(role.getModel_attributes());
    content = (_content + _generateAttributes);
    Attribute stringAttribute = this.getStringAttributeForRole(role.getModel_attributes());
    String _content_1 = content;
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("    ");
    _builder_1.append("@JsonIgnore");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("@Override");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("public String getAuthority() {");
    _builder_1.newLine();
    _builder_1.append("    \t");
    _builder_1.append("return ");
    String _name = stringAttribute.getName();
    _builder_1.append(_name, "    \t");
    _builder_1.append(";");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("    ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("}");
    content = (_content_1 + _builder_1);
    return content;
  }

  public Attribute getIdentifier(final List<Attribute> attributes) {
    for (final Attribute a : attributes) {
      boolean _isIdentifier = a.isIdentifier();
      if (_isIdentifier) {
        return a;
      }
    }
    return null;
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

  public String generateAttributes(final List<Attribute> unsortedAttributes) {
    final ArrayList<Attribute> attributes = CollectionLiterals.<Attribute>newArrayList();
    for (final Attribute a : unsortedAttributes) {
      boolean _isIdentifier = a.isIdentifier();
      if (_isIdentifier) {
        attributes.add(0, a);
      } else {
        attributes.add(a);
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GeneratedValue");
    _builder.newLine();
    String content = _builder.toString();
    for (final Attribute attribute : attributes) {
      {
        String _collumnName = attribute.getCollumnName();
        boolean _tripleNotEquals = (_collumnName != null);
        if (_tripleNotEquals) {
          String _content = content;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("    ");
          _builder_1.append("@Column(name = \"");
          String _collumnName_1 = attribute.getCollumnName();
          _builder_1.append(_collumnName_1, "    ");
          _builder_1.append("\")");
          _builder_1.newLineIfNotEmpty();
          content = (_content + _builder_1);
        }
        String _content_1 = content;
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("    ");
        _builder_2.append("private ");
        EType _type = attribute.getType();
        _builder_2.append(_type, "    ");
        _builder_2.append("  ");
        String _name = attribute.getName();
        _builder_2.append(_name, "    ");
        _builder_2.append(";");
        _builder_2.newLineIfNotEmpty();
        _builder_2.newLine();
        content = (_content_1 + _builder_2);
      }
    }
    return content;
  }

  public CharSequence generateSQLScript(final String tableName, final String stringAttribute, final List<RoleInstance> rInstances, final String id) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final RoleInstance role : rInstances) {
        _builder.append("INSERT INTO ");
        String _upperCase = tableName.toUpperCase();
        _builder.append(_upperCase);
        _builder.append(" (");
        _builder.append(id);
        _builder.append(", ");
        _builder.append(stringAttribute);
        _builder.append(") VALUES (");
        int _indexOf = rInstances.indexOf(role);
        int _plus = (_indexOf + 1);
        _builder.append(_plus);
        _builder.append(", \'");
        String _name = role.getName();
        _builder.append(_name);
        _builder.append("\');");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
