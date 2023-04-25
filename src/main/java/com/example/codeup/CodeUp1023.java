package com.example.codeup;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] CharSet = input.split("\\.");
        System.out.println(CharSet[0]);
        System.out.println(CharSet[1]);
    }
}
