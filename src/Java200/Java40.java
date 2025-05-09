package Java200;

import java.util.Scanner;

public class Java40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나라");
        String world = sc.nextLine();

        switch (world) {
            case "미국" :
                System.out.println(2000+"원");
                break;
            case "일본" :
                System.out.println(1000+"원");
                break;
            default:
                System.out.println("잘못된 나라명인디");
        }
    }
}
