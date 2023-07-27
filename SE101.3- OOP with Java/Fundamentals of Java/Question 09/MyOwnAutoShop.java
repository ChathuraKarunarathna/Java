public class MyOwnAutoShop {
    public static void main(String[] args) {
        Truck t1=new Truck(1000,100000,"Black",2500);
        t1.getSaleprice();

        Ford f1 = new Ford(200, 30000, "Blue", 2023, 5000);
        System.out.println("Sale Price of Ford: " + f1.getSalePrice());

        Ford f2 = new Ford(400, 50000, "Red", 2020, 8000);
        System.out.println("Sale Price of Ford: " + f2.getSalePrice());

        Sedan s1=new Sedan(300,300000,"Blue",18);
        s1.getSaleprice();
    }
}

