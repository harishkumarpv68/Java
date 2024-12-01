import java.util.Scanner;

public class ScanTest {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scan = new Scanner(System.in);
        //String s1 = scan.toString();
        String s2 = scan.nextLine();


        System.out.println("entered string: "+ s2);

    }

}
