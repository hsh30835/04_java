package main.java.com.ohgiraffers.section01.internum;

public class Application01 {
    public static void main(String[] args){
        int subject1 = Subjects.JAVA;
        int subject2 = Subjects.HTML;

        int subject3 = Subjects.JDBC;
        int subject4 = Subjects.JAVASCRIPT;

        int subject5 = Subjects.CSS;
        int subject6 = Subjects.JAVA;

        if(subject1 == subject2){
            System.out.println("두 과목은 같은 과목입니다.");
        }
        if(subject1 != subject5){
            System.out.println("다름");
        }
        if(subject3 == subject4) {
            System.out.println("같음");
        }
        if(subject1 == subject6){
            System.out.println("같은과목");
        }
        System.out.println();

        int num = 0; //0번째에 해당하는 값이 나옴
        String subjectText = "";
        switch (num){
            case Subjects.JAVA: subjectText = "JAVA"; break;
//            case Subjects.HTML: subjectText = "HTML"; break; //둘이 값이 같아서 오류남
            case Subjects.ORACLE: subjectText = "ORACLE"; break;
            case Subjects.JDBC: subjectText = "JDBC"; break;
        }
        System.out.println(subjectText);
        printSubject(Subjects.ORACLE);
        printSubject(2);
    }
    public static void printSubject(int subjectNumber){
        String sbj = "";
        switch (subjectNumber){
            case Subjects.JAVA: sbj="JAVA"; break;
            case Subjects.ORACLE: sbj = "ORACLE"; break;
            case Subjects.JDBC: sbj = "JDBC"; break;
        }
        System.out.println("subject : " + sbj);
    }
}
