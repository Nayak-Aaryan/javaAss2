package Q16pack;

public class University {
    public String universityName;
}
----------------------------------------
package Q16pack;

public class Undergraduate extends University {
    public int marks;

    public void checkAdmission() {
        System.out.println("University: " + universityName);
        if (marks >= 50) {
            System.out.println("Admission Eligible");
        } else {
            System.out.println("Admission Not Eligible");
        }
    }
}
--------------------------------------------------------------
package Q16pack;

public class Postgraduate extends University {
    public int marks;

    public void checkAdmission() {
        System.out.println("University: " + universityName);
        if (marks >= 50) {
            System.out.println("Admission Eligible");
        } else {
            System.out.println("Admission Not Eligible");
        }
    }
}
------------------------------------------------------------------
import java.util.Scanner;
import Q16pack.Undergraduate;
import Q16pack.Postgraduate;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Undergraduate ug = new Undergraduate();
        Postgraduate pg = new Postgraduate();

        System.out.print("Enter University Name: ");
        String name = sc.nextLine();

        ug.universityName = name;
        pg.universityName = name;

        System.out.print("Enter UG Marks: ");
        ug.marks = sc.nextInt();

        System.out.print("Enter PG Marks: ");
        pg.marks = sc.nextInt();

        System.out.println("\nUndergraduate Admission:");
        ug.checkAdmission();

        System.out.println("\nPostgraduate Admission:");
        pg.checkAdmission();

        sc.close();
    }
}
