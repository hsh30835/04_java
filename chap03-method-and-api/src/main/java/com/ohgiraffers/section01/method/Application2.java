package main.java.com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args){
        System.out.println("Application.main() 실행");
        Application2 app2 = new Application2();

        app2.methodA();
        app2.methodB();
        app2.methodC();
    }
    public void methodA() {
        System.out.println("A 호출");

        System.out.println("A 종료");
    }
    public void methodB() {
        System.out.println("B 호출");

        System.out.println("B 종료");
    }
    public void methodC() {
        System.out.println("C 호출");

        System.out.println("C 종료");
    }

}
