package com.ynz.democloud.guestservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class GuestServiceApplication {

    public static void main(String[] args) {
        log.info("Guest domain:");
        SpringApplication.run(GuestServiceApplication.class, args);
    }

}
