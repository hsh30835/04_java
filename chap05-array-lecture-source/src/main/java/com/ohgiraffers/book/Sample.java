package main.java.com.ohgiraffers.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args){
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138","129","142"));
        pitches.sort(Comparator.naturalOrder());
        System.out.println(pitches);

    }
}
