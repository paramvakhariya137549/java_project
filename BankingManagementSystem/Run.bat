
@echo off
title Banking Management System

cd /d "C:\BankingManagementSystem"

echo Starting Banking Management System...
echo.

javac -cp ".;LIB\*" *.java

if errorlevel 1 (
    echo.
    echo Compilation Error!
    pause
    exit /b
)

java -cp ".;LIB\*" LoginFrame

pause
