package com.example.Week4;

public class FactoryPattern {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        User user1 = userFactory.getAdultUser();
        System.out.println(user1.isAdult());
    }
}

class UserFactory{
    User getAdultUser(){
        User user1 = new User(20, "nenene");
        return user1;
    }
}

class User{
    int age;
    String name;
    User(int age, String name){
        this.age = age;
        this.name = name;
    }
    boolean isAdult(){
        if(this.age > 19)
            return true;
        else
            return false;
    }
}

