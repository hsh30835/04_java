package main.java.com.ohgirrafers.understand;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);// 인당 10개 제한걸기
        System.out.println("로또 몇장 구매 : ");
        int quantity = scanner.nextInt();

        if(quantity>10){
            System.out.println("제한 초과");
            return;
        }

        for(int i =0; i< 10; i++) { // 숫자가 1~45까지 중복없는 랜덤으로 6개 나오는 로또 10번 만들기
            Set<Integer> lotto = new TreeSet<>();
            while (lotto.size() < 6) {
                lotto.add((int) (Math.random() * 45) + 1);
            }
            System.out.println(lotto);
        }

        System.out.println("행운 번호");
        Set<Integer> winlotto = new TreeSet<>();
        while (winlotto.size() < 6) {
            winlotto.add((int) (Math.random() * 45) + 1);
        }
        System.out.println(winlotto);

        //lotto를 배열로 만들기
        TreeSet<String> lotto = new TreeSet<>();
        Object[] arr = lotto.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }
        System.out.println();
        // 당첨자 있으면 종료


        // 없으면 이번 회차 당첨자 없음 후 다시 번호 10번 돌리기

//        TreeSet<Integer> winningNum = new TreeSet<>(); // 행운 번호 만들기
//
//        winningNum.add(1);
//        winningNum.add(2);
//        winningNum.add(3);
//        winningNum.add(4);
//        winningNum.add(5);
//        winningNum.add(6);
//
//        System.out.println("행운 번호:  " +winningNum);

    }
}
