import java.util.Scanner;

public class CalculateProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int z = scanner.nextInt();

        int product = x * y * z;

        System.out.println("The product of the three integers is: " + product);
    }

}
