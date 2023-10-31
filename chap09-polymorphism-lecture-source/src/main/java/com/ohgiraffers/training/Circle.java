package main.java.com.ohgiraffers.training;

class Circle implements Shape{ //Shape 클래스에서 값을 가져옴
    private double radius; // Circle에서 쓸 radius를 생성함


    public Circle(double radius){
        this.radius = radius;
    }
     @Override
     public double calculateArea() {
         return Math.PI * radius * radius;
     } //calculateArea 메서드를 재정의함

     @Override
     public double calculatePerimeter() {
         return 2 * Math.PI * radius;
     } //calculatePerimeter 메서드를 재정의함
}
