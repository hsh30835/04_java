package main.java.com.ohigiraffers.beak;

import java.util.Scanner;

public class Baek9086 {
    public static void main(String[] args) {
        //https://www.acmicpc.net/problem/9086
        //문제 : 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
        //입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다.
        //문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.

        //정수T 입력기능 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        int T = scanner.nextInt();
        //정수T의 범위지정하기
        if((1>T) || (T>10)){
            System.out.println("종료");
            return;
        }else {
            //T의 길이만큼 배열생성
            String[] arr = new String[T];
            //문자열 T만큼 배열에 입력하기
            for(int i=0; i<arr.length; i++){
                System.out.println("문자열 입력 : ");
                arr[i]=scanner.next();
            }
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i].charAt(0)); //입력받은 문자열 첫자리 출력
                System.out.println(arr[i].charAt(arr[i].length()-1)); //입력받은 문자열 마지막 자리 출력
            }

        }

    }
}
