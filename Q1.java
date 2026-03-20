package Q1pack;

public class Website {
    public String websiteName;

    public void showWebsite() {
        System.out.println("Website: " + websiteName);
    }
}
-----------------------------------------------------------
package Q1pack;

public class Product extends Website {
    public String productName;
    public double price;

    public void showProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }
}
---------------------------------------------------------------
package Q1pack;

public class Order extends Product {
    public int quantity;
    public double totalAmount;
    public double deliveryCharge;

    public void showOrder() {
        totalAmount = price * quantity;

        if (totalAmount >= 2000) {
            deliveryCharge = 0;
        } else {
            deliveryCharge = 100;
        }

        showWebsite();
        showProduct();

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Delivery Charge: " + deliveryCharge);
    }
}
---------------------------------------------------------------------
import java.util.Scanner;
import Q1pack.Order;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Order o = new Order();

        System.out.print("Enter Website Name: ");
        o.websiteName = sc.nextLine();

        System.out.print("Enter Product Name: ");
        o.productName = sc.nextLine();

        System.out.print("Enter Price: ");
        o.price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        o.quantity = sc.nextInt();

        System.out.println("\nOrder Details:");
        o.showOrder();

        sc.close();
    }
}
