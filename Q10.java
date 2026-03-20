package Q10pack;

public class Shopping {

    public void CalculateBill(int price, int quantity) {
        double total = price * quantity;

        if (quantity > 10) {
            total = total - (total * 0.10);
        }

        System.out.println("Total Bill: " + total);
    }

    public void CalculateBill(int price, int quantity, double discount) {
        double total = price * quantity;
        total = total - (total * discount / 100);

        System.out.println("Total Bill with Discount: " + total);
    }

    public void CalculateBill(double price) {
        System.out.println("Total Bill: " + price);
    }
}
---------------------------------------------------------------------------------
import Q10pack.Shopping;

public class Q10 {
    public static void main(String[] args) {
        Shopping s = new Shopping();

        s.CalculateBill(100, 5);
        s.CalculateBill(200, 12);
        s.CalculateBill(150, 10, 20);
        s.CalculateBill(500.5);
    }
}
