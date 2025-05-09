import java.util.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

// 9-1번 문제
class Exercise9_1 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3,true);
        SutdaCard c2 = new SutdaCard(3,true);
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c1.equals(c2):"+c1.equals(c2));
    }
}
class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public boolean equals(Object obj) {
        if (obj instanceof SutdaCard){
            SutdaCard c = (SutdaCard) obj;
            return c.num == num && c.isKwang == isKwang;
        }
        return false;
    }
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}



// 9-2번 문제
class Exercise9_2 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(1,2,3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2?"+(p1==p2));
        System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
    }
}
class Point3D {
    int x,y,z;
    Point3D(int x, int y, int z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    Point3D() {
        this(0,0,0);
    }
    public boolean equals(Object obj) {
        if (obj instanceof Point3D) {
            Point3D p = (Point3D)obj;
            return p.x == x && p.y == y && p.z == z;
        }
        return false;
    }
    public String toString() {
        return "["+x+","+y+","+z+"]";
    }
}

//9-3번 문제
class Exercise9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        int pos = fullPath.lastIndexOf("\\");

        path = fullPath.substring(0, pos);
        fileName = fullPath.substring(pos + 1);

        System.out.println("fullPath:"+fullPath);
        System.out.println("path:"+path);
        System.out.println("fileName:"+fileName);
    }
}

//9-4번 문제
class Exercise9_4 {
    static void printGraph(int[] dataArr, char ch) {
        for (int i = 0; i < dataArr.length; i++) {
            String num = String.valueOf(dataArr[i]);
            int num1 = Integer.parseInt(num);
            for(int j = 0; j < num1; j++){
                System.out.print(ch);
            }
            System.out.println(num1);
        }
    }
    public static void main(String[] args) {
        printGraph(new int[]{3,7,1,4},'*');
    }
}

//9-5번 문제
class Exercise9_5 {
    public static int count(String src, String target) {

        int count = 0; // 찾은 횟수
        int pos = 0; // 찾기 시작할 위치

        while(true){
            pos = src.indexOf(target, pos);
            if(pos == -1){
                break;
            }
            pos = pos + target.length();
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB","AB"));
        System.out.println(count("12345","AB"));
    }
}

//9-6번 문제
class Exercise9 {
    public static String fillZero(String src, int length) {
        if(src == null || src.length() == length){
            return src;
        } else if (length <= 0) {
            return "";
        } else if (length < src.length()) {
            return src.substring(0, length);
        }
        char[] arr = new char[length];
        Arrays.fill(arr, '0');
        System.arraycopy(src.toCharArray(), 0, arr, length - src.length(), src.length());

        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3));
    }
}

//9-7번 문제
class Exercise9_7 {
    static boolean contains(String src, String target) {
        return src.indexOf(target) != -1;
    }
    public static void main(String[] args) {
        System.out.println(contains("12345","23"));
        System.out.println(contains("12345","67"));
    }
}

// 9-8번 문제
class Exercise9_8 {

    static double round(double d, int n) {
        return Math.round(d * Math.pow(10, n)) / Math.pow(10, n);
    }

    public static void main(String[] args) {
        System.out.println(round(3.1415,1));
        System.out.println(round(3.1415,2));
        System.out.println(round(3.1415,3));
        System.out.println(round(3.1415,4));
        System.out.println(round(3.1415,5));
    }
}
// 9-9번 문제
class Exercise9_9 {
    static String delChar(String src, String delCh){
        StringBuffer sb = new StringBuffer(src.length());
        for(int i = 0; i < src.length(); i++){
            char ch = src.charAt(i);
            if(delCh.indexOf(ch) == -1){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "
                + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> "
                + delChar("(1 2 3 4\t5)"," \t"));
    }
}

// 9-10번 문제
class Exercise9_10
{
    static String format(String str, int length, int alignment){
        if(length < str.length()){
            str = str.substring(0, length);
        }

        char[] arr = new char[length];
        Arrays.fill(arr, ' ');

        if(alignment == 0){
            System.arraycopy(str.toCharArray(),0,arr,0, str.length());
        } else if(alignment == 1){
            System.arraycopy(str.toCharArray(),0,arr,2, str.length());
        } else if(alignment == 2){
            System.arraycopy(str.toCharArray(),0,arr,4,str.length());
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str,7,0)); // 왼쪽 정렬
        System.out.println(format(str,7,1)); // 가운데 정렬
        System.out.println(format(str,7,2)); // 오른쪽 정렬
    }
}

// 9-11번 문제
class Exercise9_11 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("시작 단과 끝 단, 두개의 정수를 입력해주세요");
            System.out.print("USAGE : GUGDAN : ");
            int num = sc.nextInt();
            int num2 = sc.nextInt();

            if (num < 2 || num > 9 || num2 < 2 || num2 > 9) {
                System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
                continue;
            }

            if (num > num2) {
                int temp = num;
                num = num2;
                num2 = temp;
            }

            for (int i = num; i <= num2; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.println(i + "x" + j + " = " + i* j);
                }
                System.out.println();
            }
            break;
        }
    }
}

// 9-12번 문제
class Exercise9_12
{
    static int getRand(int from, int to){
        return (int) (Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);
    }
    public static void main(String[] args)
    {
        for(int i=0; i< 20; i++)
            System.out.print(getRand(1,-3)+",");
    }
}

// 9- 13번 문제
class Exercise9_13 {
    public static void main(String[] args) {
        String src = "aabbccAABBCCaa";
        System.out.println(src);
        System.out.println("aa를 " + stringCount(src, "aa") +"개 찾았습니다.");
    }
    static int stringCount(String src, String key) {
        return stringCount(src, key, 0);
    }
    static int stringCount(String src, String key, int pos) {
        int count = 0;
        int index = 0;
        if (key == null || key.length() == 0)
            return 0;
        while (true) {
            index = src.indexOf(key,pos);
            if(index == -1){
                break;
            }
            pos = index + key.length();
            count++;
        }

        return count;
    }
}

// 9-14번 문제

class Exercise9_14 {
    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };

        ArrayList list = new ArrayList();
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.print(">>");
            String input = s.nextLine().trim();
            if(input.equals("")) {
                continue;
            } else if(input.equalsIgnoreCase("Q")) {
                System.exit(0);
            }

            for (int i = 0; i < phoneNumArr.length; i++) {
                String phoneNum = phoneNumArr[i];
                String tmp = phoneNumArr[i].replace("-", "");

                if(tmp.contains(input) == true){
                    list.add(phoneNum);
                }
            }

            if(list.size()>0) {
                System.out.println(list);
                list.clear();
            } else {
                System.out.println("일치하는 번호가 없습니다.");
            }
        }
    } // main
}

