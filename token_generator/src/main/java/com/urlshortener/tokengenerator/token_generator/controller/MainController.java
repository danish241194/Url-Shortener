package com.urlshortener.tokengenerator.token_generator.controller;

import com.urlshortener.tokengenerator.token_generator.data.ResponseData;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    long startValue;
    long endValue;

    MainController(){
        startValue = 1;
        endValue = 10;
    }

    @GetMapping("/get_next_token")
    public ResponseData getNextToken(){

        System.out.println("Received Request");

        ResponseData response = new ResponseData(startValue,endValue);
        
        startValue+=10;
        endValue+=10;
        System.out.println("Returned "+response.startValue+" - "+response.endValue);
        return response;
    }
}
