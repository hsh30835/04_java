package main.java.com.ohgiraffers.test2;

class Parrot extends House implements Toy{
    private String talk;

    public Parrot(String name, int price, String food, String home, String talk) {
        super(name, price, food, home);
        this.talk = talk;
    }

    public String getTalk() {
        return talk;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    @Override
    public String toString() {
        return "앵무새";
    }

    @Override
    public String toy() {
        return "그네";
    }

    @Override
    public int toyPrice() {
        return 5000;
    }
}
