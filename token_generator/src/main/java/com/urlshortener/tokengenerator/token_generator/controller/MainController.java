package com.urlshortener.tokengenerator.token_generator.controller;

import com.urlshortener.tokengenerator.token_generator.data.ResponseData;
import com.urlshortener.tokengenerator.token_generator.services.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
   @Autowired
   MainService mainService;

   MainController(){

    }

    @GetMapping("health")
    public ResponseData health(){
        System.out.println("Received Request");

        ResponseData response = mainService.getNextBucket(); 

        System.out.println("Returning Data "+response.toString());
        return response;
    } 

    @GetMapping("/get_next_token")
    public ResponseData getNextToken(){
        System.out.println("Received Request");

        ResponseData response = mainService.getNextBucket(); 
        System.out.println("Returning Data "+response.toString());

        return response;
        
    }
}
