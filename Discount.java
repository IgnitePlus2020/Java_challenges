package com.tgt.igniteplus;

import java.io.IOException;
import java.util.Scanner;

public class Discount {
    public static void main(String args[])throws IOException{
        Scanner in=new Scanner(System.in);
        float mp,d,sp;
        System.out.println("enter the marked price of the pen");
        mp=in.nextInt();
        System.out.println("enter the discount of the pen");
        d=in.nextInt();
        sp=(mp*(100-d))/100;
        System.out.println("selling prince of the pen is:"+sp);
    }
}
