public class Patrns {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {//0<5

            for (int j = 0; j < n - i; j++) {//0<5//1<5-0=true//2<5 true//3<5 true//4<5//5<5 false
                System.out.print("*");//0<5-1=4//1<4//3<4//4<4false
                //0<3//1<3//2<3//3<3 false
                //0<2//1<2//3<2 false
                //0<1//1<1 false
                //0<0

            }
            System.out.println();
        }
    }
}
