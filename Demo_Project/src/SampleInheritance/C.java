package SampleInheritance;

public class C extends B {

    B b = new B();
    public void print_performed_Operation(){

        System.out.println("Addition of two parameters : " + b.performAddition());
        System.out.println("Subtraction of two parameters : " + b.performSubtraction());
        System.out.println("Multiplication of two parameters : " + b.performMultiplication());
        System.out.println("Division of two parameters : " + b.performDivision());
        System.out.println("Modulo of two parameters : " + b.performModulo());

    }

    public static void main(String[] args) {
       C c = new C();
        c.print_performed_Operation();
    }

}
