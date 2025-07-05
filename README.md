# Monthly Challenge Application REST API

This project is a **RESTful API** built with **Spring Boot** that allows users to create, manage, and track monthly challenges. It was developed as a personal practice project to improve my skills in Spring Boot, Java, and RESTful API design.

## 📋 Features

- **Create challenges** — Add new monthly challenges with descriptions and start/end dates.
- **View challenges** — Retrieve a list of all challenges or get details of a specific challenge.
- **Update challenges** — Edit existing challenge details.
- **Delete challenges** — Remove challenges as needed.

- ## 🚀 Tech Stack

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Web (Spring MVC)**

## 🛣️ API Endpoints

| Method | Endpoint               | Description          |
|---------|------------------------|----------------------|
| GET     | `/api/challenges`      | Get all challenges  |
| GET     | `/api/challenges/{month}` | Get challenge by month |
| POST    | `/api/challenges`      | Create a new challenge |
| PUT     | `/api/challenges/{id}` | Update a challenge  |
| DELETE  | `/api/challenges/{id}` | Delete a challenge  |
