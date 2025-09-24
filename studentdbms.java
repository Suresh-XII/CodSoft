import java.util.ArrayList;
import java.util.Scanner;
class Student {
    String name;
    int rollNo;
    String grade;
    Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Grade: " + grade;
    }
}
public class studentdbms {
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> removeStudent();
                case 3 -> searchStudent();
                case 4 -> displayAll();
                case 5 -> {
                    System.out.println("👋 Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
    private static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();
        students.add(new Student(name, roll, grade));
        System.out.println(" Student added!");
    }
    private static void removeStudent() {
        System.out.print("Enter Roll No to remove: ");
        int roll = sc.nextInt();
        students.removeIf(s -> s.rollNo == roll);
        System.out.println("Student removed (if existed).");
    }
    private static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();
        for (Student s : students) {
            if (s.rollNo == roll) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found.");
    }
    private static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
