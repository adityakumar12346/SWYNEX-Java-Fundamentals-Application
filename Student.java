


public class Student {
    int id;
    String name;
    double marks;

    // Constructor
    Student(int studentId, String studentName, double studentMarks) {
        id = studentId;
        name = studentName;
        marks = studentMarks;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }

    // Method to validate student details
    static boolean isValidStudent(int id, String name, double marks) {
        return id > 0
                && name != null
                && !name.isBlank()
                && marks >= 0
                && marks <= 100;
    }
}




