
// import java.util.Arrays;

public class F5_DynamicArrays {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,4,5},
            {6,7,8},
            {1,2}
        };

        // printing
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
