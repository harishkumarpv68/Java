package SampleInheritance;

public class B extends A {

    A a = new A();

    public double performAddition(){
        double  x =  a.Addition(2,2);
        return x;
    }

    public double performSubtraction(){
        double  x =  a.Subtraction(4,2);
        return x;
    }

    public double performMultiplication(){
        double  x =  a.Multiplication(4,2);
        return x;
    }

    public double performDivision(){
        double  x =  a.Division(4,2);
        return x;
    }

    public double performModulo(){
        double  x =  a.Modulo(4,2);
        return x;
    }

    public static void main(String[] args) {

        B b = new B();
        System.out.println("Addition of two parameters : " + b.performAddition());
        System.out.println("Subtraction of two parameters : " + b.performSubtraction());
        System.out.println("Multiplication of two parameters : " + b.performMultiplication());
        System.out.println("Division of two parameters : " + b.performDivision());
        System.out.println("Modulo of two parameters : " + b.performModulo());
    }

}
