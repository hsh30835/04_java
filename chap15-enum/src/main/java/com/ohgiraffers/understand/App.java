package main.java.com.ohgiraffers.understand;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //회원 제한은 없으며 체력을 관리해야 한다.
        // 10명의 회원 유형도 자율이다.

        List<MemberDTO> members = new ArrayList<>();
        members.add(new MemberDTO("로또",10));
        members.add(new MemberDTO("로또",10));
        members.add(new MemberDTO("로또",10));
        members.add(new MemberDTO("로또",10));
        members.add(new MemberDTO("로또",10));
        members.add(new MemberDTO("로또",10));
        members.add(new MemberDTO("로또",10));
        members.add(new MemberDTO("로또",10));
        members.add(new MemberDTO("로또",10));
        members.add(new MemberDTO("로또",10));
        Scanner scanner = new Scanner(System.in);
        String[] value = scanner.nextLine().split(" ");
        for (int i= 0; i < members.size(); i++) {
            String result = value[i];
            members.get(i).setType(/*enum*/);
        }
    }
}
