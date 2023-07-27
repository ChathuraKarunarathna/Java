/*We need the following Output. (Use Netbeans code generation option where necessary)
Employee Name: xxxxx (Use setter to set and getter to retrieve)
Basic Salary: xxxx (Use setter to set and getter to retrieve)
Bonus: xxxx (You may use the constructor to pass this value)
Bonus Amount: xxxxx (Develop a separate method to calculate Bonus amount. Bonus amount is the total of Bonus and Basic Salary)*/


public class Employee
{
    private String EmpName;
    private double Bsalary, Bonus;

    public Employee(String name,double salary,double bonus)
    {
        this.EmpName = name;
        this.Bsalary = salary;
        this.Bonus = bonus;
    }

    public String getname()
    {
        return EmpName;
    }

    public double getsalary()
    {
        return Bsalary;
    }

    public double getbonus()
    {
        return Bonus;
    }

    public double getbonusamount()
    {
        return Bsalary+Bonus;
    }
}