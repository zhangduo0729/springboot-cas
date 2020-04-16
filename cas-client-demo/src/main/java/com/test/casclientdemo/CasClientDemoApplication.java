package com.test.casclientdemo;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCasClient
@SpringBootApplication
public class CasClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasClientDemoApplication.class, args);
    }

}
