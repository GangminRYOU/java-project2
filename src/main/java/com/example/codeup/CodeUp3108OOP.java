package com.example.codeup;

import com.example.Week4.hellloprinter.ConsolePrinter;

import java.util.*;

interface InOutController {
    public boolean studentsProcedure(Student student, List<Student> studentsList);
}

class Student{
    int no;
    String name;
    public Student(int no, String name){
        this.no = no;
        this.name = name;
    }
    public String toString(){
        return no + name;
    }
    public int hashCode(){
        return no;
    }
    public boolean equals(Student s){
        if(this.no == s.no && this.name == s.name){
            return true;
        }
        return false;
    }
}

class InsertContoller implements InOutController{

    public boolean studentsProcedure(Student student, List<Student> studentsList) {
            if(!isDuplicated(student, studentsList)){
                studentsList.add(student);
                return true;
            }else{
                return false;
            }
    }
    private boolean isDuplicated(Student student, List<Student> studentsList) {
        if(studentsList.isEmpty()){
            return false;
        }
        Iterator it = studentsList.iterator();
        while(it.hasNext()){
            if(student.hashCode() == it.next().hashCode()){
                return true;
            }
        }
        return false;
    }
}

class DeleteContoller implements InOutController{
    public boolean studentsProcedure(Student student, List<Student> students) {
        if(students.isEmpty()){
            return false;
        }
        Iterator it = students.iterator();
        while(it.hasNext()){
            if(student.hashCode() == it.next().hashCode()){
                it.remove();
                return true;
            }
        }
        return false;
    }
}


class studentComp implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.hashCode() - o2.hashCode();
    }
}
public class CodeUp3108OOP {
    static ArrayList<Student> studentsList = new ArrayList<>();




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycle = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < cycle; i++) {
            String s = sc.nextLine();
            String[] words = s.split(" ");
            Student sInstance = new Student(Integer.parseInt(words[1]), words[2]);
            InOutController io;
            switch (words[0]) {
                case "I":
                    io = new InsertContoller();
                    io.studentsProcedure(sInstance, studentsList);
                    break;
                case "D":
                    io = new DeleteContoller();
                    io.studentsProcedure(sInstance, studentsList);
                    break;
            }
        }
        Collections.sort(studentsList, new studentComp());
        String cand = sc.nextLine();

    }

}

