package com.example.codeup;

import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] splits = a.split(" ");
        int aa = Integer.parseInt(splits[0]);
        int bb = Integer.parseInt(splits[1]);
        System.out.println( aa + bb);
        System.out.println( aa - bb);
        System.out.println( aa * bb);
        System.out.println(aa / bb);
        System.out.println(aa % bb);
        float cc = (aa / (float)bb);
        cc = Math.round(cc*100);
        cc /= 100.0f;
        System.out.println(cc);
    }
}
