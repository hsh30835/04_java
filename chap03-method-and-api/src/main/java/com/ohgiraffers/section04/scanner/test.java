package main.java.com.ohgiraffers.section04.scanner;

import main.java.com.ohgiraffers.section01.method.Application5;

import java.util.Scanner;

public class test {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);//클래스로부터 기능을 제공받음

        System.out.println("일 식비가 어떻게 되나요?(금액만 입력해 주세요.)");
        int calc = sc.nextInt(); //nextInt(): 입력한값이 int로 나옴


        test qs = new test(); //test클래스에서 qs를 가져와 test정보를담음
        String result = qs.result(calc); //result메소드를 선언함
        System.out.println(result);

    }

    public String result(int calc){ //result메소드 생성 int calc의 정보를 끌어옴
        return (calc > 10000)? "과소비된 식비" : (calc > 5000)? "검소한 식비" : "굶는 중";
        //calc이 10000을 초과하면 과소비된 식비 그렇지않으면 검소한 식비 만약 5000보다 낮으면 굶는 중 출력

    }
}
