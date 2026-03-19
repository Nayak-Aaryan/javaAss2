package Q8pack;

public class Hospital {
    public String hospitalName;
    public String location;

    public void showDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
    }
}
---------------------------------------------------------------
package Q8pack;

public class Doctor extends Hospital {
    public String doctorName;
    public String specialization;

    public void showDetails() {
        super.showDetails();
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }
}
--------------------------------------------------------------------
package Q8pack;

public class Patient extends Doctor {
    public String patientName;
    public double consultationFee;

    public void showDetails() {
        super.showDetails();
        System.out.println("Patient Name: " + patientName);

        if (consultationFee >= 1000) {
            consultationFee = consultationFee - (consultationFee * 0.10);
        }

        System.out.println("Consultation Fee: " + consultationFee);
    }
}
------------------------------------------------------------------------
import java.util.Scanner;
import Q8pack.Patient;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Patient p = new Patient();

        System.out.print("Enter Hospital Name: ");
        p.hospitalName = sc.nextLine();

        System.out.print("Enter Location: ");
        p.location = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        p.doctorName = sc.nextLine();

        System.out.print("Enter Specialization: ");
        p.specialization = sc.nextLine();

        System.out.print("Enter Patient Name: ");
        p.patientName = sc.nextLine();

        System.out.print("Enter Consultation Fee: ");
        p.consultationFee = sc.nextDouble();

        System.out.println("\nDetails:");
        p.showDetails();

        sc.close();
    }
}
