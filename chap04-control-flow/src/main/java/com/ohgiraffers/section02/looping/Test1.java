package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Test1 {
    public void drinkTset(){
        // 음료 계산
        // 자판기를 만들어보자.
        // 자판기가 파는 음료는 사이다(500)   콜라(600)   환타(700)   바카스(1000)  핫식스(1500)
        // 잘못된 음료수를 선택했을 때는 다시 받아야 한다.

        // 예시)
        // 계산을 입력하면 총 금액을 출력해야 한다.
        //음료를 선택해주세요 : 사이다
        //사이다를 선택하셨습니다.
        //계산하시겠습니까?(y/n)
        //n
        //음료를 더 선택해주세요.
        //몰라
        //잘못된 음료입니다. 다시 선택해주세요:
        //콜라
        //콜라를 선택하셨습니다.
        //계산하시겠습니까?(y/n)
        //y
        //총금액은 1100입니다.

    }
    public void gugudanTest(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        int n = scanner.nextInt();
        int i=0;
        if((n>=1) && (n<=9)) {
            for (i = 1; i < 10; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        }
    }
}
