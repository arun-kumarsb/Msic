package com.arun;

import java.util.Arrays;

public class F9_VariableLengthArgs {

    /*
     * VARIABLE-LENGTH ARGUMENTS (Varargs) IN JAVA
     * --------------------------------------------
     * 1. Introduced in Java 5 to allow passing a variable number of arguments to a method.
     * 2. Syntax: dataType... variableName
     *    Example: void methodName(int... nums) { }
     * 
     * 3. Internally, Java treats varargs as an array of the given type.
     * 
     * 4. Rules:
     *    - You can have only ONE varargs parameter in a method.
     *    - If a method has multiple parameters, varargs must be the LAST parameter.
     *    - Varargs can take 0 or more arguments.
     * 
     * 5. Why use it?
     *    - Makes method calls flexible without creating overloads for different argument counts.
     */

    public static void main(String[] args) {
        // Calling with different numbers of arguments
        printNumbers(1, 2, 3);
        printNumbers(10, 20);
        printNumbers(); // 0 arguments — works fine

        // Calling a method with normal + varargs parameters
        printWithMessage("List of values:", 5, 15, 25, 35);

        // Multipele
        multiple(10, 20, "arun", "Kunal", "Hii");
    }

    // Example 1: Method with varargs
    static void printNumbers(int... numbers) {
        // for (int num : numbers) {
        //     System.out.print(num + " ");
        // }
        System.out.print(Arrays.toString(numbers));
        System.out.println();
    }

    // Example 2: Varargs with another parameter
    static void printWithMessage(String message, int... values) {
        System.out.print(message + " ");
        // for (int v : values) {
        //     System.out.print(v + " ");
        // }
        System.out.print(Arrays.toString(values));
        System.out.println();
    }

    // Exmaple Multiple args
    static void multiple(int a, int b, String ...c){

    }
}
