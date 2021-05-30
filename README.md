## Url Shortener

### Status : IN DEVELOPMENT


### System Design (Using design of Code Karle)
![alt text](https://www.codekarle.com/images/blog-images/tiny_url_non_redis_solution.png)

![alt text](https://www.linkpicture.com/q/url-shortener-system-design.png)


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

### Setup Of MYSQL online
1. Create Account on www.freesqldatabase.com  for free we get 5MB
2. Create Database then you will get email id which contains server hostname , username , password which can be used to 
    setup our connection
3. In our application.properties add those details as

```

  spring.jpa.hibernate.ddl-auto=update
  spring.datasource.url=jdbc:mysql://sql6.freesqldatabase.com:3306/sql6415689    // sql164158 here reference database name
  spring.datasource.username=sql6415689
  spring.datasource.password=J8f6IELPgv

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



