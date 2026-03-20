package Q13pack;

import java.util.Scanner;

public class Course {
    String studentNames[];
    String courseNames[];
    int size;

    Course(int size) {
        this.size = size;
        studentNames = new String[size];
        courseNames = new String[size];
    }

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Student Name: ");
            studentNames[i] = sc.nextLine();

            System.out.print("Enter Course Name: ");
            courseNames[i] = sc.nextLine();
        }
    }

    public void displayDetails() {
        for (int i = 0; i < size; i++) {
            System.out.println(studentNames[i] + " - " + courseNames[i]);
        }
    }

    public void countStudentsInCourse(String course) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (courseNames[i].equalsIgnoreCase(course)) {
                count++;
            }
        }

        System.out.println("Number of students in " + course + ": " + count);
    }
}
-------------------------------------------------------------------------------------
import java.util.Scanner;
import Q13pack.Course;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Course c = new Course(n);

        c.acceptDetails();

        System.out.println("\nDetails:");
        c.displayDetails();

        System.out.print("\nEnter course to count students: ");
        String course = sc.nextLine();

        c.countStudentsInCourse(course);

        sc.close();
    }
}
