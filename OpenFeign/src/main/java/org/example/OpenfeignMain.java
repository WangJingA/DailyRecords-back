package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenfeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OpenfeignMain.class,args);
        System.out.println("Hello world!");
    }
}