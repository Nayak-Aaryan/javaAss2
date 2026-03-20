package Q17pack;

public class Temperature {

    public void convert(double celsius) {
        if (celsius < -273.15) {
            System.out.println("Invalid temperature");
            return;
        }

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }

    public void convert(double fahrenheit, int type) {
        if (fahrenheit < -459.67) {
            System.out.println("Invalid temperature");
            return;
        }

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius: " + celsius);
    }
}
---------------------------------------------------------
import Q17pack.Temperature;

public class Q17 {
    public static void main(String[] args) {

        Temperature t = new Temperature();

        t.convert(25);          // Celsius to Fahrenheit
        t.convert(77, 1);       // Fahrenheit to Celsius

    }
}
