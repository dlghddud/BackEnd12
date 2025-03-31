import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("날짜를 입력해주세요: ");
        String day = scan.nextLine();

        switch (day){
            case "monday" :
                System.out.println("농구하기");
                break;
            case "tuesday" :
            case "wednesday" :
                System.out.println("수영하기");
                break;
            case "friday" :
            case "saturday" :
                System.out.println("휴식");
                break;
            case "sunday" :
                System.out.println("야구하기");
                break;
            default:
                System.out.println("올바른 요일 입력이 아닙니다.");
        }
    }
}
