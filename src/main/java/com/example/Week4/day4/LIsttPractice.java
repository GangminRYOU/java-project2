package com.example.Week4.day4;

import com.example.Week4.hellloprinter.DiamondShapeDrawer;
import com.example.Week4.hellloprinter.Printer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LIsttPractice {
    public static void main(String[] args) {
        @SuppressWarnings("varargs")
        List list = new ArrayList();
        list.add("String");
        list.add(1);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.isEmpty());
    }
}

class GenericsTest{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("123");
        list.add("456");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}



class ShapeMaker <T extends Printer2> extends DiamondShapeDrawer{
   static <T> void drawDiamond(){}
}