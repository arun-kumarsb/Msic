package com.arun;

import java.util.Scanner;

public class F3_Sum {
    public static void main(String[] args) {
        int num1; 
        int num2;
        int sum;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt(); // Read first integer from user input
        num2 = in.nextInt(); // Read second integer from user input
        sum = num1 + num2; // Calculate the sum of the two integers
        System.out.println("Sum = " + sum);
    }
}
