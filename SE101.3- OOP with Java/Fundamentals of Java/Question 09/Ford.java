      /*Create a subclass of Car class and name it as Ford. The Ford class has the following fields and
        methods.
        ◦int year;
        ◦int manufacturerDiscount;
        ◦double getSalePrice();//FromthesalepricecomputedfromCarclass,subtract the manufacturerDiscount.*/
public class Ford extends Car {
    private int year;
    private int manufactureDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;
    }

    @Override
    public double getSalePrice() {
        double salePrice = super.getSalePrice();
        double price = salePrice - manufactureDiscount;
        return price;
    }
}
