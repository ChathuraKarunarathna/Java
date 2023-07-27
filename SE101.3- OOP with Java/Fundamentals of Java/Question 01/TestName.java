import java.util.Scanner;

public class TestName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        Name myName = new Name(name);
        myName.printName();
    }

}
