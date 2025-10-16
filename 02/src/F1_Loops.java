

import java.util.Scanner;

public class F1_Loops {
    public static void main(String[] args) {
        System.out.println("No from 1 to 20");

        // while loop example
        int count = 1;
        while(count <= 20) {
            System.out.println(count);
            count++;
        }
        System.out.println();
        // for loop example
        for(int i = 1; i <= 20; i++){
            System.out.print(i + " ");
        }


        // 1 to n
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        for(int num = 1; num <= n; num++){
            System.out.print(num + " ");
        }
        in.close();

        // do while loop
        int mm = 1;
        do {
            System.out.println("Hello");
            mm++;
        }
        while(mm <= 5);
        // run atleast onces
        int mn = 1;
        do {
            System.out.println("Hello");
            mn++;
        }
        while(mn != 1);
    }
}
