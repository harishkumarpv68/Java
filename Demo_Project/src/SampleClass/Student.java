package SampleClass;

public class Student {

    String name;
    String branch_name;
    int role_number;
    char section;

    public void getStudentDetails(){
        System.out.println("SampleClass.Student name is : " + name);
        System.out.println("SampleClass.Student branch name is : " + branch_name);
        System.out.println("SampleClass.Student role number is : " + role_number);
        System.out.println("SampleClass.Student section is : " + section);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "ABC";
        s1.branch_name = "EC";
        s1.role_number = 123;
        s1.section = 'A';

        Student s2 = new Student();
        s2.name = "ZYZ";
        s2.branch_name = "EC";
        s2.role_number = 175;
        s2.section = 'B';

        System.out.println("-----------------------s1 details----------");
        s1.getStudentDetails();
        System.out.println("-----------------------s2 details----------");
        s2.getStudentDetails();

    }

}
