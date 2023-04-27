package com.example.codeup;

import java.util.Scanner;

public class CodeUp1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nData = sc.nextInt();
        nData = ~nData;
        System.out.println(nData);
        nData = ~nData;
        System.out.println(nData);
    }
}
