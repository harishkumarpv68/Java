public class PimeNumber {


    public static void main(String[] args) {
        int i,j, value;

        for(i =2; i<=100; i++ ){
            value = 0;

            for(j=2;j<i;j++){ //2<2false//2<3 true
                if(i%j==0){
                    value++;
                    break;
                }
            }
            if(value ==0)

                System.out.print(i + ",");
        }

    }
}
