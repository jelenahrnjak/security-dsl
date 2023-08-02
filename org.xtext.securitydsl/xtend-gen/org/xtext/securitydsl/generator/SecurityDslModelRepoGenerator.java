package org.xtext.securitydsl.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
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
  private String packageName;

  private String credentialUser;

  public SecurityDslModelRepoGenerator(final IFileSystemAccess2 fsa, final Application app, final String srcDestination, final User user, final Role role) {
    this.packageName = app.getPackageName();
    this.credentialUser = SecurityDslGenerator.getCredential(user.getModel_attributes()).getName();
    String _tableName = user.getTableName();
    boolean _tripleEquals = (_tableName == null);
    if (_tripleEquals) {
      user.setTableName("users");
    }
    fsa.generateFile((srcDestination + "/model/User.java"), this.generateUserModel(user, app.getApp_security()));
    fsa.generateFile((srcDestination + "/repository/UserRepository.java"), this.generateUserRepository(user));
    fsa.generateFile((srcDestination + "/dto/UserRequestDTO.java"), this.generateUserRequestDto(user));
    fsa.generateFile((srcDestination + "/dto/AuthenticationRequestDTO.java"), this.generateAuthenticationRequestDTO());
    Security _app_security = app.getApp_security();
    if ((_app_security instanceof JWT)) {
      String stringAttribute = this.getStringAttributeForRole(role.getModel_attributes()).getName();
      String roleId = this.getIdentifier(role.getModel_attributes()).getName();
      fsa.generateFile((srcDestination + "/model/Role.java"), this.generateRoleModel(role, stringAttribute));
      fsa.generateFile((srcDestination + "/repository/RoleRepository.java"), this.generateRoleRepository(role, stringAttribute));
      String _artifact = app.getArtifact();
      String _plus = (_artifact + "/src/main/resources/data.sql");
      fsa.generateFile(_plus, this.generateSQLScript(role.getTableName(), stringAttribute, role.getRole_instances(), roleId));
    }
  }

  public String generateAuthenticationRequestDTO() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
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
    _builder.newLine();
    _builder.append("public class AuthenticationRequestDTO {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String ");
    _builder.append(this.credentialUser, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private String password;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public CharSequence generateUserRepository(final User user) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(".repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.Optional;");
    _builder.newLine();
    _builder.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.packageName);
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
    String _firstUpper = StringExtensions.toFirstUpper(this.credentialUser);
    _builder.append(_firstUpper, "    ");
    _builder.append("(String ");
    _builder.append(this.credentialUser, "    ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public String generateRoleRepository(final Role role, final String stringAttribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(".repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.packageName);
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
    return _builder.toString();
  }

  public CharSequence generateUserRequestDto(final User user) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
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
    CharSequence _generateAttributesForDto = this.generateAttributesForDto(user.getModel_attributes());
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
    return _builder;
  }

  public CharSequence generateAttributesForDto(final List<Attribute> attributes) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Attribute a : attributes) {
        {
          boolean _isIdentifier = a.isIdentifier();
          boolean _not = (!_isIdentifier);
          if (_not) {
            _builder.append("private ");
            EType _type = a.getType();
            _builder.append(_type);
            _builder.append(" ");
            String _name = a.getName();
            _builder.append(_name);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }

  public CharSequence generateUserModel(final User user, final Security security) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(".model;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      if ((security instanceof BasicAuthentication)) {
        _builder.append("import ");
        _builder.append(this.packageName);
        _builder.append(".model.enumeration.Role;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      if ((security instanceof JWT)) {
        _builder.append("import java.sql.Timestamp;");
        _builder.newLine();
        _builder.append("import java.util.Date;");
        _builder.newLine();
        _builder.append("import java.util.List;");
        _builder.newLine();
      } else {
        if ((security instanceof BasicAuthentication)) {
          _builder.append("import java.util.ArrayList;");
          _builder.newLine();
        }
      }
    }
    _builder.append("import java.util.Collection;");
    _builder.newLine();
    _builder.newLine();
    {
      if ((security instanceof JWT)) {
        _builder.append("import javax.persistence.FetchType;");
        _builder.newLine();
        _builder.append("import javax.persistence.JoinColumn;");
        _builder.newLine();
        _builder.append("import javax.persistence.JoinTable;");
        _builder.newLine();
        _builder.append("import javax.persistence.ManyToMany;");
        _builder.newLine();
      } else {
        if ((security instanceof BasicAuthentication)) {
          _builder.append("import javax.persistence.EnumType;");
          _builder.newLine();
          _builder.append("import javax.persistence.Enumerated;");
          _builder.newLine();
        }
      }
    }
    _builder.append("import javax.persistence.Column;");
    _builder.newLine();
    _builder.append("import javax.persistence.Entity;");
    _builder.newLine();
    _builder.append("import javax.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import javax.persistence.Id;");
    _builder.newLine();
    _builder.append("import javax.persistence.Table;");
    _builder.newLine();
    _builder.append("import lombok.Getter;");
    _builder.newLine();
    _builder.append("import lombok.Setter;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.springframework.security.core.GrantedAuthority;");
    _builder.newLine();
    {
      if ((security instanceof BasicAuthentication)) {
        _builder.append("import org.springframework.security.core.authority.SimpleGrantedAuthority;");
        _builder.newLine();
      }
    }
    _builder.append("import org.springframework.security.core.userdetails.UserDetails;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.fasterxml.jackson.annotation.JsonIgnore;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Getter");
    _builder.newLine();
    _builder.append("@Setter");
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("@Table(name=\"");
    String _tableName = user.getTableName();
    _builder.append(_tableName);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("public class User implements UserDetails {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _generateAttributes = this.generateAttributes(user.getModel_attributes());
    _builder.append(_generateAttributes, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      if ((security instanceof JWT)) {
        _builder.append("\t");
        _builder.append("@JsonIgnore");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Column(name = \"password\")");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("private String password;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Column(name = \"enabled\")");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("private boolean enabled;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Column(name = \"last_password_reset_date\")");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("private Timestamp lastPasswordResetDate;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@ManyToMany(fetch = FetchType.EAGER)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@JoinTable(name = \"user_role\",");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("        ");
        _builder.append("joinColumns = @JoinColumn(name = \"user_id\", referencedColumnName = \"id\"),");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("        ");
        _builder.append("inverseJoinColumns = @JoinColumn(name = \"role_id\", referencedColumnName = \"id\"))");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("private List<Role> roles;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void setPassword(String password) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("Timestamp now = new Timestamp(new Date().getTime());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("this.setLastPasswordResetDate(now);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("this.password = password;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@JsonIgnore");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public Collection<? extends GrantedAuthority> getAuthorities() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("return this.roles;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public boolean isEnabled() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("return enabled;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@JsonIgnore");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public boolean isAccountNonExpired() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@JsonIgnore");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public boolean isAccountNonLocked() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@JsonIgnore");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public boolean isCredentialsNonExpired() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      } else {
        if ((security instanceof BasicAuthentication)) {
          _builder.append("\t");
          _builder.append("private String password;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Enumerated(EnumType.STRING)");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("private Role role;");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@JsonIgnore");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public boolean isEnabled() {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return true;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@JsonIgnore");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public boolean isCredentialsNonExpired() {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return true;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@JsonIgnore");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public boolean isAccountNonLocked() {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return true;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@JsonIgnore");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public boolean isAccountNonExpired() {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return true;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@JsonIgnore");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public Collection<? extends GrantedAuthority> getAuthorities() {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("Collection<GrantedAuthority> authorities = new ArrayList<>();");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("authorities.add(new SimpleGrantedAuthority(role.getAuthority()));");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return authorities;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public String getPassword() {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("// TODO Auto-generated method stub");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return password;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public String getUsername() {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("// TODO Auto-generated method stub");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return ");
          _builder.append(this.credentialUser, "\t\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence generateRoleModel(final Role role, final String stringAttribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
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
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    String _generateAttributes = this.generateAttributes(role.getModel_attributes());
    _builder.append(_generateAttributes, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("@JsonIgnore");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getAuthority() {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return ");
    _builder.append(stringAttribute, "    \t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
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
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("@GeneratedValue");
    _builder.newLine();
    {
      for(final Attribute a_1 : attributes) {
        {
          String _collumnName = a_1.getCollumnName();
          boolean _tripleNotEquals = (_collumnName != null);
          if (_tripleNotEquals) {
            _builder.append("@Column(name = \"");
            String _collumnName_1 = a_1.getCollumnName();
            _builder.append(_collumnName_1);
            _builder.append("\")");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("private ");
        EType _type = a_1.getType();
        _builder.append(_type);
        _builder.append(" ");
        String _name = a_1.getName();
        _builder.append(_name);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder.toString();
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

  public Attribute getIdentifier(final List<Attribute> attributes) {
    for (final Attribute a : attributes) {
      boolean _isIdentifier = a.isIdentifier();
      if (_isIdentifier) {
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
}
