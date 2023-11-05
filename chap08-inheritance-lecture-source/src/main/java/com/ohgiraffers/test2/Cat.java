package main.java.com.ohgiraffers.test2;

class Cat extends Neutering implements Toy{ //Neutreing클래스를 상속받고 Toy에 인터페이스를 받음

    private String nocturnal; //수술여부 변수 생성

    public Cat(String name, int price, String food, String surgery, String nocturnal) {
        super(name, price, food, surgery); //조상클래스에 있는건 super를 써야됨
        this.nocturnal = nocturnal;
    }

    public String getNocturnal() {
        return nocturnal;
    }

    public void setNocturnal(String nocturnal) {
        this.nocturnal = nocturnal;
    }

    @Override
    public String toString() { //cat.toString()의 내용물을 return값으로 출력할 것이다
        return "고양이";
    }

    @Override
    public String toy() { //toy인터페이스의 장난감의 이름을 return값으로 출력한다
        return "낚시대";
    }

    @Override
    public int toyPrice() { //toy인터페이스의 장난감 가격을 return값으로 출력한다
        return 4000;
    }
}
