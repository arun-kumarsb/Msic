

import java.util.Arrays;

public class F3_PassinginFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        Change(arr);

        // arr ----> {1,2,3,4}
        // str ----> {1,2,3,4}
        // in fun str[0] = 99;
        // str ----> {99,2,3,4}
        // arr ----> {99,2,3,4}

    }
    public static void Change(int[] str){
        // str = new int[] {1,2,3,6}; this will create a new array not modify the old array
        str[0] = 99;
    }
}
