package com.example.codeup;

import java.util.Scanner;

public class CodeUp1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nData = sc.nextInt();
        if(nData > 69){
            if(nData > 89)
                System.out.println("A");
            else
                System.out.println("B");
        }else{
            if(nData >39)
                System.out.println("C");
            else
                System.out.println("D");
        }
    }
}
