@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  myFillBill startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and MY_FILL_BILL_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args
if "%@eval[2+2]" == "4" goto 4NT_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*
goto execute

:4NT_args
@rem Get arguments from the 4NT Shell from JP Software
set CMD_LINE_ARGS=%$

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\myFillBill.jar;%APP_HOME%\lib\jasperreports-functions-6.3.1.jar;%APP_HOME%\lib\jasperreports-fonts-6.3.1.jar;%APP_HOME%\lib\particle-1.1.3.jar;%APP_HOME%\lib\particle-1.1.3-javadoc.jar;%APP_HOME%\lib\ignite-spring-1.0.0.jar;%APP_HOME%\lib\jasperreports-6.3.1.jar;%APP_HOME%\lib\jasperreports-6.3.1-javadoc.jar;%APP_HOME%\lib\joda-time-2.2.jar;%APP_HOME%\lib\xalan-2.7.1.jar;%APP_HOME%\lib\poi-3.14.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\controlsfx-8.40.12.jar;%APP_HOME%\lib\annotation-detector-3.0.4.jar;%APP_HOME%\lib\ignite-common-1.0.0.jar;%APP_HOME%\lib\spring-context-4.2.1.RELEASE.jar;%APP_HOME%\lib\cglib-3.1.jar;%APP_HOME%\lib\commons-beanutils-1.9.0.jar;%APP_HOME%\lib\commons-collections-3.2.2.jar;%APP_HOME%\lib\commons-digester-2.1.jar;%APP_HOME%\lib\itext-2.1.7.js5.jar;%APP_HOME%\lib\jcommon-1.0.23.jar;%APP_HOME%\lib\jfreechart-1.0.19.jar;%APP_HOME%\lib\ecj-4.3.1.jar;%APP_HOME%\lib\castor-xml-1.3.3.jar;%APP_HOME%\lib\jackson-core-2.1.4.jar;%APP_HOME%\lib\jackson-databind-2.1.4.jar;%APP_HOME%\lib\jackson-annotations-2.1.4.jar;%APP_HOME%\lib\lucene-core-4.5.1.jar;%APP_HOME%\lib\lucene-analyzers-common-4.5.1.jar;%APP_HOME%\lib\lucene-queryparser-4.5.1.jar;%APP_HOME%\lib\olap4j-0.9.7.309-JS-3.jar;%APP_HOME%\lib\core-3.2.1.jar;%APP_HOME%\lib\icu4j-57.1.jar;%APP_HOME%\lib\serializer-2.7.1.jar;%APP_HOME%\lib\commons-codec-1.10.jar;%APP_HOME%\lib\spring-aop-4.2.1.RELEASE.jar;%APP_HOME%\lib\spring-beans-4.2.1.RELEASE.jar;%APP_HOME%\lib\spring-core-4.2.1.RELEASE.jar;%APP_HOME%\lib\spring-expression-4.2.1.RELEASE.jar;%APP_HOME%\lib\asm-4.2.jar;%APP_HOME%\lib\castor-core-1.3.3.jar;%APP_HOME%\lib\commons-lang-2.6.jar;%APP_HOME%\lib\stax-1.2.0.jar;%APP_HOME%\lib\stax-api-1.0-2.jar;%APP_HOME%\lib\lucene-queries-4.5.1.jar;%APP_HOME%\lib\lucene-sandbox-4.5.1.jar;%APP_HOME%\lib\xml-apis-1.3.04.jar;%APP_HOME%\lib\stax-api-1.0.1.jar;%APP_HOME%\lib\jakarta-regexp-1.4.jar;%APP_HOME%\lib\aopalliance-1.0.jar;%APP_HOME%\lib\commons-logging-1.2.jar

@rem Execute myFillBill
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %MY_FILL_BILL_OPTS%  -classpath "%CLASSPATH%" com.myfillbill.MyFillBill %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable MY_FILL_BILL_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%MY_FILL_BILL_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
