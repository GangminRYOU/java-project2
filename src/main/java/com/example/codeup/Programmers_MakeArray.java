package com.example.codeup;

public class Programmers_MakeArray {
    int recur_proc(int n, int i){
        if(i == n){
            return 1;
        }
        return recur_proc(n, i + 1) * 10;
    }

    public int[] solution(int l, int r) {
        int[] answer = {};

        return answer;
    }
}
