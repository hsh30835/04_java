package main.java.com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args){
        /*
        * 두 수를 매개변수로 받아 더한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 함수
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 나눈 값을 반환하는 함수
        *
        * 메서드에서 반환한 값을 받아서 화면에 출력헤주세요
        * */
        Application7 app7 = new Application7();

        int a = 10;
        int b = 3;
        System.out.println(app7.methodA(a,b));
        System.out.println(app7.methodB(a,b));
        System.out.println(app7.methodC(a,b));
        System.out.println(app7.methodD(a,b));
    }

    public double methodA(double a,int b){
        return (a+b);
    }

    public int methodB(int a,int b){
        return (a-b);
    }

    public int methodC(int a,int b){
        return (a*b);
    }

    public int methodD(int a,int b){
        return (a%b);
    }
}
