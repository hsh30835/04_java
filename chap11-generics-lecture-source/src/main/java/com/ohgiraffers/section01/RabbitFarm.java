package main.java.com.ohgiraffers.section01;

public class RabbitFarm <T extends Rabbit>{ //T는 Rabbit의 후손

    private T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) { //타입 제한을 안넣어서 모든 타입을 받을 수 있음
        this.animal = animal;
    }
}
