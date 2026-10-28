# Java Library Management System

An object-oriented Java application that manages a library inventory while demonstrating **inheritance, encapsulation, and abstraction**.

## Overview

This project models a library using core object-oriented programming principles. It is built to show how classes, inheritance hierarchies, and well-defined interfaces make code easier to organise, maintain, and extend.

## Features

* Manages a library inventory of books, magazines, and other media items.
* Uses inheritance to share common attributes and behaviour between related item types.
* Uses encapsulation to protect and control access to internal data fields.
* Uses abstraction to separate high-level system operations from low-level implementation details.
* Supports core operations such as adding items, displaying inventory details, and borrowing or returning items.

## OOP Concepts Demonstrated

| Concept | How it is used |
|---|---|
| Inheritance | `Book` and `Magazine` classes extend a base `LibraryItem` class to share common properties. |
| Encapsulation | Item attributes (like titles, IDs, and availability status) are kept private with public getters and setters. |
| Abstraction | Abstract base classes and interfaces define a standard contract for library operations without enforcing rigid implementations. |

## Tech Stack

* **Language:** Java (JDK 17+)
* **IDE:** Eclipse / Apache NetBeans / Visual Studio Code

## Getting Started

**Prerequisites:** Ensure you have the Java Development Kit (JDK) installed on your machine.

1. Clone the repository:
   ```bash
   git clone [https://github.com/NdumisoZulu053/java-library-management-system.git](https://github.com/NdumisoZulu053/java-library-management-system.git)

## Example Output
```
=== Welcome to the Library Management System ===
[INFO] Initialising library inventory...
[SUCCESS] Added: 'Clean Code' by Robert C. Martin (ID: B001)
[SUCCESS] Added: 'National Geographic - Oct 2026' (ID: M001)

--- Current Library Catalog ---
ID: B001 | Title: Clean Code | Type: Book | Status: Available
ID: M001 | Title: National Geographic | Type: Magazine | Status: Available

[ACTION] Borrowing item B001...
[SUCCESS] 'Clean Code' successfully checked out.

ID: B001 | Title: Clean Code | Type: Book | Status: Checked Out
```

## Possible Improvements
- Save inventory data to a file or MySQL database
- Add a graphical or web interface
- Add unit tests with JUnit

## Author
Ndumiso Blessing Zulu | IT student (UNISA) | github.com/NdumisoZulu053
