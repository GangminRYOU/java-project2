package com.example.Week4;

public class OverloadingPyramid{

    public void makeALine(int h){
        for(int i = 0; i < h; i++) {
            System.out.println(" ".repeat(i) + "*".repeat((h - 1) * 2 + 1 - (2 * i)));
        }
    }
}

class Parallel{
    public void makeALine(int h){
        for(int i = 0; i < h; i++) {
            System.out.println(" ".repeat(i) + "*".repeat((h - 1) * 2 + 1 - (2 * i)));
        }
    }
}

interface StarMap{
    String getALine(int zeroNum, int starNum);
    void makeAShape(int h);
}

class Test{


    public static void main(String[] args) {

    }
}
