import java.util.Arrays;

public class Exercise6 {
    //6-1,2번 문제
    /*public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    String info(){
        return num + (isKwang ? "K" : "");
    }*/

    //6-3,4,5번 문제
    /*public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAverage());

        Student s2 = new Student("홍길동",1,1,100,60,76);
        System.out.println(s2.info());
    }
}

class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        float avg = (kor + eng + math) / 3f;
        float avg2 = Math.round(avg * 10) / 10f;
        return avg2;
    }
    Student(){}
    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    String info(){
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
    }*/

    // 6-6,7번 문제
/*    public static void main(String args[]) {
        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistance(2,2));
    }
}
class MyPoint{
    int x;
    int y;
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    double getDistance(int x1, int y1) {
        double distance = Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
        return distance;
    }*/

    //6-20번 문제
    /*static int[] shuffle(int[] arr){
        for(int i=0; i<arr.length; i++){
            int j = (int)(Math.random()*arr.length);
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }*/

    //6-21번 문제
    /*public static void main(String args[]) {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
    }
}

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        isPowerOn =! isPowerOn;
    }
    void volumeUp() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }
    void volumeDown() {
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }
    void channelUp() {
        if (channel < MAX_CHANNEL) {
            channel++;
        } else if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        }
    }
    void channelDown() {
        if (channel > MIN_CHANNEL) {
            channel--;
        } else if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        }
    }*/
    //6-22번 문제

    /*static boolean isNumber(String str){
        if(str == null || str.equals("")){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            char a = str.charAt(i);
            if(a < '0' || a > '9'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }*/

    //6-23번 문제
    /*static int max(int[] arr){
        if(arr == null || arr.length == 0){
            return -999999;
        }
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
    }*/

    //6-24번 문제
    /*static int abs(int value){
        if(value < 0){
            value = value * -1;
        }
        return value;
    }

    public static void main(String[] args)
    {
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));
    }*/
}