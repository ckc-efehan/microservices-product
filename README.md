# Product Service

A microservice for managing products in an online shop. This service is part of a microservices architecture and provides REST APIs for creating and retrieving products.

## Table of Contents
- [Features](#features)
- [Technologies](#technologies)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Monitoring and Observability](#monitoring-and-observability)
- [Testing](#testing)

## Features

- Create new products with name, description, and price
- Retrieve all products
- MongoDB database for product storage
- API documentation with Swagger/OpenAPI
- Monitoring and observability with Prometheus and Micrometer
- Distributed tracing

## Technologies

- Java 21
- Spring Boot 3.4.2
- Spring Data MongoDB
- MongoDB
- Docker & Docker Compose
- Swagger/OpenAPI for API documentation
- Micrometer for metrics
- Prometheus for monitoring
- Zipkin for distributed tracing
- Lombok for reducing boilerplate code
- Testcontainers for integration testing

## Prerequisites

- Java 21 or higher
- Maven
- Docker and Docker Compose

## Getting Started

### Clone the repository

```bash
git clone <repository-url>
cd product-service
```

### Start MongoDB

```bash
docker-compose up -d
```

This will start a MongoDB instance with the following configuration:
- Port: 27017
- Username: root
- Password: password
- Database: product-service

### Build and run the application

```bash
mvn clean install
mvn spring-boot:run
```

The application will start on the default port 8080.

### Access Swagger UI

Open your browser and navigate to:
```
http://localhost:8080/swagger-ui.html
```

## API Endpoints

### Create Product

- **URL**: `/api/products`
- **Method**: POST
- **Request Body**:
```json
{
  "name": "Product Name",
  "description": "Product Description",
  "price": 100.00
}
```
- **Response**: 201 CREATED
```json
{
  "id": "generated-id",
  "name": "Product Name",
  "description": "Product Description",
  "price": 100.00
}
```

### Get All Products

- **URL**: `/api/products`
- **Method**: GET
- **Response**: 200 OK
```json
[
  {
    "id": "product-id-1",
    "name": "Product 1",
    "description": "Description 1",
    "price": 100.00
  },
  {
    "id": "product-id-2",
    "name": "Product 2",
    "description": "Description 2",
    "price": 200.00
  }
]
```

## Monitoring and Observability

The service exposes several endpoints for monitoring:

- Health: `/actuator/health`
- Info: `/actuator/info`
- Metrics: `/actuator/metrics`
- Prometheus: `/actuator/prometheus`

## Testing

The project uses Testcontainers for integration testing with MongoDB.

To run the tests:

```bash
mvn test
```
