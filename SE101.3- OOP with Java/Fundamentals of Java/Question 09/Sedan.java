/*Create a subclass of Car class and name it as Sedan. The Sedan class has the following fields and methods.
        ◦int length;
        ◦double getSalePrice();//Iflength>20feet,5%discount,Otherwise,10%discount*/

public class Sedan extends Car{
    private int length;

    public Sedan(int speed,double regularPrice,String color,int length)
    {
        super(speed,regularPrice,color);
        this.length=length;
    }

    public void getSaleprice() {
        if(length>20)
        {
            double discount=regularPrice*0.05;
            regularPrice-=discount;
        } else {
            double discount=regularPrice*0.1;
            regularPrice-=discount;
        }
        System.out.println("The Sale Price of Sedan is "+regularPrice);
    }
}
