package com.example.Week4.interfaceprac;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer{
    @Override
    public void print(String[] lines) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"))){
            for(int i = 0; i < lines.length; i++){
                bw.append(lines[i]);
            }
            bw.flush();
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
}
