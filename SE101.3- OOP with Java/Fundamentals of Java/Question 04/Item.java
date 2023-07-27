import java.util.Scanner;

public class Item {
    public static void main(String[] args) {
        System.out.println("Enter three digits: ");
        Scanner scan=new Scanner(System.in);
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int num3= scan.nextInt();

        System.out.println("The three digits you entered: "+num1+" "+num2+" "+num3);

        int total=num1+num2+num3;
        int product= num1*num2*num3;
        float ave=(float) (num1+num2+num3)/3;
        System.out.println("Total: "+total+"\nProduct: "+product+"\nAverage: "+ave);

        int max=num1;
        int min=num1;
        if(num2<num1 && num2<num3)
        {
            min = num2;
        }
        else if(num3<num1 && num3<num2) {
            min=num3;
        }
        if(num2>num1 && num2>num3)
        {
            max=num2;
        }
        else if(num3>num1 && num3>num2){
            max=num3;
        }
        System.out.println("The Smallest is: "+min);
        System.out.println("The Largest is: "+max);

    }

}
