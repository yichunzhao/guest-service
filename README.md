# guest-service
1st micro-service

## Register service with Eureka

Adding a new dependency

``` 
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
```

Go to application main class and enable the service discoverable. 
@EnableDiscoveryClient








