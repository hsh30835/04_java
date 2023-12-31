package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args){
        /* 배열의 사용방법
        * 1. 배열의 선언
        * 2. 배열의 할당
        * 3. 배열의 인덱스 공간에 값 대입
        * */

        /* 자료형[] 변수명;
        * 자료형 변수명[]; 로 선언할 수 있다.
        * */

        int[] iarray; //선언방법 둘다 가능
        int array[]; // []는 변수명이 아닌 배열형으로 인식함 변수명은 array
        //int array1[] = new int[1]; //int array1[]은 선언문 new int[1]은 대입문
        //array[0] = 10; //array0에 10을 넣음

        /*
        * 선언한 레퍼런스변수에 배열을 할당하여 대입할 수 있다.
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
        * 발생한 주소를 레퍼런스 변수(참조 변수)에 저장하여 이것을 사용하기 때문에 참조자료형(reference type)이라고 한다.
        * */
        iarray = new int[5];
        array = new int[10];

        int[] test = iarray;
        iarray[0] = 30; //주소값이 동일해서 test도 30으로 나옴


        /* heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역으로
        * stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있다.
        * */
        System.out.println("iarray + " + iarray);
        System.out.println("array + " + array);
        System.out.println("test Array = " + test);

        /*
        * hashCode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성하 객체의 고유한 정수값을 반환한다.
        * 동일객체인지 비교할 때 사용할 목적으로 쓰여지며, 동등객체를 동일객체 취급하기 위한 용도로 overring 해서 사용한다.
        * */
        System.out.println("iarray의 hashCode = " + iarray.hashCode());
        System.out.println("array의 hashCode = " + array.hashCode());
        System.out.println("test의 hashCode = " + test.hashCode());

        System.out.println(iarray[0]);
        System.out.println(test[0]);

        System.out.println("==================");
        int q[] = {1,2,3};
        int w[] = {1,2,3};
        System.out.println(q.hashCode());
        System.out.println(w.hashCode());
        System.out.println("==================");

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        double[] darr = new double[size];
        System.out.println("darr 의 hash chode : " + darr.hashCode());
        System.out.println("darr의 길이 : " + darr.length);

        darr = new double[30];
        System.out.println("수정 후 darr의 hashcode : " + darr.hashCode());
        System.out.println("수정 후 darr의 길이 : " + darr.length);

        darr = null;
        System.out.println("삭제 후 darr의 길이 : " + darr.length);


    }
}
