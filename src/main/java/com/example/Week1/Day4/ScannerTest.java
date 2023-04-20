package com.example.Week1.Day4;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        InputTwoVarSum is = new InputTwoVarSum();
        is.inputSum();
        is.catString();
    }
}

class Test2{
    public static void main(String[] args) {
        InputTwoVarSum inputTwoVarSum = new InputTwoVarSum();
        inputTwoVarSum.twoNumbers();
    }
}

class InputTwoVarSum{
    void inputSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() + sc.nextInt());
    }

    void catString(){
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next() + sc.next());
    }
    void twoNumbers(){
        System.out.println("두개의 숫자를 입력하세요.");
        System.out.print("첫번쨰 숫자: ");
        System.out.println("첫번쨰 숫자: " + new Scanner(System.in).nextInt() + "입니다.");
        System.out.println("두번째 숫자: ");
        System.out.println("두번째 숫자: " + new Scanner(System.in).nextInt() + "입니다.");
    }
}