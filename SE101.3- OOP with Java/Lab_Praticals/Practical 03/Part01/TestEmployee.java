public class TestEmployee
{

    public static void main(String[] args)
    {
        Employee E1 = new Employee();

        E1.setname("Chamith");
        E1.setage(23);
        E1.setsalary(50000.00f);

        System.out.println("Employee name:"+E1.getname());
        System.out.println("Age:"+E1.getage());
        System.out.println("Salary:"+E1.getsalary());

        System.out.println();
        
        Constructor E2 = new Constructor("Harshamal",22,60000.00f);

        System.out.println("Employee name:"+E2.getname());
        System.out.println("Age:"+E2.getage());
        System.out.println("Salary:"+E2.getsalary());
    }
}