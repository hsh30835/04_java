package main.java.com.ohgiraffers.test;

public class SteamGame extends Game {
    private int price; //게임가격

    //부모 클래스에서 있는 생성자를 super로 가져오고 price를 추가함
    public SteamGame(String name, String exe, String genre, int price) {
        super(name, exe, genre);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getGener() {
        System.out.println("이 게임의 장르는 " + super.getGener() + " 입니다.");
        return super.getGener();
    }

    @Override
    public String toString() {
        return "SteamGame{" +
                "price=" + price +
                '}';
    }
}