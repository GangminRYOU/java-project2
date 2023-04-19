package com.example.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {

    public void readALine() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("line1 = " + bufferedReader.readLine());
        System.out.println("line2 = " + bufferedReader.readLine());

    }
}
