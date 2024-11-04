public class Special_Operators
{
    static int  a = 2, b = 3;
    //		&, |,^, >> , <<, ~
    public void bitOperator()
    {
        System.out.println("And Operator " + (a&b) );
        System.out.println("Or Operator " + (a|b) );
        System.out.println("Nor Operator " + (a^b) );
        System.out.println("Right shift Operator " + (a<<b) );
        System.out.println("Left shift Operator " + (a>>b) );
        System.out.println("Left shift Operator " + (~a) );

    }

    public void conditionOperators()
    {
        System.out.println("Condition " + ((a>b)? (a-b) : (b-a)) );
    }

    public static void main(String[] args) {

        new Special_Operators().bitOperator();
        System.out.println("-----------------------condition Operator-------------");
        new Special_Operators().conditionOperators();

    }

}
