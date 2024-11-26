# Crypto Wallet Generator Backend

Welcome to the **Crypto Wallet Generator Backend**, a Java-based backend application for generating cryptocurrency wallets for Bitcoin (BTC), Ethereum (ETH), and TRON networks. This project provides a RESTful API interface for creating and managing wallets securely and efficiently.

---

## Features

- **Generate Wallets**: Create wallets for Bitcoin, Ethereum, and TRON networks via RESTful API endpoints.
- **Secure Key Management**: Implements industry-standard encryption for private key management.
- **Lightweight and Scalable**: Built with Java for high performance and scalability.
- **API Ready**: Easy-to-use endpoints for frontend or third-party service integration.

---

## Technologies Used

- **Java**: Core backend development.
- **Spring Boot**: Framework for RESTful APIs.
- **Gradle/Maven**: Dependency and project management.
- **JSON Web Tokens (JWT)**: Secure authentication (optional).
- **Cryptographic Libraries**: For wallet generation and encryption.

---

## Installation and Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/crypto-wallet-generator.git
   cd crypto-wallet-generator
2 **Configure Environment Variables:**
   - **Create** a .env file or configure environment variables for:
      ```bash
     BTC_API_KEY (if using an external Bitcoin API)
     ETH_API_KEY (if using an external Ethereum API)
     TRON_API_KEY (if using an external TRON API)
3. **Build the Project: Using Maven:**
    ```bash
    mvn clean install
