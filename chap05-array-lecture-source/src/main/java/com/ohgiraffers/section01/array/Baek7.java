package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Baek7 {
    public static void main(String[] args){
        //세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
        //예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
        //첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다.
        //세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
        //과목개수 N입력하기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //N 범위 정하기
        if(N>1000){
            return;
        }
        //길이가 N인 배열 만들기
        int[] arr = new int[N];
        //최댓값
        int M = 0;
        //점수 입력하기
        for(int i=0;i< arr.length;i++) {
            //점수 범위 정하기
            if(arr[i]>0 && arr[i]<=100) {
                arr[i] = scanner.nextInt();
            }
        }
        System.out.println();
        //최댓값구하기
        for(int i=0;i< arr.length; i++){
            if(arr[i]>M){
                M = arr[i];
            }
        }
        System.out.println(M);
        //기존점수/최댓값 * 100

    }
}
