package com.company;
import java.util.*;
public class insertion {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1; i<n; i++){
            int temp = arr[i];
            for(int j=i-1; j>=0; j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
