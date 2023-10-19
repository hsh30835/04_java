package main.java.com.ohgiraffers.section01.method;

public class Application1 { //클래스
    public static void main(String[] args){ //메소드 //static은 메모리에 미리 생성함
        /*
        * 메소드란?
        * 메소드(mathod)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */

        System.out.println("main()메서드 시작됨.");
        //새로운 함수를 만든다.
        //메서드 a 일회성으로 외부의 메서드a를 실행시키고 소멸함
        Application1 app1; // 메모리에 공간 확보
        app1 = new Application1(); //app1에 가진 Application()이 가진 속성을 생성함
        //Application1의 데이터를 app1이 가질수 있음
        app1.methodA(); //methodA를 호출함
    }

    //메서드 a
    //public은 모두가 공통되게 쓸수있음 void는 반환타입 methodA()는 함수이름 ()안에 데이터타입을 명시해야됨 안하면 아무것도 안함
    //static이 없으면 선언만 한거지 생성한건 아님
    public void methodA(){
        System.out.println("methodA() 호출.");

        methodB();

        System.out.println("methodA() 종료.");
    } //메서드를 정의한다

    public void methodB(){
        System.out.println("methodB 호출.");

        methodC();
        System.out.println("methodB 종료.");
    }

    public void methodC(){
        System.out.println("methodC 호출");
        System.out.println("methodC 종료");
    }
}
