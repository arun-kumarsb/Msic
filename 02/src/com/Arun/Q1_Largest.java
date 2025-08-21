package com.Arun;

import java.util.Scanner;

public class Q1_Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * Program to find largest of three numbers.
         * “Take 3 integer input from keyboard, Find the largest numbers
         * among them “.
         */

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Num1 is Greatest: " + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("Num2 is Greatest: " + num2);
        }
        else {
            System.out.println("Num3 is Gratest: " + num3);
        }


        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("The max is: " + max);
        

        int max1 = 0;
        if (num1 > num2){
            max1 = num1;
        }
        else {
            max1 = num2;
        }
        if (num3 > max1) {
            num3 = max1;
        }
        System.out.println(max1);
        

        int max2 = Math.max(num3, Math.max(num1, num2));
        System.out.println(max2);

        in.close();
    }
}
