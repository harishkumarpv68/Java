import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        //Addition
        System.out.println("For Addition");
        System.out.println("enter first value");
        double num1 = scan.nextDouble();
        System.out.println("enter Second value");
        double num2 = scan.nextDouble();
        double add = (num1 + num2);
        System.out.println("addition of two numbers : " +add);

        //Subtraction
        System.out.println("For Subtraction");
        System.out.println("enter first value");
        double num3 = scan.nextDouble();
        System.out.println("enter Second value");
        double num4 = scan.nextDouble();
        double Sub = (num3 - num4);
        System.out.println("Subtraction of two numbers : " +Sub);

        //Multiplication
        System.out.println("For Multiplication");
        System.out.println("enter first value");
        double num5 = scan.nextDouble();
        System.out.println("enter Second value");
        double num6 = scan.nextDouble();
        double Mul = (num5 * num6);
        System.out.println("Multiplication of two numbers : " +Mul);

        //Division
        System.out.println("For Division");
        System.out.println("enter first value");
        double num7 = scan.nextDouble();
        System.out.println("enter Second value");
        double num8 = scan.nextDouble();
        double Div = (num7 / num8);
        System.out.println("Division of two numbers : " +Div);

    }

}
