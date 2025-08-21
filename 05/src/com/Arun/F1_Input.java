package com.Arun;

import java.util.Arrays;
import java.util.Scanner;

public class F1_Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        // arrays of primitives

        // int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 25;
        // arr[3] = 55;
        // arr[4] = 75;
        // System.out.println(arr[3]);

        // input using for loop
        // int[] arr1 = new int[5];
        // for (int i = 0; i < arr1.length; i++) {
        //     arr1[i] = in.nextInt();
        // }

        // printing the array
        // 1.
        // for (int i = 0; i < arr1.length; i++) {
        //     System.out.print(arr1[i] + " ");
        // }
        // // 2. for each loop
        // for(int num : arr1){
        //     System.out.print(num + " ");
        // }
        // 3. Arrays.toSTring
        // System.out.println(Arrays.toString(arr1));



        // arrays of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
