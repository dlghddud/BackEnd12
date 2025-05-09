package Java200;

import java.util.Scanner;

public class object_oriented1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 학생의 국어 성적 ");
        int kor1 = sc.nextInt();
        System.out.print("첫 번째 학생의 수학 성적 ");
        int math1 = sc.nextInt();

        System.out.print("두 번째 학생의 국어 성적 ");
        int kor2 = sc.nextInt();
        System.out.print("두 번째 학생의 수학 성적 ");
        int math2 = sc.nextInt();

        System.out.print("세 번째 학생의 국어 성적 ");
        int kor3 = sc.nextInt();
        System.out.print("세 번째 학생의 수학 성적 ");
        int math3 = sc.nextInt();

        System.out.print("네 번째 학생의 국어 성적 ");
        int kor4 = sc.nextInt();
        System.out.print("네 번째 학생의 수학 성적 ");
        int math4 = sc.nextInt();

        System.out.print("다섯 번째 학생의 국어 성적 ");
        int kor5 = sc.nextInt();
        System.out.print("다섯 번째 학생의 수학 성적 ");
        int math5 = sc.nextInt();

        int[] arr = {kor1, kor2 ,kor3 ,kor4 ,kor5};
        int[] arr2 = {math1, math2, math3, math4, math5};

        int kormin = min(arr);
        int mathmin = min(arr2);
        int kormax = max(arr);
        int mathmax = max(arr2);
        int korsum = sum(arr);
        int mathsum = sum(arr2);
        int koravr = avg(arr);
        int mathavr = avg(arr2);

        System.out.println("국어 최고" + kormax);
        System.out.println("국어 최저" + kormin);
        System.out.println("국어 총점" + korsum);
        System.out.println("국어 평균" + koravr);

        System.out.println("수학 최고" + mathmax);
        System.out.println("수학 최저" + mathmin);
        System.out.println("수학 총점" + mathsum);
        System.out.println("수학 평균" + mathavr);
    }
    static int min(int[] arr){
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    static int avg(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
