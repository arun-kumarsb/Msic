package com.arun;

import java.util.Scanner;

public class Q1_TempConvert {
    // celsius to farenheit formula
    // celsius = (farenheit - 32) * 5/9
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Temperature in Celsisus: ");
        Float CTemp = in.nextFloat();
        float FTemp = CTemp * 9/5 + 32; 
        System.out.println("Tempearature in Farenhiet: " + FTemp);

    }
}
