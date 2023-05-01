package com.example.codeup;
import java.util.*;
public class CodeUp1067 {


    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String szBuffer = sc.nextLine();
            String[] words = szBuffer.split(" ");
            int nArr[] = new int[words.length];
            for(int i = 0; i < nArr.length; i++)
                nArr[i] = Integer.parseInt(words[i]);
            for(int tmp : nArr){
                if(tmp >= 0){
                    System.out.println("plus");
                    if(tmp % 2 == 0)
                        System.out.println("even");
                    else
                        System.out.println("odd");
                }
                else
                    System.out.println("minus");
                if(tmp % 2 == 0)
                    System.out.println("even");
                else
                    System.out.println("odd");
            }
        }
    }
}
