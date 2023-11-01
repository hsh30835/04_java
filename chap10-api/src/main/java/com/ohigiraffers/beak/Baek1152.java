package main.java.com.ohigiraffers.beak;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek1152 {
    public static void main(String[] args){
        //https://www.acmicpc.net/problem/1152
        //문제 : 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까?
        //이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

        //문자열 입력기능 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String str = scanner.nextLine();

        //문자열을 구분하는 기능 만들기
        StringTokenizer st = new StringTokenizer(str);

        System.out.println(st.countTokens()); //문자열 개수를 출력하기
    }
}
