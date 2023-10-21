package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Login {
    public static void main(String[] args){
        /*
        * 아이디와 비밀번호를 입력해서
        정해진 아이디와 비밀번호가 둘 다 일치시 로그인성공
        아이디 틀렸을시 아이디 틀림
        비밀번호 틀렸을시 비밀번호 틀림
        */


        Scanner scanner = new Scanner(System.in);
        System.out.println("아이디 입력 : ");
        String id = scanner.nextLine();

        System.out.println("비밀번호 입력 : ");
        String ps = scanner.nextLine();


        if(id.equals("qwe123")){
            if(ps.equals("asd123")){
                System.out.println("로그인 성공");
            } else{
                System.out.println("비밀번호 틀림");
            }

        }else{
            System.out.println("아이디 틀림");
        }
    }
}
