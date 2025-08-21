package com.Arun;

import java.util.Scanner;

public class Q2_CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // System.out.println(in.next().trim().charAt(0));

        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The Char is Lowercase");
        }
        else{
            System.out.println("The Char is Uppercase");
        }
        in.close();
    }
}
