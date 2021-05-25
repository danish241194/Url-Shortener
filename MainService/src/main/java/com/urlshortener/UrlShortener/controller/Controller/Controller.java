package com.urlshortener.UrlShortener.controller.Controller;


import com.urlshortener.UrlShortener.Models.LongUrlData;
import com.urlshortener.UrlShortener.Models.ShortUrlResponseData;
import com.urlshortener.UrlShortener.Service.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    MainService mainService;



    // localhost.com/shortcode
    @GetMapping("/{shortCode}")
    public String getLongUrlFromShortUrl(@PathVariable("shortCode") String shortCode){
        return "Short Code : " + shortCode;
    }

    
    @PostMapping(
        value = "/",
        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    
    public ShortUrlResponseData getShortUrlFromLongUrl(@RequestBody LongUrlData longUrlData){
        ShortUrlResponseData response = mainService.getShortUrl(longUrlData);
        return response;
    }

    
}
