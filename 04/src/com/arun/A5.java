package com.arun;

import java.util.Scanner;

public class A5{
    static float PI = 3.14f;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        String ans = CircInfo(radius);
        System.out.println("The area and circumference of radius " + radius + " is: ");
        System.out.println(ans);
        in.close();
    }
    static String CircInfo(float radius) {
        float area = PI*radius*radius;
        float circumference = 2*PI*radius;
        return area + " " + circumference;
    }
}