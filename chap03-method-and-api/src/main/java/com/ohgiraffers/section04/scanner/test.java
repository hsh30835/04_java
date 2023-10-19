package main.java.com.ohgiraffers.section04.scanner;

import main.java.com.ohgiraffers.section01.method.Application5;

import java.util.Scanner;

public class test {
    public static void main(String[] args){

        //test라는 클래스 안에서 ts라는 변수명을 만들어서 test의 정보를 담음
        //public int cal()는 생성만 되고 선언은 안돼서
        //선언할수 있게 만듬
        Scanner sc = new Scanner(System.in);//클래스로부터 기능을 제공받음

        System.out.println("일 식비가 어떻게 되나요?(금액만 입력해 주세요.)");
        int calc = sc.nextInt(); //nextInt(): 입력한값이 int로 나옴

        //int ans = ts.cal(); //입력하는 칸


        test qs = new test();
        String result = qs.result(calc);
        System.out.println(result);

    }

    public String result(int calc){ //cal()메소드 생성
        return (calc > 10000)? "과소비된 식비" : (calc > 5000)? "검소한 식비" : "굶는 중";


        //입력한 ans가 만보다 크다면 과소비된 식비, 그렇지 않으면 검소한 식비, 5000보다 낮으면 굶는 중 출력
        //입력은 숫자로 하지만 나오는 문구가 문자열이기 때문에 String을 씀



         //calc에 반환한다 다끝나면 int ans = ts.cal();로 넘어감
    }
}
