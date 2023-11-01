package main.java.com.ohgiraffers.login.auth;

import main.java.com.ohgiraffers.login.dto.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO memberDTO); //login정보가 true인지 false인지 비교하기 위해 boolean으로 함
}
