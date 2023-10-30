package main.java.com.ohgiraffers.baduk;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args){
        String[][] baduk = new String[30][30];

        for (int i = 0; i < baduk.length; i++) {
            for (int j = 0; j < baduk[i].length; j++) {
                baduk[i][j] = " ";
            }
        }
        boolean test = true;
        Scanner scanner = new Scanner(System.in);
        int turn = 1;

        while (test) {
            System.out.println(((turn%2==0)? "홍팀" : "청팀") + " 님 차례입니다.");
            String[] index = scanner.nextLine().split(" ");
            int first = Integer.parseInt(index[0]);
            int second = Integer.parseInt(index[1]);


            if (first > 30 || second > 30) {
                System.out.println("입력한 값이 범위를 벗어났습니다. 다시 입력해주세요.");
                continue;
            }

            if (turn % 2 == 0) {
                if (baduk[first][second].equals(" ")) {
                    baduk[first][second] = "O";
                }else {
                    System.out.println(((turn%2==0)? "홍팀" : "청팀") + " 다시 입력해주세요.");
                    continue;
                }
            }else {
                if (baduk[first][second].equals(" ")){
                    baduk[first][second] = "X";
                }else {
                    System.out.println(((turn%2==0)? "홍팀" : "청팀") + " 다시 입력해주세요.");
                    continue;
                }
            }

            for (int i = 0; i < baduk.length; i++) {
                System.out.print("|");
                for (int j = 0; j < baduk[i].length; j++) {
                    System.out.print(baduk[i][j] + "|");
                }
                System.out.println();
            }
            turn++;
        }
    }
}
