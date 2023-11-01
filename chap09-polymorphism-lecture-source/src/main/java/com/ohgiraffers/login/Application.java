package main.java.com.ohgiraffers.login;

import main.java.com.ohgiraffers.login.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.login.auth.impl.KakaoAuth;
import main.java.com.ohgiraffers.login.auth.impl.NaverAuth;
import main.java.com.ohgiraffers.login.dto.MemberDTO;
import main.java.com.ohgiraffers.login.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        MemberService memberService; //

        do{
            MemberDTO memberDTO = new MemberDTO(); //사용자 인증한걸 계속 초기화 해줄려고 반복문 안에 넣음
            System.out.println("-------사용자 인증 프로그램입니다.-----");
            System.out.println("1. google 로그인");
            System.out.println("2. naver 로그인");
            System.out.println("3. kakao 로그인");
            System.out.println("9. 프로그램 종료");
            System.out.println("로그인 한 인증 수단을 선택해주세요.");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            scanner.nextLine();
            System.out.println("아이디를 입력해주세요 : ");
            memberDTO.setId(scanner.nextLine());
            System.out.println("비밀번호를 입력해주세요 : ");
            memberDTO.setPass(scanner.nextLine());

            boolean result;
            String type;

            switch (choice){
                case 1 : memberService = new MemberService(new GoogleAuth());
                    result = memberService.findMember(memberDTO);
                    if(result){
                        System.out.println("google로그인에 성공하였씁니다. " + memberDTO.getId());
                    }
                    break;
                case 2 : memberService = new MemberService(new NaverAuth());
                    result = memberService.findMember(memberDTO);
                    if(result){
                        System.out.println("naver로그인에 성공하였습니다. " + memberDTO.getId());
                    }
                    break;
                case 3 : memberService = new MemberService(new KakaoAuth());
                    result = memberService.findMember(memberDTO);
                    if(result){
                        System.out.println("kakao 로그인에 성공하였습니다. " + memberDTO.getId());
                    }
                    break;

                case 9 :
                    System.out.println("로그인을 종료합니다");
                    return;
            }
        }while(true);

    }
}
