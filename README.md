# FlowBoard

A full-stack project management platform designed to help teams organise work, collaborate on projects and manage workspace members.

FlowBoard is being developed as a personal software engineering project to strengthen my experience in backend development, system design, authentication, database modelling and full-stack application development.

##  Overview

FlowBoard allows users to create and manage workspaces, invite team members, assign roles and organise projects within a shared workspace.

The application uses a Java/Spring Boot backend with a relational database and a React frontend.

The project is currently under active development.

##  Features

### Authentication & Security
- User registration and login
- JWT-based authentication
- Secure password hashing
- Protected API endpoints
- Role-based access control

### Workspace Management
- Create workspaces
- Manage workspace members
- Assign workspace roles
- Different permissions for Owners, Admins and Members

### Workspace Invitations
- Invite users to a workspace through email
- Invitation tokens
- Accept invitations
- Reject invitations
- Invitation expiration handling
- Validation to ensure invitations can only be accepted by the intended recipient

### Project Management
- Create projects within a workspace
- Role-based project creation permissions
- Associate projects with workspaces
- Project ownership and management

### API Development
- RESTful API architecture
- DTO-based request and response handling
- API validation
- Exception handling
- API testing with Postman

## Tech Stack

### Backend
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- JWT

### Frontend
- React
- JavaScript
- Vite

### Database
- PostgreSQL
- SQL

### Development Tools
- Git & GitHub
- Docker
- Postman
- Swagger/OpenAPI
- IntelliJ IDEA

### Email
- JavaMailSender
- SMTP
