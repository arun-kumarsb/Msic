package com.Arun;

import java.util.Scanner;

public class Q4_NumCount {
    public static void main(String[] args){
        // n = 1385757879

        int num = 45536;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while (num != 0) {
            if (num % 10 == n) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
        in.close();
    }
}
