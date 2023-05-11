package com.example.codeup;

import java.util.*;

class StudentEx{
    String code;
    int testId;

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }

    String name;
    public StudentEx(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }




}

public class CodeUp3108LEC {
    private List<StudentEx> studentsEx = new ArrayList<>();
    public StudentEx makeAStudent(String code, int testId, String name){
        return new StudentEx(code, testId, name);
    }
    private boolean isExist(StudentEx pStudent){
        for(StudentEx studentEx : studentsEx){
            if(pStudent.getTestId() == studentEx.getTestId()){
                return true;
            }
        }
        return false;
    }
    private StudentEx getExistStudent(StudentEx pStudent){
        return new StudentEx("", 0, "");
    }
    private void deleteStudent(StudentEx pStudent){
        for(int i = 0; i < studentsEx.size(); i++){
            if(studentsEx.get(i).getTestId() == pStudent.getTestId()){
                studentsEx.remove(i);
            }
        }
    }
    public void process (String line){
        String[] splitted = line.split(" ");
        StudentEx studentEx = makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        switch (studentEx.getCode()){
            case "I" -> addAStudnet(studentEx);
            case "D" -> deleteStudent(studentEx);
        }
    }
    private void addAStudnet(StudentEx studentEx){
        if(!isExist(studentEx)){
            studentsEx.add(studentEx);
        }
    }
    private void printStudents(){
        for(StudentEx studentEx : studentsEx){
            System.out.println(String.format("%s %s %s", studentEx.getCode(), studentEx.getTestId(), studentEx.getName()));
        }
    }
    private void printSpecificStudents(int[] arr){
        Collections.sort(studentsEx, new Comparator<StudentEx>() {
            @Override
            public int compare(StudentEx o1, StudentEx o2) {
                return o1.getTestId()-o2.getTestId();
            }
        });
        for(int i = 0; i< arr.length; i++){
            StudentEx se = studentsEx.get(arr[i] - 1);
            System.out.println(String.format("%d%s", se.getTestId(), se.getName()));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CodeUp3108LEC cd = new CodeUp3108LEC();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            cd.process(sc.nextLine());
        }
        String[] specific = sc.nextLine().split(" ");
        int[] nArr = new int[specific.length];
        for(int i = 0; i < nArr.length; i++){
            nArr[i] = Integer.parseInt(specific[i]);
        }
        cd.printSpecificStudents(nArr);
    }
}
