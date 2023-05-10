package com.example.Week4;

public class AccountTest {
    public static void main(String[] args) {
        System.out.println(new Payment().isSufficient);
    }
}

class Account{
    int balance = 2000;
    public boolean isSufficient(){
        return balance >= 1500;
    }
}
class Payment{
    Account account = new Account();
    boolean isSufficient = account.isSufficient();
}
