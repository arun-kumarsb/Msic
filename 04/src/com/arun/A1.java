package com.arun;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();    
        int b = in.nextInt();    
        int c = in.nextInt();    
        Max(a,b,c);
        in.close();
    }

    static void Max(int a, int b, int c) {
        // int max = 0;
        // if (a>b) {
        //     max = a;
        // }
        // else {
        //     max = b;
        // }
        // if (c>max) {
        //     max = c;
        // }
        // System.out.println(max);

        System.out.println(Math.max(a, Math.max(b, c)));
    }

}
