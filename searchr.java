package com.company;
import java.sql.SQLOutput;
//Binary search using recursion
import java.util.*;
public class searchr {
    static int search(int start, int last, int key, int[]arr){
        int mid = (start+last)/2;
        int res = -1;
        if(arr[mid]==key){
            return mid;
        }
        if(start>last){
            return -1;
        }
        if(arr[mid]<key){
            res = search(mid+1,last,key,arr);
        }
        if(arr[mid]>key){
            res = search(start,mid-1,key,arr);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int es = search(0, n - 1, key, arr);
        if(es==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(es+1);
        }
    }
}
