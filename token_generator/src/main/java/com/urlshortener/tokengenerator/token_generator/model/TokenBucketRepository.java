package com.urlshortener.tokengenerator.token_generator.model;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface TokenBucketRepository extends CrudRepository<TokenBucket, Long> {
    
    public List<TokenBucket> findByAvail(Boolean avail);


    @Query(value = "SELECT * FROM token_bucket WHERE avail = true LIMIT 1", nativeQuery = true)
    public TokenBucket getData();

    public TokenBucket findById(long id);

    @Modifying
    @Query(value = "update token_bucket u set u.avail = false where u.id = :id", nativeQuery = true)
    void updateBucket(@Param(value = "id") long id);
    
}
