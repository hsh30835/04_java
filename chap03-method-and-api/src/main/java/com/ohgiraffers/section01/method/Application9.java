package main.java.com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args){
        /*
        * 계산기 만들기
        * */
        int first = 100;
        int second = 50;

        int result = 0;
        Calculator cal = new Calculator(); //Calculator에서 가져올거임

        result=cal.minNumberOf(first,second);
        System.out.println(result);

        result = Calculator.maxNumberOf(first, second); //static
        System.out.println(result);
    }

}
