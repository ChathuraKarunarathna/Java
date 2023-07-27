public class TestInheritance {
    public static void main(String[] args)
    {
        SuperB B1 = new SuperB();
        B1.setIt(2);
        B1.increase();
        B1.triple();

        System.out.println( B1.returnIt() );

        SubC C1 = new SubC();
        C1.setIt(2);
        C1.increase();
        C1.triple();

        System.out.println( C1.returnIt() );

    }
}

/* Output:  9
            6

Explanation

Create objects from Class SuperB and SubC separately.

Object B1
setIt()  method sets x to 2
increase() method increase the value of x by 1 (3)
triple() method multiplies x by 3 (9)
print value of x is as 9

Object C1
setIt()  method sets x to 2
increase() method increase the value of x by 1 (3)
triple() method in SubC class add 3 (6)
print value of x is as 6
*/

