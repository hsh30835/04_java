package com.ohgiraffers.section03.increment;

public class Application {
    public static void main(String[] args){

        //증감연산자에 대하여 공부하자
        /*
        *  ++ X / X ++ : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 증가시킨다.
        *  -- X / X -- : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 뺀다.
        * */
        int num = 5;
        System.out.println(num++);
        System.out.println(num++);
        System.out.println(num);
        System.out.println("===========");
        int num1 = 5;
        System.out.println(++num1);
        System.out.println(++num1);
        System.out.println(num1);
        System.out.println("===========");
        int n = 5;
        System.out.println(--n);
        System.out.println(n--);
        System.out.println(n);
    }
}
