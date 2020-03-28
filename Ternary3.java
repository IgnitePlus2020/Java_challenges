package com.tgt.igniteplus;

public class Ternary3 {
    public static void main(String args[])
    {
        int a = 10, b = 15, c = 5;
        int max;
        max = ( a > b && a > c) ? a :((b > a && b > c) ? b : c);
        System.out.println("the largest number among three digits are:"+max);
    }
}
