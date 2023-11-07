package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Rebaek2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //정수 N입력
        System.out.println("정수 N 입력 : ");
        int N = scanner.nextInt();
        //정수 X입력
        System.out.println("정수 X 입력 : ");
        int X = scanner.nextInt();
        //입력한 N의 길이만큼 배열A 생성
        int[] A = new int[N];
        System.out.println("배열에 값 입력 : ");
        //배열A에 값 입력
        for(int i = 0; i < A.length; i++){
            A[i] = scanner.nextInt();
        }

        //배열A의 값이 X보다 낮을때 출력
        //하나씩 비교해야되기 때문에 for문씀
        for(int i=0; i<A.length;i++){
            if(A[i]<X){
                System.out.print(A[i] + " ");
            }
        }
    }
}
