@echo off
setlocal enabledelayedexpansion

set DOCKER_COMPOSE_FILE=docker\docker-compose.yml

for /f "tokens=2 delims==" %%a in ('findstr "version" version.properties') do (
    set VERSION_KEY=%%a
)
echo # Reading property from version.properties

set DOCKER_IMAGE=secrets-provider:%VERSION_KEY%

echo Building the project with Gradle...
call gradlew clean build -x test

echo Building Docker image...
docker build -t %DOCKER_IMAGE% -f docker\Dockerfile .

echo Starting the application with Docker Compose...
docker-compose -f %DOCKER_COMPOSE_FILE% up -d

endlocal