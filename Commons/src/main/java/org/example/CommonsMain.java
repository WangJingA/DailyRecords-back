package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CommonsMain {
    public static void main(String[] args) {
        SpringApplication.run(CommonsMain.class,args);
        System.out.println("Hello world!");
    }
}