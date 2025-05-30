# Instructions for running Application on Linux or Windows with docker


## Prerequisites

Ensure you have the following installed:
- Gradle
- Docker
- Docker compose

## Steps Linux

1. **Open Terminal**:
    - Open your terminal emulator.

2. **Navigate to the script directory**:
    - Use the `cd` command to change into the `deployments/linux` directory.
      ```sh
      cd path/to/your/project/docker
      ```

3. **Make the script executable (if not already)**:
    - Change the permissions to make the script executable.
      ```sh
      chmod +x run.sh
      ```

4. **Run the script**:
    - Execute the `deploy.sh` script.
      ```sh
      ./run.sh
      ```

5. **Access the Application**:
    - Open your web browser and go to [create secret page](http://localhost:8080/api/v1/createSecret).

6. **Stopping the container**:
    - If you need to manually stop the container:
      ```sh
      docker-compose -f docker/docker-compose.yml down
      ```
      
7. **Delete container**:
    - If you need to manually delete the container:
      ```sh
      docker rmi secrets-provider:<version>
      ```

## Troubleshooting

- Ensure Docker is running, if required.
- Check that Gradle is installed and available in your system's PATH.
- Check the console output for error messages, and address any issues mentioned.