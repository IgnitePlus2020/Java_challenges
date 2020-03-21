package com.tgt.igniteplus;

import java.io.IOException;
import java.time.LocalDateTime;

public class DateTime {
    public static void main(String args[])throws IOException
    {
        LocalDateTime current=LocalDateTime.now();
        System.out.println("current date and time is:"+ current);
    }

}
