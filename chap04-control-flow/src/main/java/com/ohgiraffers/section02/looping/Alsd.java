package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Alsd {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M >= 45){
            M = M - 45;
            System.out.println(H + " " + M);
        }else{
            if(H==0){
                H = 23;
                M = M + 15;
                System.out.println(H + " " + M);
            }else if(H != 0){
                H = H - 1;
                M = M + 15;
                System.out.println(H + " " + M);
            }
        }

    }
}
