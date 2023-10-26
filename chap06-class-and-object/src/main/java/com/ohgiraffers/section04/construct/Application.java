package main.java.com.ohgiraffers.section04.construct;

public class Application {
    public static void main(String[] args){
        /*
        * 생성자란?
        * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출된다.
        * 생성자 함수에 매개변수가 없는 생성자를 기본생성자(default contructor)라고하며,
        * 기본 생성자는 conpiler에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용하였다.
        * (인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 아무 것도 작성하지 않은 것이다.)
        * */

        //원시 자료형 == 기본자료형 == 프리미티브타입
        int a; //변수를 선언한다. 스택은 크기가 정해짐
        a=10; //a를 10으로 초기화 한다.
        System.out.println(a);
        //변수 == 주소 == 값

        //참조 자료형 == 레퍼런스 타입 == 사용자 정의
        User user; //변수를 선언한다. 크기가 정해지지 않았음
        // 변수 == 주소 == 속성
        //변수(주소값의 별칭)
        //heap영역은 주소의 크기를 측정할 수 없기에 변수 선언만 함
        //System.out.println(user.hashCode()); 에러남 틀만 만든거지 주소값이 존재하지 않음

        user = new User(); // 변수를 생성한다.

        User user1 = new User("sdf"); //만들어놓은 규칙이 꼭 필요할때 사용
        //System.out.println(user.hashCode()); 에러안남 만들어졌기 때문
        System.out.println();

    }
}
