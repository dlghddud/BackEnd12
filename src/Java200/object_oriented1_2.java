package Java200;

import java.util.Scanner;

public class object_oriented1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 개의 정수를 입력하세요. ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = min(num1, num2);
        System.out.println("최소값은 " + result);

        System.out.print("두 개의 실수를 입력하세요. ");
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        double result2 = min(num3, num4);
        System.out.println("최소값은 " + result2);

        System.out.print("두 개의 문자열을 입력하세요. ");
        try {
            String str1 = scanner.next();
            String str2 = scanner.next();
            String result3 = min(str1, str2);
            System.out.println("최소값은 " + result3);
        } catch (Exception e) {
            System.out.println("올바른 문자열을 입력하세요.");
        }

        System.out.print("정수 배열 5개의 원소를 입력하세요. ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int result4 = min(arr);
        System.out.println("최소값은 " + result4);

        scanner.close();
    }

    static int min(int num1, int num2){
        return Math.min(num1, num2);
    }

    static double min(double num3, double num4){
        return Math.min(num3, num4);
    }
    static String min(String str1, String str2) {
        if (str1.compareTo(str2) >= 0) {
            return str2;
        }
        return str1;
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}