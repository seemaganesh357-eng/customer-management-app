# Customer Management Microservices System

A robust, scalable backend system built on **Spring Boot** and **Spring Cloud** architecture. This application utilizes a decoupled 
microservice pattern consisting of an automated service discovery registry and a dedicated functional microservice backed by a
relational database management system.

##  System Architecture Overview

The system architecture follows a decentralized pattern to optimize service decoupling, configuration management, and elastic scaling 
capabilities:

1. **Service Registry (`service-registry`)**:Powered by **Netflix Eureka Server**, acting as the central lookup coordinate hub for
                                             dynamic service registration, health check updates, and service inter-communication pathways.
3. **Customer Microservice (`customer-service`)**: A domain-driven service managing customer profile datasets, integrating
                                                   **Spring Data JPA** for data persistence and exposure via standard **RESTful API**
                                                   controllers.
