public class Data_types {

    //Primitive data types
    int a = 20;
    double b = 2.2;
    short c = 3;
    float d = 2.1F;
    boolean e = true;
    long f = 34;
    char g = 'g';

    //wrapper data types
    Integer a1 = 30;
    Double b1 = 3.2;
    Short c1 = 4;
    Float d1 = 3.1F;
    Boolean e1 = false;
    Long f1 = 35L;


public static void main (String[] args)
{
    Data_types d = new Data_types();

    System.out.println("--------------Primitive data types ------------");
    System.out.println(d.a + " is Int");
    System.out.println(d.b + " is decimal");
    System.out.println(d.c + " is short");
    System.out.println(d.d + " is float");
    System.out.println(d.e + " is Boolean");
    System.out.println(d.f + " is long");
    System.out.println(d.g + " is char");

    System.out.println("--------------wrapper data types ------------");
    System.out.println(d.a1 + " is Int");
    System.out.println(d.b1 + " is decimal");
    System.out.println(d.c1 + " is short");
    System.out.println(d.d1 + " is float");
    System.out.println(d.e1 + " is Boolean");
    System.out.println(d.f1 + " is long");

}

}



