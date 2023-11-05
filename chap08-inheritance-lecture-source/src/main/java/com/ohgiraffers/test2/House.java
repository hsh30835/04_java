package main.java.com.ohgiraffers.test2;

class House extends Animal{

    private String home;


    public House(String name, int price, String food, String home) {
        super(name, price, food);
        this.home = home;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
