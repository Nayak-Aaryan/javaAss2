package Q15pack;

public class Person {
    public String name;
    public int age;

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
-----------------------------------------------------
package Q15pack;

public class Student extends Person {
    public int rollNo;

    public void showDetails() {
        super.showDetails();
        System.out.println("Roll No: " + rollNo);
    }
}
---------------------------------------------------------
package Q15pack;

public class Result extends Student {
    public int marks;
    public String grade;

    public void calculateGrade() {
        if (marks >= 80) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
--------------------------------------------------
import java.util.Scanner;
import Q15pack.Result;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        System.out.print("Enter Name: ");
        r.name = sc.nextLine();

        System.out.print("Enter Age: ");
        r.age = sc.nextInt();

        System.out.print("Enter Roll No: ");
        r.rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        r.marks = sc.nextInt();

        r.calculateGrade();

        System.out.println("\nResult Details:");
        r.showDetails();

        sc.close();
    }
}
