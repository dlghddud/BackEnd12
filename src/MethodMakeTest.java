import java.util.Scanner;

public class MethodMakeTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a를 입력해주세요: ");
        int a = sc.nextInt();

        System.out.print("b를 입력해주세요: ");
        int b = sc.nextInt();

        int result = add(a,b);
        System.out.println("result="+result);
    }

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}
