public class Loop {
    int a = 5;

    public static void main(String[] args) {

        Loop l1 = new Loop();

        //while loop
        while(l1.a<=10){
            System.out.println("entered the loop");
            l1.a++;
        }

        System.out.println("------do while loop----------");
        //do while loop
        int b = 2;
        do {
            System.out.println("entered the loop");
            b++;
        }while(b>=10);

        System.out.println("------For loop------");
        //For loop :- Solid rectangle
        for(int i=4;i>=0;i--)
        {
            for(int j=4; j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------break------");
        //break
        for (int m =0; m<=10; m++) {

            if (m == 5) {
                break;
            }
            System.out.println("m value is :" + m);
        }
        System.out.println("------continue------");
        //continue
        for (int n =0; n<=10; n++) {

            if (n == 5) {
                continue;
            }
            System.out.println("n value is :" + n);
        }

        //breack using while loop
        int w = 2;
        while (w < 10){
            if (w==5)
            {
                break;
            }
            System.out.println("w value is :" + w);
            w++;
        }
    }



}
