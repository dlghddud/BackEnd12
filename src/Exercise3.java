import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.println((num/10+(num%10==0?0:1))*10-num);

        int fehrenheit = 100;
        float celsius = (int)(5/9f*(fehrenheit - 32)*100 + 0.5)/100f;
        System.out.println(fehrenheit);
        System.out.println(celsius);

        byte a = 10;
        byte b = 20;
        int c = a + b;
        System.out.println(c);

        char ch = 'A';
        ch = (char)(ch + 2);
        System.out.println(ch);

        float f = 3/2f;
        long l = 3000*3000*3000L;
        System.out.println(f);
        System.out.println(l);

        float f2 = 0.1f;
        double d = (float)0.1;
        boolean result = d == f2;
        System.out.println(result);*/

        char ch = sc.next().charAt(0);
        boolean b = ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'));
        System.out.println(b);

        char lowerCase = (ch>=65 && ch<=90) ? (char)(ch+32) : ch;
        System.out.println(lowerCase);
    }
}
