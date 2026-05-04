# Sales API (Spring Boot)

A RESTful API built with Java and Spring Boot to manage and query sales data.  
The project demonstrates backend development practices including REST design, database integration, and containerization using Docker.

## Current Status
This project is under active development.

- CSV data ingestion is **in progress**
- Analytics endpoints (e.g., top products, top segments) are **temporarily disabled**
- Currently supports retrieving products stored manually via API requests

## Features
- REST API endpoints for managing products
- Integration with PostgreSQL
- Dockerized database setup
- Layered architecture (Controller → Service → Repository)

## Tech Stack
- Java
- Spring Boot
- PostgreSQL
- Docker
- REST APIs

## How to Run

1. Clone the repository
2. Start the database using Docker:
   ```bash
   docker-compose up