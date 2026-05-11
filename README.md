# 🏥 EHR System Backend

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.0-green)
![Docker Compose](https://img.shields.io/badge/Docker-Compose-orange)
![MySQL](https://img.shields.io/badge/MySQL-8.0-lightblue)

HIPAA‑compliant Electronic Health Record (EHR) backend built with Java, Spring Boot, and microservices architecture. Demonstrates secure patient data management, scalable API design, and cloud‑ready deployment.


## 🚀 Features
- RESTful APIs for patient records and appointments
- MySQL integration with JPA/Hibernate persistence
- Validation using @NotBlank, @Email, and @Valid for clean input handling
- Global Exception Handling with structured JSON error responses
- Swagger/OpenAPI documentation for interactive API exploration
- Unit testing with JUnit and Mockito
- Docker Compose setup for one‑command deployment of app + database

## 📂 Repository Structure
```text
ehr-system-backend/
 ├── src/
 │    └── main/
 │         └── java/com/ehr/patient/
 │              ├── PatientController.java      # REST API endpoints
 │              ├── PatientService.java         # Business logic
 │              ├── PatientRepository.java      # JPA repository
 │              ├── Patient.java                # Entity with validation
 │              └── GlobalExceptionHandler.java # Centralized error handling
 │
 │         └── resources/
 │              ├── application.properties      # DB + app configs
 │              └── static/                     # (optional) static files
 │
 ├── target/                                    # Compiled output (generated)
 ├── Dockerfile                                 # Build Spring Boot app image
 ├── docker-compose.yml                         # Run app + MySQL together
 ├── pom.xml                                    # Maven dependencies & build
 └── README.md                                  # Project documentation

## 🚀 Quickstart with Docker Compose
```bash
# Clone the repo
git clone https://github.com/yourusername/ehr-system-backend.git
cd ehr-system-backend

# Build and run with Docker Compose
docker-compose up --build
---

## 🔄 Workflow
- Client sends request (e.g., POST /api/patients).
- Controller validates input (@Valid).
- Service applies business logic.
- Repository persists data with JPA.
- Database stores patient records.
- GlobalExceptionHandler returns clean JSON errors if something fails.

## 🏗️ Box‑Style Architecture Diagram
+----------------------+
|     Client Requests  |
|  (Frontend / Postman)|
+----------+-----------+
           |
           v
+----------------------+
|   Patient Controller |
|   REST API Endpoints |
+----------+-----------+
           |
           v
+----------------------+
|    Patient Service   |
|     Business Logic   |
+----------+-----------+
           |
           v
+----------------------+
|  Patient Repository  |
|     JPA / Hibernate  |
+----------+-----------+
           |
           v
+----------------------+
|   MySQL Database     |
|  EHR System Storage  |
+----------------------+
```
## 🧩 Architecture Diagram (Mermaid)
```mermaid
flowchart LR
    Client[👩‍💻 Client] --> Controller[📦 PatientController]
    Controller --> Service[⚙️ PatientService]
    Service --> Repository[🗄️ PatientRepository]
    Repository --> DB[(💾 MySQL Database)]

```
## 📌 Future Work
- Add authentication & role‑based access.
- Integrate logging & monitoring (Prometheus/Grafana).
- CI/CD pipeline with GitHub Actions.
- Extend to multiple microservices (appointments, billing, etc.).


