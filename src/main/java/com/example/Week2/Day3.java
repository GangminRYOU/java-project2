package com.example.Week2;

public class Day3 {
    public static void main(String[] args) {

    }
}

class Student{

}

class ClassinSchool{
    int stdNum;
    int classNo;
    Student[] students;
    Teacher t = new Teacher();
    ClassinSchool(int stdNum, int classNo){
        this.stdNum = stdNum;
        this.classNo = classNo;
        students = new Student[this.stdNum];
        for(int i = 0; i < students.length; i++){
            students[i] = new Student();
        }
    }
}

class Teacher{
    int id;
    String name;
    int age;
}