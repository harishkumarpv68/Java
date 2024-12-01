package SampleInheritance;

public class D extends A {

    A a = new A();

    public double performAddition(){
        double  y =  a.Addition(8,4);
        return y;
    }

    public double performSubtraction(){
        double  y =  a.Subtraction(8,4);
        return y;
    }

    public double performMultiplication(){
        double  y =  a.Multiplication(8,4);
        return y;
    }

    public double performDivision(){
        double  y =  a.Division(8,4);
        return y;
    }

    public double performModulo(){
        double  y =  a.Modulo(8,4);
        return y;
    }

    public static void main(String[] args) {
            D d = new D();
        System.out.println("Addition of two parameters : " + d.performAddition());
        System.out.println("Subtraction of two parameters : " + d.performSubtraction());
        System.out.println("Multiplication of two parameters : " + d.performMultiplication());
        System.out.println("Division of two parameters : " + d.performDivision());
        System.out.println("Modulo of two parameters : " + d.performModulo());
    }


}
