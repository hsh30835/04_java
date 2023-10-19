package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력해주세요");
        String greeting = sc.nextLine(); //모든라인전부
        System.out.println(greeting);

        System.out.println("두번째 값을 입력해주세요");
        String greeting2 = sc.next(); //띄어쓰기를 기준으로 하나의 토큰을 만들고 맨 처음거만 출력
        System.out.println(greeting2);

    }
}
