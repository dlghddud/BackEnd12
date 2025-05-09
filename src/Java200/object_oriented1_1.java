package Java200;

import java.util.Scanner;

public class object_oriented1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("년도를 입력하세요 : ");
        int year = sc.nextInt();
        System.out.print("Hello ");
        System.out.println(name);
        System.out.print("GoodLuck in ");
        System.out.println(year);
        sc.close();
    }
}
