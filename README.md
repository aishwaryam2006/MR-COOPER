# 📚 Library Management System

## 🔹 Problem Statement
Design and implement a simple Library Management System using Java that allows users to:
- Add books to the library
- Borrow books
- Return books
- Remove books from the library

The system should maintain the availability status of books and ensure proper handling of borrow/return operations.

---

## 🔹 Features Implemented

- Add new books to the library
- Borrow a book (if available)
- Return a borrowed book
- Remove a book from the library
- Menu-driven console interface

---

## 🔹 Approach / Logic Used

The application follows basic **Object-Oriented Programming (OOP)** principles:

### 1. Class Design

- **Book Class**
  - Represents a book entity
  - Stores attributes like title and availability
  - Provides methods to get/set availability

- **Library Class**
  - Acts as the core logic handler
  - Maintains a list of books using `ArrayList`
  - Handles operations like:
    - Adding books
    - Borrowing books
    - Returning books
    - Removing books

- **App Class**
  - Acts as the main driver class
  - Provides a menu-driven interface using `Scanner`
  - Calls appropriate methods from `Library`

- **User Class**
  - Represents a user (basic structure added for extensibility)

---

### 2. Key Logic

- **Borrow Book**
  - Search book by title
  - Check availability
  - Mark as unavailable if borrowed

- **Return Book**
  - Search book
  - Mark as available

- **Remove Book**
  - Removes book from the list

---

## 🔹 Assumptions

- Book titles are used as unique identifiers
- Only one copy of each book is handled logically (availability-based)
- System is console-based (no database)
