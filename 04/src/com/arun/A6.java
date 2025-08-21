package com.arun;

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("The Number " + num + " is prime: " + isPrime((num)));
        in.close();
        
    }

    static Boolean isPrime(int num) {
        if (num<=1) {
            return false;
        }
        int c = 2;
        while (c*c<=num) {
            if (num%c==0) {
                return false;
            }
            c++;
        }
        if(c*c>num) {
            return true;
        }
        else return false;
    }
    
}
