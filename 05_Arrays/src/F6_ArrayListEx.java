import java.util.ArrayList;
import java.util.Scanner;

public class F6_ArrayListEx {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<>();
        // wrapper classes <Integer><String>
        // ArrayList<Integer> list = new ArrayList<>();

        list.add(69);
        list.add(1);
        list.add(23);
        list.add(29);
        list.add(6);
        list.add(49);

        list.set(0, 99);

        // System.out.println(list.contains(2));
        // false

        // list.remove(2);
        System.out.println(list);

        // input
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);

        // list[i] // wrong
        System.out.println(list.get(1)); // correct
        //list[i] will not work
        
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }

        // internally working
        // ssame as array
        /*
         * An ArrayList in Java is a dynamic, resizable array. Unlike a traditional
         * array with a fixed size, an ArrayList can grow and shrink as needed. It's
         * part of the Java Collections Framework and provides a more flexible
         * alternative to arrays when you don't know the exact number of elements you'll
         * need.
         */

        // 1. Size is fixed internally
        /*
         * When you create an ArrayList, it's backed by a standard array. Initially,
         * this array has a small default capacity (usually 10).
         */
        // 2. iff arrays is filled is by some ammount
        // it will create a new empty list of double size and copies the all elements
        // from the previous list to new list and old list is deleted

        /*
         * Size: Arrays have a fixed size. An ArrayList's size is dynamic.
         * 
         * Performance: ArrayList offers similar performance to arrays for element
         * access but is slower for insertions and deletions in the middle of the list
         * due to the shifting of elements.
         * 
         * Syntax: ArrayList uses method calls (add(), get(), remove()) to manipulate
         * data, while arrays use the [] operator.
         */

    }
}
