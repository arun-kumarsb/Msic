

public class F0_Main {
    public static void main(String[] args) {
        // 1. What is an array?
        // An array is a collection of data types, which can be primitives (like int, boolean, etc.) or objects (like String).
        // Arrays are a fundamental data structure for storing multiple elements of the same type in a single variable.

        // Array declaration syntax:
        // datatype[] arrayName = new datatype[size];

        // Example: Storing 5 roll numbers
        int[] rollNo_1 = new int[5];

        // Or using direct initialization and declaration (shorthand syntax)
        int[] rollNo_2 = {2, 3, 4, 5, 6};
        // if the type of array is int then all element should be int

        // Note: All elements in an array must be of the same specified datatype.
        // For example, the following line would cause a compile-time error:
        // int[] rollNo_1 = {"string", 4, true, 5, 1}; // Incorrect: mix of datatypes

        // The reference variable (e.g., `rollNo_2`) points to an array object that holds elements of the specified type (e.g., `int`).
        // Array declaration vs. object creation:

        // int[] rollNo_2;       // Declaration: `rollNo_2` is defined in the stack memory.
        // rollNo_2 = new int[5]; // Object creation: The array object is created in the heap memory.

        // 2. Memory allocation for arrays
        // `int[] arr = new int[5];`
        // `int[] arr` (reference variable) resides in the **stack** memory at compile time.
        // `new int[5]` (array object) is created in the **heap** memory at runtime.

        // Key points about Java array memory:
        // 1. Array objects are always stored in the **heap** memory.
        // 2. According to the Java Language Specification (JLS), heap objects (including arrays) are not guaranteed to be stored in a contiguous block of memory. Their allocation depends on the JVM's internal memory management.
        // 3. The heap is the runtime data area from which memory for all objects is allocated.
        // 4. Therefore, arrays in Java are a dynamic data structure, with memory allocated at runtime. While conceptually they are a contiguous data collection, their physical memory layout is JVM-dependent. This is different from languages like C++, where arrays are typically contiguous.
        // 
        // Unlike C++, Java has no explicit pointers or memory addresses for developers to manage.

        // 3. Array indices
        // Array elements are accessed using a zero-based index.
        // Example:
        // Array: |1|2|3|4|5|36|
        // Indices:0 1 2 3 4 5

        // Accessing elements:
        // System.out.println(arr[0]); // Prints the first element, which is 1
        // System.out.println(arr[2]); // Prints the third element, which is 3
        // System.out.println(arr[3]); // Prints the fourth element, which is 4

        // Modifying an element:
        // arr[4] = 99; // Changes the value at index 4 to 99

        // 4. The `new` keyword
        // The `new` keyword is used to create an object and allocate memory for it in the heap.

        int[] ros;             // Declares a reference variable `ros`.
        ros = new int[5];      // Creates a new integer array object of size 5.
        // When an array of a primitive type is created, its elements are initialized to a default value (e.g., 0 for int, false for boolean).
        System.out.println(ros[1]); // Output: 0 (the default value for an int)
        // The array initially looks like: [0, 0, 0, 0, 0]

        // 5. String arrays
        String[] arr1 = new String[4];
        // For arrays of objects (like String), elements are initialized to `null` by default.
        System.out.println(arr1[1]); // Output: null (a special literal)

        // The `null` literal:
        // - It's a special literal that represents the absence of a value or a reference.
        // by default value of the refrence variable is pointing to
        // - It can be assigned to any non-primitive (object) type.
        String a = null; // Valid
        // int s = null; // Invalid: `null` cannot be assigned to a primitive type.

        // Primitives vs. Objects in memory:
        // - Primitive variables (e.g., `int b;`) are typically stored directly in the stack.
        // - Object reference variables are stored in the stack, but the actual object data is stored in the heap.
        // `String[] arr = new String[5];`
        // - The `arr` reference variable is in the **stack**.
        // - It points to the array object in the **heap**.
        // - This array object contains 5 elements, each of which is a reference variable itself.
        // each particular element of array is an object
        // - These 5 elements point to `String` objects, which are also stored in the **heap** (potentially at different memory locations).
        // arr[0] = null; by default it points to null if not assigned
        
    }
}