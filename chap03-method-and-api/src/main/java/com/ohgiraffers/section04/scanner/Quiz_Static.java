package main.java.com.ohgiraffers.section04.scanner;

public class Quiz_Static {
    public static int totalPrice(int num1, int num2, int num3){ //int num1,2,3이 없으니 가져와줌
        return num1 + num2 + num3;
    }

    public static double won (int totalPrice, double tax) { //int totalPrice랑 double tax가 없으니 가져와줌
        return totalPrice*tax;
    }
}
