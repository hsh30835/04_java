package main.java.com.ohgiraffers.section01.polymorphism;

public class Application02 {
    public static void main(String[] args){
        Animal[] animals = new Animal[5];
        animals[0] = new Rabit();
        animals[1] = new Tiger();
        animals[2] = new Rabit();
        animals[3] = new Tiger();
        animals[4] = new Rabit();

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry(); // 동적 바인딩
        }
        //Animal animal = animals[0,1,2,3,4]; 풀어쓰면 이럼
        for (Animal animal: animals) {
            if(animal instanceof  Rabit){
                ((Rabit) animal).jump();
            }else{
                ((Tiger) animal).bite();
            }
        }
    }
}
