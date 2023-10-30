package main.java.com.ohgiraffers.baduk;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        String[][] baduk = new String[10][10];
        //바둑이라는 이차원배열을 만듬 길이는 10*10


        for (int i = 0; i < baduk.length; i++) { //i는 0부터 i는 바둑배열의 길이보다 작을때 실행 i는 1씩 증가
            for (int j = 0; j < baduk[i].length; j++) { //바둑판 빈공간
                baduk[i][j] = " ";
            }
        }
        boolean test = true; //test가 true일시 실행
        Scanner scanner = new Scanner(System.in); //입력기능
        int turn = 1; //turn의 1을 준 이유는 그냥 홍팀이랑 청팀 먼저 할 순서를 정함

        while (test) {
            System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 님 차례입니다.");
            // 순서정하기 :  turn이 짝수일때 홍팀차례 아닐때 청팀차례
            String[] index = scanner.nextLine().split(" "); //스플릿은 스플릿을 대상으로 배열을 구분해준다
            int first = Integer.parseInt(index[0]); //Integer.parseInt는 String에서 int로 전환할때 쓰는거
            int second = Integer.parseInt(index[1]);

            if (first > 10 || second > 10) {
                System.out.println("입력한 값이 범위를 벗어났습니다. 다시 입력해주세요.");
                continue;
            }

            if (turn % 2 == 0) { //만약 turn이 짝수일때
                if (baduk[first][second].equals(" ")) { //공백이 맞으면 O로 바꿈
                    baduk[first][second] = "O";
                } else {
                    System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 님 차례입니다."); //차례알려주기
                    continue; //다시 입력하기
                }
            } else { //짝수가 아닐때
                if (baduk[first][second].equals(" ")) { //빈칸을 X로 바꾸는 칸
                    baduk[first][second] = "X";
                } else {
                    System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 님 차례입니다.");
                    continue;
                }
            }

            for (int i = 0; i < baduk.length; i++) { //i는 초기화 baduk배열의 길이보다 작을때 실행 i는 증가
                System.out.print("|"); //바둑판 틀만들기
                for (int j = 0; j < baduk[i].length; j++) {
                    System.out.print(baduk[i][j] + "|");
                }
                System.out.println();
            }
            turn++; // 다음차례
        }
        //바둑판 30*30, 바둑종료, 범위벗어날시 다시
    }
}