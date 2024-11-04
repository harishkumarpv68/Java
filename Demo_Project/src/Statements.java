import java.util.Scanner;

public class Statements {
   // static int a=10, b=15,c= 20, d = 5;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---Enter four values----");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        //if statement
        System.out.println("----- if statement-----------");
        if (a<b){
            System.out.println("a is less than b");
        }

        //Nested if statement
        System.out.println("-----Nested if statement-----------");
        if ((a>b)&&(a>c)&&(a>d)) {
            System.out.println("a is grater value");
        } else if ((b>c)&&(b>d)){
            System.out.println("b is grater value");
        }else if (c>d){
            System.out.println("c is grater value");
        }else {
            System.out.println("d is grater value");
        }

        //if else statement
        System.out.println("-----if else statement-----------");
        if (c>d){
        System.out.println("c is grater value");
        }else {
        System.out.println("d is grater value");
        }
    }
}
