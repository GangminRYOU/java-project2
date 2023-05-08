package com.example.codeup;

import java.util.Scanner;

public class CodeUp1071_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nData = 0;
        while(sc.hasNextInt()){
            if((nData = sc.nextInt()) != 0)
                System.out.println(nData);
            else
                break;
        }
    }
}
