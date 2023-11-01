package main.java.com.ohigiraffers.beak;

import java.util.Scanner;

public class Baek2444 {
    public static void main(String[] args) {
        //https://www.acmicpc.net/problem/2444
        // 마름모 별찍기
        // 범위 1<=N<=100
        // 2N-1

        Scanner scanner = new Scanner(System.in); //정수N 입력하는기능 만들기
        System.out.println("정수 입력 : ");
        int N = scanner.nextInt();

        if ((1 > N) || (N > 100)){ //정수N의 범위 지정하기 1<= N <= 100
            System.out.println("범위를 벗어남");
            return;
        } else {
            for (int i = 0; i<N; i++){ //N줄 만들기
                for (int j = N-1; j > i; j--){ //4 3 2 1 0 공백칸 만들기
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i+1; j++){ //1 3 5 7 9 별칸 만들기
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i<N; i++){ //N-1줄 만들기
                for (int j=0; j<i; j++){ //1 2 3 4 공백칸 만들기
                    System.out.print(" ");
                }
                for (int j=2*N-1; j>2*i; j--){ //7 5 3 1 별칸 만들기
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
