package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application04 {
    public static void main(String[] args){
        //5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 만들어 주세요
        //5개의 배열만들기
        //숫자 입력하기
        //5명의 점수합 구하기
        //5명의 평균 구하기

        int[] num = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("5명 점수 입력");
        for(int i=0; i<num.length; i++){
            num[i] = scanner.nextInt();
        }
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        int num4 = scanner.nextInt();
//        int num5 = scanner.nextInt();

//        int sum = num1 + num2 + num3 + num4 + num5;
        int sum = 0;
        for(int i=0;i< num.length;i++){
            sum += num[i];
        }

        double a = sum/5;
        System.out.println("점수의 합" + sum);

        System.out.println("점수의 평균" + a);
    }
}
