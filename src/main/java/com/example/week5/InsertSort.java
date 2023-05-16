package com.example.week5;

import java.sql.Wrapper;
import java.util.Arrays;

public class InsertSort <T extends Comparable>{
    public T[] sort(T [] arr, boolean isAscending){
            for (int i = 1; i < arr.length; i++) {
                for (int j = i; j >= 1; j--) {
                    if (isAscending ? (arr[j].compareTo(arr[j - 1]) < 0) : arr[j - 1].compareTo(arr[j]) < 0) {
                        T tmp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = tmp;
                    } else {
                        break;
                    }
                }
            }
        return arr;
    }
    public T[] sort(T[] arr){
       return sort(arr, true);
    }


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Integer[] nArr = new Integer[] {2,4,2,1,5,6,7,4,2,1,3,3};
        Character[] cArr = new Character[]{'a', 'e', 'c', 'd', 's', 'f'};
        InsertSort<Character> is = new InsertSort<>();
        InsertSort<Integer> isn = new InsertSort<>();
        System.out.println(Arrays.toString(isn.sort(nArr, true)));
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
