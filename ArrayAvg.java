package com.tgt.igniteplus;

import java.io.IOException;
import java.util.Scanner;

public class ArrayAvg {
    public static void main(String args[])throws IOException {
        Scanner in=new Scanner(System.in);
        System.out.println("how many values do you want?");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("enter value into array");
        int i,s=0;
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            s=s+arr[i];
        }
        float avg=s/n;
        System.out.println("array values are");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println("s="+s+"avg="+avg);
    }
}
