package com.example.codeup;

public class ConcatedNumber {
    public static int solution(int[] num_list) {
        String even = "";
        String odd = "";
        for(int i = 0; i < num_list.length; i++){
            if(i % 2 == 0)
                even += num_list[i] + "";
            else
                odd += num_list[i] + "";
        }
        int a = Integer.parseInt(even);
        int b = Integer.parseInt(odd);
        int answer = a + b;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5,7, 8, 3}));
    }
}
