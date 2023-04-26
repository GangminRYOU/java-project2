package com.example.Week2;

import java.util.Arrays;

public class TwoDimesionArray {
    public static void main(String[] args){

        int[][] nArr = new int[3][3];
        int[] part = nArr[0];
        part[0] = 1;
        part[2] = 3;
        int[] part2 = nArr[1];
        part2[0] = 2;
        extracted(nArr);
    }

    private static void extracted(int[][] nArr) {
        for(int i = 0; i < nArr.length; i++){
            System.out.println(Arrays.toString(nArr[i]));
        }
    }

}
