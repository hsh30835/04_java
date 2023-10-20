package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatment(){
        /*
         * for[표현식]
         * for(초기값; 조건식; 증감식){
         *
         * }
         * */
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
    }

    public void testForExample(){
        // 반의 학생이 10명인 학생의 이름을 입력받기

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("1번째 학생의 이름을 입력해주세요 : ");
        String name1 = scanner.nextLine();
        //반복문을 쓰지않으면 이걸 10번 다 써야됨*/

        for(int i=0; i<10; i++){
            System.out.println(i + "번째 이름을 입력해주세요 : ");
            String student = scanner.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");
        }
    }

    public void testForExample2(){
        //1~10까지 수의 합을 구한다.

        //더하기 조건을 만든다
        //for문 조건에서 1부터 10까지 하나씩 증가한다
        //1+2+3+4+5+6+7+8+9+10
        int sum = 0;
        for(int i=1; i<11; i++){
            sum += i;

        }
        System.out.println(sum);

        //반복문에서 조건문 사용하기

        for (int i = 0; i < 10; i++) {
            if(i == 0){
                System.out.println("0입니다");
            } else if (i%2 == 0) {
                System.out.println(i + "짝수 입니다.");
            }else {
                System.out.println("홀수 입니다.");
            }

        }

    }

    public void testForExample4(){
        /* 숫자 두 개를 입력받아 작은 수에서 큰 수까지의 합게를 구하세요
        * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결을 합니다.
        * */

        /* 프로그램
        * 목표 : 두 수를 입력 받아서 작은 수 부터 큰 수까지의 합계를 구한다
        * 주의 : 두 수의 값은 같을 수 없다
        *
        * 1. 두 수를 입력받아야 한다.
        * 2. 입력받은 수가 같은지 비교한다.
        *   false. 두 수가 같지 않으면 다음으로 넘긴다.
        *   true. 두 수를 다시 입력한다.
        * 3. 같지 않다면 작은 수와 큰 수를 구한다.
        * 4. 작은 수 부터 큰 수 까지의 합계를 구한다.
        * */
        System.out.println("두 수를 입력받아 작은 수 부터 큰 수까지의 합계를 구하는 프로그램 입니다.");
         //1. 두 수를 입력받아야 한다.
        Scanner scanner = new Scanner(System.in);


        for(;;){ //for(;;)조건 안줘서 무한반복함

            System.out.println("첫 번째 수를 입력해주세요 : ");
            int first = scanner.nextInt();
            System.out.println("두 번째 수를 입력해주세요 : ");
            int second = scanner.nextInt();

            //2. 입력받은 수가 같은지 비교한다.
            if(first==second){ //같은 경우 입력을 다시 받는다
                System.out.println("두 수의 값이 같기 때문에 입력을 다시 받습니다.");


            }else{ //같지 않은 경우 다음진행
                //3.같지 않다면 작은 수와 큰 수를 구한다.
                int max = (first > second)? first : second;
                int min = (first<second)? first:second;
                int sum = 0;
                // 4. 작은 수 부터 큰 수 까지의 합계를 구한다.
                for(int i = min; i <= max; i++){
                    sum += i;
            }
                System.out.println("입력한 두 수에서 작은 값은 " + min + "큰 값은" + max + " 이고 합계는 "
                + sum + "입니다.");
                break; //해당반복문을 종료할때 사용
        }

            ///입력을 다시 받아야한다.
        }
           //false. 두 수가 같지 않으면 다음으로 넘긴다.
                  //true. 두 수를 다시 입력한다.



    }
    /**
     * 구구단을 위한 함수 입니다.
     * first n~9단 까지의 구구단
     * @param first : 해당 단을 출력함
     * @return void
     * */
    public void gugudan(int first){
        /*
        * 목표
        * 수 하나를 입력한다.
        * 입력한 수를 1부터 9까지 곱한다.
        * 반복문으로 1부터 9까지 1씩 증가한다
        * */
        System.out.println("수를 입력해 해당 단의 구구단을 출력");


        for(int i=1; i<10; i++){
            System.out.println(first + "*" + i + " = " + (first*i));
        }

    }

}
