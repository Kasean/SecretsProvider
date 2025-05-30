![Java CI](https://github.com/Kasean/SecretsProvider/actions/workflows/ci.yaml/badge.svg)

# Encrypted One-Time Message Sharing - Functional Description

[API](API_DESCRIPTION.md)



## User Flow

1. **Message Input:**
   - User 1 enters a secret text message into the provided input field.

2. **Message Submission:**
   - User 1 clicks the "Generate secret link" button to submit the message.

3. **Link Generation:**
   - After submission, the system generates a unique link.
   - User 1 receives the link, which can be shared with another user.

4. **Message Access:**
   - User 2, or any recipient provided with the link, opens the link to view the message.

5. **Automatic Deletion:**
   - Once the link is accessed:
     - The message is displayed to the recipient (User 2).
     - The message and all associated data are immediately and permanently deleted from the system.
   - If the link is not accessed, the message remains stored in the system until its first usage.

## Security Details

- All messages are stored in the system in encrypted form to ensure data privacy and prevent unauthorized access.
- Once the message is read (via the link), the system deletes the encrypted data and associated metadata to prevent further retrieval.


## How to deploy

<img src="https://upload.wikimedia.org/wikipedia/commons/8/87/Windows_logo_-_2021.svg" alt="Windows Logo" width="20" height="20">: [manual](deployments/windows/instructions/MANUAL.md)

<img src="https://upload.wikimedia.org/wikipedia/commons/a/af/Tux.png" alt="Linux Logo" width="20" height="20">: [manual](deployments/linux/instructions/MANUAL.md)

<img src="https://upload.wikimedia.org/wikipedia/commons/a/a7/Docker-svgrepo-com.svg" alt="Docker Logo" width="20" height="20">: [manual](deployments/docker/MANUAL.md)