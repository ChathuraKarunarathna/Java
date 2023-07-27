import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();

        try {
            if (arraySize < 0) {
                throw new NegativeArraySizeException("Array size can't be negative");
            }

            System.out.println("Array size is: " + arraySize);
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}

