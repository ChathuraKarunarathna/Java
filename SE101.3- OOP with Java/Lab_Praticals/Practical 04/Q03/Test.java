public class Test {
    public static void main(String[] args)
    {
        Student stu = new Student();
        stu.setname("Chamith Weerasingha");
        stu.setId(28507);
        stu.setcourse("Software Engineering");

        Lecturer lec = new Lecturer();
        lec.setname("Mr. Pramod Perera");
        lec.setId(1056);
        lec.setprogramme("Software Engineering");

        System.out.println("Student Details:");
        System.out.println("Name: " + stu.getname());
        System.out.println("ID: " + stu.getId());
        System.out.println("Course: " + stu.getcourse());
        System.out.println();

        System.out.println("Lecturer Details:");
        System.out.println("Name: " + lec.getname());
        System.out.println("ID: " + lec.getId());
        System.out.println("Programme: " + lec.getprogramme());
    }
}
