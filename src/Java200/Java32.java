package Java200;

import java.util.Scanner;

public class Java32 {
    public static void main(String[] args) {
        double[] latitude = new double[1];
        double[] longitude = new double[1];
        String[] city = new String[1];

        Scanner sc = new Scanner(System.in);
        System.out.print("도시명을 입력해주세요 : ");

        city[0] = sc.nextLine();
        System.out.print("위도를 입력하여 주세요 : ");

        latitude[0] = sc.nextDouble();
        System.out.print("경도를 입력하여 주세요 : ");

        longitude[0] = sc.nextDouble();
        System.out.println(city[0]+"의 (위도, 경도)는 " +'(' + latitude[0] + ", " + longitude[0]+')');
        System.out.println();

        double[][] location = {latitude, longitude};
        System.out.println(city[0]+"의 (위도, 경도)는 " +'(' + latitude[0] + ", " + longitude[0]+')');
    }
}
