package com.example.codeup;

import java.util.Scanner;

public class CodeUp1200 {
    public static void main(String[] args) {
        String star = "*";
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for(int i = 0; i < height ; i++){
            for(int j = 0; j < height * 2 - (i + 1); j++){
                if(j < height - 1 - i){
                    System.out.print(" ");
                }else{
                    System.out.print(star);
                }
            }
            System.out.println();
        }
    }
}
class PyramidTest{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int height = 5;
        for(int i = 0; i < height; i++){
            for(int j = 0; j < height + i; j++){
                if( j < i )
                   sb.append(" ");
                else
                    sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        int pHeight = 3;
        for(int i = 0; i < pHeight; i++){
            for(int j = 0; j < pHeight + i + 1; j++){
                if(j < pHeight - i)
                    sb2.append(" ");
                else
                    sb2.append("*");
            }
            sb2.append("\n");
        }
        System.out.println(sb2.toString());
    }
}

class Pyramid{
    public static void main(String[] args) {
        int height = 3;
        for(int i = 0; i < height; i++){
            for(int j = 0; j < height - 1 - i; j++){
                System.out.print("0");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
