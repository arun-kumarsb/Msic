package com.arun;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(multipy(in.nextInt(), in.nextInt()));
        in.close();
    }

    static int multipy(int a, int b) {
        return a*b;
    }
}
