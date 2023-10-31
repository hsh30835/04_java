package main.java.com.ohgiraffers.section02;

public abstract class Product {
    public Product(){

    }

    public void nonStaticMethod(){
        System.out.println("Product 클래스의 NonStaticMethod를 호출함");
    }
    public static void staticMethod(){
        System.out.println("Product 클래스의 static Method");
    }

    //재정의를 안하면 작동을 안하게끔
    public abstract void abstractMethod();
}
