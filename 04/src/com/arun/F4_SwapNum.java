package com.arun;

public class F4_SwapNum {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(x + " " + y);
        Swap(x, y);


        String name = "Arun";
        changeName(name);
        System.out.println(name); // will not change name even if passed
        
    }



    // public static void Swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }
    // this alone cannot swap the the numbers 

    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    static void changeName(String name) {
        name = "Kunal";

        // in primitives it only passes the value
        // in objects and and stuff passing values of the refrence variable
    }
}
