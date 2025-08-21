package com.Arun;

public class Q5_Rev {
    // n = 23597 --> 79532
    public static void main(String[] args) {
        int num = 23597;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev*10 + rem;
            num = num / 10;
        }
        System.out.println(rev);
    }

    // logic 
    /*
     * n = 2345 --> 5432
     * rev = 0
     * 
     * ans = 0*10 + 5
     * ans = 5*10 + 4
     * ans = 54*10 + 3
     * ans = 543*10 + 2
     * ans = 5432
     */
}
