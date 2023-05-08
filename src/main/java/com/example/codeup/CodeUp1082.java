package com.example.codeup;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(16);
        for(int i = 1; i < 16; i++){
            int result = number * i;
            System.out.printf("%s*%s=%s\n", Integer.toString(number, 16).toUpperCase(),
                    Integer.toString(i, 16).toUpperCase(), Integer.toString(result, 16).toUpperCase() );
        }
    }
}
