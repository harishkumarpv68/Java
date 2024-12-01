package SamplePolymorphism;

public class SampleCalculator {


    public static void main(String[] args) {

        Addition a = new Addition();
        System.out.println("Adding two integers: " + a.addition(5, 3));
        System.out.println("Adding three integers: " + a.addition(2, 3, 4));
        System.out.println("Adding two doubles: " + a.addition(5.5, 4.5));

        Subtraction b = new Subtraction();
        System.out.println("Subtraction two integers: " + b.subtraction(5, 3));
        System.out.println("Subtraction three integers: " + b.subtraction(10, 3, 4));
        System.out.println("Subtraction two doubles: " + b.subtraction(5.5, 4.5));

        Multiplication c = new Multiplication();
        System.out.println("Multiplying two integers: " + c.multiply(5, 3));
        System.out.println("Multiplying three integers: " + c.multiply(2, 3, 4));
        System.out.println("Multiplying two doubles: " + c.multiply(5.5, 4.5));

    }
}
