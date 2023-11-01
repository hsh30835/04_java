package main.java.com.ohgiraffers.login.auth.impl;

import main.java.com.ohgiraffers.login.auth.SnsAuth;
import main.java.com.ohgiraffers.login.dto.MemberDTO;

import java.lang.reflect.Member;

public class GoogleAuth implements SnsAuth { //SnsAuth에서 데이터를 구현 받음

    @Override //Override로 재정의 해줌
    public boolean login(MemberDTO memberDTO) {
        MemberDTO googleMember = new MemberDTO("google","pass"); //google의 id와 pass를 설정함

        if(!googleMember.getId().equals(memberDTO.getId())){ //만약 입력한 아이디가 google 아이디가 같지 않다면
            System.out.println("구글 회원의 아이디가 같지 않습니다.");
            return false;
        }else{
            if(!googleMember.getPass().equals(memberDTO.getPass())){ //만약 입력한 비밀번호와 google 비밀번호가 같지 않다면
                System.out.println("구글 회원의 비밀번호가 같지 않습니다.");
                return false;
            }
        }

        return true;
    }
}
