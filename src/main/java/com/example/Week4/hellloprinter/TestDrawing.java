package com.example.Week4.hellloprinter;

import java.io.IOException;

public class TestDrawing {
    ShapeDrawer sd;
    Printer2 printer;
    public TestDrawing(ShapeDrawer sd, Printer2 printer){
        this.sd = sd;
        this.printer = printer;
    }
    void print(int height) throws IOException {
        printer.print(sd.makeAShape(height));
    }
    public static void main(String[] args) throws IOException {
        TestDrawing td = new TestDrawing(new DiamondShapeDrawer(), new ConsolePrinter());
        td.print(5);
    }
}
