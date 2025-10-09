
import java.util.Scanner;

public class F4_TypeCasting {
    public static void main(String[] args) {

        // -----------------------------------------------------------------
        // SECTION 1: WHAT IS TYPE CASTING?
        // -----------------------------------------------------------------
        // Type casting is when you assign a value of one primitive data type to another
        // type.
        // In Java, there are two types of casting:

        // 1. Widening Casting (Implicit/Automatic)
        // - Converting a smaller type to a larger type size.
        // - byte -> short -> char -> int -> long -> float -> double
        // - This is done automatically by Java because it is safe (no data loss).

        // 2. Narrowing Casting (Explicit/Manual)
        // - Converting a larger type to a smaller size type.
        // - double -> float -> long -> int -> char -> short -> byte
        // - This must be done manually by placing the type in parentheses.
        // - This can lead to data loss or loss of precision.

        // -----------------------------------------------------------------
        // SECTION 2: WIDENING CASTING (IMPLICIT)
        // -----------------------------------------------------------------
        // Here, values are automatically converted to a larger data type.

        System.out.println("--- Widening (Implicit) Casting ---");
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("Original int: " + myInt); // Outputs: 9
        System.out.println("Casted double: " + myDouble); // Outputs: 9.0
        System.out.println();

        // -----------------------------------------------------------------
        // SECTION 3: NARROWING CASTING (EXPLICIT)
        // -----------------------------------------------------------------
        // Here, we must manually specify the type to convert to. This is risky.

        System.out.println("--- Narrowing (Explicit) Casting ---");
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // Manual casting: double to int

        System.out.println("Original double: " + anotherDouble); // Outputs: 9.78
        System.out.println("Casted int: " + anotherInt); // Outputs: 9 (Precision is lost)
        System.out.println();

        // Another example of data loss with narrowing:
        int largeInt = 257;
        // A byte can only hold values from -128 to 127.
        // When casting 257 to a byte, the value wraps around.
        // The formula is: (value % range_of_byte), which is 257 % 256 = 1.
        byte myByte = (byte) largeInt;
        System.out.println("Original int: " + largeInt); // Outputs: 257
        System.out.println("Casted byte: " + myByte); // Outputs: 1 (Significant data loss)
        System.out.println();

        int aa = 255;
        byte bb = (byte) aa; // Casting int to byte
        System.out.println("Original int: " + aa); // Outputs: 255
        System.out.println("Casted byte: " + bb); // Outputs: -1 (due to overflow)
        System.out.println();

        int a2 = 128;
        byte b2 = (byte) a2; // Casting int to byte
        System.out.println("Original int: " + a2); // Outputs: 128
        System.out.println("Casted byte: " + b2); // Outputs: -128 (due to overflow)
        System.out.println();

        /*
         * Of course. This behavior can be confusing, but it's all about how Java
         * handles data types of different sizes. Here is a breakdown of what's
         * happening.
         * 
         * The Core Concept: Data Truncation
         * Size Difference: An int uses 32 bits of memory, while a byte only uses 8
         * bits.
         * Range: Because a byte has only 8 bits, it can only store numbers from -128 to
         * 127.
         * Casting: When you force a 32-bit int into an 8-bit byte, Java simply chops
         * off the first 24 bits and keeps only the last 8. The resulting 8 bits are
         * then interpreted as a byte value.
         * This "chopping" process is what causes the values to wrap around and
         * sometimes become negative. Let's look at your examples.
         * 
         * Example 1: int largeInt = 257;
         * Integer 257 in binary (simplified): ...00000001 00000001 (The first 1
         * represents 256, the second represents 1).
         * Casting to byte: Java discards the higher bits and keeps the last 8:
         * 00000001.
         * Result: The binary 00000001 is equal to the decimal value 1.
         * Example 2: int aa = 255;
         * Integer 255 in binary (simplified): ...00000000 11111111.
         * Casting to byte: Java keeps the last 8 bits: 11111111.
         * Interpreting the result: In Java's signed byte system (called two's
         * complement), the binary pattern 11111111 represents the decimal value -1. The
         * leftmost bit being 1 indicates a negative number.
         * Result: The value becomes -1.
         * Example 3: int a2 = 128;
         * Integer 128 in binary (simplified): ...00000000 10000000.
         * Casting to byte: Java keeps the last 8 bits: 10000000.
         * Interpreting the result: In the signed byte system, the binary pattern
         * 10000000 represents the most negative value possible, which is -128.
         * Result: The value becomes -128.
         * Summary
         * When you perform a narrowing cast like this, you are not doing a mathematical
         * conversion. Instead, you are performing a low-level binary truncation, which
         * can lead to unexpected results if the original number is outside the target
         * type's range (-128 to 127 for a byte).
         */

        // -----------------------------------------------------------------
        // SECTION 4: TYPE PROMOTION IN EXPRESSIONS
        // -----------------------------------------------------------------
        // When performing arithmetic operations, Java automatically promotes smaller
        // data types (like byte, short) to 'int' to avoid potential overflow
        // during intermediate calculations.

        System.out.println("--- Type Promotion in Expressions ---");
        byte a = 40;
        byte b = 50;
        byte c = 100;

        // In the expression (a * b), 'a' and 'b' are first promoted to 'int'.
        // Calculation becomes: (int)40 * (int)50 = 2000.
        // Then, 2000 is divided by 'c' (also promoted to int): 2000 / 100 = 20.
        // The result is an 'int', so it fits perfectly in the 'd' variable.
        int d = a * b / c;
        System.out.println("Result of (40 * 50 / 100) is: " + d); // Outputs: 20
        System.out.println();

        /*
         * That's an excellent question. Java promotes byte (and short) values to int
         * during calculations for two main reasons:
         * 
         * To Prevent Data Overflow and Ensure Correctness: This is the most important
         * reason. The intermediate results of a calculation can easily exceed the range
         * of a byte (-128 to 127).
         * 
         * Let's use your exact example:
         * 
         * byte a = 40;
         * byte b = 50;
         * If Java tried to calculate a * b using only byte arithmetic, the result would
         * be 2000. However, 2000 is far too large to fit into a byte. This would cause
         * an overflow, and you would get a completely wrong and unpredictable number.
         * 
         * By automatically promoting a and b to int before multiplying, the calculation
         * becomes (int)40 * (int)50, which results in (int)2000. The int type can
         * easily hold this value, so the intermediate result is correct.
         * 
         * For JVM and Hardware Efficiency: Most modern computer processors are
         * optimized to perform calculations on data that is 32 bits (int) or 64 bits
         * (long) in size. It is often simpler and faster for the Java Virtual Machine
         * (JVM) to convert smaller data types like byte to int and then perform a
         * standard integer operation, rather than having special instructions for every
         * possible combination of smaller types (byte * byte, short + byte, etc.).
         * 
         * In short, this automatic promotion is a safety feature that prevents subtle
         * bugs from data overflow and aligns with how modern hardware works
         * efficiently.
         */

        // -----------------------------------------------------------------
        // SECTION 5: CHARACTER AND INTEGER CASTING
        // -----------------------------------------------------------------
        // Java uses Unicode values for characters. You can cast between them.

        System.out.println("--- Char and Int Casting ---");
        int numberForChar = 65;
        char capitalA = (char) numberForChar; // int to char
        System.out.println("The character for Unicode 65 is: " + capitalA); // Outputs: A

        char characterB = 'B';
        int numberForCharB = characterB; // char to int (widening, so it's automatic)
        System.out.println("The Unicode value for character 'B' is: " + numberForCharB); // Outputs: 66
        System.out.println();

        // -----------------------------------------------------------------
        // SECTION 6: USER INPUT EXAMPLE
        // -----------------------------------------------------------------
        // Using Scanner to see implicit conversion from an integer input to a float.

        System.out.println("--- User Input Example ---");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number (e.g., 20): ");
        // If you enter an integer like 20, it will be read and stored as a float.
        float num = input.nextFloat();
        System.out.println("You entered: " + num); // If you enter 20, this prints 20.0
        input.close(); // Good practice to close the scanner
        
        // -----------------------------------------------------------------
        // SECTION 7: EXTRA EXAMPLE
        // -----------------------------------------------------------------    
        byte bx = 42;
        char cx = 'a';
        short sx = 1024;
        int ix = 50000;
        float fx = 5.67f;
        double dx = 0.1234; 

        double result = (fx * bx) + (ix / cx) - (dx * sx);//
        // Explanation:
        // 1. fx * bx: This multiplies a float by a byte, resulting in a float. // value is 42 * 5.67 = 238.14
        // 2. ix / cx: This divides an int by a char, resulting in an int. // value is 50000 / 97 = 515
        // 3. dx * sx: This multiplies a double by a short, resulting   in a double. // value is 0.1234 * 1024 = 126.976

        // float + int - double: double  
        // 4. The final result is a double because the largest type in the expression is double.



        System.out.println((fx * bx) +" " + (ix / cx) +" " + (dx * sx)); 
        System.out.println(result);
    }
}