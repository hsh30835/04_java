package main.java.com.ohgiraffers.section01.user_type;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){

        String id = "user01";
        String pwd = "pass01";
        String name = "기유";
        int age = 20;
        char gender = '남';
        String[] hobbys = new String[] {"축구", "헬스", "테니스"};

        //개별적으로 관리하면 데이터가 많아질수록 직접입력해야하는 분량도 많고 유지보수가 힘듬

        print(id,pwd, name,age, gender, hobbys);
        System.out.println("---1년지남---");

        age = modifyAge(age);

        print(id,pwd,name,age,gender,hobbys);

        String id1 = "user02";
        String pwd1 = "pass02";
        String name1 = "민식";
        int age1 = 20;
        char gender1 = '남';
        String[] hobbys1 = new String[] {"축구", "헬스", "테니스"};

        print(id1,pwd1, name1,age1, gender1, hobbys1); //이름이 아니라 자료형이 중요함 순서바꾸면 오류남
        //사용자가 많아질수록 계속 반복해서 써줘야됨 이 방식일때 천명이면 age는 따로 빼서 천명의 age를 입력해야됨

        /* 위와 같이 변수를 개별적으로 활용해서 생기는 문제점
        * 1. 변수명을 다 관리해야 하는 어려움이 생긴다.
        * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면 너무 많은 값을 인자로 전달해야 해서 한눈에 안들어온다
        * 3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴 값으로 사용할 수 없다.(자료형이 서로 다르기 때문이다.)
        * */
        Member kiyu = new Member();
        kiyu.name = "기유";
        kiyu.age = 20;
        kiyu.id = "kiyu";
        kiyu.pwd = "pass";
        kiyu.hobby = new String[]{"축구", "헬스", "농구"};

        System.out.println(kiyu.toString());
        System.out.println("===1년지남===");
        kiyu = modifyMember(kiyu);
        System.out.println(kiyu.toString());


        Member minsik = new Member();
        minsik.name = "민식";
        minsik.age = 18;
        minsik.pwd = "pass";
        minsik.gender = '남';
        //객체는 공통된 속성의 묶음
    }

    public static void print(String id, String pwd, String name, int age, char gender, String[] hobbys){
        System.out.println(id + " 님이 " + pwd + " 로그인을 하셨습니다.");
        System.out.println("로그인한 사용자 이름은 " + name + " 나이는 : " + age + " 성별은 " + gender + " 취미는 :");
        for (String hobby: hobbys) {
            System.out.print(hobby + " ");
        }
        System.out.println("입니다.");
    }

    public static int modifyAge(int age){ //함수의 반환타입은 무조건한개 이름이나 취미를 바꿀려면 새로 메소드를 만들어야됨
        //메소드를 필드 수 만큼 만들어야해서 비효율적임
        if(age < 0){
            return 0;
        } //나이는 -가 없으니깐 0보다 낮을시 0으로 반환함
        return age + 1;
    }

    public static Member modifyMember(Member member){ //반환타입이 Member객체가 됨
        member.age = member.age+1;
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("취미가 변경 되셨나요? ");
        String value = scanner.nextLine();
        if(value.equals("Y")){
            //취미 다시 입력받기
        }*/
        return member;

    }



}
