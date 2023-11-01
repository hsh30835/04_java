package main.java.com.ohgiraffers.login.auth.impl;

import main.java.com.ohgiraffers.login.auth.SnsAuth;
import main.java.com.ohgiraffers.login.dto.MemberDTO;

public class NaverAuth implements SnsAuth {
    @Override
    public boolean login(MemberDTO memberDTO) {
        MemberDTO naverMember = new MemberDTO("naver","pass"); //naver의 아이디와 비밀번호 값을 설정함

        if(!naverMember.getId().equals(memberDTO.getId())){ //입력한 id와 naver id가 같지 않다면
            System.out.println("네이버 회원의 아이디가 같지 않습니다.");
            return false;
        }else{
            if(!naverMember.getPass().equals(memberDTO.getPass())){ //입력한 비밀번호와 naver 비밀번호가 같지 않다면
                System.out.println("네이버 회원의 비밀번호가 같지 않습니다.");
                return false;
            }
        }

        return true;
    }
}
