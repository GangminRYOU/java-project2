package com.example.Week2.Day4;

import java.util.Scanner;

public class ModularPractice {
    public static void main(String[] args) {
        int nData = 0;
        Scanner sc = new Scanner(System.in);
        nData = sc.nextInt();
        int nSum = 0;
        while(nData > 0){
            nSum += nData % 10;
            nData /= 10;
        }
        System.out.println(nSum);
    }
}
