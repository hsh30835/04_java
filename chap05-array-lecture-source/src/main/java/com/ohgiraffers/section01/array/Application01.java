package main.java.com.ohgiraffers.section01.array;

public class Application01 {
    public static void main(String[] args){
        /*
        * 배열이란?
        * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
        * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
        *
        * 배열의 사용 이유
        * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
        * 1.연속된 메모리 공간으로 관리할 수 없다.
        * 2.반복문을 이용한 연속 처리가 불가능하다.
        * 문제점은 변수를 이동했을때 빈자리를 채워줘야됨
        * */
        /* 배열의 필요성을 느낀부분
        * 종환 : 변수에 초기화? 같은 값을 재사용하기 불편
        * 광중 :
        * */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum=0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        //변수가 많아질수록 쓰기 불편해짐
        //연속된 메모리 공간을 써서 처리속도가 빨라짐
        System.out.println("num1~5 += " + sum);


        sum = 0;
        int[] array = new int[5];//자료형이 정수 배열 변수의 이름은 array 배열은 5의 길이를 가짐
        //배열의 길이는 동적으로 변경 불가능 다시 만들어야됨
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;

        sum += array[0];
        sum += array[1];
        sum += array[2];
        sum += array[3];
        sum += array[4];
        System.out.println("array = " + sum);

        sum = 0;
        //length는 배열의 길이 여기선 5, array[0]하면 위에서 10을 넣어서 10으로 나옴
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("for array = " + sum);

    }
}

