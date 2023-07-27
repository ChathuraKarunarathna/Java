// Write down a program to get the following output using a for loop. Repeat the same example by using a while loop.

public class Loops{

    public static void main(String[] args)
    {
        // using for loop

        for( int i=0;i<5;i++)
        {
            System.out.println("Executing Loop "+i);
        }

        System.out.println();

        // using while loop

        int i=0;
        while(i<5)
        {
            System.out.println("Executing Loop "+i);
            i++;
        }

    }
}