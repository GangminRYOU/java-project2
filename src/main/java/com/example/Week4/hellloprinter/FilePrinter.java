package com.example.Week4.hellloprinter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer2{

    @Override
    public void print(String message) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"))) {
            bw.append(message);
            bw.flush();
        }catch (IOException ie){
            ie.printStackTrace();
        }
    }
}
