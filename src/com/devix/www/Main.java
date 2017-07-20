package com.devix.www;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date date = new Date();
        String strdate = "HH:mm:ss a";
        SimpleDateFormat simpleFormatter = new SimpleDateFormat(strdate);
        System.out.println(simpleFormatter.format(date));
    }
}
