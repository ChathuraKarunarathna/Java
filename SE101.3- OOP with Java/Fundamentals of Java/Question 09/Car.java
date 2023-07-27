   /*Create a super class called Car. The Car class has the following fields and methods.
    ◦int speed;
    ◦double regularPrice;
    ◦String color;
    ◦double getSalePrice()*/
public class Car {
        private int speed;
        protected double regularPrice;
        private String color;

        public Car(int speed, double regularPrice, String color) {
            this.speed = speed;
            this.regularPrice = regularPrice;
            this.color = color;
        }

        public double getSalePrice() {
            double salePrice = regularPrice - (regularPrice * 0.1);  // Calculate sale price with 10% discount
            return salePrice;
        }
    }
