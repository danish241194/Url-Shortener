package com.urlshortener.UrlShortener.Utils;

public class CustomPair {
    public long startValue;
    public long endValue;

    public CustomPair(){
        this.startValue=Constants.UN_INITIALIZED;
        this.endValue=Constants.UN_INITIALIZED;
    }

    public CustomPair(long startValue,long endValue){
        this.startValue = startValue;
        this.endValue = endValue;
    }
    
}
