package com.ohgiraffers.section02.assigment;

public class Application {
    public static void main(String[] args){
        /* 대입연산자와 산술 복합 대입 연산자
        *  '=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입한다.
        *  '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 대입한다.
        *  '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 대입한다.
        *  '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 대입한다.
        *  '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 대입한다.
        *  '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 대입한다.
        * */

        int num = 12;
        System.out.println("num : " + num);

        //sout 입력하면 System.out.println(); 나옴
        //3 증가
        num = num + 3;
        System.out.println(num);

        num += 3;
        System.out.println(num);

        num %= 2;
        System.out.println(num);

        System.out.println("============");
        int num1 = 10;
        num1 = num1 + 2;
        System.out.println(num1);
        num1+=2;
        System.out.println(num1);
        num1-=3;
        System.out.println(num1);
        num1*=4;
        System.out.println(num1);
        num1/=2;
        System.out.println(num1);
        num1%=7;
        System.out.println(num1);

    }
}
