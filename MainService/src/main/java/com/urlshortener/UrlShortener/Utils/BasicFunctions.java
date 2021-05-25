package com.urlshortener.UrlShortener.Utils;

public  class BasicFunctions {
    public static boolean ended(long value){
        long rem = value % Constants.COUNTER_BATCH_SIZE;
        return rem == 0;
    }
}
