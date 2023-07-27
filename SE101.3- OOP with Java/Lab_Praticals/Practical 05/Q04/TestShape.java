public class TestShape {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.setRadius(7);
        c1.calculateArea();
        c1.display();
        System.out.println();

        Rectangle r1=new Rectangle();
        r1.setLength(10);
        r1.setWidth(5);
        r1.calculateArea();
        r1.display();
    }
}
