package com.Arun;

public class F0_Conditions {
    public static void main(String[] args) {
        // conditions
        /*
         * Synatx
         * if(Boolean Exp){
         * // do this
         * }
         * else {
         * // do this
         * }
         */

        // example 1
        int a = 10;
        if (a > 5) {
            System.out.println("a is greater than 5");
        } else {
            System.out.println("a is not greater than 5");
        }
        // result: a is greater than 5


        // example 2
        int salary = 5000;
        if (salary > 10000) {
            salary += 1000;
            System.out.println("Salary is increased by 1000");
        }
        else if (salary > 20000) {
            salary += 2000;
            System.out.println("Salary is increased by 2000");
        }
        else{
            salary += 500;
            System.out.println("Salary is increased by 500");
        }
    }
}