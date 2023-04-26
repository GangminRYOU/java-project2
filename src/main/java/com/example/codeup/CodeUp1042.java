package com.example.codeup;

import java.awt.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sz = sc.nextLine();
        String[] words = sz.split(" ");
        int a = Integer.parseInt(words[0]);
        int b = Integer.parseInt(words[1]);
        System.out.println(a/b);
    }
}
