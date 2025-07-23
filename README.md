# Zoom Integration API

This is a Spring Boot-based microservice that integrates with Zoom using **OAuth 2.0 (Authorization Code Flow)**. It enables authorized users to create Zoom meetings and register participants via API endpoints.

## Features

- OAuth 2.0 integration with Zoom (Authorization Code flow)
- Access & refresh token handling
- Zoom meeting creation
- Meeting registrant management

## Prerequisites

Before you begin, ensure you have:

- Java 17+
- Maven
- PostgreSQL
- A Zoom OAuth App (with redirect URI)
- Git
  
## Clone the Repository

git clone https://github.com/chegeveronica/Zoom-API-Integration.git  
cd zoom-integration

## Environment Setup

Create a `.env` file in the root of the project and add the following variables:

## Zoom OAuth Credentials
ZOOM_CLIENT_ID=your_zoom_client_id  
ZOOM_CLIENT_SECRET=your_zoom_client_secret  
ZOOM_REDIRECT_URI=http://localhost:8080/api/meetings/callback  

## Database Configuration
DB_URL=jdbc:postgresql://localhost:5432/your_db  
DB_USERNAME=your_db_user  
DB_PASSWORD=your_db_password  

## Running the application

Load the environment variables from .env:

 export $(grep -v '^#' .env | xargs) && mvn spring-boot:run

 ## Zoom App Configuration

1. Go to the Zoom App Marketplace: https://marketplace.zoom.us/
2. Create a new **OAuth App** (not Server-to-Server)
3. Set the **Redirect URI** to: http://localhost:8080/api/meetings/callback

4. Add the following **OAuth scopes**:
- `meeting:read`
- `meeting:write`
- `user:read`
- `user:write`

5. Copy your **Client ID** and **Client Secret** into the `.env` file:

ZOOM_CLIENT_ID=your_zoom_client_id
ZOOM_CLIENT_SECRET=your_zoom_client_secret
ZOOM_REDIRECT_URL =http://localhost:8080/api/meetings/callback

## OAuth Flow

1. Direct users to the Zoom authorization URL:
 https://zoom.us/oauth/authorize?response_type=code&client_id=YOUR_CLIENT_ID&redirect_uri=YOUR_REDIRECT_URI

2. After a successful login, Zoom redirects the user back to your app with an authorization code:
   http://localhost:8080/api/meetings/callback?code=AUTH_CODE
   
3. Your backend receives this code and exchanges it for **access** and **refresh tokens** using Zoom's token endpoint.

4. These tokens are then stored securely in your system for authenticated API requests.


## API Endpoints

| Method | Endpoint                  | Description                    |
| ------ | ------------------------- | ------------------------------ |
| GET    | `/api/meetings/authorize` | Redirects user to Zoom login   |
| GET    | `/api/meetings/callback`  | Handles Zoom OAuth callback    |
| POST   | `/api/meetings/create`    | Creates a Zoom meeting         |
| POST   | `/api/meetings/register`  | Registers a user for a meeting |


## Creating the PostgreSQL Database

1. Enter the PostgreSQL CLI:
   psql -U postgres  
   CREATE DATABASE your_db;  
   \q  
2. Ensure your .env file reflects the correct database name and credentials:
   DB_URL=jdbc:postgresql://localhost:5432/your_db  
  DB_USERNAME=your_username  
  DB_PASSWORD=your_password  


   




