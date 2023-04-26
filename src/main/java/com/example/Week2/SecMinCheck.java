package com.example.Week2;

public class SecMinCheck {
    public static void main(String[] args) {
        int sec = 239;
        int min = 239 / 60;
        int remainSec = 239 % 60;
        System.out.println("min + \" \" = " + min + "분" + remainSec + "초");
    }
}
