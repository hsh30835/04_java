package main.java.com.ohgiraffers.test2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        System.out.println("무엇을 살지 생각중");

        Dog dog = new Dog("댕댕이",15000,"사료","중성화 안함","하루 2번");
        Cat cat = new Cat("꼬망이",20000,"참치캔","중성화 함","밤에 활발함");
        Fish fish = new Fish("구피",5000,"떡밥","어항","20일에 한번");
        Parrot parrot = new Parrot("페라페",10000,"열매","새장","가끔 따라함");
        System.out.println("목록 : " + dog.toString() + "," + cat + "," + fish + "," + parrot);

        System.out.println("장난감의 정보");
        System.out.println("개 : " + dog.toy() + " 이고 " + dog.toyPrice() + "원이다.");
        System.out.println("고양이 : " + cat.toy() + " 이고 " + cat.toyPrice() + "원이다.");
        System.out.println("새 : " + parrot.toy() + " 이고 " + parrot.toyPrice() + "원이다.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("내가 가진 돈은 얼마 : ");
        int money = scanner.nextInt();

        if(money >= 50000){
            System.out.println("그정도 돈 없음");
            return;
        } else if(money <= 0){
            System.out.println("돈이나 벌어라");
            return;
        }

        if(money >= dog.getPrice() + dog.toyPrice()){
            System.out.println("개와 장난감 모두 구매 가능");
        } else if (money >= dog.getPrice()){
            System.out.println("개는 가능하지만 장난감은 구매 불가능");
        } else {
            System.out.println("모두 구매 불가능");
        }

        if(money >= cat.getPrice() + cat.toyPrice()){
            System.out.println("고양이와 장난감 모두 구매 가능");
        } else if (money >= cat.getPrice()){
            System.out.println("고양이는 가능하지만 장난감은 구매 불가능");
        } else {
            System.out.println("모두 구매 불가능");
        }

        if(money >= parrot.getPrice() + parrot.toyPrice()){
            System.out.println("앵무새와 장난감 모두 구매 가능");
        } else if(money >= parrot.getPrice()){
            System.out.println("앵무새는 가능하지만 장난감은 구매 불가능");
        }

        if(money >= fish.getPrice()){
            System.out.println("물고기 구매 가능");
        } else {
            System.out.println("물고기 구매 불가능");
        }

        System.out.println("내가 고른것은 : ");
        String select = scanner.next();
        System.out.println(select + " 입니다.");

    }
}
