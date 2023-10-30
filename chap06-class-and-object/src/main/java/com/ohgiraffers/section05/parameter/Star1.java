package main.java.com.ohgiraffers.section05.parameter;

import java.util.Scanner;

public class Star1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 입력");
        int N = scanner.nextInt();
        //*
        //**
        //***
        //****
        //*****
        //****
        //***
        //**
        //*

        // *이 1부터 N까지 1씩 증가하기
        // 이후 *이 N-1부터 1까지 1씩 감소하기
        for(int i=1; i<=N; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=N-1; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //*****
        //****
        //***
        //**
        //*
        //**
        //***
        //****
        //*****
        System.out.println("===");
        // *이 N부터 1씩 감소함
        // *이 1부터 N까지 1씩 증가함
        for(int i=0; i<N-1; i++){
            for(int j=N; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =1; i < N+1; i++) {
            for(int j =0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //    *
        //   ***
        //  *****
        // *******
        //*********
        System.out.println("===");
        // 공백은 4 3 2 1
        //*은 홀수개 1 3 5 7 9 (2n+1)


        for(int i=0; i<N; i++){
            for(int j=N; j>i; j--){ //N인 공백칸 만들기
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){ //*홀수개로 찍기
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===");
        //*********
        // *******
        //  *****
        //   ***
        //    *

        // *가 9 7 5 3 1의 홀수로 되어있음
        // N에 5를 입력할것이기 때문에 조건을 2N-1로 잡고 0보다 클때 실행 점차 감소함
        // 공백칸은 0 1 2 3 4로 1씩 증가함
        for (int i = 0; i < N; i++) {
            for (int j = 0; j<i; j++){
                System.out.print("@");
            }
            for (int j=2*(N-i)-1;j>0;j--){
                //N이 5일시 j=9 i=0 j가 i보다 큰게 맞으니 실행
                //j가 1감소되서 8이나옴 i=2 맞으니 실행
                //j가 1감소되서 7이나옴 i=4 맞으니 실행
                //j가 1감소되서 6이나옴 i=6 틀림 실행안함
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("===");
        //    *
        //   ***
        //  *****
        // *******
        //*********
        // *******
        //  *****
        //   ***
        //    *

        //줄은 9줄 5줄까진 1 3 5 7 9의 별찍기
        //남은 4줄은 7 5 3 1의 별찍기
        //첫 공백은 4 3 2 1 0
        //다음 공백은 1 2 3 4

        for(int i = 0; i<N; i++){ //5줄만들기
            for(int j=N-1; j > i; j--){ //4 3 2 1 0의 공백칸만들기
                System.out.print(" ");
            }
            for(int j=0; j < 2*i+1; j++){ //1 3 5 7 9의 별찍기
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<N; i++){ //4줄 만들기
            for(int j=0; j<i; j++){ //1 2 3 4 공백만들기
                System.out.print(" ");
            }
            for(int j=2*N-1; j>2*i; j--){ //7 5 3 1 별찍기
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===");
        //***** *****
        //****   ****
        //***     ***
        //**       **
        //*         *
        //**       **
        //***     ***
        //****   ****
        //***** *****

        //9줄필요 5줄과 4줄로 나눔



        for (int i = 0; i < N; i ++){ //첫 5줄
            for (int j = N; j > i; j--){ //왼쪽에 5 4 3 2 1 *찍기함
                System.out.print("*");
            }
            for (int j = 0; j<2*i+1; j++){ //중앙 1 3 5 7 9 공백찍기함
                System.out.print(" ");
            }
            for (int j = N; j>i; j--){ //오른쪽 5 4 3 2 1 반대로 *찍기함
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < N; i++){ //두번째
            for(int j=0; j < i+1; j++){ //4줄 왼쪽 2 3 4 5 *찍기
                System.out.print("*");
            }
            for(int j=2*N-1; j > 2*i; j--){ //중앙 7 5 3 1 공백찍기
                System.out.print(" ");
            }
            for(int j=0; j < i+1; j++){ //오른쪽 1 2 3 4 5 반대로 *찍기
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
