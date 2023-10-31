package main.java.com.ohgiraffers.training;

public class InterfaceExample {
    public static void main(String[] args){
        Shape circle = new Circle(5.0); //Circle에서 radius를 추가해서 값을 넣어줌
        Shape rectangle = new Rectangle(4.0,6.0); //Rectangle에서 width와 height를 추가해서 넣어줌

        //각각의 도형의 면적과 둘레를 계산하고 출력
        System.out.println("원의 면적: " + circle.calculateArea()); //circle의 calculateArea를 출력시킴
        System.out.println("원의 둘레: " + circle.calculatePerimeter()); //circle의 calculatePerimeter를 출력시킴

        System.out.println("사각형의 면적: " + rectangle.calculateArea()); //rectangle의 calculateArea를 출력시킴
        System.out.println("사각형의 둘레: " + rectangle.calculatePerimeter()); //rectangle의 calculatePerimeter를 출력시킴
    }
}
