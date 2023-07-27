import java.util.Scanner;

public class MultipleCatch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();

        try {
            if (arraySize < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative");
            } else if (arraySize > 100) {
                throw new ArrayIndexOutOfBoundsException("Array index out of limit");
            }

            System.out.println("Array size is: " + arraySize);
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}


