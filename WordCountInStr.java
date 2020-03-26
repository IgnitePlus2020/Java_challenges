package com.tgt.igniteplus;

import java.io.IOException;
import java.util.Scanner;

public class WordCountInStr {
    public static void main(String args[])throws IOException
    {
        int count = 1;
        String words;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string" );
        words=in.nextLine();
        for (int i = 0; i < words.length() - 1; i++)
        {
            if ((words.charAt(i) == ' ') && (words.charAt(i + 1) != ' '))
            {
                count++;

            }
        }
        System.out.println("Number of words in a string = " + count);
    }
}
