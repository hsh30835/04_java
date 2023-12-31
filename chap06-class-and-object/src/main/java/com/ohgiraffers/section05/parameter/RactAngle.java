package main.java.com.ohgiraffers.section05.parameter;

public class RactAngle {
    private double width;
    private double height;

    public RactAngle(){
        //밑의 RactAngle과 같은건데 시그니쳐가 다름
    }
    public RactAngle(double width, double height) { //생성자의 특징은 반환타입이 없고 클래스 이름을 그대로 따라감
        this.width = width;
        this.height = height;
    }
    //기본생성자를 만들고 getter setter를 만듬

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calcArea(){
        double area = width * height;
        System.out.println("사각형의 넓이는 " + area);
    }

    public void calcRound(){
        double area = (width + height) * 2;
        System.out.println("사각형의 둘레는 " + area + "입니다.");
    }

    @Override
    public String toString() {
        return "RactAngle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
