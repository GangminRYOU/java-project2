package com.example.codeup;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[20][20];
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[x][y] = 1;
        }
        for(int i = 1; i < 20; i++){
            for(int j = 1; j < 20; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}

class CodeUp1097{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[20][20];
        for(int i = 1; i <= 19; i++){
            for(int j = 1; j <= 19; j++){
                map[i][j] = sc.nextInt();
            }
        }
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int r = 1; r <= 19; r++){
                if(map[r][y] == 1) map[r][y] = 0;
                else map[r][y] = 1;
            }
            for(int c = 1; c <= 19; c++){
                if(map[x][c] == 1) map[x][c] = 0;
                else map[x][c] = 1;
            }
        }
        for(int i = 1; i <= 19; i++){
            for(int j = 1; j <= 19; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class CodeUp1098{
    public static void main(String[] args) {
        int h = 0;
        int w = 0;
        int n = 0;
        int i = 0;
        int d = 0;
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        h = sc.nextInt();
        int[][] map = new int[w][h];
        n = sc.nextInt();

        for(int c = 0; c < n; c++){
            i = sc.nextInt();
            d = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            for(int l = 0; l < i; l++){
                if(d == 0){
                    map[x - 1][y - 1] = 1;
                    ++y;
                }else{
                    map[x -1][y - 1] = 1;
                    ++x;
                }
            }
        }
        for(int garo = 0; garo < w; garo++){
            for(int sero = 0; sero < h; sero++){
                System.out.print(map[garo][sero] + " ");
            }
            System.out.println();
        }

    }
}

