package com.example.week5;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] nArr = {3,5,1,2,4,6,7,2,3,5,78,8};
        for (int i = 0; i < nArr.length - 1; i++) {
            for (int j = 0; j < nArr.length - 1 - i ; j++) {
                if(nArr[j] > nArr[j+1]){
                    int nTmp = nArr[j];
                    nArr[j] = nArr[j+1];
                    nArr[j+1] = nTmp;
                }
            }
        }
        System.out.println(Arrays.toString(nArr));
    }
}
