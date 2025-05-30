FROM openjdk:21-jdk-slim

WORKDIR /app

COPY ../build/libs/SecretsProvider-0.0.1.jar /app/app.jar
COPY ../build/resources /app/resources

CMD ["java", "-jar", "/app/app.jar"]