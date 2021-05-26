package com.urlshortener.UrlShortener.Service;

import com.urlshortener.UrlShortener.Utils.BasicFunctions;
import com.urlshortener.UrlShortener.Utils.Constants;
import com.urlshortener.UrlShortener.Utils.CustomPair;

import org.springframework.stereotype.Service;

@Service
public class Counter {
    private long startValue;
    private long endValue;
    private long nextValueToAssign;

    public  Counter (){
        this.startValue =Constants.UN_INITIALIZED;
        this.endValue = Constants.UN_INITIALIZED;
        this.nextValueToAssign = Constants.UN_INITIALIZED;
    }

    public synchronized long next(){
       
        if (startValue == Constants.UN_INITIALIZED ||  nextValueToAssign > endValue) { 
            /**
             * This block will run if the next function is called
             * first time or the assinged token bucket is empty
             * 
             **/ 

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
