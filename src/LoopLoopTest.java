public class LoopLoopTest {
    public static void main(String[] args) {
        //int i,j;

        /*for(i=2; i<=9; i++){
            for(j=1; j<=9; j++){
                System.out.print(i+"x"+j +"="+(i*j));
                System.out.print("\t");
            }
            System.out.println();
        }*/

        /*for(i=1; i<=9; i++){
            for(j=2; j<=9; j++){
                System.out.print(j+"x"+i+"="+(j*i));
                System.out.print("\t");
            }
            System.out.println();
        }*/

        int count =0;
        for(int i=1;i<=10;i++){
            if(i%3!=0){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
