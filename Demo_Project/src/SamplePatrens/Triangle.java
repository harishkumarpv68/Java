package SamplePatrens;

public class Triangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) { //1<=5 2<=5 3<=5 4<=5 5<=5 6<=5

            for (int j = 1; j <= i; j++) { //1<=1 2<=1
                                            //1<=2 2<=2 3<=2
                                            //1<=3 2<=3 3<=3 4<=3
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
