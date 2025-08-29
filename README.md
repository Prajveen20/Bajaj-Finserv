# Bajaj-Finserv



# Bajaj Finserv Health Qualifier - Java Solution

A Spring Boot application that automatically solves SQL problems and submits solutions via webhook.

## Features
- Automatic webhook generation on startup
- SQL query solution based on registration number
- JWT-authenticated solution submission
- No manual triggers required

## How It Works
1. Application starts up
2. Sends POST request to generate webhook
3. Determines SQL problem based on regNo (odd/even)
4. Solves the SQL problem
5. Submits solution to the webhook URL with JWT authentication

## Build & Run
```bash
# Build the project
./mvnw clean package

# Run the application
java -jar target/health-qualifier-0.0.1-SNAPSHOT.jar



<img width="1741" height="304" alt="image" src="https://github.com/user-attachments/assets/9d1c0995-6091-4acb-88bc-112bde847a04" />
