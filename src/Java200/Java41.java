package Java200;

import java.util.Scanner;

public class Java41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력하여 주세요.");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("운년입니다.");
        } else
            System.out.println("윤년아님");
    }
}
