

import java.util.Arrays;
import java.util.Scanner;

public class F4_MultDim {
    public static void main(String[] args) {
        /*
         * 
         * 1 2 3    
         * 4 5 6
         * 7 8 9
         * 
         */

        int[][] arr = new int[3][]; // coloum is not necessary but rows are mandatory

        // directly
        int[][] arr1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // in c/c++ it continous memory allocation
        // but in java it is not continous

        int[][] arr2 = {
                { 1, 2, 3 }, // 0th
                { 4, 5 }, // 1st
                { 6, 7, 8, 9 } // 2nd
        };

        // input

        int[][] arr_i = new int[3][3];

        Scanner in = new Scanner(System.in);
        for (int row = 0; row < arr_i.length; row++) {
            for (int col = 0; col < arr_i[row].length; col++) {
                arr_i[row][col] = in.nextInt();
            }
        }
        // for (int row = 0; row < arr_i.length; row++) {
        //     for (int col = 0; col < arr_i[row].length; col++) {
        //         System.out.print(arr_i[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < arr_i.length; i++) {
        //     System.out.println(Arrays.toString(arr_i[i]));
        // }
        
        for (int[] num : arr_i) {
            System.out.println(Arrays.toString(num));
        }
    }

}
