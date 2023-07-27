/*Create a sub class of Car class and name it as Truck. The Truck class has the following fields and
  methods.
  int weight;
  ◦double getSalePrice();//Ifweight>2000,10%discount.Otherwise,20%discount.*/
public class Truck extends Car
{
    private int weight;

    public Truck(int speed,double regularPrice,String color, int weight)
    {
        super(speed,regularPrice,color);
        this.weight=weight;
    }
    public void getSaleprice() {
        if(weight>2000){
            double discount= regularPrice*0.1;
            regularPrice-=discount;
        }else{
            double discount= regularPrice*0.2;
            regularPrice-=discount;
        }
        System.out.println("The Sale Price of Truck is "+regularPrice);
    }
}