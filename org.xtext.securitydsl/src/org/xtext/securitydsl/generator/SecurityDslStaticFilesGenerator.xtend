package org.xtext.securitydsl.generator

import security_dsl.Application
import org.eclipse.xtext.generator.IFileSystemAccess2

class SecurityDslStaticFilesGenerator {
	
	
	new(IFileSystemAccess2 fsa, Application app, String capitalizedName, String srcDestination){
				
		fsa.generateFile(srcDestination + capitalizedName + 'Application.java', mainClassGenerator(app.packageName, capitalizedName + 'Application'));
		fsa.generateFile(app.artifact + '/README.md', app.description);
		fsa.generateFile(srcDestination.replace('main', 'test') + capitalizedName + 'ApplicationTests.java', generateTests(app.packageName, capitalizedName + 'Tests'))
	
		fsa.generateFile(app.artifact + '/.mvn/wrapper/MavenWrapperDownloader.java', generateMavenWrappaerDownloader());
		fsa.generateFile(app.artifact + '/.mvn/wrapper/maven-wrapper.properties', genMavenWrapperProperties());
		fsa.generateFile(app.artifact + '/mvnw', generateMvnw());		
		fsa.generateFile(app.artifact + '/mvnw.cmd', generateMvnwCmd());
		
		
	}
	
	def genMavenWrapperProperties()'''
	distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.8.5/apache-maven-3.8.5-bin.zip
	wrapperUrl=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.1.0/maven-wrapper-3.1.0.jar
	'''
	
	def generateMavenWrappaerDownloader() '''
	import java.net.*;
	import java.io.*;
	import java.nio.channels.*;
	import java.util.Properties;
	
	public class MavenWrapperDownloader {
	
	    private static final String WRAPPER_VERSION = "0.5.6";
	    /**
	     * Default URL to download the maven-wrapper.jar from, if no 'downloadUrl' is provided.
	     */
	    private static final String DEFAULT_DOWNLOAD_URL = "https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/"
	        + WRAPPER_VERSION + "/maven-wrapper-" + WRAPPER_VERSION + ".jar";
	
	    /**
	     * Path to the maven-wrapper.properties file, which might contain a downloadUrl property to
	     * use instead of the default one.
	     */
	    private static final String MAVEN_WRAPPER_PROPERTIES_PATH =
	            ".mvn/wrapper/maven-wrapper.properties";
	
	    /**
	     * Path where the maven-wrapper.jar will be saved to.
	     */
	    private static final String MAVEN_WRAPPER_JAR_PATH =
	            ".mvn/wrapper/maven-wrapper.jar";
	
	    /**
	     * Name of the property which should be used to override the default download url for the wrapper.
	     */
	    private static final String PROPERTY_NAME_WRAPPER_URL = "wrapperUrl";
	
	    public static void main(String args[]) {
	        System.out.println("- Downloader started");
	        File baseDirectory = new File(args[0]);
	        System.out.println("- Using base directory: " + baseDirectory.getAbsolutePath());
	
	        // If the maven-wrapper.properties exists, read it and check if it contains a custom
	        // wrapperUrl parameter.
	        File mavenWrapperPropertyFile = new File(baseDirectory, MAVEN_WRAPPER_PROPERTIES_PATH);
	        String url = DEFAULT_DOWNLOAD_URL;
	        if(mavenWrapperPropertyFile.exists()) {
	            FileInputStream mavenWrapperPropertyFileInputStream = null;
	            try {
	                mavenWrapperPropertyFileInputStream = new FileInputStream(mavenWrapperPropertyFile);
	                Properties mavenWrapperProperties = new Properties();
	                mavenWrapperProperties.load(mavenWrapperPropertyFileInputStream);
	                url = mavenWrapperProperties.getProperty(PROPERTY_NAME_WRAPPER_URL, url);
	            } catch (IOException e) {
	                System.out.println("- ERROR loading '" + MAVEN_WRAPPER_PROPERTIES_PATH + "'");
	            } finally {
	                try {
	                    if(mavenWrapperPropertyFileInputStream != null) {
	                        mavenWrapperPropertyFileInputStream.close();
	                    }
	                } catch (IOException e) {
	                    // Ignore ...
	                }
	            }
	        }
	        System.out.println("- Downloading from: " + url);
	
	        File outputFile = new File(baseDirectory.getAbsolutePath(), MAVEN_WRAPPER_JAR_PATH);
	        if(!outputFile.getParentFile().exists()) {
	            if(!outputFile.getParentFile().mkdirs()) {
	                System.out.println(
	                        "- ERROR creating output directory '" + outputFile.getParentFile().getAbsolutePath() + "'");
	            }
	        }
	        System.out.println("- Downloading to: " + outputFile.getAbsolutePath());
	        try {
	            downloadFileFromURL(url, outputFile);
	            System.out.println("Done");
	            System.exit(0);
	        } catch (Throwable e) {
	            System.out.println("- Error downloading");
	            e.printStackTrace();
	            System.exit(1);
	        }
	    }
	
	    private static void downloadFileFromURL(String urlString, File destination) throws Exception {
	        if (System.getenv("MVNW_USERNAME") != null && System.getenv("MVNW_PASSWORD") != null) {
	            String username = System.getenv("MVNW_USERNAME");
	            char[] password = System.getenv("MVNW_PASSWORD").toCharArray();
	            Authenticator.setDefault(new Authenticator() {
	                @Override
	                protected PasswordAuthentication getPasswordAuthentication() {
	                    return new PasswordAuthentication(username, password);
	                }
	            });
	        }
	        URL website = new URL(urlString);
	        ReadableByteChannel rbc;
	        rbc = Channels.newChannel(website.openStream());
	        FileOutputStream fos = new FileOutputStream(destination);
	        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
	        fos.close();
	        rbc.close();
	    }
	
	}
	'''
	
	
	def static mainClassGenerator(String packageName, String appName){
		
		return '''
		package «packageName»;
		
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		
		@SpringBootApplication
		public class «appName»{
		
			public static void main(String[] args) {
				
				SpringApplication.run(«appName».class, args);
		
			}
		
		}
		'''
		
	}
	
