# SWYNEX Java Fundamentals Application

A beginner-friendly, console-based Student Management System built using Java. This project was created to practice core Java programming concepts through a practical application.

## About the Project

The SWYNEX Java Fundamentals Application allows users to manage student records through a simple text-based menu.

Users can add student details, view all students, search by student ID, update marks, and delete student records.

## Features

- Add a student with an ID, name, and marks.
- View all student records.
- Search for a student by ID.
- Update a student's marks.
- Delete a student record.
- Validate student IDs, names, and marks.
- Use a menu-driven console interface.
- Handle invalid menu input (if tested successfully).

## Technologies Used

- Java
- Java Collections Framework (`ArrayList`)
- Object-Oriented Programming (classes and objects)
- Constructors and methods
- Conditional statements and loops
- Exception handling

## Requirements

Before running this project, install:

- Java Development Kit (JDK)
- Visual Studio Code or another Java-compatible editor
- A terminal or command prompt

To check whether Java is installed, open a terminal and run:

```bash
java -version
javac -version
```

Both commands should display version information.

## Project Structure

```text
SWYNEX-Java-Fundamentals-Application/
├── Main.java
├── Student.java
└── README.md
```

- `Main.java` contains the menu and application logic.
- `Student.java` defines the student class and its details.
- `README.md` explains the project and how to run it.

## How to Run

### 1. Download or clone the repository

If you use Git, run:

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

Replace `YOUR_GITHUB_REPOSITORY_URL` with your actual GitHub repository URL.

### 2. Open the project folder

Open `SWYNEX-Java-Fundamentals-Application` in Visual Studio Code.

### 3. Open the terminal

In VS Code, select **Terminal → New Terminal**.

Make sure the terminal is inside the project folder containing `Main.java` and `Student.java`.

### 4. Compile the Java files

Run:

```bash
javac Main.java Student.java
```

### 5. Run the application

Run:

```bash
java Main
```

Follow the menu displayed in the terminal.

## Example Menu

```text
===== SWYNEX Student System =====
1. Add Student
2. View All Students
3. Search Student
4. Update Marks
5. Delete Student
6. Exit
Enter your choice:
```

The menu may differ depending on the latest version of the application.

## Data Storage

Student records are currently stored in an `ArrayList` while the application is running. The records are not saved permanently, so they disappear when the program exits.

## Learning Outcomes

Through this project, I practiced:

- Java classes and objects
- Constructors
- Methods
- Variables and data types
- User input using `Scanner`
- Conditional statements and loops
- `ArrayList` collections
- Searching, updating, and deleting records
- Basic input validation and exception handling

## Future Improvements

- Save student records permanently to a file.
- Improve input validation and error handling.
- Separate application logic into reusable methods.
- Add automated tests and a database.

## Author

Created as part of my Java fundamentals and programming practice.

## License

This project is available for learning and educational purposes.