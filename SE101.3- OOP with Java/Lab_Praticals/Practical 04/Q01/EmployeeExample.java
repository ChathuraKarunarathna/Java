public class EmployeeExample {
        public static void main(String[] args)
        {
            {
                Employee E1 = new Employee();
                Employee E2 = new Employee();

                E1.setempid(24657);
                E1.setname("Mr.Bogdan ");
                E1.setdesignation("Web Developer");

                E1.setempid(24680);
                E2.setname("Ms.Bird ");
                E2.setdesignation("DevOps Engineer");

                System.out.println("Employee ID:"+E1.getempid());
                System.out.println("Employee Name:"+E1.getname());
                System.out.println("Designation:"+E1.getdesignation());

                System.out.println();

                System.out.println("Employee ID:"+E1.getempid());
                System.out.println("Employee Name:"+E2.getname());
                System.out.println("Designation:"+E2.getdesignation());
            }
        }
    }

