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

<img width="1350" height="690" alt="image" src="https://github.com/user-attachments/assets/91690920-fa09-4f4e-8fc3-f52c574a676f" />


<img width="1304" height="433" alt="image" src="https://github.com/user-attachments/assets/2c71b72e-5139-4a6a-a4ad-1ab69332bbf6" />


<img width="734" height="442" alt="image" src="https://github.com/user-attachments/assets/ad27dd50-1abf-4a37-9406-5df4faa0d19b" />


## 🔹 Assumptions

- Book titles are used as unique identifiers
- Only one copy of each book is handled logically (availability-based)
- System is console-based (no database)

## 🔹 Steps to Execute the Code

**Using VS Code**
  -Open the project folder in VS Code
  -Make sure Java Extension Pack is installed
  -Open App.java
  -Click the ▶️ Run button (top right)








