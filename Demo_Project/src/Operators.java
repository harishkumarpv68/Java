public class Operators {

    static int a = 8, b= 4, c = 6;

    public void arithmetic()
        {
            System.out.println("add : " + (a+b));
            System.out.println("sub : " + (a-b));
            System.out.println("mul : " + (a*b));
            System.out.println("div : " + (a/b));
            System.out.println("div : " + (a%b));
            System.out.println("div : " + (a/b));

            //Post Increment & decrement
            System.out.println("Increment : " + a++);
            System.out.println("After Post Increment " + a);

            System.out.println("decrement : " + b--);
            System.out.println("After Post decrement " + b);

            //Pre Increment & decrement
            System.out.println("Increment : " + ++a);
            System.out.println("After Pre Increment " + a);

            System.out.println("decrement : " + --b);
            System.out.println("After Pre decrement " + b);

        }

    public void relational()
    {
        System.out.println("equals : " + (a==b));
        System.out.println("not equals : " + (a!=b));
        System.out.println("greater than : " + (a>b));
        System.out.println("less than : " + (a<b));
        System.out.println("greater than equal to : " + (a>=b));
        System.out.println("less than equal to : " + (a<=b));
    }

    //static int a = 8, b= 4, c = 6;
    public void logical()
    {
        System.out.println("and operator : " + ((a==b) && (a==c) && (c==b) ));
        System.out.println("or operator : " + ((a!=b) || (a==c) ));
        System.out.println("not operator : " + (!(a==b)));
    }

    public static void main (String[] args)
    {
        System.out.println("------------------arithmetic operator output----------------");
        new Operators().arithmetic();

        System.out.println("------------------relational operator output----------------");
        new Operators().relational();

        System.out.println("------------------logical operator output----------------");
        new Operators().logical();
    }
}
