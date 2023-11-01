package main.java.com.ohigiraffers.beak;

import java.util.Scanner;

public class Baek27866 {
    public static void main(String[] args) {
        //https://www.acmicpc.net/problem/27866
        //문제 : 단어
        //S와 정수 i가 주어졌을 때,
        //S의 i번째 글자를 출력하는 프로그램을 작성하시오.

        //첫째 줄에 영어 소문자와 대문자로만 이루어진 단어S가 주어진다. 단어의 길이는 최대 10000이다.
        //둘째 줄에 정수 i가 주어진다 1<=i<=S
        //ex) Sprout 3 r

        //문자열 입력기능 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String S = scanner.nextLine();
        //정수 i 입력기능 만들기
        System.out.println("정수 입력 : ");
        int i = scanner.nextInt();

        //단어의 최대길이 설정
        if(S.length()>10000){
            System.out.println("종료");
            return;
        }
        //정수 i의 범위 설정
        if((1>i) || (i>S.length())){
            System.out.println("범위 벗어남 종료");
            return;
        } else { //i가 범위 안이 맞으면 문자열을 추출한다
            System.out.println(S.charAt(i-1));
        }
    }
}
