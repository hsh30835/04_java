package main.java.com.ohgiraffers.section04.sort;

public class Application01 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int team; //변수의 임시저장소

        team = num1;
        num1 = num2;
        num2 = team;

        int[] arr = {2,1,3};

        team = arr[0];
        arr[0] = arr[1];
        arr[1] = team;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }
}
