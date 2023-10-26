package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Baek3 {
    public static void main(String[] args){
        //N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

        //정수 N 입력
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 입력 ");
        int N = scanner.nextInt();

        //길이가 N인 배열만들기
        int[] arr = new int[N];

        //배열의 크기만큼 값을 입력
        for (int i = 0; i < N; i++) {
            System.out.println("값 입력");
            arr[i] = scanner.nextInt();
        }

        //배열 값의 최댓값, 최솟값 구하기
        int max = 0;
        int min = 10000000;
        //최대값, 최소값 변수에 값을 지정해줄 때는 최소값에는 가장 큰 값을 대입해놓고, 최대값에는 가장 작은 값을 넣어준다.
        //이유는 수치 두개를 만들어놓고, 첫번째 값과 비교하면 무조건 첫번째 값이 최대값이나 최소값에 대입되기 때문이다.

        for (int j=0; j<N; j++){
            //최댓값 구하기
            if(max<arr[j]){
                max=arr[j];
            }
            /*if는 맞을 때 실행 만약 arr배열의 값이 {1,2,3}이라 가정할때
              1은 0보다 크니 실행 2는 0보다 크니 실행 3은 0보다 크니 실행
              그래서 3이 나옴
             */

            //최솟값 구하기
            if(min>arr[j]){
                min=arr[j];
            }
        }
        System.out.println("최댓값 " + max);
        System.out.println("최솟값 " + min);
    }
}
