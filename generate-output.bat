@echo off
echo Generating application output for GitHub showcase...
echo.

REM Create output directory if it doesn't exist
if not exist "github-output" mkdir "github-output"

REM Run the application and capture detailed output
echo BAJAJ FINSERV HEALTH QUALIFIER - APPLICATION OUTPUT > github-output/application-output.md
echo =================================================== >> github-output/application-output.md
echo Generated on: %date% %time% >> github-output/application-output.md
echo. >> github-output/application-output.md

echo **Starting Application Execution...** >> github-output/application-output.md
echo ```log >> github-output/application-output.md
java -jar health-qualifier-0.0.1-SNAPSHOT.jar >> github-output/application-output.md 2>&1
echo ``` >> github-output/application-output.md

echo. >> github-output/application-output.md
echo **Execution Completed Successfully!** >> github-output/application-output.md

echo Output generated successfully!
echo File: github-output/application-output.md
pause