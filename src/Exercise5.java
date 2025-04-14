import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        //5-3번 문제
        /*int[] arr = {10,20,30,40,50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);*/

        //5-4번 문제
        /*int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float average = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                total += arr[i][j];
            }
        }
        average = (float) total/(arr.length * arr[0].length);

        System.out.println("total="+total);
        System.out.println("average="+average);*/

        //5-5번 문제
        /*int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        // ballArr배열의 임의의 요소를 골라서 위치를 바꾼다.
        for(int i=0; i< ballArr.length;i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp =0;
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        for(int i=0; i< ball3.length;i++) {
            ball3[i] = ballArr[i];
        }

        for(int i=0;i<ball3.length;i++) {
            System.out.print(ball3[i]);
        }*/

        //5-6번 문제
        /*int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money="+money);

        for(int i=0;i<coinUnit.length;i++) {
            int count = 0;
            count = money/coinUnit[i];
            money = money-count*coinUnit[i];
            System.out.println(coinUnit[i]+ "원 : "+count);

        }*/

        //5-7번 문제
        /*if(args.length != 1) {
            System.out.println("5-7");
            System.exit(0);
        }
        int money = Integer.parseInt(args[0]);
        System.out.println("money="+money);

        int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수

        for(int i=0;i<coinUnit.length;i++) {
            int coinNum = 0;
            coinNum = money/coinUnit[i];
            if(coin[i]>coinNum){
                coin[i] = 0;
            }else {
                coin[i] = coin[i]-coinNum;
            }
            money = money-coinUnit[i]*coinNum;
        }

        if(money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0); // 프로그램을 종료한다.
        }

        System.out.println("=남은 동전의 개수 =");

        for(int i=0;i<coinUnit.length;i++) {
            System.out.println(coinUnit[i] + "원:" + coin[i]);
        }*/

        //5-8번 문제
        /*int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
        int[] counter = new int[4];

        for(int i=0; i < answer.length;i++) {
            int j = (int)(Math.random()*answer.length);
            int tmp = 0;
            tmp = answer[i];
            answer[i] = answer[j];
            answer[j] = tmp;
        }

        for(int i=0; i < counter.length;i++) {
            counter[i] = answer[i];
            System.out.print(counter[i]);
            for(int j=0; j < counter[i];j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //5-9번 문제
        char[][] star = {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };

        char[][] result = new char[star[0].length][star.length];
        for(int i=0; i < star.length;i++) {
            for(int j=0; j < star[i].length;j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0; i < star.length;i++) {
            for(int j=0; j < star[i].length;j++) {
                result[j][star.length - 1 - i] = star[i][j];
            }
        }

        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

        /*char[] abcCode ={ '`','~','!','@','#','$','%','^','&','*',
                '(',')','-','_','+','=','|','[',']','{', '}',
                ';',':',',','.','/'};

        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String src = "abc123";
        String result = "";

        for(int i=0; i < src.length();i++) {
            char ch = src.charAt(i);
            if(ch>='a' && ch <= 'z'){
                result += abcCode[ch-'a'];
            }else if(ch >='0' && ch <= '9'){
                result += numCode[ch-'0'];
            }
        }
        System.out.println("src:"+src);
        System.out.println("result:"+result);*/

        //5-11번 문제
        /*int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };

        int[][] result = new int[score.length+1][score[0].length+1];

        for(int i=0; i < score.length;i++) {
            for(int j=0; j < score[i].length;j++) {
                result[i][j] = score[i][j];
                result[i][result[i].length-1] += score[i][j];
                result[result.length-1][j] += score[i][j];
                result[result.length-1][result[i].length-1] += score[i][j];
            }
        }

        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }*/

        //5-12번 문제
        /*String[][] words = {
                {"chair","의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n") ;
                count++;
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
            }
        }
        System.out.println("전체 3문제 중 "+count+"문제 맞추셨습니다.");*/

        //5-13번 문제
        /*String[] words = { "television", "computer", "mouse", "phone" };

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<words.length;i++) {
            char[] question = words[i].toCharArray();

            for(int j=0;j<question.length;j++){
                int num = (int)(Math.random()*question.length);
                char ch = question[j];
                question[j] = question[num];
                question[num] = ch;

            }

            System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
            String answer = scanner.nextLine();

            if(words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.printf("틀렸습니다.%n%n");
        }*/
        //퀴즈 1번
        /*int[] arr = new int[3];
        int[] arr2 = new int[3];
        int ball = 0;
        int strike = 0;
        while(true){
            for(int i=0; i<3;i++){
                arr[i] = (int)(Math.random()*9)+1;
                arr2[i] = (int)(Math.random()*9)+1;
            }
            if(!Arrays.equals(arr, arr2)){
                break;
            }
        }
        for(int i=0; i<3;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=0; i<3;i++){
            System.out.print(arr2[i]);
        }
        System.out.println();
        for(int i=0; i<3;i++){
            if(arr[i]==arr2[i]){
                strike++;
            }else {
                for (int j = 0; j < 3; j++) {
                    if (i != j && arr[i] == arr2[j]) {
                        ball++;
                    }
                }
            }
        }
        System.out.println(strike + " strike  " + ball + "ball");*/



        //퀴즈 2번
        /*int[] arr = {3,4,6,1,2,5,1,2,3,2,5};
        int[] arr2 = new int[arr.length];
        int count = 0;
        *//*for (int i = 0; i < arr.length -1; i++) {
            for(int j = 0; j < arr.length-1-i; j++){
                if (arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }*//* // 정렬 열심히 짜봤더니 sort라는 좋은게 있네
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        int[] arr3 = new int[count];
        for(int i=0;i<arr2.length;i++){
            if(arr2[i] != 0){
                arr3[i] = arr2[i];
            }
        }

        System.out.print("1. 중복 제거 : ");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        System.out.print("2. 정렬 : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
    }
}
