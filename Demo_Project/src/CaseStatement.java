import java.util.Scanner;

public class CaseStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter value");
        int a = scan.nextInt();

    //int a = 5;
    switch (a%7) {
            case 0 : System.out.println("Mon"); break;
            case 1 : System.out.println("Tue"); break;
            case 2 : System.out.println("Wed"); break;
            case 3 : System.out.println("The"); break;
            case 4 : System.out.println("Fri"); break;
            case 5 : System.out.println("Sat"); break;
            default : System.out.println("Sun"); break;
        }
    }


}
