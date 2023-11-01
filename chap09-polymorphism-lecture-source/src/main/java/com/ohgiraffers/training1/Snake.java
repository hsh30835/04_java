package main.java.com.ohgiraffers.training1;

class Snake implements Animal{
    //Shape에서 기능을 구현해준다
    //Snake만이 가진 겨울잠을 추가한다
    public String hibernation; //겨울잠 추가

    public Snake(String hibernation) { this.hibernation = hibernation; }

    @Override
    public void eat() {
        System.out.println("몸으로 조여서 한번에 삼킨다");
    }

    @Override
    public void move() {
        System.out.println("기어다님");
    }
}
