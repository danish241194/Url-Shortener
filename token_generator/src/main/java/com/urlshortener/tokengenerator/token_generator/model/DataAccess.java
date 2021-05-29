package com.urlshortener.tokengenerator.token_generator.model;


import com.urlshortener.tokengenerator.token_generator.data.TransactionFilureException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class DataAccess {
    @Autowired
    TokenBucketRepository repository;

    @Transactional(propagation = Propagation.REQUIRES_NEW, 
                        rollbackFor = TransactionFilureException.class)
                        
    public TokenBucket transactBucket() throws TransactionFilureException {
        TokenBucket res = repository.getData();
        if(res == null){
            throw new TransactionFilureException("No bucket available");
        }
        repository.updateBucket(res.getId());
        return res; 
    }
}
