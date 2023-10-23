package main.java.com.ohgiraffers.section04.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Baek1 {
    public static void main(String[] args) {
        //N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
        //첫째 줄에 행렬의 크기 N 과 M이 주어진다.
        //둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
        //이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
        //N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
        //첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

        //정수 N과 M입력칸 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 N 입력 : ");
        int N = scanner.nextInt();
        System.out.println("정수 M 입력 : ");
        int M = scanner.nextInt();
        //A,B 이중배열 만들기
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        if ((N>100) && (M >100)){
            System.out.println("재입력");
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("A의 " + i + "행 " + j + "열의 숫자를 기입하세요 : ");
                int putA = scanner.nextInt();

                A[i][j] = putA;

                System.out.println("B의 " + i + "행 " + j + "열의 숫자를 기입하세요 : ");
                int putB = scanner.nextInt();

                B[i][j] = putB;
            }

        }

        System.out.println(Arrays.deepToString(A));
        System.out.println(Arrays.deepToString(B));

    }
}
