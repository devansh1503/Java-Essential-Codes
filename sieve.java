package com.company;

import java.util.Arrays;

//Sieve of Eratosthenes
public class sieve {
    public static void main(String[]args){
        boolean[]isPrime = sieveeratosthenes(20);
        int num = 0;
        for(int i=0; i<=20; i++){
            if(isPrime[i]){
                num++;
            }
        }
        System.out.println(num); // number of prime numbers till 20

    }
    static boolean[] sieveeratosthenes(int n){
        boolean [] isPrime = new boolean[n+1]; //n+1 spaces because we want array to contain indexes upto n
        Arrays.fill(isPrime,true); //makes all elements in array true for now
        isPrime[0] = false;  // 0 is not prime
        isPrime[1] = false;  // 1 is not prime
        for(int i=2; i*i<=n; i++){  // i<=root n, because we are to check multiples of root n numbers only
            for(int j= 2*i; j<=n; j+=i){  // we will start with 2nd multiple of i, and increment with i each time
                isPrime[j] = false;       // j is multiple of i, so it is not prime
            }
        }
        return isPrime;

    }
}
