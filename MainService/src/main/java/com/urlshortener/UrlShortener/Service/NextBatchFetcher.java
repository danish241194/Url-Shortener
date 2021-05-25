package com.urlshortener.UrlShortener.Service;

import com.urlshortener.UrlShortener.Utils.CustomPair;

public class NextBatchFetcher {

    public static CustomPair getNextBatch(){
        // api call to get next start and end value
        long startValue = 1;
        long endValue = 10;
        return new CustomPair(startValue,endValue);
    }
    
}
