public class ReverseString {

    public static void main(String[] args) {
        String str = "Helow world";
        //String reversr = "";

        StringBuilder str1 = new StringBuilder(str);
        System.out.println(str1.reverse());

        //SwapNumbers


                int a = 10;
                int b = 20;

                System.out.println("a is " + a + " and b is " + b);

                a = a + b;
                b = a - b;
                a = a - b;

                System.out.println("After swapping, a is " + a + " and b is " + b);


        
    }
}
