package main.java.com.ohgiraffers.section01.method;

public class Calculator {

    public int minNumberOf(int first, int second){
        return (first > second)? second : first; //first가 second보다 크면 second 아닐시 first
    }

    public static int maxNumberOf(int first, int second){
        return (first > second)? first : second;
    }
}

