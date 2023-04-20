package com.example.Week1.Day4;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        InputTwoVarSum is = new InputTwoVarSum();
        is.inputSum();
        is.catString();
    }
}

class InputTwoVarSum{
    void inputSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() + sc.nextInt());
    }

    void catString(){
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next() + sc.next());
    }
}