package com.arun;

public class F7_Scoping {

    /*
     * SCOPING IN JAVA
     * ----------------
     * 1. FUNCTION / METHOD SCOPE:
     *    - Variables declared inside a method can only be accessed inside that method.
     *    - They are destroyed once the method execution is complete.
     * 
     * 2. BLOCK SCOPE:
     *    - Variables declared inside a block (inside { }) can only be accessed within that block.
     *    - Blocks can be if-statements, loops, or just extra { } inside a method.
     * 
     * 3. CLASS SCOPE (not shown here):
     *    - Variables declared at class level (fields) can be accessed by all methods
     *      of the class depending on their access modifier.
     */

    // MAIN method - Program execution starts here
    public static void main(String[] args) {
        int a = 10;  // Local variable for main method
        int b = 20;

        // System.out.println(num); // ❌ ERROR: 'num' is in random() scope, not here

        random();   // Calling another method
        swap(a, b); // Calling swap method
        BlockScope();
    }

    // Example of FUNCTION SCOPE
    static void random() {
        int num = 67; // Local variable to this method
        System.out.println("Inside random(): num = " + num);

        // System.out.println(a); // ❌ ERROR: 'a' belongs to main() scope, not here
    }

    // Example method showing local scope for parameters
    static void swap(int num1, int num2) {
        /*
         * 'num1' and 'num2' are copies of the values passed from main().
         * Changes here won't affect the original variables in main().
         */
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Inside swap(): num1 = " + num1 + ", num2 = " + num2);
        // These variables exist only inside swap(), and are destroyed after it ends.
    }

    // Example of BLOCK SCOPE
    public static void BlockScope() {
        int a = 10; // Declared outside block
        int b = 20;
        System.out.println("Outside block(Upper): a = " + a + ", b = " + b);
        { // Start of inner block
            // int a = 70; // ❌ ERROR: Can't redeclare 'a' here because it's already declared in outer scope
            a = 70; // ✅ Allowed: we are reassigning the existing 'a'

            int c = 10; // This variable exists only inside this block
            System.out.println("Inside block: a = " + a + ", b = " + b + ", c = " + c);
        } // 'c' is destroyed after this block

        System.out.println("Outside block: a = " + a + ", b = " + b);
        // System.out.println(c); // ❌ ERROR: 'c' was declared inside block, not accessible here
    }
}
