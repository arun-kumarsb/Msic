package com.Arun;

import java.util.Scanner;

public class Q6_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter (op: +,-,*,/,%) num1 num2");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                float num1 = in.nextInt();
                float num2 = in.nextInt();
                float result = 0;

                if (op == '+') {
                    result = num1 + num2;
                } else if (op == '-') {
                    result = num1 - num2;
                } else if (op == '*') {
                    result = num1 * num2;
                } else if (op == '/') {
                    if (num2 == 0) {
                        System.out.println("Divison By Zero Error");
                    } else {
                        result = num1 / num2;
                    }
                } else if (op == '%') {
                    result = num1 % num2;
                } else {
                    System.out.println("Wrong Operator");
                }
                System.out.println(result);
            }
            else if (op == 'X' || op == 'x') {
                break;
            }
            else {
                System.out.println("Invalid Operator");
            }
        }
        in.close();

    }

}
