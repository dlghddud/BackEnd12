import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = scan.nextInt();
        System.out.println("num = " + num);

        System.out.print("문자열을 입력하세요: ");
        String string = scan.next();
        System.out.println("string = " + string);

        scan.nextLine(); //버퍼비우기(스트림 비우기)

        System.out.print("문자열을 입력하세요: ");
        String string1 = scan.nextLine();
        System.out.println("string1 = " + string1);

        scan.close();
    }
}
