package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Leapyear {
    public void leapYearTest(){
        /*연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
        윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
        1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
        하지만, 2000년은 400의 배수이기 때문에 윤년이다.*/

        // 연도를 입력하는 기능 만듬
        // if문으로 true일땐 1 아닐땐 0 출력
        // 연도%4==0 && 연도%100 != 0 || 연도%400 == 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("년도 입력");

        int result = scanner.nextInt();

        if((result%4 == 0) && (result%100 != 0) || (result%400 == 0)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
