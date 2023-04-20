package com.example.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String[] sArr = s.split("\\.");
        int[] nArr = new int[sArr.length];
        for(int i = 0; i < sArr.length; i++)
            nArr[i] = Integer.parseInt(sArr[i]);
        System.out.printf("%d.%02d.%02d\n", nArr[0], nArr[1], nArr[2]);
    }
}
