public class Data1 {

    static int a = 10; //static variable

    int c=30;//instance variable

    public static void main(String[] args) {

        int b = 20; //local variable
        System.out.println(a+b + " is the local variable and static variable");

        Data1 t = new Data1(); //calling the C

        System.out.println(t.c+b + " is the local variable and instance variable");


    }





}
