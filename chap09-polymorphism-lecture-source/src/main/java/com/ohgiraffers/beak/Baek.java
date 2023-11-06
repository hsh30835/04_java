package main.java.com.ohgiraffers.beak;

import java.util.Scanner;

public class Baek {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //정수의 개수 N 입력하기
        //입력한 정수 출력하기
        //입력한 정수v가 몇개인지 찾기
        int count = 0; //카운트해줄 변수
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] arr = new int[N]; //배열 선언

        for(int i=0; i<N; i++){ //N의 길이만큼 배열만들고 값 입력하기
            arr[i] = scanner.nextInt();
        }

    }
}
