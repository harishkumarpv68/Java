public class Collage
{
    //Default values
    String College_Name = "ABC is default value";
    String Branch_Name = "Testing is default value";
    int Student_ID = 23112;
    char Section_Name = 'A';

    public Collage()
    {
        System.out.println(College_Name + " is College names");
        System.out.println(Branch_Name + " is Branch names");
        System.out.println(Student_ID + " is Student ID");
        System.out.println(Section_Name + " is Section names");
    }

    //Custom Details
    Collage(String Name,String Course,int Id,char section)
    {
        College_Name = Name;
        Branch_Name = Course;
        Student_ID = Id;
        Section_Name =section;
    }

    //Main method
    public static void main(String[] args) {

        System.out.println("----------------default Student Details------------------");
        new Collage();

        System.out.println("----------------C1 Student Details------------------");

        Collage c1 = new Collage("ABC2","Testing2",7369,'B');
        System.out.println(c1.College_Name + " is College names");
        System.out.println(c1.Branch_Name + " is Branch names");
        System.out.println(c1.Student_ID + " is Student ID");
        System.out.println(c1.Section_Name + " is Section names");

        System.out.println("----------------C2 Student Details------------------");

        Collage c2 = new Collage("ABC2","Testing2",7370,'C');
        System.out.println(c2.College_Name + " is College names");
        System.out.println(c2.Branch_Name + " is Branch names");
        System.out.println(c2.Student_ID + " is Student ID");
        System.out.println(c2.Section_Name + " is Section names");

    }

}
