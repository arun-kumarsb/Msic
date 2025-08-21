package com.arun;

import java.util.Scanner;

public class F1_Sum {
    public static void main(String[] args) {
        int ans = Sum();
        System.out.println("The Sum is: " + ans);
    }
    public static int Sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        in.close();
        return sum; // function will end here whenever the return statement is hit
    }
}