	def generateTests(String packageName, String appName) {
		return '''
		package «packageName»;
		
		import org.junit.jupiter.api.Test;
		import org.springframework.boot.test.context.SpringBootTest;
		
		@SpringBootTest
		class «appName»{
		
			@Test
			void contextLoads() {
			}
		
		}
		'''
	
	}
	
	def generateMavenWrapperJar()'''
	PK
	'''
	def generateMvnw()'''
	if [ -z "$MAVEN_SKIP_RC" ] ; then
	
	  if [ -f /etc/mavenrc ] ; then
	    . /etc/mavenrc
	  fi
	
	  if [ -f "$HOME/.mavenrc" ] ; then
	    . "$HOME/.mavenrc"
	  fi
	
	fi
	
	# OS specific support.  $var _must_ be set to either true or false.
	cygwin=false;
	darwin=false;
	mingw=false
	case "`uname`" in
	  CYGWIN*) cygwin=true ;;
	  MINGW*) mingw=true;;
	  Darwin*) darwin=true
	    # Use /usr/libexec/java_home if available, otherwise fall back to /Library/Java/Home
	    # See https://developer.apple.com/library/mac/qa/qa1170/_index.html
	    if [ -z "$JAVA_HOME" ]; then
	      if [ -x "/usr/libexec/java_home" ]; then
	        export JAVA_HOME="`/usr/libexec/java_home`"
	      else
	        export JAVA_HOME="/Library/Java/Home"
	      fi
	    fi
	    ;;
	esac
	
	if [ -z "$JAVA_HOME" ] ; then
	  if [ -r /etc/gentoo-release ] ; then
	    JAVA_HOME=`java-config --jre-home`
	  fi
	fi
	
	if [ -z "$M2_HOME" ] ; then
	  ## resolve links - $0 may be a link to maven's home
	  PRG="$0"
	
	  # need this for relative symlinks
	  while [ -h "$PRG" ] ; do
	    ls=`ls -ld "$PRG"`
	    link=`expr "$ls" : '.*-> \(.*\)$'`
	    if expr "$link" : '/.*' > /dev/null; then
	      PRG="$link"
	    else
	      PRG="`dirname "$PRG"`/$link"
	    fi
	  done
	
	  saveddir=`pwd`
	
	  M2_HOME=`dirname "$PRG"`/..
	
	  # make it fully qualified
	  M2_HOME=`cd "$M2_HOME" && pwd`
	
	  cd "$saveddir"
	  # echo Using m2 at $M2_HOME
	fi
	
	# For Cygwin, ensure paths are in UNIX format before anything is touched
	if $cygwin ; then
	  [ -n "$M2_HOME" ] &&
	    M2_HOME=`cygpath --unix "$M2_HOME"`
	  [ -n "$JAVA_HOME" ] &&
	    JAVA_HOME=`cygpath --unix "$JAVA_HOME"`
	  [ -n "$CLASSPATH" ] &&
	    CLASSPATH=`cygpath --path --unix "$CLASSPATH"`
	fi
	
	# For Mingw, ensure paths are in UNIX format before anything is touched
	if $mingw ; then
	  [ -n "$M2_HOME" ] &&
	    M2_HOME="`(cd "$M2_HOME"; pwd)`"
	  [ -n "$JAVA_HOME" ] &&
	    JAVA_HOME="`(cd "$JAVA_HOME"; pwd)`"
	fi
	
	if [ -z "$JAVA_HOME" ]; then
	  javaExecutable="`which javac`"
	  if [ -n "$javaExecutable" ] && ! [ "`expr \"$javaExecutable\" : '\([^ ]*\)'`" = "no" ]; then
	    # readlink(1) is not available as standard on Solaris 10.
	    readLink=`which readlink`
	    if [ ! `expr "$readLink" : '\([^ ]*\)'` = "no" ]; then
	      if $darwin ; then
	        javaHome="`dirname \"$javaExecutable\"`"
	        javaExecutable="`cd \"$javaHome\" && pwd -P`/javac"
	      else
	        javaExecutable="`readlink -f \"$javaExecutable\"`"
	      fi
	      javaHome="`dirname \"$javaExecutable\"`"
	      javaHome=`expr "$javaHome" : '\(.*\)/bin'`
	      JAVA_HOME="$javaHome"
	      export JAVA_HOME
	    fi
	  fi
	fi
	
	if [ -z "$JAVACMD" ] ; then
	  if [ -n "$JAVA_HOME"  ] ; then
	    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
	      # IBM's JDK on AIX uses strange locations for the executables
	      JAVACMD="$JAVA_HOME/jre/sh/java"
	    else
	      JAVACMD="$JAVA_HOME/bin/java"
	    fi
	  else
	    JAVACMD="`which java`"
	  fi
	fi
	
	if [ ! -x "$JAVACMD" ] ; then
	  echo "Error: JAVA_HOME is not defined correctly." >&2
	  echo "  We cannot execute $JAVACMD" >&2
	  exit 1
	fi
	
	if [ -z "$JAVA_HOME" ] ; then
	  echo "Warning: JAVA_HOME environment variable is not set."
	fi
	
	CLASSWORLDS_LAUNCHER=org.codehaus.plexus.classworlds.launcher.Launcher
	
	# traverses directory structure from process work directory to filesystem root
	# first directory with .mvn subdirectory is considered project base directory
	find_maven_basedir() {
	
	  if [ -z "$1" ]
	  then
	    echo "Path not specified to find_maven_basedir"
	    return 1
	  fi
	
	  basedir="$1"
	  wdir="$1"
	  while [ "$wdir" != '/' ] ; do
	    if [ -d "$wdir"/.mvn ] ; then
	      basedir=$wdir
	      break
	    fi
	    # workaround for JBEAP-8937 (on Solaris 10/Sparc)
	    if [ -d "${wdir}" ]; then
	      wdir=`cd "$wdir/.."; pwd`
	    fi
	    # end of workaround
	  done
	  echo "${basedir}"
	}
	
	# concatenates all lines of a file
	concat_lines() {
	  if [ -f "$1" ]; then
	    echo "$(tr -s '\n' ' ' < "$1")"
	  fi
	}
	
	BASE_DIR=`find_maven_basedir "$(pwd)"`
	if [ -z "$BASE_DIR" ]; then
	  exit 1;
	fi
	
	##########################################################################################
	# Extension to allow automatically downloading the maven-wrapper.jar from Maven-central
	# This allows using the maven wrapper in projects that prohibit checking in binary data.
	##########################################################################################
	if [ -r "$BASE_DIR/.mvn/wrapper/maven-wrapper.jar" ]; then
	    if [ "$MVNW_VERBOSE" = true ]; then
	      echo "Found .mvn/wrapper/maven-wrapper.jar"
	    fi
	else
	    if [ "$MVNW_VERBOSE" = true ]; then
	      echo "Couldn't find .mvn/wrapper/maven-wrapper.jar, downloading it ..."
	    fi
	    if [ -n "$MVNW_REPOURL" ]; then
	      jarUrl="$MVNW_REPOURL/io/takari/maven-wrapper/0.5.6/maven-wrapper-0.5.6.jar"
	    else
	      jarUrl="https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/0.5.6/maven-wrapper-0.5.6.jar"
	    fi
	    while IFS="=" read key value; do
	      case "$key" in (wrapperUrl) jarUrl="$value"; break ;;
	      esac
	    done < "$BASE_DIR/.mvn/wrapper/maven-wrapper.properties"
	    if [ "$MVNW_VERBOSE" = true ]; then
	      echo "Downloading from: $jarUrl"
	    fi
	    wrapperJarPath="$BASE_DIR/.mvn/wrapper/maven-wrapper.jar"
	    if $cygwin; then
	      wrapperJarPath=`cygpath --path --windows "$wrapperJarPath"`
	    fi
	
	    if command -v wget > /dev/null; then
	        if [ "$MVNW_VERBOSE" = true ]; then
	          echo "Found wget ... using wget"
	        fi
	        if [ -z "$MVNW_USERNAME" ] || [ -z "$MVNW_PASSWORD" ]; then
	            wget "$jarUrl" -O "$wrapperJarPath"
	        else
	            wget --http-user=$MVNW_USERNAME --http-password=$MVNW_PASSWORD "$jarUrl" -O "$wrapperJarPath"
	        fi
	    elif command -v curl > /dev/null; then
	        if [ "$MVNW_VERBOSE" = true ]; then
	          echo "Found curl ... using curl"
	        fi
	        if [ -z "$MVNW_USERNAME" ] || [ -z "$MVNW_PASSWORD" ]; then
	            curl -o "$wrapperJarPath" "$jarUrl" -f
	        else
	            curl --user $MVNW_USERNAME:$MVNW_PASSWORD -o "$wrapperJarPath" "$jarUrl" -f
	        fi
	
	    else
	        if [ "$MVNW_VERBOSE" = true ]; then
	          echo "Falling back to using Java to download"
	        fi
	        javaClass="$BASE_DIR/.mvn/wrapper/MavenWrapperDownloader.java"
	        # For Cygwin, switch paths to Windows format before running javac
	        if $cygwin; then
	          javaClass=`cygpath --path --windows "$javaClass"`
	        fi
	        if [ -e "$javaClass" ]; then
	            if [ ! -e "$BASE_DIR/.mvn/wrapper/MavenWrapperDownloader.class" ]; then
	                if [ "$MVNW_VERBOSE" = true ]; then
	                  echo " - Compiling MavenWrapperDownloader.java ..."
	                fi
	                # Compiling the Java class
	                ("$JAVA_HOME/bin/javac" "$javaClass")
	            fi
	            if [ -e "$BASE_DIR/.mvn/wrapper/MavenWrapperDownloader.class" ]; then
	                # Running the downloader
	                if [ "$MVNW_VERBOSE" = true ]; then
	                  echo " - Running MavenWrapperDownloader.java ..."
	                fi
	                ("$JAVA_HOME/bin/java" -cp .mvn/wrapper MavenWrapperDownloader "$MAVEN_PROJECTBASEDIR")
	            fi
	        fi
	    fi
	fi
	##########################################################################################
	# End of extension
	##########################################################################################
	
	export MAVEN_PROJECTBASEDIR=${MAVEN_BASEDIR:-"$BASE_DIR"}
	if [ "$MVNW_VERBOSE" = true ]; then
	  echo $MAVEN_PROJECTBASEDIR
	fi
	MAVEN_OPTS="$(concat_lines "$MAVEN_PROJECTBASEDIR/.mvn/jvm.config") $MAVEN_OPTS"
	
	# For Cygwin, switch paths to Windows format before running java
	if $cygwin; then
	  [ -n "$M2_HOME" ] &&
	    M2_HOME=`cygpath --path --windows "$M2_HOME"`
	  [ -n "$JAVA_HOME" ] &&
	    JAVA_HOME=`cygpath --path --windows "$JAVA_HOME"`
	  [ -n "$CLASSPATH" ] &&
	    CLASSPATH=`cygpath --path --windows "$CLASSPATH"`
	  [ -n "$MAVEN_PROJECTBASEDIR" ] &&
	    MAVEN_PROJECTBASEDIR=`cygpath --path --windows "$MAVEN_PROJECTBASEDIR"`
	fi
	
	# Provide a "standardized" way to retrieve the CLI args that will
	# work with both Windows and non-Windows executions.
	MAVEN_CMD_LINE_ARGS="$MAVEN_CONFIG $@"
	export MAVEN_CMD_LINE_ARGS
	
	WRAPPER_LAUNCHER=org.apache.maven.wrapper.MavenWrapperMain
	
	exec "$JAVACMD" \
	  $MAVEN_OPTS \
	  -classpath "$MAVEN_PROJECTBASEDIR/.mvn/wrapper/maven-wrapper.jar" \
	  "-Dmaven.home=${M2_HOME}" "-Dmaven.multiModuleProjectDirectory=${MAVEN_PROJECTBASEDIR}" \
	  ${WRAPPER_LAUNCHER} $MAVEN_CONFIG "$@"
	'''
	
