package com.example.week5;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSortOOP {
    private Comparator<Integer> comparator;
    public BubbleSortOOP(Comparator<Integer> comparator){
        this.comparator = comparator;
    }

    public int[] sortARound(int[] arr, int until){
        for (int i = 0; i < until; i++) {
            if(comparator.compare(arr[i], arr[i+1]) > 0){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        for (int i = 1; i <= arr.length - 1; i++) {
            arr = sortARound(arr, arr.length - i);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSortOOP bs = new BubbleSortOOP((o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(bs.sort(new int[]{5,4,3,2,1})));
    }
}
