package section03.constamt;

import section01.literal.Application2;

public class Application01 {
    /*public은 접근자 class는 접근방식 Application1은 이름*/
    //public String date; 빌드변수
    //void는 반환타입이 없음 String은 문자열 []배열 String[]은 문자열배열
    public static void main(String[] args){ //메인메서드 프로그램 실행시킴 다른거로 바꾸면 실행안됨
        /*Application2 application2 = new Application2();
        application2.main(); 스태틱필드라 Application2에서 application2를 꺼내옴*/

        /*String[] a = new String[]{"",""};

        application2.main(a);

        Application2.main(a);*/

        /*
        * 상수란?
        * 변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면, 상수는 이와 상반되는 개념이다.
        * 변하지 안흔 값을(고정된 값)을 저장해두기 위한 메모리상의 공간을 상수라고 한다.
        *
        * 상수의 사용목적
        * 변경되지 않는 고정된 값을 지정할 목적으로 사용한다.
        * 초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다.
        *
        * 사용방법
        * 1. 상수를 선언한다.(변수 선언과 유사하지만 final 키워드를 사용함)
        * 2. 값을 초기화한다. (초기화 이후에는 값 변경 불가능)
        * 3. 필요한 위치에 상수를 호출해서 사용한다
        * */
        //상수는 선언시에 fianl 키워드를 붙인다.
        //암묵적인 개발자 들의 규칙으로 상수는 일반 변수와 구분하기 위하여 대문자로 작성한다.
        final int AGE;

        //상수 필드 초기화

        AGE = 10;
        //AGE = 30; //초기화 이후 상수의 값은 변경할 수없기 때문에 에러가 발생된다.
        System.out.println("Age의 값 : " + AGE);
        //필요시 연산식에 호출해서 사용가능
        System.out.println("AGE의 두배의 값 : " + (AGE*2));

        //대입 연산시 활용
        int sum = AGE;
        /*id나 비밀번호같이 변하지않는 기본값들은 상수필드로 들어감*/






    }
}
