import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수 하나를 입력하여 주세요:");
        int num =  scan.nextInt();

        if(num%7 == 0){
            System.out.println(num + "은 7의 배수입니다.");
        }else{
            System.out.println(num +"은 7의 배수가 아닙니다.");
        }

        int year = scan.nextInt();
        if(year%4 == 0){
            System.out.println("윤년입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
