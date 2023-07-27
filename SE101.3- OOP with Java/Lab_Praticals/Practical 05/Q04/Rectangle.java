public class Rectangle extends Shape {
    private float length;
    private float width;
    private float area;

    public void setLength(int length)
    {
        this.length = length;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    @Override
    public void calculateArea()
    {
        area=(float)length*width;
    }

    @Override
    public void display()
    {
        System.out.printf("The Area of the Rectangle is %.2f",area);
    }

}
