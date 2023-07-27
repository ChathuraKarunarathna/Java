public class Main {
    public static void main(String[] args)
    {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        circle.draw();
        circle.erase();

        System.out.println();

        triangle.draw();
        triangle.erase();

        System.out.println();
        
        square.draw();
        square.erase();
    }
}

