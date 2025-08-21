package com.arun;

import java.util.Scanner;

public class Q1_isPrime {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();

        boolean ans = isPrime(n);
        System.out.println(ans);
        in.close();

    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c<=n-1) {
            if (n%c==0) {
                return false;
            }
            c++;
        }
        if (c*c>n) {
            return true;
        }
        else{
            return false;
        }
    }
}
