public class EmployeeExample {
        public static void main(String[] args)
        {
            Employee E1 = new Employee("Chamith",80000.00,10000.00);

            System.out.println("Employee Name:"+E1.getname());
            System.out.println("Salary:"+E1.getsalary());
            System.out.println("Bonus:"+E1.getbonus());
            System.out.println("Bonus Amount:"+E1.getbonusamount());
        }
    }

