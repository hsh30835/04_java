package main.java.com.ohgiraffers.beak;

import java.util.Scanner;

public class Baek {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //입력받은 수 만큼 더하기를 한다
        //A와 B는 0<A,B<10이다
        int count = scanner.nextInt();
        for(int i=0; i<count; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A+B);
        }

    }
}
