package com.arun;

public class F5_Basics {
    public static void main(String[] args) {
        if (true) {
            System.out.println("Hello");
        }

        int count = 0;
        while (count != 5) {
            System.out.println("Count is: " + count);
            count++;

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("i is: " + i);
        }

        // when ww will use for loop, we will use it when we know how many times we want to run the loop
        // when we will use while loop, we will use it when we don't know how many
    }
}
