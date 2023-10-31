package main.java.com.ohgiraffers.training1;

class Bird implements Animal{
    //Animal의 기능을 구현받는 Bird를 만듬
    // Bird만의 울음소리를 추가함
    private String cry; //울음소리를 선언하고

    public Bird(String cry) { this.cry = cry; } //울음소리를 생성함


    @Override
    public String eat() {
        System.out.println("짹짹");
        return null;
    }

    @Override
    public String move() {
        return null;
    }
}
