package main.java.com.ohgiraffers.training1;

class Bird implements Animal{
    //Animal의 기능을 구현받는 Bird를 만듬
    // Bird만의 울음소리를 추가함
    public String cry; //울음소리를 선언하고

    public Bird(String cry) { this.cry = cry; } //울음소리를 생성함


    @Override
    public void eat() { //eat을 재정의한다
        System.out.println("발톱이나 부리로 사냥한다");
        return;
    }

    @Override
    public void move() { //move를 재정의한다
        System.out.println("날아다님");
    }
}
