package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Baek1 {
    public static void main(String[] args){
        //총 N개의 정수가 주어졌을때, 정수 v가 몇개인지 구하는 프로그램을 작성하시오.
        //첫째 줄에 정수의 개수 N(1<=N<=100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어졌다.
        //셋째 줄에는 찾으려고 하는 정수가 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.


        //N의 값 입력하기
        // N의 범위 내면 실행하기
        //arr 배열에 집어 넣기
        //배열안에있는 정수중에서 정수v와 같은숫자가 몇개있는지 찾기


        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        int count = 0;


        if (N>=100 && N<=1) {
                System.out.println("재입력");
                return;
        }
        System.out.println("값 입력 : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("정수 입력 : ");
        int V = scanner.nextInt();
        for(int i=0; i< arr.length; i++){
            if(arr[i] == V){
                count ++;
            }
        }
        System.out.println(count);

    }
}
