package com.arun;

import java.util.Scanner;

public class Q2_ArmStrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = isArmStrongNum(num);
        System.out.println(ans);
        in.close();
    }
    static boolean isArmStrongNum(int num){
        int original = num;
        int sum = 0;
        while (num!=0) {
            int rem = num%10;
            num = num / 10;
            sum = sum + rem*rem*rem;
        }
        if (sum==original) {
            return true;
        }
        return false;
    }

}
