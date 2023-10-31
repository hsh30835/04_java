package main.java.com.ohgiraffers.training;

public interface Shape { //Circle과 Rectangle이 공통적으로 쓸 변수들을 생성
    double calculateArea(); // 모든 구현 클래스는 면적을 계산하는 메소드를 제공해야 합니다.

    double calculatePerimeter(); //모든 구현 클래스는 둘레를 계산하는 메소드를 제공해야 합니다.

}
