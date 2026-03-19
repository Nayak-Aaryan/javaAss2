package Q7pack;

public abstract class Order {
    public int orderId;
    public String productName;
    public int quantity;
    public double price;

    public abstract void displayOrderDetails();
}
------------------------------------------------------
package Q7pack;

public abstract class Payment {
    public double amount;

    public abstract void processPayment();
}
--------------------------------------------------------
package Q7pack;

public class CreditCardPayment extends Order {
    public void displayOrderDetails() {
        double total = quantity * price;
        System.out.println("Order ID: " + orderId);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Amount: " + total);
    }
}
-------------------------------------------------------------
package Q7pack;

public class PayPalPayment extends Order {
    public void displayOrderDetails() {
        double total = quantity * price;
        System.out.println("Order ID: " + orderId);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Amount: " + total);
    }
}
-------------------------------------------------------------------
package Q7pack;

public class UPIPayment extends Order {
    public void displayOrderDetails() {
        double total = quantity * price;
        System.out.println("Order ID: " + orderId);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Amount: " + total);
    }
}
-------------------------------------------------------------------------
package Q7pack;

public class CreditCardPay extends Payment {
    public void processPayment() {
        System.out.println("Payment done using Credit Card: " + amount);
    }
}
-------------------------------------------------------------------------
package Q7pack;

public class PayPalPay extends Payment {
    public void processPayment() {
        System.out.println("Payment done using PayPal: " + amount);
    }
}
----------------------------------------------------------------------------
package Q7pack;

public class UPIPay extends Payment {
    public void processPayment() {
        System.out.println("Payment done using UPI: " + amount);
    }
}
------------------------------------------------------------------------------
import java.util.Scanner;
import Q7pack.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CreditCardPayment order = new CreditCardPayment();

        System.out.print("Enter Order ID: ");
        order.orderId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        order.productName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        order.quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        order.price = sc.nextDouble();

        System.out.println("\nOrder Details:");
        order.displayOrderDetails();

        double total = order.quantity * order.price;

        System.out.println("\nChoose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. UPI");

        int choice = sc.nextInt();

        Payment p;

        if (choice == 1) {
            p = new CreditCardPay();
        } else if (choice == 2) {
            p = new PayPalPay();
        } else {
            p = new UPIPay();
        }

        p.amount = total;
        p.processPayment();

        sc.close();
    }
}
