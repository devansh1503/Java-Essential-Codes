package com.company;

public class ratmaze {
    public static void main(String[]args){
        int[][]a={
                {1,1,0,0,1},
                {0,1,1,1,0},
                {1,1,1,0,1},
                {1,0,1,1,1},
                {0,1,1,0,1}
                 };
        int r=a.length;
        int c=a[0].length;
        int res = maze(0,0,a,2,0);
        if(res>=10000){
            System.out.println("not possible");
        }
        else{
            System.out.println(res+1);
        }
    }
    static int maze(int n, int m, int[][]a,int i,int j){
        int r=a.length;
        int c=a[0].length;
        boolean[][]vis = new boolean[r][c];
        int res = solve(n,m,a,vis,i,j);
        return res;
    }
    static int solve(int n, int m, int[][]a, boolean[][]vis,int i,int j){
        if(!valid(n,m,a,vis)){
            return 10000;
        }
        if(n==i && m==j){
            return 0;
        }
        vis[n][m] = true;
        int right = 1 + solve( n,m+1,a,vis,i,j);
        int left = 1 + solve(n,m-1,a,vis,i,j);
        int top = 1 + solve(n-1,m,a,vis,i,j);
        int down = 1 + solve(n+1,m,a,vis,i,j);
        vis[n][m] = false;
        return Math.min(Math.min(left,down),Math.min(top,right));
    }
    static boolean valid(int n, int m, int[][]a, boolean[][]vis){
        int i=a.length;
        int j = a[0].length;
        return n>=0&& m>=0 && n<i && m<j && a[n][m]==1 && !vis[n][m] ;

    }
}
