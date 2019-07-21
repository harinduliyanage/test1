package com.finetech.testbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class TestBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestBackendApplication.class, args);
    }

}
