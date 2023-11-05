package main.java.com.ohgiraffers.test2;

class Neutering extends Animal{ //Animal을 상속받음
    private String surgery; //Neutering에서 쓸 sugery변수를 추가함

    public Neutering(String name, int price, String food, String surgery) {
        super(name, price, food); //부모클래스의 변수라 super씀
        this.surgery = surgery;
    }

    public String getSurgery() {
        return surgery;
    }

    public void setSurgery(String surgery) {
        this.surgery = surgery;
    }
}
