
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice = 0;

        do {
            System.out.println("\n===== SWYNEX Student System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {

                case 1: {
                    try {
                        System.out.print("Enter student ID: ");
                        int id = Integer.parseInt(sc.nextLine().trim());

                        System.out.print("Enter student name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter student marks: ");
                        double marks = Double.parseDouble(sc.nextLine().trim());

                        if (Student.isValidStudent(id, name, marks)) {
                            boolean duplicate = false;

                            for (Student s : students) {
                                if (s.id == id) {
                                    duplicate = true;
                                    break;
                                }
                            }

                            if (duplicate) {
                                System.out.println("Student ID already exists.");
                            } else {
                                Student s1 = new Student(id, name, marks);
                                students.add(s1);
                                System.out.println("Student added successfully!");
                            }
                        } else {
                            System.out.println("Invalid details! Student not added.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("ID and marks must be valid numbers.");
                    }
                    break;
                }

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\n===== All Students =====");

                        for (Student s : students) {
                            s.displayDetails();
                            System.out.println("------------");
                        }
                    }
                    break;

                case 3: {
                    try {
                        System.out.print("Enter student ID to search: ");
                        int searchId = Integer.parseInt(sc.nextLine().trim());

                        boolean found = false;

                        for (Student s : students) {
                            if (s.id == searchId) {
                                s.displayDetails();
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Student not found.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Student ID must be a number.");
                    }
                    break;
                }

                case 4: {
                    try {
                        System.out.print("Enter student ID: ");
                        int updateId = Integer.parseInt(sc.nextLine().trim());

                        boolean updated = false;

                        for (Student s : students) {
                            if (s.id == updateId) {
                                System.out.print("Enter new marks: ");
                                double newMarks =
                                    Double.parseDouble(sc.nextLine().trim());

                                if (newMarks >= 0 && newMarks <= 100) {
                                    s.marks = newMarks;
                                    System.out.println("Marks updated!");
                                } else {
                                    System.out.println("Marks must be 0 to 100.");
                                }

                                updated = true;
                                break;
                            }
                        }

                        if (!updated) {
                            System.out.println("Student not found.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("ID and marks must be valid numbers.");
                    }
                    break;
                }

                case 5: {
                    try {
                        System.out.print("Enter student ID to delete: ");
                        int deleteId = Integer.parseInt(sc.nextLine().trim());

                        boolean deleted = false;

                        for (int i = 0; i < students.size(); i++) {
                            if (students.get(i).id == deleteId) {
                                students.remove(i);
                                deleted = true;
                                System.out.println("Student deleted!");
                                break;
                            }
                        }

                        if (!deleted) {
                            System.out.println("Student not found.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Student ID must be a number.");
                    }
                    break;
                }

                case 6:
                    System.out.println("Exiting SWYNEX Student System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1 to 6.");
            }

        } while (choice != 6);

        sc.close();
    }
}
