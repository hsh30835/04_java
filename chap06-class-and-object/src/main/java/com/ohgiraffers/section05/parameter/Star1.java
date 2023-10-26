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

        /*for(int i = 1; i < 2*N; i+=2) { //N에 5입력시 1,3,5,7,9로 5줄 반복함
            for(int j = 1; j < i; j+=2){ //
                System.out.print("@");
            }
            for(int j = 2*N; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
