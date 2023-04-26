package com.example.Week2;

import java.util.Arrays;

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
