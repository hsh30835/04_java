package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Baek3 {
    public static void main(String[] args){
        //N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

        //정수 N 입력
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 입력 ");
        int N = scanner.nextInt();
        //배열 선언하고 배열 안에 값을 넣어준다
        int[] arr = new int[N];
        System.out.println("값 입력 : ");
        for(int i=0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        //최댓값 최소값 구하기
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        System.out.println("최댓값 : " +max);
        System.out.println("최솟값 : " +min);

    }
}
