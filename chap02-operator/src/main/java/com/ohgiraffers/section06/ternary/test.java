package com.ohgiraffers.section06.ternary;

public class test {
    public static void main(String[] args){
        //시험과목 3개의 점수가 50,40,60이다 평균 40을 넘기면 합격 못넘기면 불합격 출력
        int q=50;
        int w=40;
        int e=60;
        double a= (q+w+e)/3;

        String result1 = (a >= 40)? "합격":  "불합격";
        System.out.println("결과는 " + result1);

        // A 마트의 이번 주 주류 판매 실적은 소주 :  45만원 , 맥주 : 35만원 , 와인 : 30만원 , 고량주 : 40만원 이다.

        // 마트의 주당 평균 총 매출이 140 만원일때

        // 그 주의 주류 별 평균 실적과 그 주의 총 매출을 정리하고(세금 10%),

        // 총 매출이 주당 평균 매출보다 높은지 나타내려고 한다.

        // 다음과 같은 양식을 가진다.

        // A마트 이번 주 주류 당 평균 실적은 ()만원이고, 세금을 제외한 총 매출은 ()만원이며 세금은 ()만원을 냈다.

        // 이번 주 총 매출은 평균 총 매출보다 높다/낮다. (삼항연산자 사용)

        int q1=450000;
        int q2=350000;
        int q3=300000;
        int q4=400000;

        // 승객 두명의 놀이기구 탑승 가능여부를 출력하는 코드를 만드시오.
        // 놀이기구 탑승 기준은 키가 120cm 이상이다.
        // 승객 두명의 키는 각각 113cm 와 127cm 이다.

        // 화면에 보여지는 양식은 다음과 같다.
        // 키카 113cm 이므로 탑승 불가능합니다.
        // 키가 127cm 이므로 탑승 가능합니다.

        // 조건
        // 삼항 연산자를 사용하시오
        int h1 = 113;
        int h2 = 127;
        String result2=(h1 > 120)? "가능":"불가능";
        String result3=(h2 > 120)? "가능":"불가능";

        System.out.println("키가 " + h1 + "cm 이므로 탑승" + result2 + "합니다.");
        System.out.println("키가 " + h2 + "cm 이므로 탑승" + result3 + "합니다.");

        //삼항연산자를 이용해 1이 4보다 작으면 바보 . 4보다 크면 천재를 출력
        int aa=1;
        String result4=(aa < 4)? "바보":"천재";
        System.out.println(result4);

        //1. ch1 = X, ch2 = Z 일때 그 값을 비교한 후 참이면 "참", 거짓이면 "거짓"으로 출력할 것
        char ch1 = 'X';
        char ch2 = 'Z';

        String result5=(ch1 == ch2)? "참":"거짓";

        System.out.println(result5);
        //2. 자신의 나이를 집어넣고 20 보다 작으면 미성년자, 20보다 높으면 성인이 출력되도록 한다
        int age = 24;

        String result6=(age < 20)? "미성년자":"성인";

        System.out.println(result6);
        //3.길동이의 첫달 월급은 100만원이다
        //   짝수달은 10프로 보너스를 받고, 홀수달은 15프로 보너스를 받는다
        //   길동이 연봉은?
        //출력 내용 = 길동이의 연봉은 XX만원입니다
        int q11=100;
        final double bonus1 = 1.10;
        final double bonus2 = 1.15;

        System.out.println("길동이의 연봉은" + (int)(((q11*bonus1)*6)+((q11*bonus2)*6)) + "만원입니다." );
        //1.
        //한 축구 구단의 직원 수는 약 1892명 이다.
        //올해에 리그에서 순위가 18위 이하로 나온다면 강등 되어서 직원수는 15% 감소하고, 18위 이하를 기록하지 않는다면 구단의 직원수는 15% 증가한다.
        //
        //구단의 직원들에게 설명하기 위해 삼항연산자를 활용해 작성해보자.
        //
        //구단은 기적적으로 17위를 기록하였는데, 이후의 구단 직원수도 구해보자.

        int s1=17;
        int s2=1892;
        final double p=1.15;
        final double m=0.85;

        String result7=(18>=s1)? "잔류":"강등";
        System.out.println(result7 + " ,직원수 : " + (int)(s2*p));

    }

}
