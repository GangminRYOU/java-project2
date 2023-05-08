package com.example.codeup;

import java.util.Scanner;
import java.util.Stack;

public class CodeUp99 {
    static void mazePrint(int[][] map){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static void mazePush(int x, int y){
        if(x < 0 && y < 0)  return;
        if(map[x][y] != 1 && map[x][y] != 9){
            candidate.push(new Point(x, y));
        }
    }
    static int map[][] = new int[10][10];
    static Stack<Point> candidate = new Stack<Point>();
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                map[i][j] = sc.nextInt();
            }
        }
        Point here = new Point(1, 1);
        while(true){

            int x = here.x;
            int y = here.y;
            if(here.x == 8 && here.y == 8)
                break;
            if(map[here.x][here.y] == 2)
                break;
            map[x][y] = 9;

            mazePush(x + 1, y);
            mazePush(x, y + 1);
            if(candidate.isEmpty()){
                break;
            }
            else
                here = candidate.pop();
        }
        mazePrint(map);
    }
}
