package main.java.com.ohgiraffers.login.auth.impl;

import main.java.com.ohgiraffers.login.auth.SnsAuth;
import main.java.com.ohgiraffers.login.dto.MemberDTO;

public class KakaoAuth implements SnsAuth {
    @Override
    public boolean login(MemberDTO memberDTO) {
        MemberDTO kakaoMember = new MemberDTO("kakao","pass"); //kakao의 아이디와 비밀번호를 설정함

        if(!kakaoMember.getId().equals(memberDTO.getId())){ //입력한 id와 kakao의 id가 같지않으면
            System.out.println("카카오 회원의 아이디가 같지 않습니다.");
            return false;
        }else{
            if(!kakaoMember.getPass().equals(memberDTO.getPass())){ //입력한 비밀번호와 kakao의 비밀번호가 같지않으면
                System.out.println("카카오 회원의 비밀번호가 같지 않습니다.");
                return false;
            }
        }

        return true;
    }
}
