@echo off
echo Running Bajaj Finserv Health Qualifier Application...
echo Capture started at: %date% %time% > output.log
echo =================================================== >> output.log
java -jar health-qualifier-0.0.1-SNAPSHOT.jar >> output.log 2>&1
echo =================================================== >> output.log
echo Capture ended at: %date% %time% >> output.log
echo Output captured in output.log
pause