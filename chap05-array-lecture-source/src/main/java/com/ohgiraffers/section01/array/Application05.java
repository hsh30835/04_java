package main.java.com.ohgiraffers.section01.array;

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
    }
}
