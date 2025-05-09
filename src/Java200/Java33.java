package Java200;

import java.util.Scanner;

public class Java33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        location lc = new location();
        System.out.print("도시를 입력하세요: ");
        String city = sc.nextLine();
        System.out.println();
        System.out.print("위도를 입력하여 주새요: ");
        lc.lat = sc.nextDouble();
        System.out.println();
        System.out.print("경도를 입력하여 주세요: ");
        lc.lng = sc.nextDouble();
        System.out.println();
        System.out.println(city + "의 위도는 " + lc.lat + " 경도는 " + lc.lng);
    }
}
class location{
    double lat;
    double lng;
}
