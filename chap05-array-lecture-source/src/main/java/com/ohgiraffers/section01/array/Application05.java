package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application05 {
    public static void main(String[] args){
        /* 랜덤한 카드를 한 장 뽑아서 출력해보자 */
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] chardNumber = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};
        // Math.random() * array.length

        //랜덤한 카드를 한 장 뽑는다.
        int shapesNum = (int)(Math.random()* shapes.length);
        int num = (int)(Math.random() * chardNumber.length);
        System.out.println("뽑은 카드 : " + shapes[shapesNum] + " " + chardNumber[num]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("배열 길이 입력 : ");
        int n = scanner.nextInt();
        String[] item = new String[n];
        for(int i = 0; i < item.length; i++){
            System.out.println((i+1)+" 번째 아이템 입력 : ");
            item[i] = scanner.next();
        }

        int itemNum = (int)(Math.random()* item.length);
        System.out.println("뽑은 아이템 : " + item[itemNum]);
    }
}
