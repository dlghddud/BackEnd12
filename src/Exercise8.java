import java.util.*;
// 8-8번 문제
class Exercise8_8 {
    public static void main(String[] args)
    {
// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기 위한 변수
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 :");

            try {
                System.out.print("1과 100사이의 값을 입력하세요 :");
                input = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 값입니다. 다시 입력해라");
                continue;
            }

            if(answer > input) {
                System.out.println(" 더 큰 수를 입력하세요");
            } else if(answer < input) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 "+count+"번입니다.");
                break; // do-while문을 벗어난다
            }
        } while(true); // 무한반복문
    } // end of main
} // end of class HighLow*/

// 8-9번 문제
class Exercise8_9
{
    public static void main(String[] args) throws Exception
    {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다 .",100);
    }
}

class UnsupportedFuctionException extends RuntimeException {
    final private int ERR_CODE;

    UnsupportedFuctionException(String msg, int errCode){
        super(msg);
        ERR_CODE = errCode;
    }

    UnsupportedFuctionException(String msg){
        this(msg, 100);
    }

    public int getErrorCode(){
        return ERR_CODE;
    }

    public String getMessage(){
        return "[" + getErrorCode()+ "] " + super.getMessage();
    }
}

