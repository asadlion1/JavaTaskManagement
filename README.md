# Task Management System

A simple and efficient **Task Management System** built in Java. This application helps users manage tasks by adding, updating, and tracking their progress. It also includes features like priority levels, statuses, and due date tracking.

## Features

- **Task Creation:** Add tasks with details like title, description, due date, priority, and status.
- **Task Management:** Update task details, mark tasks as completed, and delete tasks.
- **Task Tracking:** 
  - Check if tasks are overdue.
  - Track progress using task statuses (`PENDING`, `IN_PROGRESS`, `COMPLETED`).
- **Priority Levels:** Categorize tasks into `HIGH`, `MEDIUM`, and `LOW` priority.
- **Readable Output:** Human-readable representation of task details using `toString()`.

## Project Structure

src/
├── model/
│   ├── Task.java
│   ├── User.java
├── service/
│   ├── TaskService.java
│   ├── UserService.java
├── controller/
│   ├── TaskController.java
│   ├── AuthController.java
├── dao/
│   ├── TaskDao.java
│   ├── UserDao.java
├── utils/
│   ├── Validator.java
│   ├── Logger.java
├── main/
│   ├── App.java
├── resources/
│   ├── config.properties
│   ├── schema.sql

