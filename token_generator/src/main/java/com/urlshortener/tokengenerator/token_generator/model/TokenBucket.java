package com.urlshortener.tokengenerator.token_generator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "token_bucket")
public class TokenBucket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_value")
    private int startValue;

    @Column(name = "end_value")
    private int endValue;

    @Column(name = "avail")
    private boolean avail;

    public TokenBucket() {
    }
 
    public TokenBucket(int startValue, int endValue,boolean avail ) {
        this.startValue = startValue;
        this.endValue = endValue;
        this.avail = avail;

    }
    
    public int getStartValue(){
        return this.startValue;
    }

    public int getEndValue(){
        return this.endValue;
    }
    public Long getId(){
        return this.id;
    }
    // getters and setters are hidden for brevity
 
    @Override
    public String toString() {
        return startValue + ". " + endValue + " - " + avail;     
    }  
    
}
