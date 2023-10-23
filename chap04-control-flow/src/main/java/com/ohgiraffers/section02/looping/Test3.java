package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*
        * 첫째 줄에는 별 1개, 둘째 줄에는 2개 ….. N번째 줄에는 별 N개를 찍는 프로그램이다.
        N의 범위는 0 < N < 50이며, 범위를 벗어나는 숫자를 입력하면 각각의 범위를 벗어나는 숫자를 입력하면 다시 입력하라는
        * 안내와 함께 숫자를 다시 입력해야한다.

        별을 출력한 이후에는 종료하시겠냐는 질문이 나오고 yes를 입력하면 그대로 프로그램 종료,
        * no를 입력하면 새로운 숫자를 입력하라는 멘트가 나오며 프로그램이 계속된다*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력 : ");


        int i = 0;
        int j = 0;

        for (; ; ) {
            int N = scanner.nextInt();
            if ((N > 0) && (N < 50)) {
                for (i = 1; i <= N; i++) {
                    for (j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("종료하시겠습니까?");

                String s = scanner.next();

                if (s.equals("no")) {
                    System.out.println("숫자 재입력");
                } else if (s.equals("yes")) {
                    return;
                }

            } else if (N > 50) {
                System.out.println("다시 입력");
            } else if (N < 0) {

                System.out.println("다시 입력");
            }
        }

    }

    public int diceTest() {
        /*
        3개의 주사위를 던져서 상금을 받는 게임 프로그램을 제작한다.

        3개 모두 같은 눈이라면  20,000원+(눈의 숫자) × 2,000원의 상금을 받게 된다.
        3개 중 2개가 같은 눈이라면  1,500원+(눈의 숫자) × 100원의 상금을 받게 된다.
        모두 다른 숫자의 눈이라면 “꽝”을 출력한다.

        게임 프로그램을 작성하시오.

        1. if 조건문을 1회 이상 사용해야 한다.
        2. 입력한 내용이 ‘굴리기’가 아니라면 다음과 같이 실행한다.
        System.out.println("주사위를 굴리지 않아 프로그램을 종료합니다.");
        3. 6면체 주사위 코드는 다음과 같다.
        return (int) (Math.random() * 6) + 1;

        [출력 내용 예시 (주사위 숫자가 모두 다른 경우)]
        ===주사위 게임을 시작합니다.===
        첫 번째 주사위를 굴립니다 '굴리기'를 입력하세요.
        굴리기(사용자 입력)
        첫 번째 주사위: 3
        두 번째 주사위를 굴립니다 '굴리기'를 입력하세요.
        굴리기(사용자 입력)
        두 번째 주사위: 4
        세 번째 주사위를 굴립니다 '굴리기'를 입력하세요.
        굴리기(사용자 입력)
        세 번째 주사위: 2
        꽝!

        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("===주사위 게임을 시작합니다.===");
        System.out.println("첫 번째 주사위를 굴립니다 '굴리기'를 입력하세요.");
        String S = scanner.nextLine();

        int num1 = (int) (Math.random() * 6) + 1;
        int num2 = (int) (Math.random() * 6) + 1;
        int num3 = (int) (Math.random() * 6) + 1;

        if (!(S.equals("굴리기"))) {
            System.out.println("주사위를 굴리지 않아 프로그램을 종료합니다.");
        } else if (S.equals("굴리기")) {
            System.out.println("첫 번째 주사위: " + num1);
        }

        System.out.println("두 번째 주사위를 굴립니다 '굴리기'를 입력하세요.");
        String S1 = scanner.nextLine();
        if (!(S1.equals("굴리기"))) {
            System.out.println("주사위를 굴리지 않아 프로그램을 종료합니다.");
        } else if (S1.equals("굴리기")) {
            System.out.println("두 번째 주사위: " + num2);
        }

        System.out.println("세 번째 주사위를 굴립니다 '굴리기'를 입력하세요.");
        String S2 = scanner.nextLine();
        if (!(S2.equals("굴리기"))) {
            System.out.println("주사위를 굴리지 않아 프로그램을 종료합니다.");
        } else if (S2.equals("굴리기")) {
            System.out.println("세 번째 주사위: " + num3);
        }
        if(num1==num2){
            if(num2==num3){
                System.out.println((200000 + (num1*2000))+"원 상금 획득");
            }else if(num1==num2){
                if(num2!=num3){
                    System.out.println((1500+ (num1*100))+"원 상금 획득");
                }else if(num1!=num2){
                    if(num2!=num3){
                        System.out.println("꽝");
                    }
                }
            }
        }

        return num1;

    }
}