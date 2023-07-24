package rs.ac.uns.ftn.securitydsl.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import security_dsl.Application;

@SuppressWarnings("all")
public class SecurityDslStaticFilesGenerator {
  public SecurityDslStaticFilesGenerator(final IFileSystemAccess2 fsa, final Application app, final String capitalizedName, final String srcDestination) {
    fsa.generateFile(((srcDestination + capitalizedName) + "Application.java"), SecurityDslStaticFilesGenerator.mainClassGenerator(app.getPackageName(), app.getName()));
    String _artifact = app.getArtifact();
    String _plus = (_artifact + "/README.md");
    fsa.generateFile(_plus, app.getDescription());
    String _replace = srcDestination.replace("main", "test");
    String _plus_1 = (_replace + capitalizedName);
    String _plus_2 = (_plus_1 + "ApplicationTests.java");
    String _packageName = app.getPackageName();
    String _name = app.getName();
    String _plus_3 = (_name + "Tests");
    fsa.generateFile(_plus_2, this.generateTests(_packageName, _plus_3));
  }

  public static String mainClassGenerator(final String packageName, final String appName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + packageName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.springframework.boot.SpringApplication;");
    _builder_1.newLine();
    _builder_1.append("import org.springframework.boot.autoconfigure.SpringBootApplication;");
    _builder_1.newLine();
    _builder_1.append("import org.springframework.scheduling.annotation.EnableScheduling;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SpringBootApplication");
    _builder_1.newLine();
    _builder_1.append("public class ");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + appName);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("{");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("public static void main(String[] args) {");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.append("SpringApplication.run(");
    String _plus_3 = (_plus_2 + _builder_2);
    String _plus_4 = (_plus_3 + appName);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append(".class, args);");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("}");
    _builder_3.newLine();
    return (_plus_4 + _builder_3);
  }

  public String generateTests(final String packageName, final String appName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + packageName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.junit.jupiter.api.Test;");
    _builder_1.newLine();
    _builder_1.append("import org.springframework.boot.test.context.SpringBootTest;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SpringBootTest");
    _builder_1.newLine();
    _builder_1.append("class ");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + appName);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("{");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("@Test");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("void contextLoads() {");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("}");
    _builder_2.newLine();
    return (_plus_2 + _builder_2);
  }
}
