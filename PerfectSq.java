package com.tgt.igniteplus;

import java.util.Scanner;

public class PerfectSq {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.println("enter the value of a:");
        a=in.nextInt();
        System.out.println("enter the value of b:");
        b=in.nextInt();
        int perfect1=a*a+b*b+2*a*b;
        System.out.println("(a+b)^2="+perfect1);
        int perfect2=a*a+b*b-2*a*b;
        System.out.println("(a+b)^2="+perfect2);
    }
}
