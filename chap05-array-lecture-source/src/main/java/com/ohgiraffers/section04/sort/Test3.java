package main.java.com.ohgiraffers.section04.sort;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        // 문제 3
        // 포카드 만들기
        // 랜덤한 카드를 4장 뽑아서 포카드인지 아닌지 확인하고 포카드일 시 "포 카드!", 그외에는 "꽝!"이 나오도록 출력
        /*
         * 예시
         * 포 카드를 뽑는 운 게임
         * ===========================================
         * 게임 진행 여부 묻기
         * 당신이 뽑은 카드는
         * SPADE ACE, CLOVER KING, CLOVER 4, HEART 3
         * 꽝!*/
        //포카드 만들기
        //포카드에서 랜덤으로 4장 뽑기
        //게임 진행여부 묻기 예 진행 아니요 종료
        Scanner scanner = new Scanner(System.in);

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] chardNumber = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};

        System.out.println(" 포 카드를 뽑는 운 게임");
        System.out.println("========");
        System.out.println("게임 진행 여부 묻기 : 예/아니요");
        String ans = scanner.next();

        if(ans.equals("예")){
            System.out.println("진행");

            int shapesNum = (int)(Math.random()* shapes.length);
            int num = (int)(Math.random() * chardNumber.length);
        }
    }
}
