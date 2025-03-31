import java.util.Scanner;

public class Exersise {
    public static void main(String[] args) {
        /*String str = "12345";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (int)str.charAt(i) - 48;
        }
        System.out.println("Sum: " + sum);*/

        /*int num = 12345;
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);*/

        int answer = (int)(Math.random()*100)+1;
        int input = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        do{
            count++;
            System.out.print("값을 입력하세요 : ");
            input = scan.nextInt();

            if(answer == input) {
                System.out.println("정답입니다.");
                System.out.println("시도 횟수는 : " + count);
                break;
            }else if (answer > input) {
                System.out.println("더 큰 수를 입력하세요");
            }else {
                System.out.println("더 작은 수를 입력하세요.");
            }
        }while(true);
        scan.close();
    }
}
