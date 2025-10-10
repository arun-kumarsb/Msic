package com.arun;

public class F2_StringEx {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

        String personalised = myGreet("Arun");
        System.out.println(personalised);
        
    }

    public static String greet() {
        String str = "How are you";
        return str;
    }

    public static String myGreet(String str) {
        String a = "Good Morining " + str;
        return a;
    }
}
