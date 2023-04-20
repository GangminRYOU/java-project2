package com.example.codeup;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String[] sArr = s.split("-");
        System.out.println(sArr[0] + sArr[1]);
    }
}
