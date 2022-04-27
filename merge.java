package com.company;
import java.util.*;
public class merge {
    static void mergesort(int[]arr,int l, int r){

        if(l<r){
            int mid = (l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            mergeem(arr,l,mid,r);
        }

    }
    static void mergeem(int[]arr,int l, int mid, int r){
        int i=l;
        int j=mid+1;
        int k=l;
        int[]b=new int[r+1];
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                b[k]=arr[i];
                i++;
            }
            else{
                b[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i>=mid && j<r){
            while(j<=r){
                b[k]=arr[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid){
                b[k]=arr[i];
                i++;
                k++;
            }
        }
        for(int g=0; g<=r; g++){
            arr[g]=b[g];
        }
    }
    static void printit(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        mergesort(arr,0,n-1);
        printit(arr);
    }
}
