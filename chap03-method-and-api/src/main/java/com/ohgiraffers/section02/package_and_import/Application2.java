package main.java.com.ohgiraffers.section02.package_and_import; //패키지경로

import main.java.com.ohgiraffers.section01.method.Calculator; //import로 경로 설정을 미리해줌
import static main.java.com.ohgiraffers.section01.method.Calculator.maxNumberOf; //maxNumberOf가 있는 스태틱 메서드를 가져올것
//필수사항은 아님

public class Application2 {
    public static void main(String[] args){
        /* 임포트란?
        *  서로 다른 패키지에서 존재하는 클래스를 사용하는 경우 패키지명을포함한 풀 클래스 이름을 사용해야 한다
        *  하지만 매번 다른클래시의 패키지명을 기술하기에는 번거롭다.
        *  그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import구문이다.
        *  import는 package 선언문과 class 선언문 사이에 작성하며
        *  어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
        * */

        Calculator cal = new Calculator();
        int min = cal.minNumberOf(1,2);
        System.out.println(min);

        int max = Calculator.maxNumberOf(1,2);
        System.out.println(max);
    }
}
