package com.tgt.igniteplus;

import java.io.IOException;
import java.util.Scanner;

public class VolCylinder {
    public static void main(String args[])throws IOException{
        int r,h;
        double pie=3.14;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of cylinder radius:");
        r=in.nextInt();
        System.out.println("enter the value of cylinder height");
        h=in.nextInt();
       double V=pie*r*r*h;
        System.out.println("the volume of cylinder is:"+V);
    }
}
