package main.java.com.ohgiraffers.section01.user_type;

public class Member {
    //회원의 정보를 여기서 모두 수정할 수 있음
    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobby;

    public void setInt(int age){
        if(age<0){
            System.out.println("나이는 0살보다 작을 수 없어요");
        }
        this.age= age;
    }

    public String toString() {
        return id + "님이 로그인 하셨습니다. \n 로그인한 사용자의 이름은 " + name + "나이는 : " + age + "성별은 : " + gender +
                " 취미는 : " + hobby[0] + " " + hobby[1] + " " + hobby[2] + " 입니다.";
        //기능을 수정해야 하면 메소드마다 일일이 수정을 안하고 여기서 수정하면 됨
    }
}
