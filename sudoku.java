package com.company;
import java.util.*;
public class sudoku {
    public static void solve(int[][]arr, int r, int c){
        if(r==8 && c==9){//8 is taken here because c will be incremented in each recursive call, hence the last row to be traversed is 8th
            return ;
        }
        if(c==9){
            r++;
            c=0;
        }
        if(arr[r][c]!=0){
            solve(arr,r,c+1);
        }
        for(int i=1; i<=9; i++){
            if(isSafe(arr,i, r, c)){
                arr[r][c] = i;
                solve(arr,r,c+1);
                arr[r][c]=0;
            }

        }

    }
    public static void display(int[][]arr){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int[][]arr, int num, int r, int c){
        for(int i=0; i<9; i++){
            if(arr[r][i]==num){
                return false;
            }
        }
        for(int i=0; i<9; i++){
            if(arr[i][c]==num){
                return false;
            }
        }
        int startr = r-r%3;
        int startc = c-c%3;
        for(int i=startr; i<startr+3; i++){
            for(int j=startc; j<startc+3; j++){
                if(arr[i][j]==num){
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[]args){
        int[][]arr = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        solve(arr,0,0);
        display(arr);

    }
}
