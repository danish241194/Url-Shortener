package com.urlshortener.UrlShortener.controller.Controller;

import java.io.Console;

import com.urlshortener.UrlShortener.Models.LongUrlData;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    

    // localhost.com/shortcode
    @GetMapping("/{shortCode}")
    public String getLongUrlFromShortUrl(@PathVariable("shortCode") String shortCode){
        return "Short Code : " + shortCode;
    }

    
    @PostMapping(
        value = "/",
        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    
    public LongUrlData getShortUrlFromLongUrl(@RequestBody LongUrlData longUrlData){
        return longUrlData;
    }

    
}
