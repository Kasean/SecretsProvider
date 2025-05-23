# SecretsProvider

![Java CI](https://github.com/Kasean/SecretsProvider/actions/workflows/ci.yml/badge.svg)

Simple web service for exchanging secret messages


### Basic functionality: 
User 1 enters a secret text message and clicks the "send" button. After which he receives a link, by which the other user can read the message. After the first click on the link, the message and all information about it is deleted from the system, i.e. messages are stored in the system only until they are read once. All messages are stored in encrypted form.