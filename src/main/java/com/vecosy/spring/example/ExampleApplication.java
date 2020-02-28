package com.vecosy.spring.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

    private final String dbUser;

    public ExampleApplication(@Value("${db.user}") final String dbUser) {
        this.dbUser = dbUser;
    }

    @GetMapping("/")
    public String getValue() {
        return dbUser;
    }
}
