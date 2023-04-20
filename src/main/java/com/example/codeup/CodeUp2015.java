package com.example.codeup;

import java.util.Scanner;

public class CodeUp2015 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        float f = Float.parseFloat(s);
        System.out.println(f*100);
        f = ((int)(f * 100 + 0.5))/100.0f;
        System.out.printf("%.2f",f);
    }
}
