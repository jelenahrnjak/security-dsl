package org.xtext.securitydsl.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import security_dsl.Application;

@SuppressWarnings("all")
public class SecurityDslBasicAuthenticationGenerator {
  public SecurityDslBasicAuthenticationGenerator(final IFileSystemAccess2 fsa, final Application app, final String srcDestination) {
  }

  public CharSequence generateApplicationSecurityConfig() {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }

  public String generatePassEncoder(final String packageName) {
    String content = "";
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + packageName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.springframework.context.annotation.Bean;");
    _builder_1.newLine();
    _builder_1.append("import org.springframework.context.annotation.Configuration;");
    _builder_1.newLine();
    _builder_1.append("import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@Configuration");
    _builder_1.newLine();
    _builder_1.append("public class PasswordEncoder {");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("@Bean");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("public BCryptPasswordEncoder bCryptPasswordEncoder(){");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("return new BCryptPasswordEncoder();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    String _plus_1 = (_plus + _builder_1);
    content = _plus_1;
    return content;
  }
}
