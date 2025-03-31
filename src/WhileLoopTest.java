public class WhileLoopTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;

        /*while(i<numbers.length){
            System.out.println(numbers[i]);
            i++;
        }*/

        do{
            System.out.println(numbers[i]);
            i++;
        }while(i<numbers.length);
    }
}
