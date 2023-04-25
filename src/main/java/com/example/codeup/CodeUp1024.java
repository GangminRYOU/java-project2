package com.example.codeup;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        String[] words = next.split("");
        for(String n : words){
            System.out.println("\'" + n + "\'");
        }
    }
}
