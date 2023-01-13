package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayMain {
    public static void main(String[] args) {
        try {
            SpringApplication.run(GatewayMain.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Hello world!");
    }
}