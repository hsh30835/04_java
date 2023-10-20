package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Game {
    public void gameTest(){
        // up down 게임 만들기
        // 랜덤으로 생성된 수를 맞추는 게임입니다.
        // 랜덤으로 생성하는 수의 범위는 1~50 입니다.
        // 입력한 수가 랜덤으로 생성된 수보다 낮다면 "up",
        // 입력한 수가 랜덤으로 생성된 수보다 높다면 "down",
        // 입력한 수가 랜덤으로 생선된 수와 같다면 "정답"이 출력되어야 합니다.

        // 조건문과 반복문을 사용하세요.

        //숫자 하나를 입력한다
        //다른 숫자를 랜덤으로 생성한다 숫자의 범위는 n>=1 && n<=50
        //만약 num1<num2면 up 출력
        //아닐시 num1>num2면 down 출력
        //같을시 정답 출력
        //맞을때까지 해야됨
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력");
        int num1 = scanner.nextInt();

        System.out.println((int)(Math.random() * 50));

        if(num1>(int)(Math.random() * 50)){
            System.out.println();
        }

    }
}
