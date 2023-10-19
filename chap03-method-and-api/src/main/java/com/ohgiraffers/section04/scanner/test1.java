package main.java.com.ohgiraffers.section04.scanner;
import java.util.Scanner; //import로 경로설정
public class test1 {
    public static void main(String[] args){
        /*
         * 식당에서 스파게티, 햄버거, 스테이를 주문하고 맛있게 먹었다.
         * 계산은 직접 가격을 입력하면 팁 20%가 추가된 최종 가격을 출력하는 기계에서 한다.
         * 음식의 가격을 직접 입력하면 최종 가격이 나오는 코드를 짜보자.
         * 1. Scanner 활용
         * 2. 계산식은 Quiz_Static 클래스에 입력하고  메인 클래스에 static 메소드를 호출하라
         * 출력화면은 "음식1 가격은?" -> "음식2 가격은?" -> "음식3 가격은?" -> "택스 포함 최종 가격은 —원 입니다."
         */
        Scanner sc  = new Scanner(System.in);

        System.out.println("스파게티 가격은?");
        int num1 = sc.nextInt(); //num1이라는 정수형 변수를 입력함
        System.out.println("햄버거 가격은?");
        int num2 = sc.nextInt();
        System.out.println("스테이크 가격은?");
        int num3 = sc.nextInt();

        int totalPrice;
        double tax = 1.2;
        double won;

        totalPrice = Quiz_Static.totalPrice(num1, num2, num3); //Quiz_Static클래스의 totalPrice라는 메소드가있음
        won = Quiz_Static.won(totalPrice, tax); //Quiz_Static클래스의 won 메소드가있음

        System.out.println("팁 포함 최종 가격은: " + won + "원 입니다.");
    }


    }
