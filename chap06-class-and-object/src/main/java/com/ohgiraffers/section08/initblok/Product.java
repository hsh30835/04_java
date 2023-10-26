package main.java.com.ohgiraffers.section08.initblok;

public class Product {
    private String name;
    private int price;
    private static String brand;

    // 인스턴스 초기화 블럭
    {
        name = "사이언";
        price = 100000;
        brand = "사과";
    }

    //static 블럭은 초기값을 넣어야할때 사용함
    static {
        //name = "손오공";
        //price = 10000;
        brand = "드래곤볼";
    }

}
