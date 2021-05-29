package com.urlshortener.UrlShortener.Service;

import com.urlshortener.UrlShortener.Models.LongUrlData;
import com.urlshortener.UrlShortener.Models.ShortUrlResponseData;
import com.urlshortener.UrlShortener.Utils.Base62;

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
        String shortUrlCode = Base62.encode(value);
        ShortUrlResponseData responseData = new ShortUrlResponseData(originalUrl,shortUrlCode);
        return responseData;
    }
    
}
