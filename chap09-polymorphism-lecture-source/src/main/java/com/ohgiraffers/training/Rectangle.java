package main.java.com.ohgiraffers.training;

class Rectangle implements Shape{ //Shape에서 가져옴
    private double width; //width를 선언함
    private double height; //height를 선언함

    public Rectangle(double width, double height){ //생성함
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    } //calculateArea를 재정의함

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    } // calculatePerimeter를 재정의함

}
