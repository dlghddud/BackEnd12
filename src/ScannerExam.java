import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("제목 : ");
        String title = scan.nextLine();

        System.out.print("가격 : ");
        int price = scan.nextInt();

        scan.nextLine();

        System.out.print("출판사 : ");
        String company = scan.nextLine();

        System.out.print("저자 : ");
        String author = scan.nextLine();

        System.out.print("페이지 수 : ");
        int pages = scan.nextInt();

        scan.nextLine();

        System.out.print("ISBN : ");
        String ISBN = scan.nextLine();

        System.out.println("\n" + "제목 : " + title + "\n" + "가격 : " + price + "\n" + "출판사 : " + company + "\n"
                + "저자 : " + author + "\n" + "페이지 수 : " + pages + "\n" + "ISBN : " + ISBN + "\n");

        scan.close();
    }
}
