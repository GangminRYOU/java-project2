package com.example.Week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {

    public void readAChar() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        int i = inputStreamReader.read();
        System.out.println(i);
    }
    public void readTwoCharters()throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        int ascii1 = is.read();
        int ascii2 = is.read();
        System.out.println(ascii1);
        System.out.println(ascii2);
    }
}
