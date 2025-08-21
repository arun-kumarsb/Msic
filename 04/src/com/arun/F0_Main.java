package com.arun;

import java.util.Scanner;

public class F0_Main {
    public static void main(String[] args) {

        // function call
        sum(); // return type: void returns nothing
        Greet();

    }

    public static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        in.close();
    }

    public static void Greet(){
        System.out.println("Hello");
    }

    /*
     * 
     * Access Modifier return_type name(){
     * //body
     * return statement;
     * }
     */
}
