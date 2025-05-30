#!/bin/bash

DOCKER_COMPOSE_FILE="docker/docker-compose.yml"

cd ..

VERSION_KEY=`cat version.properties | grep "version" | cut -d'=' -f2`
echo "# Reading property from $PROPERTY_FILE"

# shellcheck disable=SC2154
DOCKER_IMAGE="secrets-provider:${VERSION_KEY}"

echo "Building the project with Gradle..."
chmod +x gradlew
./gradlew clean build -x test

echo "Building Docker image..."
docker build -t $DOCKER_IMAGE -f docker/Dockerfile .
#
echo "Starting the application with Docker Compose..."
docker-compose -f $DOCKER_COMPOSE_FILE up -d