package Q5pack;

public class Vehicle {
    public String vehicleName;
    public double rentPerDay;

    public void showVehicle() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Rent Per Day: " + rentPerDay);
    }
}
--------------------------------------------------------------
package Q5pack;

public class Car extends Vehicle {
    public int days;
    public double totalRent;

    public void showCar() {
        totalRent = rentPerDay * days;
        if (days >= 7) {
            totalRent = totalRent - (totalRent * 0.15);
        }
        showVehicle();
        System.out.println("Days: " + days);
        System.out.println("Total Rent: " + totalRent);
    }
}
-----------------------------------------------------------------
package Q5pack;

public class Bike extends Vehicle {
    public int days;
    public double totalRent;

    public void showBike() {
        totalRent = rentPerDay * days;
        if (days >= 5) {
            totalRent = totalRent - (totalRent * 0.10);
        }
        showVehicle();
        System.out.println("Days: " + days);
        System.out.println("Total Rent: " + totalRent);
    }
}
--------------------------------------------------------------------
import java.util.Scanner;
import Q5pack.Car;
import Q5pack.Bike;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();
        Bike b = new Bike();

        System.out.print("Enter Car Name: ");
        c.vehicleName = sc.nextLine();
        System.out.print("Enter Rent Per Day: ");
        c.rentPerDay = sc.nextDouble();
        System.out.print("Enter Days: ");
        c.days = sc.nextInt();

        System.out.println("\nCar Details:");
        c.showCar();

        sc.nextLine();

        System.out.print("\nEnter Bike Name: ");
        b.vehicleName = sc.nextLine();
        System.out.print("Enter Rent Per Day: ");
        b.rentPerDay = sc.nextDouble();
        System.out.print("Enter Days: ");
        b.days = sc.nextInt();

        System.out.println("\nBike Details:");
        b.showBike();

        sc.close();
    }
}
