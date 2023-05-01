package com.example.codeup;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp1069 {
    public static void main(String[] args) throws IOException {
        Scanner sc  = new Scanner(System.in);
        int c = sc.nextInt();
        switch (c){
           case 12, 1, 2 :
               System.out.println("winter");
               break;
            case 3, 4, 5 :
                System.out.println("spring");
                break;
            case 6, 7, 8 :
                System.out.println("summer");
            case 9, 10, 11 :
                System.out.println("fall");
        }
    }
}
