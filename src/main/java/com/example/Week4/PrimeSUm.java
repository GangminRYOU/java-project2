package com.example.Week4;

public class PrimeSUm {
    static int PrimeSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(PrimeSum(12));
        System.out.println(PrimeSum(36));
        System.out.println(PrimeSum(48));
        System.out.println(PrimeSum(29));
    }
}
