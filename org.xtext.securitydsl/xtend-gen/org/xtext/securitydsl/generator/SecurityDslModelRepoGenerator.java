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
      String _tableName = user.getTableName();
      boolean _tripleEquals = (_tableName == null);
      if (_tripleEquals) {
        user.setTableName("users");
      }
      fsa.generateFile((srcDestination + "/model/User.java"), this.generateUserModel(app.getPackageName(), user, app.getApp_security()));
      fsa.generateFile((srcDestination + "/repository/UserRepository.java"), this.generateUserRepository(app.getPackageName(), user));
      fsa.generateFile((srcDestination + "/dto/UserRequestDTO.java"), this.generateUserRequestDto(app.getPackageName(), user));
    }
    if ((roles.hasNext() && (app.getApp_security() instanceof JWT))) {
      Role role = roles.next();
      String _tableName_1 = role.getTableName();
      boolean _tripleEquals_1 = (_tableName_1 == null);
      if (_tripleEquals_1) {
        role.setTableName("roles");
      }
      fsa.generateFile((srcDestination + "/model/Role.java"), this.generateRoleModel(app.getPackageName(), role));
      fsa.generateFile((srcDestination + "/repository/RoleRepository.java"), this.generateRoleRepository(app.getPackageName(), role));
    }
  }

  public String generateUserRepository(final String packageName, final User user) {
    String credentialName = this.getCredential(user.getModel_attributes()).getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + packageName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(".repository;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import java.util.Optional;");
    _builder_1.newLine();
    _builder_1.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import ");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + packageName);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append(".model.User;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("public interface UserRepository extends JpaRepository<User, ");
    String _plus_3 = (_plus_2 + _builder_2);
    EType _type = this.getIdentifier(user.getModel_attributes()).getType();
    String _plus_4 = (_plus_3 + _type);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("> {");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("    ");
    _builder_3.append("Optional<User> findBy");
    String _plus_5 = (_plus_4 + _builder_3);
    String _firstUpper = StringExtensions.toFirstUpper(credentialName);
    String _plus_6 = (_plus_5 + _firstUpper);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("(String ");
    String _plus_7 = (_plus_6 + _builder_4);
    String _plus_8 = (_plus_7 + credentialName);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append(");");
    _builder_5.newLine();
    _builder_5.append("}");
    _builder_5.newLine();
    String content = (_plus_8 + _builder_5);
    return content;
  }

  public String generateRoleRepository(final String appMainPackage, final Role role) {
    String stringAttribute = this.getStringAttributeForRole(role.getModel_attributes()).getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + appMainPackage);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(".repository;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import java.util.List;");
    _builder_1.newLine();
    _builder_1.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import ");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + appMainPackage);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append(".model.Role;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("public interface RoleRepository extends JpaRepository<Role, ");
    String _plus_3 = (_plus_2 + _builder_2);
    EType _type = this.getIdentifier(role.getModel_attributes()).getType();
    String _plus_4 = (_plus_3 + _type);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("> {");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("List<Role> findBy");
    String _plus_5 = (_plus_4 + _builder_3);
    String _firstUpper = StringExtensions.toFirstUpper(stringAttribute);
    String _plus_6 = (_plus_5 + _firstUpper);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("(String ");
    String _plus_7 = (_plus_6 + _builder_4);
    String _plus_8 = (_plus_7 + stringAttribute);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append(");");
    _builder_5.newLine();
    _builder_5.append("}");
    _builder_5.newLine();
    String content = (_plus_8 + _builder_5);
    return content;
  }

  public String generateUserRequestDto(final String packageName, final User user) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + packageName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(".dto;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import lombok.*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@Getter");
    _builder_1.newLine();
    _builder_1.append("@Setter");
    _builder_1.newLine();
    _builder_1.append("@ToString");
    _builder_1.newLine();
    _builder_1.append("@AllArgsConstructor");
    _builder_1.newLine();
    _builder_1.append("@NoArgsConstructor");
    _builder_1.newLine();
    _builder_1.append("public class UserRequestDTO {");
    _builder_1.newLine();
    _builder_1.newLine();
    String _plus_1 = (_plus + _builder_1);
    String _generateAttributesForDto = this.generateAttributesForDto(user.getModel_attributes());
    String _plus_2 = (_plus_1 + _generateAttributesForDto);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("    ");
    _builder_2.append("private String password;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("private String role;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("}");
    _builder_2.newLine();
    String content = (_plus_2 + _builder_2);
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
        _builder.append("    ");
        _builder.append("private ");
        EType _type = a.getType();
        String _plus = (_builder.toString() + _type);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(" ");
        String _plus_1 = (_plus + _builder_1);
        String _name = a.getName();
        String _plus_2 = (_plus_1 + _name);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(";");
        _builder_2.newLine();
        _builder_2.newLine();
        String _plus_3 = (_plus_2 + _builder_2);
        content = (_content + _plus_3);
      }
    }
    return content;
  }

  public String generateUserModel(final String appMainPackage, final User user, final Security security) {
    String credentialName = this.getCredential(user.getModel_attributes()).getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + appMainPackage);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(".model;");
    _builder_1.newLine();
    _builder_1.newLine();
    String userContent = (_plus + _builder_1);
    if ((security instanceof BasicAuthentication)) {
      String _userContent = userContent;
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("import ");
      String _plus_1 = (_builder_2.toString() + appMainPackage);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(".model.enumeration.Role;");
      _builder_3.newLine();
      _builder_3.newLine();
      String _plus_2 = (_plus_1 + _builder_3);
      userContent = (_userContent + _plus_2);
    }
    String _userContent_1 = userContent;
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("import java.sql.Timestamp;");
    _builder_4.newLine();
    _builder_4.append("import java.util.ArrayList;");
    _builder_4.newLine();
    _builder_4.append("import java.util.Collection;");
    _builder_4.newLine();
    _builder_4.append("import java.util.Date;");
    _builder_4.newLine();
    _builder_4.append("import java.util.List;");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("import javax.persistence.Column;");
    _builder_4.newLine();
    _builder_4.append("import javax.persistence.Entity;");
    _builder_4.newLine();
    _builder_4.append("import javax.persistence.EnumType;");
    _builder_4.newLine();
    _builder_4.append("import javax.persistence.Enumerated;");
    _builder_4.newLine();
    _builder_4.append("import javax.persistence.FetchType;");
    _builder_4.newLine();
    _builder_4.append("import javax.persistence.GeneratedValue;");
    _builder_4.newLine();
    _builder_4.append("import javax.persistence.GenerationType;");
    _builder_4.newLine();
    _builder_4.append("import javax.persistence.Id;");
    _builder_4.newLine();
    _builder_4.append("import javax.persistence.JoinColumn;");
    _builder_4.newLine();
    _builder_4.append("import javax.persistence.JoinTable;");
    _builder_4.newLine();
    _builder_4.append("import javax.persistence.ManyToMany;");
    _builder_4.newLine();
    _builder_4.append("import javax.persistence.Table;");
    _builder_4.newLine();
    _builder_4.append("import lombok.Getter;");
    _builder_4.newLine();
    _builder_4.append("import lombok.Setter;");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("import org.springframework.security.core.GrantedAuthority;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.security.core.authority.SimpleGrantedAuthority;");
    _builder_4.newLine();
    _builder_4.append("import org.springframework.security.core.userdetails.UserDetails;");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("import com.fasterxml.jackson.annotation.JsonIgnore;");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("@Getter");
    _builder_4.newLine();
    _builder_4.append("@Setter");
    _builder_4.newLine();
    _builder_4.append("@Entity");
    _builder_4.newLine();
    _builder_4.append("@Table(name=\"");
    String _tableName = user.getTableName();
    String _plus_3 = (_builder_4.toString() + _tableName);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("\")");
    _builder_5.newLine();
    _builder_5.append("public class User implements UserDetails {");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.newLine();
    _builder_5.append("    ");
    _builder_5.append("private static final long serialVersionUID = 1L;");
    _builder_5.newLine();
    _builder_5.append("\t\t\t");
    _builder_5.newLine();
    String _plus_4 = (_plus_3 + _builder_5);
    userContent = (_userContent_1 + _plus_4);
    String _userContent_2 = userContent;
    String _generateAttributes = this.generateAttributes(user.getModel_attributes());
    userContent = (_userContent_2 + _generateAttributes);
    if ((security instanceof JWT)) {
      String _userContent_3 = userContent;
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("    ");
      _builder_6.append("@JsonIgnore");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@Column(name = \"password\")");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("private String password;");
      _builder_6.newLine();
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@Column(name = \"enabled\")");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("private boolean enabled;");
      _builder_6.newLine();
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@Column(name = \"last_password_reset_date\")");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("private Timestamp lastPasswordResetDate;");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@ManyToMany(fetch = FetchType.EAGER)");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@JoinTable(name = \"user_role\",");
      _builder_6.newLine();
      _builder_6.append("            ");
      _builder_6.append("joinColumns = @JoinColumn(name = \"user_id\", referencedColumnName = \"id\"),");
      _builder_6.newLine();
      _builder_6.append("            ");
      _builder_6.append("inverseJoinColumns = @JoinColumn(name = \"role_id\", referencedColumnName = \"id\"))");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("private List<Role> roles;");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("public void setPassword(String password) {");
      _builder_6.newLine();
      _builder_6.append("        ");
      _builder_6.append("Timestamp now = new Timestamp(new Date().getTime());");
      _builder_6.newLine();
      _builder_6.append("        ");
      _builder_6.append("this.setLastPasswordResetDate(now);");
      _builder_6.newLine();
      _builder_6.append("        ");
      _builder_6.append("this.password = password;");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("}");
      _builder_6.newLine();
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@JsonIgnore");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@Override");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("public Collection<? extends GrantedAuthority> getAuthorities() {");
      _builder_6.newLine();
      _builder_6.append("        ");
      _builder_6.append("return this.roles;");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("}");
      _builder_6.newLine();
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@Override");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("public boolean isEnabled() {");
      _builder_6.newLine();
      _builder_6.append("        ");
      _builder_6.append("return enabled;");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("}");
      _builder_6.newLine();
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@JsonIgnore");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@Override");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("public boolean isAccountNonExpired() {");
      _builder_6.newLine();
      _builder_6.append("        ");
      _builder_6.append("return true;");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("}");
      _builder_6.newLine();
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@JsonIgnore");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@Override");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("public boolean isAccountNonLocked() {");
      _builder_6.newLine();
      _builder_6.append("        ");
      _builder_6.append("return true;");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("}");
      _builder_6.newLine();
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@JsonIgnore");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("@Override");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("public boolean isCredentialsNonExpired() {");
      _builder_6.newLine();
      _builder_6.append("        ");
      _builder_6.append("return true;");
      _builder_6.newLine();
      _builder_6.append("    ");
      _builder_6.append("}");
      _builder_6.newLine();
      _builder_6.newLine();
      userContent = (_userContent_3 + _builder_6);
    }
    if ((security instanceof BasicAuthentication)) {
      String _userContent_4 = userContent;
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.append("    ");
      _builder_7.append("private String password;");
      _builder_7.newLine();
      _builder_7.append("\t\t\t");
      _builder_7.newLine();
      _builder_7.append("    ");
      _builder_7.append("@Enumerated(EnumType.STRING)");
      _builder_7.newLine();
      _builder_7.append("    ");
      _builder_7.append("private Role role;");
      _builder_7.newLine();
      _builder_7.append("    ");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("@JsonIgnore");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("@Override");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("public boolean isEnabled() {");
      _builder_7.newLine();
      _builder_7.append("\t\t");
      _builder_7.append("return true;");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("}");
      _builder_7.newLine();
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("@JsonIgnore");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("@Override");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("public boolean isCredentialsNonExpired() {");
      _builder_7.newLine();
      _builder_7.append("\t\t");
      _builder_7.append("return true;");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("}");
      _builder_7.newLine();
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("@JsonIgnore");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("@Override");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("public boolean isAccountNonLocked() {");
      _builder_7.newLine();
      _builder_7.append("\t\t");
      _builder_7.append("return true;");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("}");
      _builder_7.newLine();
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("@JsonIgnore");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("@Override");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("public boolean isAccountNonExpired() {");
      _builder_7.newLine();
      _builder_7.append("\t\t");
      _builder_7.append("return true;");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("}");
      _builder_7.newLine();
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("@JsonIgnore");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("@Override");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("public Collection<? extends GrantedAuthority> getAuthorities() {");
      _builder_7.newLine();
      _builder_7.append("\t\t");
      _builder_7.append("Collection<GrantedAuthority> authorities = new ArrayList<>();");
      _builder_7.newLine();
      _builder_7.append("\t\t");
      _builder_7.append("authorities.add(new SimpleGrantedAuthority(role.getAuthority()));");
      _builder_7.newLine();
      _builder_7.append("\t\t");
      _builder_7.append("return authorities;");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("}");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("@Override");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("public String getPassword() {");
      _builder_7.newLine();
      _builder_7.append("\t\t");
      _builder_7.append("// TODO Auto-generated method stub");
      _builder_7.newLine();
      _builder_7.append("\t\t");
      _builder_7.append("return password;");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("}");
      _builder_7.newLine();
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("@Override");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("public String getUsername() {");
      _builder_7.newLine();
      _builder_7.append("\t\t");
      _builder_7.append("// TODO Auto-generated method stub");
      _builder_7.newLine();
      _builder_7.append("\t\t");
      _builder_7.append("return ");
      String _plus_5 = (_builder_7.toString() + credentialName);
      StringConcatenation _builder_8 = new StringConcatenation();
      _builder_8.append("\t");
      _builder_8.append(";");
      _builder_8.newLine();
      _builder_8.append("}");
      _builder_8.newLine();
      String _plus_6 = (_plus_5 + _builder_8);
      userContent = (_userContent_4 + _plus_6);
    }
    String _userContent_5 = userContent;
    userContent = (_userContent_5 + "}");
    return userContent;
  }

  public String generateRoleModel(final String appMainPackage, final Role role) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + appMainPackage);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(".model;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import lombok.Getter;");
    _builder_1.newLine();
    _builder_1.append("import lombok.Setter;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import com.fasterxml.jackson.annotation.JsonIgnore;");
    _builder_1.newLine();
    _builder_1.append("import org.springframework.security.core.GrantedAuthority;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import javax.persistence.*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@Getter");
    _builder_1.newLine();
    _builder_1.append("@Setter");
    _builder_1.newLine();
    _builder_1.append("@Entity");
    _builder_1.newLine();
    _builder_1.append("@Table(name=\"");
    String _plus_1 = (_plus + _builder_1);
    String _tableName = role.getTableName();
    String _plus_2 = (_plus_1 + _tableName);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\")");
    _builder_2.newLine();
    _builder_2.append("public class Role implements GrantedAuthority {");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("private static final long serialVersionUID = 1L;");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.newLine();
    String content = (_plus_2 + _builder_2);
    String _content = content;
    String _generateAttributes = this.generateAttributes(role.getModel_attributes());
    content = (_content + _generateAttributes);
    Attribute stringAttribute = this.getStringAttributeForRole(role.getModel_attributes());
    String _content_1 = content;
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("    ");
    _builder_3.append("@JsonIgnore");
    _builder_3.newLine();
    _builder_3.append("    ");
    _builder_3.append("@Override");
    _builder_3.newLine();
    _builder_3.append("    ");
    _builder_3.append("public String getAuthority() {");
    _builder_3.newLine();
    _builder_3.append("    \t");
    _builder_3.append("return ");
    String _name = stringAttribute.getName();
    String _plus_3 = (_builder_3.toString() + _name);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append(";");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("}");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("}");
    String _plus_4 = (_plus_3 + _builder_4);
    content = (_content_1 + _plus_4);
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
          String _plus = (_builder_1.toString() + _collumnName_1);
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("\")");
          _builder_2.newLine();
          String _plus_1 = (_plus + _builder_2);
          content = (_content + _plus_1);
        }
        String _content_1 = content;
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("    ");
        _builder_3.append("private ");
        String _upperCase = attribute.getType().toString().substring(0, 1).toUpperCase();
        String _plus_2 = (_builder_3.toString() + _upperCase);
        String _lowerCase = attribute.getType().toString().substring(1).toLowerCase();
        String _plus_3 = (_plus_2 + _lowerCase);
        String _plus_4 = (_plus_3 + 
          " ");
        String _name = attribute.getName();
        String _plus_5 = (_plus_4 + _name);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append(";");
        _builder_4.newLine();
        _builder_4.newLine();
        String _plus_6 = (_plus_5 + _builder_4);
        content = (_content_1 + _plus_6);
      }
    }
    return content;
  }
}
