package com.arun;

import java.util.Scanner;

public class F3_Arguments {
    public static void main(String[] args) {
        // int x = 1;
        // int y = 12;
        // System.out.println("The Sum is: " + Sum(x, y));


        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String Our_Message = Greet(a);
        System.out.println("Your Mesage Is: " + Our_Message);
        in.close();
    }

    private static String Greet(String str) {
        return str;
    }

    public static int Sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    

    /*
     * 
     * Access Modifier return_type name(){
     * //body
     * return statement;
     * }
     * 
     */

}
