package com.example.codeup;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newString = sc.nextLine();
        String[] words = newString.split("\\.");
        System.out.printf("%02d-%02d-%04d", Integer.parseInt(words[1]), Integer.parseInt(words[2]), Integer.parseInt(words[0]));
    }
}
