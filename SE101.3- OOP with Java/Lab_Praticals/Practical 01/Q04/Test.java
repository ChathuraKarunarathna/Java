//Write a class and insert the following code block into the appropriate place. Execute the code and get the result.
public class Test {

    public static void main(String[] args)
    {
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ){
            if( x == 30 ){
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
        System.out.println("I'm out of the loop now");

        System.out.println();

 /*Result:  10
            20
            I'm out of the loop now

Repeat the same code using “continue” instead of “break”. Write down the output.*/

        for(int x : numbers ){
            if( x == 30 ){
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }
        System.out.println("I’m out of the Loop now");

        /*Result:   10
                    20
                    40
                    50
                    I’m out of the Loop now*/
    }
}
