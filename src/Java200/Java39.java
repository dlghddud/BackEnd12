package Java200;

import java.util.Scanner;

public class Java39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a;
        System.out.println("카드값을 입력하여 주세요.");
        a = sc.next().charAt(0);
        switch (a){
            case 'A':
                System.out.println("A는 1이다.");
                break;
            case 'J':
                System.out.println("J는 11이다.");
                break;
            case 'Q':
                System.out.println("Q는 12이다.");
                break;
            case 'K':
                System.out.println("K는 13이다.");
                break;
            case '0':
                System.out.println();
        }
    }
}
