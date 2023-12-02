package main.java.com.ohgiraffers;

import java.util.Scanner;

public class Baek {
    public static void main(String[] args){
        //테스트할 T 입력
        //a와 b를 입력받아 a^b하기
        //일의 자리수 출력 a^b%10
        //승은 Math.pow(a,b)
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 0; i<T;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println((long) Math.pow(a,b)%10);
        }
    }
}
