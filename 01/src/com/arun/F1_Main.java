/*
 * PACKAGE EXPLANATION:
 * --------------------
 * package com.arun;
 * - The 'package' keyword is used to group related classes together.
 * - 'com.arun' is a package name, following the reverse domain naming convention.
 * - Packages help organize code and avoid naming conflicts.
 *
 * KEYWORD EXPLANATION:
 * --------------------
 * public:
 * - Makes the class or method accessible from other classes and packages.
 *
 * class:
 * - Used to declare a class, which is a blueprint for objects.
 *
 * static:
 * - Indicates that the method belongs to the class, not to any object.
 * - Allows the JVM to call 'main' without creating an object of Main.
 *
 * void:
 * - Specifies that the method does not return any value.
 *
 * String[] args:
 * - 'String' is a class representing text.
 * - 'String[]' is an array of Strings, used to hold command-line arguments.
 * - 'args' is the variable name for this array.
 *
 * for:
 * - A loop keyword used to iterate over a range of values.
 *
 * int:
 * - A primitive data type representing integers.
 *
 * System.out.println:
 * - 'System' is a built-in class for system operations.
 * - 'out' is a static member of System, representing the standard output stream.
 * - 'println' is a method to print text followed by a newline.
 */

package com.arun;

// This is the Main class. In Java, every application must have at least one class.
// The 'public' keyword means this class is accessible from other classes.
public class F1_Main {

    /*
     * The main method is the entry point of any Java application.
     * It must be 'public' so the JVM can access it.
     * It must be 'static' so it can run without creating an object of Main.
     * It must be 'void' because it does not return any value.
     * The parameter 'String[] args' allows command-line arguments to be passed to the program.
     */
    public static void main(String[] args) {
        // This line prints "Hello, World!" to the console.
        System.out.println("Hello, World!");

        // You can also print the command-line arguments, if any are provided.
        // This loop iterates over each argument and prints it.
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}

/*
 * How this program works:
 * 1. The JVM looks for the 'main' method to start execution.
 * 2. It prints "Hello, World!" to the console.
 * 3. If you run the program with command-line arguments, it prints each argument.
 *
 * Example output:
 * Hello, World!
 * Argument 0: firstArg
 * Argument 1: secondArg
 *
 * To run:
 * > java com.arun.Main firstArg secondArg
 */