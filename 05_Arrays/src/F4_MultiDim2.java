
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class F4_MultiDim2 {
    public static void main(String[] args) {
        int row = 3;

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[row][];

        for (int i = 0; i < arr.length; i++) {
            int col = in.nextInt();
            arr[i] = new int[col];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int[] arr1 : arr) {
            System.out.println(Arrays.toString(arr1));
        }
    }
}
