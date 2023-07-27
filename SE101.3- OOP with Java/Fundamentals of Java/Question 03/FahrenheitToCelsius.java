import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        float fahrenheit = scanner.nextFloat();

        double celsius =(double)5 / 9 * (fahrenheit - 32);

        System.out.println("The temperature in Celsius is: " + celsius);
    }

}
