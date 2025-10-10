package com.Arun;

public class Q5_Rev {
    // n = 23597 --> 79532
    public static void main(String[] args) {
        int n = 23597;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        System.out.println(ans);
    }

    // logic 
    /*
     * n = 2345 --> 5432
     * ans = 0
     * 
     * ans = 0*10 + 5
     * ans = 5*10 + 4
     * ans = 54*10 + 3
     * ans = 543*10 + 2
     * ans = 5432
     */
}
