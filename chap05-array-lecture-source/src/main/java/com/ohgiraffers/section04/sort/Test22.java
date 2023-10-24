package main.java.com.ohgiraffers.section04.sort;

public class Test22 {
    public static int fibonacciIterative(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fibPrev = 0;
            int fibCurr = 1;
            for (int i = 2; i <= n; i++) {
                int temp = fibCurr;
                fibCurr = fibPrev + fibCurr;
                fibPrev = temp;
            }
            return fibCurr;
        }
    }

    public static void main(String[] args) {
        int n = 10;  // 원하는 피보나치 수열의 항 개수
        for (int i = 1; i < n; i++) {
            System.out.print(fibonacciIterative(i) + " ");
        }
    }
}

