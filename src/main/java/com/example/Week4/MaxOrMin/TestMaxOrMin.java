package com.example.Week4.MaxOrMin;

import java.lang.module.FindException;
import java.util.Scanner;

public class TestMaxOrMin {

     int getMaxOrMin(int[] arr, MaxOrMin comp){
        int target = arr[0];
         for(int i : arr){
             if(comp.myComparator(target, i))
                 target = i;
         }
         return target;
     }

    public static void main(String[] args) {
        int[] nArr = {2,3,4,5,1,2,4,4,612,3,1,4,24,32,4,234,1};
        TestMaxOrMin tmm = new TestMaxOrMin();
        int max = tmm.getMaxOrMin(nArr, new findMax());
        int min = tmm.getMaxOrMin(nArr, new findMin());
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
