## Url Shortener

### Status : IN DEVELOPMENT


### System Design (Using design of Code Karle)
![alt text](https://www.codekarle.com/images/blog-images/tiny_url_non_redis_solution.png)
### Tech Stack Used
```
  1. Java Spring Boot
  2. Redis
  3. MYSQL
  4. Cassendra
```

### Services 

```
  1. Main Sevice
  2. Token Service
  3. Load Balancer Service Service
```

#### Main Service
  1. This Service will get the requests for shortening or url or redirecting short url to the original one.
  2. This Service will get counter tokens from Token Service When it start or when the tocken bucket gets empty
```
API 1 :  localhost.com:8080/{shorturl}
      This API is responsible to redirect the request to the original url associated with the shorturl
API 2:   localhost.com:8080/  with body as  {logUrl:'original Url'}
      This API is reponsible to convert the long url to short url of length 7
```



