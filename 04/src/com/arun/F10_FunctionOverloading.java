package com.arun;

public class F10_FunctionOverloading {

    /*
     * FUNCTION OVERLOADING IN JAVA
     * ----------------------------
     * When two or more methods in the same class have:
     *  - The same name
     *  - BUT different parameters (number, type, or order)
     * 
     * Key points:
     * 1. Return type alone is NOT enough to overload a method.
     * 2. Parameters must differ in:
     *      a) Number of parameters
     *      b) Data types of parameters
     *      c) Order of parameters
     * 3. Overloading is resolved at compile time (Static Polymorphism).
     */

    public static void main(String[] args) {
        // Call the overloaded functions
        sum(5, 10);             // Calls int, int
        sum(5, 10, 15);         // Calls int, int, int
        sum(5.5, 4.5);          // Calls double, double
        sum("Arun", " Kumar");  // Calls String, String
    }

    // Overloaded method #1 (two integers)
    static void sum(int a, int b) {
        System.out.println("Sum of 2 ints: " + (a + b));
    }

    // Overloaded method #2 (three integers)
    static void sum(int a, int b, int c) {
        System.out.println("Sum of 3 ints: " + (a + b + c));
    }

    // Overloaded method #3 (two doubles)
    static void sum(double a, double b) {
        System.out.println("Sum of 2 doubles: " + (a + b));
    }

    // Overloaded method #4 (two Strings)
    static void sum(String a, String b) {
        System.out.println("Concatenated Strings: " + (a + b));
    }
}
