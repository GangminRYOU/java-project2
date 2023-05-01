package com.example.Week2.Day5;

public class SwitchCaseTest {
    public static void main(String[] args) {
        String sz = "월";
        String time = null;
        switch (sz) {
            case "월", "화", "목", "금":
                time = "09:30 ~ 17:30";
                break;
            case "수":
                time = "No slots available";
                break;
        }
        System.out.println(sz + "요일 시간은 " + time + "입니다.");
    }
}

class AdvancedSwitch{
    public static void main(String[] args) {
        int month = 10;
        switch (month){
            case 1,2,3 -> System.out.println("봄");
            case 4,5,6 -> System.out.println("여름");
            case 7,8,9 -> System.out.println("가을");
            case 10,11,12 -> System.out.println("겨울");
        }
    }
}
