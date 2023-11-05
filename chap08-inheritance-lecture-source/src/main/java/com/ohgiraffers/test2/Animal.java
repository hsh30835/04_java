package main.java.com.ohgiraffers.test2;

public class Animal { //동물들이 가지고 있는 공통적 특징들
    private String name; //이름생성

    private int price; //가격생성

    private String food; //먹이생성

    public Animal(String name, int price, String food){ // 생성한 이름 가격 먹이 변수들을 선언
        this.name = name;
        this.price = price;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

}
