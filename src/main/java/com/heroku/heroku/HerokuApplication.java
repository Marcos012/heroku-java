package com.heroku.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HerokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.heroku.heroku.HerokuApplication.class, args);
        System.out.println("sid");
    }
}

