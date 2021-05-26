package com.urlshortener.UrlShortener.Models;

public class TokenGenResponse {
    public long startValue;
    public long endValue;
    public TokenGenResponse(){}
    public TokenGenResponse(long startValue,long endValue){
        this.startValue = startValue;
        this.endValue = endValue;
    }  
}
