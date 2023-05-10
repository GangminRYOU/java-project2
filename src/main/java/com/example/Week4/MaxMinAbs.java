package com.example.Week4;

import java.sql.DatabaseMetaData;

interface Damageable{
    public abstract int getHP();
}
class People implements Damageable{
    int hp;
    public int getHP(){return this.hp;}
    public People(int hp) {this.hp = hp;}
}
class Animal implements Damageable{
    int hp;
    public int getHP(){return this.hp;}
    public Animal(int hp) {this.hp = hp;}
}
class Car implements Damageable{
    int hp;
    public int getHP(){return this.hp;}
    public Car(int hp) {this.hp = hp;}
}
public class MaxMinAbs <T extends Damageable> {
    public int findMax(T[] unitArr){
       int max = 0;
       for(int i = 0; i < unitArr.length; i++){
           if(max < unitArr[i].getHP()){
               max = unitArr[i].getHP();
           }
       }
       return max;
    }
    public int findMin(T[] unitArr){
        int min = 0;
        for(int i = 0; i < unitArr.length; i++){
            if(min > unitArr[i].getHP()){
                min = unitArr[i].getHP();
            }
        }
        return min;
    }


}

class PolymoTest{
    public static void main(String[] args) {
        MaxMinAbs<Damageable> mma = new MaxMinAbs<Damageable>();
        int max;
        max = mma.findMax(new Damageable[]{new People(12), new Car(30), new Animal(20)});
        System.out.println(max);
    }
}