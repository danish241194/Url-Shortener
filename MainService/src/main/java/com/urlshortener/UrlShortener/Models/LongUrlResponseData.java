package com.urlshortener.UrlShortener.Models;

public class LongUrlResponseData {
    public String originalUrl;
    public String shortUrlCode;
    public String createdAt;

    public LongUrlResponseData(){}
    public LongUrlResponseData(String originalUrl,
                                String shorUrlCode){

        this.originalUrl = originalUrl;
        this.shortUrlCode = shorUrlCode;
        this.createdAt = DateUtilsCustom.now();
    }
}
