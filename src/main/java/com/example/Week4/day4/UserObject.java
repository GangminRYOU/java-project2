package com.example.Week4.day4;

public class UserObject {
    private String name;
    private String password;
    private int id;
    private String phoneNumber;
    private static int sequence = 1;

    public UserObject(String name, String password, String phoneNumber) {
        this.name = name;
        this.password = password;
        this.id = sequence++;
        this.phoneNumber = phoneNumber;
    }
    public UserObject(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class UserTest{
    public static void main(String[] args) {
        UserObject u1 = new UserObject("Gangmin", "123", "010-123-1234");
        System.out.println(u1.getName() + " : " + u1.getPhoneNumber());
    }
}