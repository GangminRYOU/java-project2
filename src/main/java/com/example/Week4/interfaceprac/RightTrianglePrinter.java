package com.example.Week4.interfaceprac;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {
    private Printer printer;

    public RightTrianglePrinter(Printer printer){
        this.printer = printer;
    }

    public String makeALine(int h, int i){
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    public void printToFile(String[] lines){
        try{
            printer.print(lines);
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
    public void printToConsoleM(String[] lines){
        try{
            printer.print(lines);
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
    public String[] makeShape(int h){
        String[] lines = new String[h];
        for(int i = 0; i < h; i++) {
            lines[i] = makeALine(h, i + 1);
        }
        return  lines;
    }

    public static void main(String[] args) {
        RightTrianglePrinter rtp = new RightTrianglePrinter(new FilePrinter());
        String[] lines = rtp.makeShape(5);
        rtp.printToFile(lines);

    }
}
