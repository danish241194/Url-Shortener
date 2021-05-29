package com.urlshortener.tokengenerator.token_generator.services;

import com.urlshortener.tokengenerator.token_generator.data.ResponseData;
import com.urlshortener.tokengenerator.token_generator.data.TransactionFilureException;
import com.urlshortener.tokengenerator.token_generator.model.DataAccess;
import com.urlshortener.tokengenerator.token_generator.model.TokenBucket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    @Autowired
    DataAccess dataAccess;


    public ResponseData getNextBucket(){

        TokenBucket bucket;
        try {
            bucket = dataAccess.transactBucket();
        } catch (TransactionFilureException e) {
            bucket = new TokenBucket(-1,-1,false);
        }
        ResponseData response = new ResponseData(bucket.getStartValue(),bucket.getEndValue());

        return response;
    }
}
