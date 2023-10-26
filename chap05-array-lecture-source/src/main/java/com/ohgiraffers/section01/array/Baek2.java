package main.java.com.ohgiraffers.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Baek2 {
    public static void main(String[] args){
        //정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

        //정수N 입력하기
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 N 입력");
        int N = sc.nextInt();

        //정수 X 입력하기
        System.out.println("정수 X 입력");
        int X = sc.nextInt();

        //배열 A 만들기
        int[] A = new int[N];

        //수열 A에 값 입력하기
        for (int i = 0; i < N; i++) {
            System.out.println("값 입력");
            A[i] = sc.nextInt();
        }

        //정수 X와 수열A의 값 비교하고 출력하기
        for (int i = 0; i < N; i++) {
            if(A[i] < X){
                System.out.print(A[i] + " ");
            }

        }
    }
}
