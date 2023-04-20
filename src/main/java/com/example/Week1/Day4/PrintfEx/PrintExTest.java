package com.example.Week1.Day4.PrintfEx;

public class PrintExTest {
    static void printfTest(){
        System.out.printf("%s\n", "Hello");
        System.out.printf("%s\n", "bye");
    }

    static void multiply(){
        System.out.printf("%d * %d = %d", 3, 3, 3*3);
    }


    public static void main(String[] args) {
       PrintExTest.printfTest();
       PrintExTest.multiply();
    }
}

