package com.example.Week4.interfaceprac;

import java.io.IOException;

public class ConsolePrinter implements Printer {
    public void print(String[] lines) throws IOException {
        for(int i = 0; i < lines.length; i++){
            System.out.println(lines[i]);
        }
    }
}
