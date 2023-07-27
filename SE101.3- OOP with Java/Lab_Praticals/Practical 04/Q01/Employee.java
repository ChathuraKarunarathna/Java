/*Create a class called “Employee” which has 3 private variables (empID, empName, empDesignation) and create getters and setters for each field. Please note that this has no main method since this is just  a blueprint  not a application. Now crate a test class to invoke the Employee class. Create two objects  for Mr.Bogdan and Ms.Bird and set required values using setters  and print them back on the console using getters.*/
public class Employee
{
    private int empID;
    private String  empName;
    private String empDesignation;

    public void setempid(int empID)
    {
        this.empID = empID;
    }

    public void setname(String empName)
    {
        this.empName = empName;
    }

    public void setdesignation(String empDesignation)
    {
        this.empDesignation = empDesignation;
    }

    public int getempid()
    {
        return empID;
    }

    public String getname()
    {
        return empName;
    }

    public String getdesignation()
    {
        return empDesignation;
    }
}
