import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.println((num/10+(num%10==0?0:1))*10-num);

        int fehrenheit = 100;
        float celsius = (int)(5/9f*(fehrenheit - 32)*100 + 0.5)/100f;
        System.out.println(fehrenheit);
        System.out.println(celsius);
    }
}
