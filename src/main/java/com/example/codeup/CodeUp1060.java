package com.example.codeup;

import java.util.Scanner;

public class CodeUp1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sz = sc.nextLine();
        String[] digits = sz.split(" ");
        int a = Integer.parseInt(digits[0]);
        int b = Integer.parseInt(digits[1]);
        int c = Integer.parseInt(digits[2]);
        System.out.println((a < b? (a < c? a: c) : (b < c? b:c)));
    }
}
