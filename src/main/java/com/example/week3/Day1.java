package com.example.week3;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        int month = new Scanner(System.in).nextInt();
       int lastdata =  switch (month){
            case 1, 3,5,7,8,10,12 -> 31;
            case 4, 6, 9 -> 30;
            case 2 -> 28;
           default -> throw new IllegalArgumentException();
        };
        System.out.println(lastdata);
    }
}
