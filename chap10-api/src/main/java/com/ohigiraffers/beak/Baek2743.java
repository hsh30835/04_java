package main.java.com.ohigiraffers.beak;

import java.util.Scanner;

public class Baek2743 {
    public static void main(String[] args) {
        //https://www.acmicpc.net/problem/2743
        //문제 : 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.

        //문자열 입력기능 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열 입력: ");
        String str = scanner.nextLine();

        //입력한 문자열의 길이 구하기
        System.out.println(str.length());
    }
}
