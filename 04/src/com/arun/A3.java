package com.arun;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        System.out.println("Enter the age: ");
        Scanner in = new Scanner(System.in);
        if (EligibleToVote(in.nextInt())) {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not Eligible to vote");
        }
        in.close();
    }

    static boolean EligibleToVote(int age) {
        return age>= 18 && age<= 120;
    }

}
