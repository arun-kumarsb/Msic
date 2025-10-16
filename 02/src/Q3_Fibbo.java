
import java.util.Scanner;

public class Q3_Fibbo {
    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13,21,.... 
        // find the nth fibbonachi number

        int a = 0;
        int b = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        // for(int i = 2; i <= n; i++){
        //     int temp = b;
        //     b = a + b;
        //     a = temp;
        // }

        int i = 2;
        while (i <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            i++;
        }

        System.out.println(b);
        in.close();

        
    }
}
