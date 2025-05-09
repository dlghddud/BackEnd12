package Java200;

import java.util.Scanner;

public class object_oriented1_5 {
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

        int total1 = kor1 + math1;
        int total2 = kor2 + math2;
        int total3 = kor3 + math3;
        int total4 = kor4 + math4;
        int total5 = kor5 + math5;

        int[] arr3 = {total1, total2, total3, total4, total5};
        int[] arr4 = {1,1,1,1,1};

        int[] rank = rank(arr3,arr4);

        System.out.println("국어 최고" + kormax);
        System.out.println("국어 최저" + kormin);
        System.out.println("국어 총점" + korsum);
        System.out.println("국어 평균" + koravr);

        System.out.println("수학 최고" + mathmax);
        System.out.println("수학 최저" + mathmin);
        System.out.println("수학 총점" + mathsum);
        System.out.println("수학 평균" + mathavr);

        System.out.println("1번 학생의 총점 " + total1 + " 석차 " + rank[0]);
        System.out.println("2번 학생의 총점 " + total2 + " 석차 " + rank[1]);
        System.out.println("3번 학생의 총점 " + total3 + " 석차 " + rank[2]);
        System.out.println("4번 학생의 총점 " + total4 + " 석차 " + rank[3]);
        System.out.println("5번 학생의 총점 " + total5 + " 석차 " + rank[4]);
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

    static int[] rank(int[] arr, int[] arr2){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr[i] < arr[j]){
                    arr2[i]++;
                }
            }
        }
        return arr2;
    }
}
