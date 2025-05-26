@echo off
setlocal enabledelayedexpansion

cd /d %~dp0\..\..\

echo Secrets provider deploying...
start "Spring Boot Application" cmd /c "gradlew bootRun"

timeout /T 10

tasklist /FI "IMAGENAME eq java.exe" 2>NUL | find /I /N "java.exe">NUL
if "%ERRORLEVEL%"=="0" (
    echo.
    echo =========================
    echo Create secret:
    echo http://localhost:8080/api/v1/createSecret
    echo =========================
) else (
    echo Application startup error.
    exit /b 1
)