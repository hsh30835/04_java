package main.java.com.ohigiraffers.beak;

import java.util.Scanner;

public class Baek10988 {
    public static void main(String[] args) {
        //https://www.acmicpc.net/problem/10988
        //풀이 https://auyeol-coding.tistory.com/51
        //알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
        //팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
        //level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

        //문자열입력기능만들기
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String str = scanner.nextLine();

        int len = str.length(); //len은 str문자열의 길이
        int ans = 1; //맞으면 1이 나옴

        for (int i=0;i<len/2;i++){ //문자열의 절반만 비교해도 값은 동일함
            if(str.charAt(i) != str.charAt(len-1-i)) { //str.charAt(i)와 str.charAt(len-1-i)의 값이 같지 않으면
                ans = 0; //ans는 0이다
            }
        }
        System.out.println(ans);
    }
}
