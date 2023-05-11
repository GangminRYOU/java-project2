package com.example.Week4.hellloprinter;

public class DiamondShapeDrawer implements ShapeDrawer{

    @Override
    public String makeAShape(int h) {
        StringBuilder shape = new StringBuilder();
        int pivot = h / 2;
        for(int i = 0; i < h; i++) {
            if (i <= pivot) {
                shape.append(getReapetedSymbol("*", pivot - i, 2 * i + 1));
            } else {
                shape.append(getReapetedSymbol("*", i - pivot, 2 * (h - i) - 1));
            }
        }
        return shape.toString();
    }

    @Override
    public String getReapetedSymbol(String symbol, int spaceNum, int starNum) {
        return String.format("%s%s\n", " ".repeat(spaceNum), symbol.repeat(starNum));
    }
}
