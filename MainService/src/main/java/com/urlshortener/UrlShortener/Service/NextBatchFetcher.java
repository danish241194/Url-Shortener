package com.urlshortener.UrlShortener.Service;

import com.urlshortener.UrlShortener.Config;
import com.urlshortener.UrlShortener.Models.TokenGenResponse;
import com.urlshortener.UrlShortener.Utils.Constants;
import com.urlshortener.UrlShortener.Utils.CustomPair;

import org.springframework.web.client.RestTemplate;

public class NextBatchFetcher {
    private static final RestTemplate restTemplate = new RestTemplate();;
    public static CustomPair getNextBatch(){
        String url = Config.tokenGeneratorUrl;
        TokenGenResponse response =  restTemplate.getForObject(url, TokenGenResponse.class);
        return new CustomPair(response.startValue,response.endValue);
    }
    
}
