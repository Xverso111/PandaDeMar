set SERVICE_NAME=SondaJavaSignerService
set PR_INSTALL=C:\Program Files (x86)\Sonda del Ecuador\java\prunsrv.exe

REM Service log configuration
set PR_LOGPREFIX=%SERVICE_NAME%
set PR_LOGPATH=d:\SRI\temp\logs
set PR_STDOUTPUT=d:\SRI\temp\stdout.txt
set PR_STDERROR=d:\SRI\temp\stderr.txt
set PR_LOGLEVEL=Info

REM Path to java installation
set PR_JVM=C:\Program Files (x86)\Sonda del Ecuador\java\jre7\bin\client\jvm.dll
set PR_CLASSPATH=C:\Program Files (x86)\Sonda del Ecuador\java\SondaSignerService.jar;C:\Program Files (x86)\Sonda del Ecuador\java\lib\;C:\Program Files (x86)\Sonda del Ecuador\java\lib\MITyCLibAPI-1.0.4.jar;C:\Program Files (x86)\Sonda del Ecuador\java\lib\MITyCLibCert-1.0.4.jar;C:\Program Files (x86)\Sonda del Ecuador\java\lib\MITyCLibTSA-1.0.4.jar;C:\Program Files (x86)\Sonda del Ecuador\java\lib\MITyCLibXADES-1.0.4.jar;C:\Program Files (x86)\Sonda del Ecuador\java\lib\xmlsec-1.4.2-ADSI-1.0.jar;C:\Program Files (x86)\Sonda del Ecuador\java\lib\bcmail-jdk15-1.43.jar;C:\Program Files (x86)\Sonda del Ecuador\java\lib\bcprov-jdk15-1.43.jar;C:\Program Files (x86)\Sonda del Ecuador\java\lib\bctsp-jdk15-1.43.jar;C:\temp2\java\lib\cliente-file-ws.jar;C:\Program Files (x86)\Sonda del Ecuador\java\lib\commons-logging-1.1.jar;C:\Program Files (x86)\Sonda del Ecuador\java\lib\log4j-1.2.17.jar

REM Startup configuration
set PR_STARTUP=manual
set PR_STARTMODE=jvm
set PR_STARTCLASS=ec.sonda.service.MainSignerService
set PR_STARTMETHOD=start

REM Shutdown configuration
set PR_STOPMODE=jvm
set PR_STOPCLASS=ec.sonda.service.MainSignerService
set PR_STOPMETHOD=stop

REM JVM configuration
set PR_JVMMS=256
set PR_JVMMX=512
set PR_JVMSS=4000
set PR_JVMOPTIONS=-Duser.language=en;-Duser.region=US

REM Install service
prunsrv.exe //IS//%SERVICE_NAME%
