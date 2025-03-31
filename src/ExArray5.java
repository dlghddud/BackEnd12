public class ExArray5 {
    public static void main(String[] args) {
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=0;j<5-2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j=6;j>i*2-1;j--){
                System.out.print("*");
            }
            System.out.println();
        }*/
        MyMath mm = new MyMath();
        mm.gugudan(4);
        int result = mm.add(3,6);
        System.out.println(result);
        int result1 = mm.minus(2,20);
        System.out.println(result1);
        System.out.println('A'+'B');
    }
}
class MyMath {
    void gugudan(int dan) {
        if (dan < 2 || dan > 9) {
            return;
        }
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + "x" + i + "=" + dan * i);
        }
    }
    int add(int a, int b){
        return a + b;
    }
    int minus(int a, int b){
        return a - b;
    }
}