	def generateMvnwCmd()'''
	@REM ----------------------------------------------------------------------------
	@REM Licensed to the Apache Software Foundation (ASF) under one
	@REM or more contributor license agreements.  See the NOTICE file
	@REM distributed with this work for additional information
	@REM regarding copyright ownership.  The ASF licenses this file
	@REM to you under the Apache License, Version 2.0 (the
	@REM "License"); you may not use this file except in compliance
	@REM with the License.  You may obtain a copy of the License at
	@REM
	@REM    https://www.apache.org/licenses/LICENSE-2.0
	@REM
	@REM Unless required by applicable law or agreed to in writing,
	@REM software distributed under the License is distributed on an
	@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
	@REM KIND, either express or implied.  See the License for the
	@REM specific language governing permissions and limitations
	@REM under the License.
	@REM ----------------------------------------------------------------------------
	
	@REM ----------------------------------------------------------------------------
	@REM Maven Start Up Batch script
	@REM
	@REM Required ENV vars:
	@REM JAVA_HOME - location of a JDK home dir
	@REM
	@REM Optional ENV vars
	@REM M2_HOME - location of maven2's installed home dir
	@REM MAVEN_BATCH_ECHO - set to 'on' to enable the echoing of the batch commands
	@REM MAVEN_BATCH_PAUSE - set to 'on' to wait for a keystroke before ending
	@REM MAVEN_OPTS - parameters passed to the Java VM when running Maven
	@REM     e.g. to debug Maven itself, use
	@REM set MAVEN_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000
	@REM MAVEN_SKIP_RC - flag to disable loading of mavenrc files
	@REM ----------------------------------------------------------------------------
	
	@REM Begin all REM lines with '@' in case MAVEN_BATCH_ECHO is 'on'
	@echo off
	@REM set title of command window
	title %0
	@REM enable echoing by setting MAVEN_BATCH_ECHO to 'on'
	@if "%MAVEN_BATCH_ECHO%" == "on"  echo %MAVEN_BATCH_ECHO%
	
	@REM set %HOME% to equivalent of $HOME
	if "%HOME%" == "" (set "HOME=%HOMEDRIVE%%HOMEPATH%")
	
	@REM Execute a user defined script before this one
	if not "%MAVEN_SKIP_RC%" == "" goto skipRcPre
	@REM check for pre script, once with legacy .bat ending and once with .cmd ending
	if exist "%HOME%\mavenrc_pre.bat" call "%HOME%\mavenrc_pre.bat"
	if exist "%HOME%\mavenrc_pre.cmd" call "%HOME%\mavenrc_pre.cmd"
	:skipRcPre
	
	@setlocal
	
	set ERROR_CODE=0
	
	@REM To isolate internal variables from possible post scripts, we use another setlocal
	@setlocal
	
	@REM ==== START VALIDATION ====
	if not "%JAVA_HOME%" == "" goto OkJHome
	
	echo.
	echo Error: JAVA_HOME not found in your environment. >&2
	echo Please set the JAVA_HOME variable in your environment to match the >&2
	echo location of your Java installation. >&2
	echo.
	goto error
	
	:OkJHome
	if exist "%JAVA_HOME%\bin\java.exe" goto init
	
	echo.
	echo Error: JAVA_HOME is set to an invalid directory. >&2
	echo JAVA_HOME = "%JAVA_HOME%" >&2
	echo Please set the JAVA_HOME variable in your environment to match the >&2
	echo location of your Java installation. >&2
	echo.
	goto error
	
	@REM ==== END VALIDATION ====
	
	:init
	
	@REM Find the project base dir, i.e. the directory that contains the folder ".mvn".
	@REM Fallback to current working directory if not found.
	
	set MAVEN_PROJECTBASEDIR=%MAVEN_BASEDIR%
	IF NOT "%MAVEN_PROJECTBASEDIR%"=="" goto endDetectBaseDir
	
	set EXEC_DIR=%CD%
	set WDIR=%EXEC_DIR%
	:findBaseDir
	IF EXIST "%WDIR%"\.mvn goto baseDirFound
	cd ..
	IF "%WDIR%"=="%CD%" goto baseDirNotFound
	set WDIR=%CD%
	goto findBaseDir
	
	:baseDirFound
	set MAVEN_PROJECTBASEDIR=%WDIR%
	cd "%EXEC_DIR%"
	goto endDetectBaseDir
	
	:baseDirNotFound
	set MAVEN_PROJECTBASEDIR=%EXEC_DIR%
	cd "%EXEC_DIR%"
	
	:endDetectBaseDir
	
	IF NOT EXIST "%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config" goto endReadAdditionalConfig
	
	@setlocal EnableExtensions EnableDelayedExpansion
	for /F "usebackq delims=" %%a in ("%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config") do set JVM_CONFIG_MAVEN_PROPS=!JVM_CONFIG_MAVEN_PROPS! %%a
	@endlocal & set JVM_CONFIG_MAVEN_PROPS=%JVM_CONFIG_MAVEN_PROPS%
	
	:endReadAdditionalConfig
	
	SET MAVEN_JAVA_EXE="%JAVA_HOME%\bin\java.exe"
	set WRAPPER_JAR="%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.jar"
	set WRAPPER_LAUNCHER=org.apache.maven.wrapper.MavenWrapperMain
	
	set DOWNLOAD_URL="https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/0.5.6/maven-wrapper-0.5.6.jar"
	
	FOR /F "tokens=1,2 delims==" %%A IN ("%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.properties") DO (
	    IF "%%A"=="wrapperUrl" SET DOWNLOAD_URL=%%B
	)
	
	@REM Extension to allow automatically downloading the maven-wrapper.jar from Maven-central
	@REM This allows using the maven wrapper in projects that prohibit checking in binary data.
	if exist %WRAPPER_JAR% (
	    if "%MVNW_VERBOSE%" == "true" (
	        echo Found %WRAPPER_JAR%
	    )
	) else (
	    if not "%MVNW_REPOURL%" == "" (
	        SET DOWNLOAD_URL="%MVNW_REPOURL%/io/takari/maven-wrapper/0.5.6/maven-wrapper-0.5.6.jar"
	    )
	    if "%MVNW_VERBOSE%" == "true" (
	        echo Couldn't find %WRAPPER_JAR%, downloading it ...
	        echo Downloading from: %DOWNLOAD_URL%
	    )
	
	    powershell -Command "&{"^
			"$webclient = new-object System.Net.WebClient;"^
			"if (-not ([string]::IsNullOrEmpty('%MVNW_USERNAME%') -and [string]::IsNullOrEmpty('%MVNW_PASSWORD%'))) {"^
			"$webclient.Credentials = new-object System.Net.NetworkCredential('%MVNW_USERNAME%', '%MVNW_PASSWORD%');"^
			"}"^
			"[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12; $webclient.DownloadFile('%DOWNLOAD_URL%', '%WRAPPER_JAR%')"^
			"}"
	    if "%MVNW_VERBOSE%" == "true" (
	        echo Finished downloading %WRAPPER_JAR%
	    )
	)
	@REM End of extension
	
	@REM Provide a "standardized" way to retrieve the CLI args that will
	@REM work with both Windows and non-Windows executions.
	set MAVEN_CMD_LINE_ARGS=%*
	
	%MAVEN_JAVA_EXE% %JVM_CONFIG_MAVEN_PROPS% %MAVEN_OPTS% %MAVEN_DEBUG_OPTS% -classpath %WRAPPER_JAR% "-Dmaven.multiModuleProjectDirectory=%MAVEN_PROJECTBASEDIR%" %WRAPPER_LAUNCHER% %MAVEN_CONFIG% %*
	if ERRORLEVEL 1 goto error
	goto end
	
	:error
	set ERROR_CODE=1
	
	:end
	@endlocal & set ERROR_CODE=%ERROR_CODE%
	
	if not "%MAVEN_SKIP_RC%" == "" goto skipRcPost
	@REM check for post script, once with legacy .bat ending and once with .cmd ending
	if exist "%HOME%\mavenrc_post.bat" call "%HOME%\mavenrc_post.bat"
	if exist "%HOME%\mavenrc_post.cmd" call "%HOME%\mavenrc_post.cmd"
	:skipRcPost
	
	@REM pause the script if MAVEN_BATCH_PAUSE is set to 'on'
	if "%MAVEN_BATCH_PAUSE%" == "on" pause
	
	if "%MAVEN_TERMINATE_CMD%" == "on" exit %ERROR_CODE%
	
	exit /B %ERROR_CODE%
	'''
}
	
