package main.java.com.ohgiraffers.section05.parameter;

public class For {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j<i; j++){
                System.out.print("@");
            }
            for (int j = 9; j>i*2; j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
