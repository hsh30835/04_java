package main.java.com.ohgiraffers.test;

public class OnlineGame extends Game {
    private String company; //게임사

    public OnlineGame(String name, String exe, String genre, String company){
        super(name, exe, genre);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String getGener() {
        System.out.println("이 게임의 장르는 " + super.getGener() + " 입니다.");
        return super.getGener();
    }
}
