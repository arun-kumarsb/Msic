package com.arun;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(EvenOdd(in.nextInt()));
        in.close();
        
    }

    static String EvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        else return "Odd";
    }
}
