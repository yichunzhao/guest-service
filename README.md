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

Refreshing the Eureka

![image](https://user-images.githubusercontent.com/17804600/88572560-a2bc7c00-d03f-11ea-8cf8-7d5f002ceca9.png)

The service is registered with the Eureka. 







