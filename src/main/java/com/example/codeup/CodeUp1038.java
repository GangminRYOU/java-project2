package com.example.codeup;

import java.util.Scanner;

public class CodeUp1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sz = sc.nextLine();
        String[] words = sz.split(" ");
        Long a = Long.parseLong(words[0]);
        Long b = Long.parseLong(words[1]);
        System.out.println(a + b);
    }
}
