package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Baek4 {
    public static void main(String[] args){
        //9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
        //예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61
        //이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

        Scanner scanner = new Scanner(System.in);
        //9의 배열길이 만들기
        int[] arr = new int[9];
        //최댓값
        int max = 0;
        //몇번째
        int index = 0;
        //배열에 값 집어넣기
        for(int i=0;i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        //최댓값구하기
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
