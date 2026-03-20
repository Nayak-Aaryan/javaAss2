package Q11pack;

public class MobileStore {

    public static String storeName = "Aaryan Mobile Store";

    public static void CalculatePrice(int price) {
        System.out.println("Store: " + storeName);
        System.out.println("Total Price: " + price);
    }

    public static void CalculatePrice(int price, int quantity) {
        double total = price * quantity;

        if (quantity > 10) {
            total = total - (total * 0.10);
        }

        System.out.println("Store: " + storeName);
        System.out.println("Total Price: " + total);
    }
}
-----------------------------------------------------------------------
import Q11pack.MobileStore;

public class Q11 {
    public static void main(String[] args) {

        MobileStore.CalculatePrice(10000);
        MobileStore.CalculatePrice(15000, 12);

    }
}
