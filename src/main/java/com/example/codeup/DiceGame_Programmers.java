package com.example.codeup;

public class DiceGame_Programmers {
    public static int solution(int a, int b, int c) {
        int answer = 0;
        int count = 0;
        int nIndex = 0;
        int[] tmp = {1, 1, 1};
        int[] nArr = {a, b, c};
        for (int i = 0; i < 3; i++) {
            nIndex = (i + 1) % 3;
            for (int j = 0; j < 2; j++) {
                if (nArr[i] == nArr[nIndex])
                    count++;
                nIndex = (nIndex + 1) % 3;
            }
        }
        count /= 2;
        switch (count) {
            case 0:
                answer = a + b + c;
            case 1:
                answer = (a + b + c) * (a * a + b * b + c * c);
            case 3:
                answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 2, 3));
    }
}
