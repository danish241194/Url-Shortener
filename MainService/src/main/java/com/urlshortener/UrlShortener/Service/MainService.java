package com.urlshortener.UrlShortener.Service;

import com.urlshortener.UrlShortener.Models.LongUrlData;
import com.urlshortener.UrlShortener.Models.ShortUrlResponseData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    private Counter counter;

    public MainService(){
        
    };

    public ShortUrlResponseData getShortUrl(LongUrlData originalUrlData){
        String originalUrl = originalUrlData.longUrl;
        long value = counter.next();
        String shorUrlCode=value+"";
        //logic
        ShortUrlResponseData responseData = new ShortUrlResponseData(originalUrl, shorUrlCode);
        return responseData;
    }
    
}
