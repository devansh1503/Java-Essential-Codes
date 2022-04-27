package com.company;
import java.util.*;
public class nqueens {


    public static void queens(int n, int row, boolean[][]board){
        if(row==n){
            display(board);
            return;
        }
        for(int col=0; col<n; col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                queens(n,row+1,board);
                board[row][col]=false;
            }
        }
    }
    public static void display(boolean[][]board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j< board.length; j++){
                if(board[i][j]){
                    System.out.print('Q');
                }
                else{
                    System.out.print('X');
                }
            }
            System.out.println();
        }
        System.out.println("                 ");
    }
    public static boolean isSafe(boolean[][]board, int r, int c){
        for(int i=0; i<r; i++){
            if(board[i][c]) return false;
        }
        int maxleft = Math.min(r,c);
        for(int i=0; i<=maxleft; i++){
            if(board[r-i][c-i]) return false;
        }
        int maxright = Math.min(r,board.length-c-1);
        for(int i=0; i<=maxright; i++){
            if(board[r-i][c+i]) return false;
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][]board = new boolean[n][n];
        queens(n,0,board);

    }
}
