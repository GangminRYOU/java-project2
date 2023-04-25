package com.example.codeup;

import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] parts = s1.split("");
        int place = 1;
        for(int i = 0; i < parts.length; i++){
            int digit = Integer.parseInt(parts[i]);
            for(int j = parts.length - i; j > 1; j--){
                place *= 10;
            }
            System.out.println("[" + (digit * place) + "]");
            place = 1;
        }
    }
}
