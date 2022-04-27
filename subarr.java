package com.company;
import java.util.*;
public class subarr {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<>();
        int max= Integer.MIN_VALUE;
        int max_now = 0;
        int start =0, end =0;
        for(int i=0; i<n; i++){
            max_now = max_now + arr[i];
            if(max_now>max){
                max = max_now;
                end = i;

            }
            if(max_now<0){
                max_now = 0;
                start = i + 1;

            }
        }
        System.out.println(max);
        for(int i=start; i<=end; i++){

            System.out.print(arr[i] + " ");
        }
    }
}
