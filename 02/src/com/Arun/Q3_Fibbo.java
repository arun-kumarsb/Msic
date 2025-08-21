package com.Arun;

import java.util.Scanner;

public class Q3_Fibbo {
    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13,21,.... 
        // find the nth fibbonachi number

        int a = 0;
        int b = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        // for(int i = 2; i <= n; i++){
        //     int temp = a;
        //     a = b;
        //     b = b + temp;
        // }

        int count = 2;
        while (count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }


        System.out.println(b);
        in.close();

        
    }
}
