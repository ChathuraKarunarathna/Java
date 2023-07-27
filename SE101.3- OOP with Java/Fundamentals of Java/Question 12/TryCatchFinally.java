import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();

        try {
            if (arraySize < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative");
            }

            System.out.println("Array size is: " + arraySize);
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Enter the required array size.");
        }
    }
}
