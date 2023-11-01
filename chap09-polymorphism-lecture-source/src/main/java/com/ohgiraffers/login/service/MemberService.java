package main.java.com.ohgiraffers.login.service;

import main.java.com.ohgiraffers.login.auth.SnsAuth;
import main.java.com.ohgiraffers.login.dto.MemberDTO;

public class MemberService {

    private SnsAuth snsAuth;

    public MemberService(SnsAuth snsAuth) {
        this.snsAuth = snsAuth;
    }

    public boolean findMember(MemberDTO memberDTO){
        boolean result = snsAuth.login(memberDTO);

        return result;
    }
}
