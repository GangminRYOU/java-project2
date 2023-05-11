package com.example.Week4.hellloprinter;

import com.example.Week4.interfaceprac.Printer;

public class ConsolePrinter implements Printer2 {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
