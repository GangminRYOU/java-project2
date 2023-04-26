package com.example.codeup;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String words[] = word.split(" ");
        int a = Integer.parseInt(words[0]);
        int b = Integer.parseInt(words[1]);
        int c = Integer.parseInt(words[2]);
        System.out.println(a + b + c);
        System.out.println((a + b + c) / 3.0f);
    }
}
