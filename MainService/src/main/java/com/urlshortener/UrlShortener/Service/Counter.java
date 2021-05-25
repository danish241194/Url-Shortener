package com.urlshortener.UrlShortener.Service;

import com.urlshortener.UrlShortener.Utils.BasicFunctions;
import com.urlshortener.UrlShortener.Utils.CustomPair;

import org.springframework.stereotype.Service;

@Service
public class Counter {
    private long startValue;
    private long endValue;
    private long nextValueToAssign;

    public  Counter (){
        this.startValue =0;
        this.endValue = 0;
        this.nextValueToAssign = this.startValue;
    }

    public synchronized long next(){
       
        if (nextValueToAssign == 0 || BasicFunctions.ended(nextValueToAssign)){
            CustomPair response = NextBatchFetcher.getNextBatch();
            this.startValue = response.startValue;
            this.endValue = response.endValue;
            this.nextValueToAssign = this.startValue;
        }
        long value = nextValueToAssign;
        nextValueToAssign+=1;
        
        return value;

    }
    
}
