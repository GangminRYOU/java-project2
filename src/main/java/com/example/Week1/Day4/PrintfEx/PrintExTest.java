package com.example.Week1.Day4.PrintfEx;

public class PrintExTest {
    static void printfTest(){
        System.out.printf("%s\n", "Hello");
        System.out.printf("%s\n", "bye");
    }

    static void multiply(){
        System.out.printf("%d * %d = %d\n", 3, 3, 3*3);
    }

    static void printData(){
        System.out.printf("%d-%02d-%02d\n", 2014, 02, 14);
    }

    public static void main(String[] args) {
       PrintExTest.printfTest();
       PrintExTest.multiply();
       PrintExTest.printData();
    }
}

