package com.company;
//Time Complexity: O(n+k)
//Handles duplicate terms in a good way
//Is not efficient for negative values
import java.util.*;
public class countsort {
    static void sort(int[]arr, int n){
        int[]output = new int[n];
        int[]count = new int[100];
        for(int i=0; i<100; i++){
            count[i]=0;
        }
        for(int i=0; i<n; i++){
            ++count[arr[i]];
        }
        for(int i=1; i<100; i++){
            count[i] += count[i-1];
        }
        for(int i=n-1; i>=0; i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        print(output);
    }
    static void print(int[]output){
        for(int i=0; i<output.length; i++){
            System.out.print(output[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr,n);
    }
}
