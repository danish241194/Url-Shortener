package com.urlshortener.UrlShortener.Models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilsCustom {
    public static String now(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }
    
}
