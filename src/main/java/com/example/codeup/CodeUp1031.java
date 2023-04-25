package com.example.codeup;

import java.util.Scanner;

public class CodeUp1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sz = sc.next();
        int Hex = Integer.valueOf(sz,16);
        System.out.println(Integer.toString(Hex, 8));

    }
}
