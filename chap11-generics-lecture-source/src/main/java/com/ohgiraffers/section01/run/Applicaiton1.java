package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.*;

import javax.xml.datatype.Duration;
import java.util.ArrayList;
import java.util.List;

public class Applicaiton1 {
    public static void main(String[] args){


//        RabbitFarm<Animal> farm1 = new RabbitFarm<>(); //Animal은 Rabbit의 부모라안됨 T는 Rabbit의 자식
//        RabbitFarm<Rabbit> farm = new RabbitFarm<>(); //T가 Rabbit을 상속받기에 가능
//        RabbitFarm<Mammal> = new RabbitFarm<>();
//        RabbitFarm<Snake> = new RabbitFarm<>(); //아예 관련이 없음
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();
//        RabbitFarm<?> farm7 = new RabbitFarm(); //?는 무슨타입이 들어갈지 모른다
//        farm7.setAnimal(new Snake());
//        Rabbit test = new Rabbit();
        farm4.setAnimal(new Rabbit());
        ((Rabbit)farm4.getAnimal()).cry(); //farm4는 제네릭스 //타입을 꺼내야 타입이생김 //제네릭스타입은 타입이 동적으로 결정되는것
//        Object test = new Object(); //test는 오브젝트
//        ((Rabbit)test).cry();

        // Rabbit의 후손 타입만 허용할 수 있도록 제네릭스의 제한을 걸어 두었기 때문에
        // <T extends Rabbit> 형변환이 생각가능하다.
        // 이유 T이 결정되어도 T의 값은 Rabbit의 후손일 것이기 때문에
        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        ((Bunny) farm6.getAnimal()).cry();

        List<? super Rabbit> parents = new ArrayList<>();
        parents.add(new Rabbit());

    }
}
