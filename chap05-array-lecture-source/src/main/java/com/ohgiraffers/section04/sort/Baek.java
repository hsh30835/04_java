package main.java.com.ohgiraffers.section04.sort;

import java.util.Scanner;

public class Baek {
    public static void main(String[] args){
        //조규현의 좌표 x1,y1
        //백승환의 좌표 x2,y2
        //조규현이 계산한 류재명의 위치 r1
        //백승환이 계산한 류재명의 위치 r2
        //류재명이 있을수 있는 위치
        //첫줄에 테스트케이스의 개수 T가 주어진다
        //x1 y1 r1 x2 y2 r2를 입력한다
        //있을수 있는 위치가 무한대면 -1을 출력한다
        //-10000 <= x1,x2,y1,y2 <= 10000
        // 1<=r1,r2<=10000
        //(0,0) 13 (40,0) 37 반지름이 13인 0,0을 중심으로 잡는 원과 반지름이 37인 40,0을 중점으로 잡는 원
        //(0,0) 3 (0,7) 4 1
        //(1,1) 1 (1,1) 5 0
        //내접문제
        //r1 = 13 r2 = 37 x1과 x2의 길이 40 r1+r2>x2-x1, r2-r1<x2-x1 이러면 접점이 2개다
        //r1 = 3 r2 = 4 x1과 x2의 길이 0

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i=0;i<T;i++){
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int z1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int z2 = scanner.nextInt();
        }

    }
}
