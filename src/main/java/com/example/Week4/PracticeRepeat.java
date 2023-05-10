package com.example.Week4;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeRepeat implements StarMap{
    public void makeAShape(int h){
        if(h <= 1){
            throw new IllegalArgumentException("Invalid input");
        }
        for(int i = 0; i < h - 1; i++){
            System.out.println(getALine(h - i - 1, 2 * i + 1));
        }
        System.out.println("*".repeat(2 * (h - 1) + 1));
        for(int i = h; i >= 2; i--){
            System.out.println(getALine(h - i + 1, 2 * (i - 2) +1));
        }
    }
    public String getALine(int zeroNum, int starNum){
        return  getRepeatedSysmbol("0", zeroNum) + getRepeatedSysmbol("*", starNum);
    }
    public String getRepeatedSysmbol(String symbol, int i){
        return symbol.repeat(i);
    }
    public static void main(String[] args) {
        int height = 5;
        PracticeRepeat p = new PracticeRepeat();
        p.makeAShape(3);
        int h = 3;
        File file = new File("c:\\Users\\star.txt");
        try{
            if(file.createNewFile())
                System.out.println("file is created");
            else
                System.out.println("failed to create file");
        }catch(IOException e){
            e.printStackTrace();
        }

        try (FileOutputStream fos = new FileOutputStream(file)){
            PracticeRepeat p2 = new PracticeRepeat();
            BufferedOutputStream bo = new BufferedOutputStream(fos);
            for(int i = 0; i < h - 1; i++){
                bo.write(p2.getALine(h - i - 1, 2 * i + 1).getBytes());
            }
            bo.write(p2.getRepeatedSysmbol("*", 2 * (h - 1) + 1).getBytes());
            for(int i = h; i >= 2; i--){
                bo.write(p2.getALine(h - i + 1, 2 * (i - 2) +1).getBytes());
            }
        }catch(IOException ie){
           ie.printStackTrace();
        }
    }
}

