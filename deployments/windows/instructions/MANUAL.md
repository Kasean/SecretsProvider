# Instructions for running Application on Windows

This document provides instructions for running the Spring Boot application using the `deploy.bat` script located in the `deployments/windows` directory.

## Prerequisites

Ensure you have the following installed:
- Gradle
- Java Development Kit (JDK) version 21

## Steps

1. **Open Command Prompt**:
    - Press `Win + R`, type `cmd`, and hit `Enter`.

2. **Navigate to the script directory**:
    - Use the `cd` command to change into the `deployments/windows` directory.
      ```sh
      cd path\to\your\project\deployments\windows
      ```

3. **Run the script**:
    - Execute the `deploy.bat` script.
      ```sh
      deploy.bat
      ```

4. **Output**:
    - The script will start the Spring Boot application and output messages indicating whether the launch was successful.
    - If successful, you will see the following message:
      ```
      =========================
      Create secret:
      http://localhost:8080/api/v1/createSecret
      =========================
      ```

5. **Access the Application**:
    - Open your web browser and go to [create secret page](http://localhost:8080/api/v1/createSecret).

6. **Stopping the Application**:
    - If you need to manually stop the application, find the Java process in Task Manager and end it.

## Troubleshooting

- Ensure Docker is running, if required.
- Check that Gradle is installed and available in your system's PATH.
- Ensure that you have the correct version of JDK installed and configured.
- Check the console output for error messages, and address any issues mentioned.