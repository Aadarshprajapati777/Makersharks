# Makersharks Assessment
## Overview
Makersharks is building a search page where buyers can find manufacturers based on customized requirements. This Spring Boot proof of concept includes functionality for searching, creating, and retrieving supplier details, with added features such as rate limiting and comprehensive API documentation.

## API Endpoints
    1. Search Suppliers
    POST /api/v1/supplier/search

    2. Create Supplier
    POST /api/v1/supplier/create

    3. Get Supplier Details
    GET /api/v1/supplier/{id}

  ## Requirements
    1. Search Functionality: Retrieve a list of manufacturers based on location, nature of business, and manufacturing processes. Supports pagination.
    2. Input Validation: Ensure all inputs are validated and sanitized.
    3. Exception Handling: Properly handle exceptions and provide meaningful error messages.
    4. Security: Implement security best practices to protect sensitive data.
    5. Rate Limiting: Rate limiting has been implemented to control the number of requests to the API.
    6. API Documentation: API documentation is available using Swagger.
## Installation

Clone the Repository:
```bash
  https://github.com/Aadarshprajapati777/Makersharks
  cd Makersharks

```
Build and Run the Application:
```bash
 mvn spring-boot:run                     
```

Access Swagger Documentation:
```bash
http://localhost:8080/swagger-ui.html
```
## Testing
```bash
./mvnw test
```

## Contact
Mail to:
```bash
geekaadarsh.dev@gmail.com
```
for any kind of information.

## Configuration

```bash
cd src/main/resources/application.properties
Setup postgres Configuration
```
Replace the Postgres Configuration with your own or mail to get the password.
## curl

```bash
curl -X 'POST' \
  'http://localhost:8080/api/v1/supplier/create' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "company_name": "Example Co.",
  "website": "example.com",
  "location": "India",
  "nature_of_business": "small_scale",
  "manufacturing_processes": "3d_printing"
}'
```

```bash
curl -X 'GET' \
  'http://localhost:8080/api/v1/supplier/152' \
  -H 'accept: */*'

```

```bash
curl -X 'POST' \
  'http://localhost:8080/api/v1/supplier/search?pageNo=0&pageSize=3' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "location": "India",
  "nature_of_business": "small_scale",
  "manufacturing_processes": "3d_printing"
}'
```