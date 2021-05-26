package com.urlshortener.tokengenerator.token_generator.data;

public class ResponseData {
    public long startValue;
    public long endValue;
    public ResponseData(){}
    public ResponseData(long startValue,long endValue){
        this.startValue = startValue;
        this.endValue = endValue;
    }  
}
