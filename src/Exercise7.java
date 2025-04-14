/*//7-1,2번 문제
public class Exercise7{
    public static void main(String args[]) {

        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for(int i = 0; i < CARD_NUM; i++){
            if(i==0){
                cards[i] = new SutdaCard();
            } else if (i==2 || i==7) {
                cards[i] = new SutdaCard(i+1, true);
            } else if (i<10){
                cards[i] = new SutdaCard(i+1, false);
            } else if (i>=10) {
                cards[i] = new SutdaCard(i-9, false);
            }
        }
    }

    void shuffle(){
        for (int i = CARD_NUM - 1; i > 0; i--) {
            int j = (int)(Math.random() * (i + 1));
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    SutdaCard pick(int index){
        return cards[index];
    }

    SutdaCard pick(){
        int i = (int)(Math.random()*CARD_NUM);
        return cards[i];
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

    public String toString() {

        return num + (isKwang ? "K" : "");

    }
}*/

//7-10,11번 문제
/*public class Exercise7{

    public static void main(String args[]) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    int saveCh;

    public boolean getisPowerOn() {
        return isPowerOn;
    }

    public boolean setisPowerOn(boolean isPowerOn) {
        if (isPowerOn == true) {
            return this.isPowerOn = false;
        } else if (isPowerOn == false) {
            return this.isPowerOn = true;
        }
        return isPowerOn;
    }

    public int getChannel() {
        return channel;
    }

    public int setChannel(int channel) {
        if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
            saveCh = this.channel;
            this.channel = channel;
        }
        return this.channel;
    }

    public int getVolume() {
        return volume;
    }

    public int setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
        return this.volume;
    }

    public void gotoPrevChannel() {
        int tmp = channel;
        channel = saveCh;
        saveCh = tmp;
    }
}*/
//7-18번 문제
/*class Exercise7_18 {
    static void action(Robot r){
        if (r instanceof DanceRobot){
            DanceRobot d = (DanceRobot)r;
            d.dance();
        }
        if (r instanceof SingRobot){
            SingRobot s = (SingRobot)r;
            s.sing();
        }
        if (r instanceof DrawRobot){
            DrawRobot dr =  (DrawRobot)r;
            dr.draw();
        }

    }

    public static void main(String[] args) {
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
        for (int i = 0; i < arr.length; i++)
            action(arr[i]);
    }
}
class Robot {}
class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}
class SingRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}
class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}*/
// 7-20번 문제
class Exercise7_19 {
    public static void main(String args[]) {
        Buyer b = new Buyer();
        b.buy(new Tv5());
        b.buy(new Computer());
        b.buy(new Tv5());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product배열 cart에 사용될 index

    void buy(Product p) {
        if(money < p.price){
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
        } else {
            money -= p.price;
            add(p);
        }
    }

    void add(Product p) {
        if(i>=cart.length){
            Product[] cart2 = new Product[cart.length*2];
            for(int j=0;j< cart.length;j++){
                cart2[j] = cart[j];
            }
            cart = cart2;
        }
        cart[i] = p;
        i++;
    }

    void summary() {
        int sum = 0;
        System.out.print("구입한 물건 : ");
        for(int j=0;j<cart.length;j++){
            if(cart[j] == null)
                break;
            System.out.print(cart[j] + ", ");

        }
        System.out.println();
        for(int j=0;j<cart.length;j++){
            if(cart[j] == null)
                break;
            sum += cart[j].price;
        }
        System.out.println("사용한 금액 : " + sum);
        System.out.println("남은 금액 : " + money);
    }
}

class Product {
    int price; // 제품의 가격

    Product(int price) {
        this.price = price;
    }
}

class Tv5 extends Product {
    Tv5() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}


