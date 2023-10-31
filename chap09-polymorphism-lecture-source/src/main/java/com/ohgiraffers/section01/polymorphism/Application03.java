package main.java.com.ohgiraffers.section01.polymorphism;

public class Application03 {
    public static void main(String[] args){
        Animal animal = new Rabit();
        Animal animal1 = new Tiger();

        // Animal animal = animal; // Rabit
        Application03.feed(animal);
        Application03.feed((animal1));

        Rabit rabit = new Rabit();
        Tiger tiger = new Tiger(); //heap영역에 생성자를 호출함
        //Animal animal2 = rabit 과 같음
        feed(rabit);
        feed(tiger);

        feed(new Tiger());
        feed(new Rabit());
    }

    public static void feed(Animal animal){
        animal.eat();
    }
}
