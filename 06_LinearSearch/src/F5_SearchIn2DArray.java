

import java.util.Arrays;

public class F5_SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9, 0 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };
        System.out.println(Arrays.toString(SearchIn2DArray(56, arr)));
        System.out.println(Min2DArray(arr));
        System.out.println(Max2DArray(arr));
    }

    static int[] SearchIn2DArray(int target, int[][] arr){
        if (arr.length == 0) {
            return new int[] {-1,-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    // static int Min2DArray(int[][] arr) {
    // int min = Integer.MIN_VALUE;
    // for (int[] element : arr) {
    // for (int element2 : element) {
    // if (element2 < min) {
    // min = element2;
    // }
    // }
    // }
    // return min;
    // }

    static int Min2DArray(int[][] arr) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    static int Max2DArray(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

}
