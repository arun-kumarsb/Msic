package com.arun;

public class F4_SwapNum {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(x + " " + y);
        Swap(x, y);
    }

    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
