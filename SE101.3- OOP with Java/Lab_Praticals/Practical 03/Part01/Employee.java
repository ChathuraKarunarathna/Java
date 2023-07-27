/*An encapsulated class contains three variables to store Name, Age and Salary of the employee. Evelop getters and setters to set and get values . Develop a test class to test your code*/
public class Employee
{
    private String name;
    private int age;
    private float salary;

    public void setname(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return name;
    }

    public void setage(int age)
    {
        this.age = age;
    }
    public int getage()
    {
        return age;
    }

    public void  setsalary(float salary)
    {
        this.salary = salary;
    }

    public float getsalary()
    {
        return salary;
    }
}