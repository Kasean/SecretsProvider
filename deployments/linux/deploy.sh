#!/bin/bash

cd "$(dirname "$0")"
cd ../../

echo "Secrets provider deploying..."
chmod +x gradlew
nohup ./gradlew bootRun > bootRun.log 2>&1 &

sleep 10

if pgrep -f "java.*bootRun" > /dev/null
then
    echo
    echo "========================="
    echo "Create secret:"
    echo "http://localhost:8080/api/v1/createSecret"
    echo "========================="
else
    echo "Application startup error."
    exit 1
fi