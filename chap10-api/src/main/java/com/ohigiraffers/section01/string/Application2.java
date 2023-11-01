package main.java.com.ohigiraffers.section01.string;

import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args){
        /* 필기.
        * 이스케이프(escape) 문자
        * 문자열 내에서 사용하는 문자 중 특수문자를 표현하거나 특수기능을 사용할 때 사용하는 문자이다.
        * 이스케이프문자       의미
        *       \n      개행(줄바꿈)
        *       \t      탭
        *       \'      작은 따옴표
        *       \"      큰따옴표
        *       \\      역슬래쉬 표시
        * */

        /*
        * 문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
        * split() : 정규 표현식을 이용하여 문자열을 분리한다.
        *           비정형화된 문자열을 분리할 때 좋지만 (공백 문자열 값 포함)
        *           정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
        *           정규표현식은 자바에서 다루지 않고 자바스크립트에서 다룰 예정이다.
        * StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
        *                   정형화된 문자열 패턴을 분리할 때 사용하기 좋다. (공백 무시)
        *                   split()보다 속도면에서 더 빠르다.
        *                   구분자를 생략하는 경우 공백이 기본 구문자이다.
        * */
        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";
        String emp3 = "300/이순신/경기도/";

        String[] emp1Arr = emp1.split("/");
        String[] emp2Arr = emp2.split("/");
        String[] emp3Arr = emp3.split("/");
        for (String emp : emp1Arr){
            System.out.println(emp);
        }

        for (String emp:emp2Arr){
            System.out.println(emp);
        }

        for (String emp:emp3Arr){
            System.out.println(emp);
        }

        /*
        * 마지막 구분자 사이에 값이 존재하지 않는 경우 이후에도 값도 추출하고 싶을 때
        * 몇 개의 토큰으로 분리할 것인지 한계치를 두 번째 인자로 넣을 수 있다.
        * */
        System.out.println("-------------");
        String[] arrArr3 = emp3.split("/",-1);
        int i = 0;
        for(String emp : arrArr3){
            System.out.println(i+"번째 인덱스 " +emp);
            i++;
        }

        StringTokenizer st1 = new StringTokenizer(emp3,"/");
        while (st1.hasMoreTokens()){
            System.out.println("st1 : " + st1.nextToken());
        }

        String colorStr = "red*orang#blue/yellow green";
//        String[] colorArray = colorStr.split("/#* ");
//
//        for(String color : colorArray){
//            System.out.println(color);
//        }

        String[] colors = colorStr.split("[*#/ ]");
        for (String color: colors){
            System.out.println(color);
        }

    }
}
