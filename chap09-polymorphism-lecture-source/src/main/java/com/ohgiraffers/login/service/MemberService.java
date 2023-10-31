package main.java.com.ohgiraffers.login.service;

import main.java.com.ohgiraffers.login.auth.SnsAuth;
import main.java.com.ohgiraffers.login.dto.MemberDTO;

public class MemberService {

    private SnsAuth snsAuth;

    public boolean findMember(String authType, MemberDTO memberDTO){
        switch (authType){
//            case "google" : snsAuth = 000; break;
//            case "naver" : snsAuth = 000; break;
//            case "kakao" : snsAuth = 000; break;
            default:
                System.out.println("존재하지 않는 회원 인증 유형입니다."); return false;
        }

//        boolean result = snsAuth.login(memberDTO);

//        return result;
    }
}
