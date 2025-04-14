import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //4-2번
        /*int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum +=i;
            }
        }
        System.out.println(sum);*/

        //4-3번 믄제
        /*int sum2 = 0;
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 += i;
            total += sum2;
        }
        System.out.println(total);*/

        //4-4번 문제
        /*int total2 = 0;
        int number = 1;
        int count = 0;

        // 합이 100 이상이 될 때까지 반복
        while (total2 < 100) {
            total2 += number;
            count++;
            number = - number + (number % 2 == 0 ? 1 : -1);
        }

        System.out.println("합이 100 이상이 되는 항의 개수: " + count);*/

        //4-5번 문제
        /*int i = 0;
        while(i<=10){
            int j = 0;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }*/

        //4-6번 문제
        /*for(int i = 1; i<6; i++){
            for(int j = 1; j<6; j++){
                if (i + j == 6){
                    System.out.println(i + "," + j);
                }
            }
        }*/

        //4-7번 문제
        /*int value =(int)(Math.random()*6)+1;
        System.out.println(value);*/

        //4-8번 문제
        /*for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if((2*x+4*y)==10){
                    System.out.println("x="+x+",  "+"y="+y);
                }
            }
        }*/

        //4-9번 문제
        /*String str = "12345";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println(sum);*/

        //4-10번 문제
        /*int num = 12345;
        int sum = 0;
        while (num != 0) {
            sum+=num%10;
            num/=10;
        }
        System.out.println(sum);*/

        //4-11번 문제
        /*int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        System.out.print(num1 + "," + num2);

        for (int i = 0; i < 8; i++) {
            num3= num1+num2;
            num2=num1;
            num1=num3;
            System.out.print(","+num3);
        }*/

        //4-12번 문제
        /*for(int i=1;i<=3;i++){
            for(int j=2;j<=4;j++){
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=3;i++){
            for(int j=5;j<=7;j++){
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=3;i++){
            for(int j=8;j<=9;j++){
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }*/

        //4-13번 문제
        /*String value = "12345";
        char ch = ' ';
        boolean isNumber = true;
        for (int i = 0; i < value.length(); i++) {
            ch = value.charAt(i);
            if (ch <'0' || ch >'9') {
                isNumber = false;
            }
        }
        if (isNumber) {
            System.out.println(value + "는 숫자입니다.");
        } else {
            System.out.println(value + "는 숫자가 아닙니다.");
        }*/

        //4-14번 문제
        /*int answer = (int)(Math.random()*100)+1;
        int input = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");
            input = sc.nextInt();

            if(input == answer){
                System.out.println("맞췄습니다.");
                System.out.println("시도 횟수는 " + count);
                break;
            }else if(input > answer){
                System.out.println("더 작은 수를 입력하세요.");
            }else {
                System.out.println("더 큰 수를 입력하세요.");
            }
        }while (true);*/

        //4-15번 문제
        int number = 12321;
        int tmp = number;

        int result = 0;

        while (tmp != 0) {
            result = result*10 + tmp % 10;
            tmp = tmp / 10;
        }

        if (number == result) {
            System.out.println(number + "는 회문수 입니다.");
        }else {
            System.out.println(number + "는 회문수가 아닙니다.");
        }
    }
}
