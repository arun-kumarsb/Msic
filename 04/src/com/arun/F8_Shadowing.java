package com.arun;

public class F8_Shadowing {

    /*
     * SHADOWING IN JAVA
     * -----------------
     * Variable shadowing happens when a variable in a smaller scope
     * has the same name as a variable in a larger scope.
     * 
     * The inner variable "shadows" or "hides" the outer one — meaning
     * you cannot directly access the outer variable while the inner one is in scope.
     * 
     * Key points:
     * 1. Shadowing can happen with class variables (fields) and method/block variables.
     * 2. It's allowed in Java but can lead to confusion if overused.
     * 3. You can still access the shadowed variable using 'this' (for class variables)
     *    or the class name (for static variables).
     */

    static int x = 90; // Class-level variable (field)
    // THIS WILL BE SHADOWED AT LINE *30 CAUSE LOWER LEVEL IS OVERRIDING THE UPPER LEVEL

    public static void main(String[] args) {
        System.out.println("Before shadowing: x = " + x);

        int x; // Declaring Local variable with same name as class variable — starts shadowing
        // System.out.println(x); // ❌ ERROR: Local variable not initialized yet
        // Scope will begin when the value is initialized

        x = 40; // initializing value to the local variable
        System.out.println("After shadowing: x = " + x); // Refers to local 'x'

        showShadowing();
    }

    static void showShadowing() {
        System.out.println("Inside showShadowing(): x = " + x); // Refers to class-level 'x' because no local variable here
    }
}
