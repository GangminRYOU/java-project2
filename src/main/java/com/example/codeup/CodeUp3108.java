package com.example.codeup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class CodeUp3108 {
    static class Info{
        int no;
        String name;
        public Info(int no, String name){
            this.no = no;
            this.name = name;
        }
        public String toString(){
            return no + name;
        }
        public int hashCode(){
            return no;
        }
    }
    public static void main(String[] args) {
        List<Info> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        loop1 : for(int i = 0; i < cycle; i++){
            String s = sc.next();
            int number = sc.nextInt();
            String name = sc.nextLine();
            Info sInfo = new Info(number, name);
            if(s.equals("I")){
                if(list.size() != 0){
                    int order = 0;
                    for(int j = 0; j < list.size(); j++){
                        if(number == list.get(j).no){
                            continue loop1;
                        }
                        if(number < list.get(j).no){
                            order = j;
                            break;
                        }
                    }
                    if(number > list.get(list.size() - 1).no){
                        order = list.size();
                    }
                    list.add(order, sInfo);
                }
                else
                    list.add(sInfo);
            }
            else{
                for(int k = 0; k < list.size(); k++){
                    if(list.get(k).no == number){
                        list.remove(k);
                        break;
                    }
                }
            }
        }
        String s = sc.nextLine();
        String orders[] = s.split(" ");
        int[] nOrders = new int[orders.length];
        for(int i = 0; i < nOrders.length; i++){
            nOrders[i] = Integer.parseInt(orders[i]);
        }
        for(int i = 0; i < nOrders.length; i++){
            System.out.println(list.get(nOrders[i] - 1).toString());
        }
    }
}
