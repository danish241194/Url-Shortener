package com.urlshortener.UrlShortener.Service;

import com.urlshortener.UrlShortener.Models.LongUrlData;
import com.urlshortener.UrlShortener.Models.ShortUrlResponseData;

import org.springframework.stereotype.Service;

@Service
public class MainService {

    public MainService(){};

    public ShortUrlResponseData getShortUrl(LongUrlData originalUrlData){
        String originalUrl = originalUrlData.longUrl;
        String shorUrlCode="XXXXX";
        //logic
        ShortUrlResponseData responseData = new ShortUrlResponseData(originalUrl, shorUrlCode);
        return responseData;
    }
    
}
