package com.example.Week2;

import java.util.Arrays;
import java.lang.Math.*;

import static java.lang.Math.*;

public class TwoDiArrTest {
    public static void main(String[] args) {
        int[][] iArr = new int[10][10];
        fillRow(3, iArr);
        for(int i = 0; i < iArr.length;i++){
            System.out.println(Arrays.toString(iArr[i]));
        }
    }

    static void fillRow(int row, int[][] map){
        for(int i = 0; i < map[row].length; i++){
            map[row][i] = 1;
        }
    }
}

class TriangularFunction{
    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double c = Math.sqrt(Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("c = " + c);
        double a = c * Math.sin(Math.PI/4);
        double b = c * cos(Math.PI/4);
        double d = cos(toRadians(45));
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("d = " + d);
        System.out.println("atan2(a,b) = " + atan2(a,b));
        System.out.println("atan2(a,b) * 180 / PI : degree = " + atan2(a,b) * 180 / PI);
        System.out.println("toDegrees(atan2(a,b)) : degree = " + toDegrees(atan2(a,b)));
    }
}