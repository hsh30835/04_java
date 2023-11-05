package main.java.com.ohgirrafers.book.test1;

import java.util.ArrayList;

class Calculator {
    int value;

    Calculator(){
        this.value = 0;
    }

    void add(int val){
        this.value += val;
    }

    int getValue(){
        return this.value;
    }

//    void isOdd(int val) { //둘다 됨 이걸쓰면 System.out.pritln(cal.isOdd(3));말고 cal.isOdd(3);을 해야 출력됨
//    //void는 함수이기 때문
//        this.value = val;
//        if (this.value % 2 == 0){
//            System.out.println(false);
//        } else {
//            System.out.println(true);
//        }
//    }
    boolean isOdd(int num){
        return num % 2 == 1;
    }

    int avg(int[] data){
        int total = 0;
        for(int num : data){
            total += num;
        }
        return total / data.length;
    }

    int avg(ArrayList<Integer> data){
        int total = 0;
        for (int num : data){
            total += num;
        }
        return total/data.size();
    }
}
