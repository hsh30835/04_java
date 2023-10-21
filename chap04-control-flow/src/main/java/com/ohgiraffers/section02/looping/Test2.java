package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Test2 {
    public void alarmClockTest(){
        /* 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
        * 상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
        * 이런 상근이를 불쌍하게 보던 창영이는 자신이 사용하는 방법을 추천해 주었다.
        * 바로 "45분 일찍 알람 설정하기"이다.
        * 이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다.
        * 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
        * 현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
        * */

        //시간을 입력하세요 시간은 0~23 범위까지
        //분을 입력하세요 분은 0~59 범위까지
        //분에서 -45하기
        //주의사항 : 만약 분이 44분보다 낮을시 시간에서 -1이 됨
        Scanner scanner = new Scanner(System.in);
        System.out.println("시간 입력 : ");
        int h = scanner.nextInt();
        System.out.println("분 입력 : ");
        int m = scanner.nextInt();
        System.out.println("입력한 시간은 : " + h + "시 " + m + "분 입니다.");

        if((m<60) && (m>=45)){
            System.out.println("알람은 " + h + "시 " + (m-45) + "분 입니다");
        } else if((h<23) && (h>0)) {
            System.out.println("알람은 " + (h-1) + "시" + (m+15) + "분 입니다");
        } else if(h==0){
            System.out.println("알람은 23시 " + (m+15) + "분 입니다");
        }
    }
    public void gameTest() {
        // up down 게임 만들기
        // 랜덤으로 생성된 수를 맞추는 게임입니다.
        // 랜덤으로 생성하는 수의 범위는 1~50 입니다.
        // 입력한 수가 랜덤으로 생성된 수보다 낮다면 "up",
        // 입력한 수가 랜덤으로 생성된 수보다 높다면 "down",
        // 입력한 수가 랜덤으로 생선된 수와 같다면 "정답"이 출력되어야 합니다.

        // 조건문과 반복문을 사용하세요.

        //숫자 하나를 입력한다
        //다른 숫자를 랜덤으로 생성한다 숫자의 범위는 n>=1 && n<=50
        //만약 num1<num2면 up 출력
        //아닐시 num1>num2면 down 출력
        //같을시 정답 출력
        //맞을때까지 해야됨
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력");
        int num1 = scanner.nextInt();

        for (int num2=0; num2<10; num2++) {
            System.out.println((int) (Math.random() * 50) + 1);
            if(num1<num2){
                System.out.println("up");
            } else if(num1>num2){
                System.out.println("down");
            }else{
                System.out.println("정답");
            }
        }
    }
}
