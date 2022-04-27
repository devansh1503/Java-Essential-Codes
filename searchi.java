package com.company;
//program to search in an infinite array
import java.util.*;
public class searchi {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int key = sc.nextInt();
        //the element would be most probably on right side
        int start = 0;
        int last = 1;
        while(arr[last]>key){
            start = last;
            last = 2*last;
        }
        int mid = 0, flag =0;      //binary search lol
        while(start<=last){
            mid = (start+last)/2;
            if(arr[mid]==key){
                flag = 1;
                break;
            }
            else if(arr[mid]>key){
                last = mid-1;
                continue;
            }
            else{
                start = mid+1;
            }
        }
        if(flag==1){
            System.out.println(mid+1);
        }
        else{
            System.out.println("Not found");
        }
    }
}
