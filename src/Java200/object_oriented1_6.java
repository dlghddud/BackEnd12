package Java200;

import java.util.Scanner;

public class object_oriented1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력하여 주세요: ");
        int student = sc.nextInt();

        int[] score = new int[student];

        System.out.print("학생 점수를 입력하여 주세요: ");
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        float avg = avg(score);
        System.out.println("평균: " + avg);

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i] + passOrFail((score[i]), avg));
        }
    }

    static float avg(int[] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        return (float)(sum / arr.length);
    }

    static String passOrFail(int score, float avg){
        String passOrFail = "";
        if(score >= avg){
            passOrFail = "pass !";
        } else {
            passOrFail = "fail !";
        }
        return passOrFail;
    }
}
