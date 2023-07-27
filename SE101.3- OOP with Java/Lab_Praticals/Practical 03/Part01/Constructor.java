/*Now modify the same code by  trying to replace the setters using  a constructor*/
public class Constructor
{
    private String name;
    private int age;
    private float salary;

    public Constructor (String n,int a,float s)
    {
        this.name = n;
        this.age = a;
        this.salary = s;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public float getsalary()
    {
        return salary;
    }
}
