package com.example.codeup;

import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1041 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        int nData = isr.read();

        System.out.printf("%c\n", nData + 1);
    }
}
