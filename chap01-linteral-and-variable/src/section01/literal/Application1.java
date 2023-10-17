package section01.literal;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        /*print는 화면출력 ln은 줄바꿈출력 f는 붙여서 출력*/
        /* 여러 가지 값의 형태를 출력할 수 있다.*/
        /*목차 1. 숫자 형태의 값*/
        System.out.println(123); // 정수형 리터럴(값 그자체)
        System.out.println(1.23); // 실수형 리터럴
        /* ; 붙이지않으면 에러뜸*/

        /*목차. 2.문자 형태의 값 출력*/
        System.out.println('a'); // 문자형 리터럴
        //System.out.println('ab'); '' 두 개 이상은 문자로 취급하지 않아 에러가 발생함
        System.out.println('1'); //문자
        System.out.println('a'+'3'); //a랑 3의 문자가 변환되서 출력됨

        /* 목차 3 문자열 형태의 값 출력*/
        //안녕하세요를 화면에 출력해주세요
        System.out.println("안녕하세요");
        //문자열은 "" 사용함

        /*목차 4. 논리 형태의 값 출력*/
        System.out.println(true);
        System.out.println(false);
        //불리언타입은 true, false만 나옴

        }
    }
