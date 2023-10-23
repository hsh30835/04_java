package main.java.com.ohgiraffers.section04.sort;

public class Ex {
    public static void main(String[] args){
        int [][] arr = {{5, 6, 9}, {21, 1, 7}};
        int total = 0;

        System.out.println("arr의 배열 길이 : " + arr.length);
        System.out.println("arr[0]의 배열 길이 : " + arr[0].length);
        System.out.println("arr[1]의 배열 길이 : " + arr[1].length);

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total = total + arr[i][j];
                System.out.println("arr[" + i + "][" + j + "] : " + arr[i][j]);
            }
        }
        System.out.println("arr 배열의 총합 : " + total);
    }
}
