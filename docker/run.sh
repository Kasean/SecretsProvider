#!/bin/bash

APP_NAME="secrets-provider"
DOCKER_IMAGE="secrets-provider:latest"
DOCKER_COMPOSE_FILE="docker/docker-compose.yml"

cd ..

echo "Building the project with Gradle..."
./gradlew clean build -x test

echo "Building Docker image..."
docker build -t $DOCKER_IMAGE -f docker/Dockerfile .

echo "Starting the application with Docker Compose..."
docker-compose -f $DOCKER_COMPOSE_FILE up -d