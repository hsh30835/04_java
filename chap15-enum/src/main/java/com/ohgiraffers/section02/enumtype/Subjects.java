package main.java.com.ohgiraffers.section02.enumtype;

public enum Subjects { //enum은 상수열거필드
    JAVA,ORACLE,JDBC, //엔터든 붙이든 상관없음 //enum필드는 기본생성자를 받고있음 그래서 기본생성자를 만들면 에러남
    //기본생성자를 만들려면 값을 넣어줘야함 JAVA(sdf)이런식으로
    HTML,
    CSS,
    JAVASCRIPT;

    private String value;


}
