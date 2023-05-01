package com.example.codeup;

import java.util.Scanner;

public class CodeUp1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.printf("%.2f\n", Math.round((a + b + c) /3 * 100)/100.0);


    }
}

class CodeUp1117{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b =sc.nextDouble();
        System.out.println(Math.round((a*b) * 100)/100.0);
    }
}

class CodeUp1071{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String words[] = line.split(" ");
        for(int i = 0; i < words.length; i++)
        {
            if(words[i] == "0")
                break;
            System.out.println(words[i]);
        }
    }

}
class CodeUp10212{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a % b);
    }
}
