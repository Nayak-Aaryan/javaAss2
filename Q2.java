package Q2pack;

public class Student {
    public String studentName;
    public int rollNo;
    public int marks;

    public void showStudent() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
----------------------------------------------------------------
package Q2pack;

public class Result extends Student {
    public String grade;

    public void calculateGrade() {
        if (marks >= 75) {
            grade = "Distinction";
        } else if (marks >= 60) {
            grade = "First Class";
        } else if (marks >= 50) {
            grade = "Second Class";
        } else {
            grade = "Fail";
        }
    }

    public void showResult() {
        System.out.println("Grade: " + grade);
    }
}
-------------------------------------------------------------------
import java.util.Scanner;
import Q2pack.Result;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Student Name: ");
        r.studentName = sc.nextLine();

        System.out.print("Enter Roll No: ");
        r.rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        r.marks = sc.nextInt();

        r.showStudent();
        r.calculateGrade();
        r.showResult();

        sc.close();
    }
}
