package com.urlshortener.UrlShortener.Models;

public class ShortUrlResponseData {
    public String originalUrl;
    public String shortUrlCode;
    public String createdAt;

    public ShortUrlResponseData(){}
    public ShortUrlResponseData(String originalUrl,
                                String shorUrlCode){

        this.originalUrl = originalUrl;
        this.shortUrlCode = shorUrlCode;
        this.createdAt = DateUtilsCustom.now();
    }

}
