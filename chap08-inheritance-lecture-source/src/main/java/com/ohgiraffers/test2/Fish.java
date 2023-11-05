package main.java.com.ohgiraffers.test2;

class Fish extends House{
    private String cleaning;

    public Fish(String name, int price, String food, String home, String cleaning) {
        super(name, price, food, home);
        this.cleaning = cleaning;
    }

    public String getCleaning() {
        return cleaning;
    }

    public void setCleaning(String cleaning) {
        this.cleaning = cleaning;
    }

    @Override
    public String toString() {
        return "물고기";
    }
}
