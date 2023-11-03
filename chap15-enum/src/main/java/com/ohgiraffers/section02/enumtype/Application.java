package main.java.com.ohgiraffers.section02.enumtype;

public class Application {
    public static void main(String[] args){
        /*열거형(enum)을 이용한 상수 열거 패턴의 단점을 해결하기*/
        Subjects sbj = Subjects.JAVA;
        Subjects sbj2 = Subjects.HTML;
        Subjects sbj3 = Subjects.JAVA;

        if(sbj == sbj2){
            System.out.println("두 과목은 같은 과목입니다.");
        }else{
            System.out.println("sbj : " + sbj);
            System.out.println("sbj2 : " + sbj2);
            System.out.println("는 다른 과목입니다.");
        }
        System.out.println();
        if(sbj == sbj3){
            System.out.println("두 과목은 같은 과목입니다.");
        }else{
            System.out.println("sbj : " + sbj);
            System.out.println("sbj3 : " + sbj3);
            System.out.println("는 다른 과목입니다.");
        }
        //인스턴스의 타입을 보장하기 때문에 == 으로 값을 비교하는 것이 가능하다.
        System.out.println(sbj == Subjects.JAVA);

        Subjects[] subjects = Subjects.values();
        for (Subjects sb:subjects) {
            System.out.println(sb);
        }
    }
}
