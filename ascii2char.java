package com.tgt.igniteplus;

import java.io.IOException;

public class ascii2char {
    public static void main(String args[])throws IOException
    {
        char c;
        for(int i=65;i<=90;i++)
        {
            c =(char)i;
            System.out.println(i+"  =  "+c);
        }
    }
}
