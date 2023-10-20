package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;
public class A_if {
    public void testSimpleIfstatement(){
        /*
        * [if문 표현식]
        * if(조건){
        * 조건이 참일 경우 실행할 내용
        * }
        *
        * 조건식이 : 참 혹은 거짓이 나오는 연산식을 조건식이라고 한다.
        * if 문은 조건식의 결과 값이 참이면 {} 안에 있는 코드를 실행하고
        * 조건식의 결과 값이 거짓이면 {} 안의 내용을 무시한다.
        *
        * 정수를 한개 입력 받고 그 수가 짝수인지 아닌지 검사하는 프로그램을 만들어 보자
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 한개를 입력하세요 : ");
        int num = sc.nextInt();
        if((num%2)==0){
            System.out.println("입력한 숫자는 짝수입니다");

        }

        System.out.println("프로그램 종료");
    }

    public void testNestedIfstatment(){
        /*
        * 중첩된 if 문 실행 흐름 확인
        *
        * 정수 한개를 입력받아 그 수가 양수인 경우에만 짝수인지를 확인하고
        * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다."라고 출력을 한다.
        * 그외 둘 중 하나라도 아니면 프로그램을 종료한다.
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 한개를 입력해주세요 : ");
        int num = scanner.nextInt();
        //양수, 0, 음수 3가지 조건이있음
        //양수인지 확인
        //if문만 계속쓰면 연산을 계속 해줘야됨
        if(num > 0){
            //짝수 판단
            if(num % 2 == 0) {
                System.out.println("양수이면서 짝수 입니다.");
            }else{ //else는 위에서 하나라도 참이면 다음조건 실행안함
                System.out.println("양수이면서 홀수 입니다.");
            }
        }else if(num <0){
            System.out.println("음수 입니다.");
        }else{
            System.out.println("0 입니다.");
        }
    }
}
