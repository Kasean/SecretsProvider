# Secret Sharing API - v1

This API enables secure, one-time sharing of encrypted text messages. Users can create and retrieve secret messages, which are automatically deleted after being read once.

## Base URL
`/api/v1`

## Endpoints

### 1. `POST /createSecret`
#### Description:
Creates a new secret message. A link is generated that can be shared with another user to access this message.

#### Request Parameters:
- **request** (_CreateSecretRequest_, required): The payload containing the secret message and any associated metadata.

#### Response:
- **String**: A unique link or identifier to access the created secret.

---

### 2. `GET /createSecret`
#### Description:
Renders the creation form view for generating a new secret.

#### Response:
- **HTML**: A form page for entering a secret message.

---

### 3. `GET /showSecret/{id}`
#### Description:
Retrieves and displays a secret message by its unique identifier. Once accessed, the secret is permanently deleted. If the secret has already been read, a "not found" response is returned.

#### Path Parameters:
- **id** (_String_, required): The unique identifier for the secret.

#### Response:
- **String**: The decrypted secret message.
- If the message has expired or been accessed, an appropriate error message is displayed.

---

### Notes:
- **Encryption**: All secrets are stored securely in encrypted form, ensuring confidentiality.
- **One-Time Access**: Secrets are deleted from the system immediately after they are read.
