# Instructions for running Application on Linux

This document provides instructions for running the Spring Boot application using the `deploy.sh` script located in the `deployments/linux` directory.

## Prerequisites

Ensure you have the following installed:
- Gradle
- Java Development Kit (JDK) version 21

## Steps

1. **Open Terminal**:
    - Open your terminal emulator.

2. **Navigate to the script directory**:
    - Use the `cd` command to change into the `deployments/linux` directory.
      ```sh
      cd path/to/your/project/deployments/linux
      ```

3. **Make the script executable (if not already)**:
    - Change the permissions to make the script executable.
      ```sh
      chmod +x deploy.sh
      ```

4. **Run the script**:
    - Execute the `deploy.sh` script.
      ```sh
      ./deploy.sh
      ```

5. **Output**:
    - The script will start the Spring Boot application and output messages indicating whether the launch was successful.
    - If successful, you will see the following message:
      ```
      =========================
      Create secret:
      http://localhost:8080/api/v1/createSecret
      =========================
      ```

6. **Access the Application**:
    - Open your web browser and go to [create secret page](http://localhost:8080/api/v1/createSecret).

7. **Stopping the Application**:
    - If you need to manually stop the application, find the process running on port 8080 and kill it:
      ```sh
      sudo fuser -k 8080/tcp
      ```

## Troubleshooting

- Ensure Docker is running, if required.
- Check that Gradle is installed and available in your system's PATH.
- Ensure that you have the correct version of JDK installed and configured.
- Check the console output for error messages, and address any issues mentioned.