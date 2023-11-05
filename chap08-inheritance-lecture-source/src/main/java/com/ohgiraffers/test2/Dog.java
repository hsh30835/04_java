package main.java.com.ohgiraffers.test2;

class Dog extends Neutering implements Toy{
    private String walk;

    public Dog(String name, int price, String food, String surgery, String walk) {
        super(name, price, food, surgery);
        this.walk = walk;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    @Override
    public String toString() {
        return "개";
    }


    @Override
    public String toy() {
        return "공";
    }

    @Override
    public int toyPrice() {
        return 3000;
    }
}
