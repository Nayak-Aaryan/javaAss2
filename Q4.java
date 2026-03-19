package Q4pack;

public abstract class Employee {
    public String empName;
    public double basicSalary;

    public abstract void calculateSalary();
}
-------------------------------------------------------
package Q4pack;

public class FullTimeEmployee extends Employee {
    public double bonus;

    public void calculateSalary() {
        if (basicSalary >= 30000) {
            bonus = 5000;
        } else {
            bonus = 2000;
        }
        double totalSalary = basicSalary + bonus;
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}
------------------------------------------------------------
package Q4pack;

public class PartTimeEmployee extends Employee {
    public int hoursWorked;
    public double hourlyRate;

    public void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println("Employee Name: " + empName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + salary);
    }
}
-----------------------------------------------------------
import java.util.Scanner;
import Q4pack.FullTimeEmployee;
import Q4pack.PartTimeEmployee;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FullTimeEmployee f = new FullTimeEmployee();
        PartTimeEmployee p = new PartTimeEmployee();

        System.out.print("Enter Full Time Employee Name: ");
        f.empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        f.basicSalary = sc.nextDouble();

        System.out.println("\nFull Time Employee Details:");
        f.calculateSalary();

        sc.nextLine();

        System.out.print("\nEnter Part Time Employee Name: ");
        p.empName = sc.nextLine();
        System.out.print("Enter Hours Worked: ");
        p.hoursWorked = sc.nextInt();
        System.out.print("Enter Hourly Rate: ");
        p.hourlyRate = sc.nextDouble();

        System.out.println("\nPart Time Employee Details:");
        p.calculateSalary();

        sc.close();
    }
}
