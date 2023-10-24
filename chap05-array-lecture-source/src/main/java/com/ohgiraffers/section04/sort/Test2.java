package main.java.com.ohgiraffers.section04.sort;

public class Test2 {
    public static void main(String[] args){
        /*피보나치 수열(An = An-1 + An-2)을 화면에 출력해라.
        * 1.결과값 : 1 1 2 3 5 8 13 21 34
        * 2.for문과 배열을 이용해 코드를 간소화하여 작성해야 한다.
        * 3.9개까지 출력한다.
        * */

        //An1과 An2를 처음에 1씩 넣는다
        //An은 An1+An2
        //배열은 9개 준다
        int An1 = 1;
        int An2 = 1;
        int An = An1+An2;
        int[] array = new int[9];

        for (int i = 0; i < array.length; i++) {
            System.out.println(An1 +" "+ An2 + " " +An);
        }
    }
}
