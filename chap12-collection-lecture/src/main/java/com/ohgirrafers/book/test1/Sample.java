package main.java.com.ohgirrafers.book.test1;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args){

        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());
        System.out.println("=================");
        MaxLimitCalculator cal1 = new MaxLimitCalculator();
        cal1.add(50);
        cal1.add(60);
        System.out.println(cal1.getValue());
        System.out.println("===================");
        System.out.println(cal.isOdd(3));
        System.out.println(cal.isOdd(4));
//        cal.isOdd(3);
//        cal.isOdd(4);
        System.out.println("====================");
        int[] data = {1, 3, 5, 7, 9};
        int result = cal.avg(data);
        System.out.println(result);

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        int result2 = cal.avg(data2);
        System.out.println(result2);
        System.out.println(("================="));
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());
    }
}
