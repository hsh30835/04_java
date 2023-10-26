package main.java.com.ohgiraffers.section05.parameter;

import java.util.Scanner;

public class Star {
    public static void main(String[] args){
        //https://mongte.tistory.com/5
        //추가로 정수 입력기능

        //정수 N 입력하기
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 입력");
        int N = scanner.nextInt();
        //별찍기
        //*
        //**
        //***
        //****
        //*****
        for (int i =1; i < N+1; i++) {
            for(int j =0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===");
        //별찍기 역으로
        //@@@@*
        //@@@**
        //@@***
        //@****
        //*****

        //@가 4가 나오고 *이 1이 나옴
        //@는 N-1부터 감소
        for (int i = 1; i < N+1; i++) {
            for(int j = N; j>i; j--){
                System.out.print("@");

        }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }System.out.println();
        }
        System.out.println("===");
        //*****
        //****
        //***
        //**
        //*

        //첫줄에 별을 N를 출력함
        //두번째 부터 별의 개수가 1씩 감소함
        //줄바꿈해줌
        for(int i=0; i<N; i++){
            for(int j=N; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===");
        //*****
        //@****
        //@@***
        //@@@**
        //@@@@*

        // 첫항 @ 0개 * 5개
        // 두번째 @+1 *-1
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++){
                System.out.print("@");
            }
            for (int j = N; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===");
        //@@@@*
        //@@@**
        //@@***
        //@****
        //*****

        // @는 N-1부터 1씩 감소
        // *은 1부터 N까지 1씩 증가

        for(int i=1;i<N+1;i++){
            for(int j=N; j>i; j--){
                System.out.print("@");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===");
        //@가 하나 더많음
        for(int i=0;i<N;i++){
            for(int j=N; j>i; j--){
                System.out.print("@");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
