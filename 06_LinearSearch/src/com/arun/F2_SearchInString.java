package com.arun;

import java.util.Arrays;

public class F2_SearchInString {
    public static void main(String[] args) {
        String name = "Arun";
        char target = 'u';

        System.out.println(SearchInString(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean SearchInString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        // here length is a function 
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }

        return false;

    }
}
