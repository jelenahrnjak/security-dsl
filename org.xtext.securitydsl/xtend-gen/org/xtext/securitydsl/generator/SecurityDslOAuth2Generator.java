package org.xtext.securitydsl.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public class SecurityDslOAuth2Generator {
  private Object packageName = null;

  public SecurityDslOAuth2Generator(final IFileSystemAccess2 fsa, final String packageName, final String srcDestination) {
    this.packageName = packageName;
    fsa.generateFile((srcDestination + "/config/SecurityConfig.java"), this.generateSecurityConfig());
    fsa.generateFile((srcDestination + "/controller/TestController.java"), this.generateTestController());
  }

  public CharSequence generateSecurityConfig() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(".config;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.context.annotation.Bean;");
    _builder.newLine();
    _builder.append("import org.springframework.context.annotation.Configuration;");
    _builder.newLine();
    _builder.append("import org.springframework.security.config.annotation.web.builders.HttpSecurity;");
    _builder.newLine();
    _builder.append("import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;");
    _builder.newLine();
    _builder.append("import org.springframework.security.web.SecurityFilterChain;");
    _builder.newLine();
    _builder.append("import static org.springframework.security.config.Customizer.withDefaults;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Configuration");
    _builder.newLine();
    _builder.append("@EnableWebSecurity");
    _builder.newLine();
    _builder.append("public class SecurityConfig {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Bean");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return http");
    _builder.newLine();
    _builder.append("                ");
    _builder.append(".authorizeHttpRequests(auth -> {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("auth.antMatchers(\"/\").permitAll();");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("auth.anyRequest().authenticated();");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("                ");
    _builder.append(".oauth2Login(withDefaults())");
    _builder.newLine();
    _builder.append("                ");
    _builder.append(".formLogin(withDefaults())                ");
    _builder.newLine();
    _builder.append("                ");
    _builder.append(".build();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence generateTestController() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(".controller;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.GetMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RestController;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@RestController");
    _builder.newLine();
    _builder.append("public class TestController{");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@GetMapping(\"/\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String home(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return \"Hello, guest!\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@GetMapping(\"/secured\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String secured(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return \"Hello, user!\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
