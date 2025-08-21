package com.arun;

import java.util.Arrays;

public class F6_ChangeValueEx {
    public static void main(String[] args) {
        // create an array
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void change(int[] arr) {
        // arr = new int[] {90, 2, 3, 4, 5, 6};
        arr[0] = 99; // modifying the object
        // any changes to yhe object vai this ref variable same object will be changed
    }

    /*
     * You're exploring a key concept in Java: **pass-by-value**, especially how it
     * behaves differently with **primitive types** and **reference types**. Let's
     * break down both examples and clarify what's happening under the hood.
     * 
     * ---
     * 
     * ## 🧠 Example 1: Passing a `String`
     * 
     * ```java
     * String name = "Arun";
     * ChangeName(name);
     * System.out.println(name); // Output: Arun
     * ```
     * 
     * ### 🔍 What's happening:
     * - Java is **always pass-by-value**.
     * - For **reference types** like `String`, the value passed is the **reference
     * itself**, not the actual object.
     * - Inside `ChangeName`, you're assigning a **new object** (`"Kunal"`) to the
     * local variable `str`. This does **not** affect the original reference `name`.
     * 
     * ### 🧪 Analogy:
     * Think of `name` as a label pointing to a box with `"Arun"` inside. You pass
     * the label to `ChangeName`, but inside the method, you create a **new box**
     * with `"Kunal"` and point `str` to it. The original label `name` still points
     * to `"Arun"`.
     * 
     * ---
     * 
     * ## 🧠 Example 2: Passing an `int[]` Array
     * 
     * ```java
     * int[] arr = {1,2,3,4,5,6};
     * change(arr);
     * System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5, 6]
     * ```
     * 
     * ### 🔍 What's happening:
     * - Arrays are **reference types**.
     * - You passed the reference to `change`, but then reassigned `arr` to a **new
     * empty array** (`{}`).
     * - This reassignment does **not** affect the original array in `main`.
     * 
     * ### ✅ If you had done:
     * ```java
     * arr[0] = 99;
     * ```
     * Then the output would be:
     * ```
     * [99, 2, 3, 4, 5, 6]
     * ```
     * Because you're modifying the **object** that both `main` and `change` refer
     * to.
     * 
     * ---
     * 
     * ## 🔄 Summary Table
     * 
     * | Type      | Passed Value     | Can Modify Original?          | Example Change      |
     * |-----------|------------------|-------------------------------|---------------------|
     * | Primitive | Actual value     | ❌ No                         | `int x = 5;`       |
     * | Reference | Reference (copy) | ✅ Yes (if object is mutated) | `arr[0] = 99;`     |
     * | Reference | Reference (copy) | ❌ No (if reassigned)         | `arr = new int[]{}`|
     * 
     * ---
     * 
     * Would you like to explore how this works with custom objects or dive into
     * immutability next?
     * 
     */
}
