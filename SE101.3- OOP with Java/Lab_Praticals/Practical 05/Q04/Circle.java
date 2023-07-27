public class Circle extends Shape {
    private int radius;
    private float area;

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    public void calculateArea()
    {
        area=(float)Math.PI*radius*radius;
    }

    @Override
    public void display()
    {
        System.out.printf("The Area of the Circle is %.2f",area);
    }
}
