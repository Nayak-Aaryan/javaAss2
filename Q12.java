package Q12pack;

import java.util.Scanner;

public class Product {
    String ProductNames[];
    double Prices[];
    int size;

    Product(int size) {
        this.size = size;
        ProductNames = new String[size];
        Prices = new double[size];
    }

    public void acceptProducts() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Product Name: ");
            ProductNames[i] = sc.nextLine();

            System.out.print("Enter Price: ");
            Prices[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    public void displayProducts() {
        for (int i = 0; i < size; i++) {
            System.out.println(ProductNames[i].toUpperCase() + " - " + Prices[i]);
        }
    }

    public void findCostlyProduct() {
        double max = Prices[0];
        int index = 0;

        for (int i = 1; i < size; i++) {
            if (Prices[i] > max) {
                max = Prices[i];
                index = i;
            }
        }

        System.out.println("Most Expensive Product: " + ProductNames[index]);
        System.out.println("Price: " + max);
    }
}
----------------------------------------------------------------------------------------
import java.util.Scanner;
import Q12pack.Product;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        Product p = new Product(n);

        p.acceptProducts();
        System.out.println("\nProduct List:");
        p.displayProducts();

        System.out.println("\nCostliest Product:");
        p.findCostlyProduct();

        sc.close();
    }
}
