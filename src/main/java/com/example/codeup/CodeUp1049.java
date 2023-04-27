package com.example.codeup;

import java.util.Scanner;

public class CodeUp1049 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sz = sc.nextLine();
        String[] digits = sz.split(" ");
        int a = Integer.parseInt(digits[0]);
        int b = Integer.parseInt(digits[1]);
        if( a == b )
            System.out.println(1);
        else
            System.out.println(0);

    }
}
