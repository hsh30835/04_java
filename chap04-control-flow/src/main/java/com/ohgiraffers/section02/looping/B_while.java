package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {
    public void testSimpleWhileStatement() {
        /*
         * [while 표현식]
         * while(조건식){
         *
         * }
         * for문은 일반적으로 반복 횟수를 알 때 쓰고 while은 모를 때 쓴다
         * */

        Scanner scanner = new Scanner(System.in);
        /* String value = scanner.nextLine();

        int i = 0;
        //"1234567890".charAt(4); //실행시5나옴 문자배열로 취급함
        while (i <= value.length()){
            i++;
            if(i%2 == 0){
                continue; //컨티뉴는 건너뛰기
            } else if(i == 11){
                break;
            }
            System.out.println(i);
        } */

        boolean isTrue = false;
        /*
         * do while[표현식]
         * do{
         *
         * } while(조건식);
         * */
        do {
            System.out.println("메뚜기 월드 게임");
            System.out.println("시작을 원하면 true, 원하지 않으면 false를 입력해주세요");
            isTrue = scanner.nextBoolean();
        } while (isTrue);


    }

    public void doWhileTest() {
        /*do while을 이용하여 사용자에게 1단부터 n단 까지 출력하는 구구단 프로그램을 보여줍니다.
         * 프로그램은 다음과 같습니다
         * EX)사용자 입력 값이 6이라면 1~6단 까지의 단을 출력해주세요
         * 1*1=1;
         * .
         * .
         * 1*9=9;
         * 2*1=2;
         * ...
         * 6*9=54;
         * !중첩 반복문을 사용해야 함
         * */

        // n단에 넣을 숫자를 입력한다
        // 1부터 9까지 하나씩 증가하는 구구단을 만든다
        // 숫자 1부터 9까지 하나씩 올라가는 두 정수를 만든다
        // n단까지 실행해야한다
        // n단이 넘어서면 실행을 종료한다

        int num1 = 1;
        int num2 = 2;
        int num3 = 1;
        System.out.println("숫자 입력 : ");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(num2 + " * " + num3 + " = " + (num2 * num3));
            num2++;
        } while (num2 < 10);


    }
}
